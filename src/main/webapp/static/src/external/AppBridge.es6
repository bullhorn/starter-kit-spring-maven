import postRobot from 'postRobot';

export const AppBridgeHandler = {
    HTTP: 0,
    OPEN: 1,
    CLOSE: 2,
    REFRESH: 3,
    PIN: 4,
    REGISTER: 5,
    UPDATE: 6
}

const HTTP_VERBS = {
    GET: 'get',
    POST: 'post',
    PUT: 'put',
    DELETE: 'delete'
};

const MESSAGE_TYPES = {
    REGISTER: 'register',
    OPEN: 'open',
    CLOSE: 'close',
    REFRESH: 'refresh',
    PIN: 'pin',
    UPDATE: 'update',
    HTTP_GET: 'httpGET',
    HTTP_POST: 'httpPOST',
    HTTP_PUT: 'httpPUT',
    HTTP_DELETE: 'httpDELETE',
    CUSTOM_EVENT: 'customEvent'
};

export class AppBridge {
    
    // Type?
    constructor(traceName) {
        this.id = `${Date.now()}`;
        this.isMaster = false;
        this.windowName;

        this._registeredFrames = [];
        this._handlers = {};
        this._tracing = false;
        this._eventListeners = {};

        this.traceName = traceName;
        if (postRobot) {
            postRobot.CONFIG.LOG_LEVEL = 'error';
            try {
                this._setupHandlers();
            } catch (error) {
                // No op
            }
        }
    }

    set tracing(tracing) {
        this._tracing = tracing;
    }

    handle(type, handler) {
        this._handlers[type] = handler;
    }

    _trace(eventType, event) {
        if (this._tracing) {
            console.log(`[${this.traceName || this.id}] "${eventType}"`, event); // tslint:disable-line
        }
    }

    _setupHandlers() {
        // Register
        postRobot.on(MESSAGE_TYPES.REGISTER, (event) => {
            this._trace(MESSAGE_TYPES.REGISTER, event);
            if (this.isMaster) {
                this._registeredFrames.push(event);
            }
            return this.register(event.data).then(windowName => {
                this.windowName = windowName;
                return { windowName };
            });
        });
        // Update
        postRobot.on(MESSAGE_TYPES.UPDATE, (event) => {
            this._trace(MESSAGE_TYPES.UPDATE, event);
            return this.update(event.data).then(success => {
                return { success };
            });
        });
        // Open
        postRobot.on(MESSAGE_TYPES.OPEN, (event) => {
            this._trace(MESSAGE_TYPES.OPEN, event);
            return this.open(event.data).then(success => {
                return { success };
            });
        });
        // Close
        postRobot.on(MESSAGE_TYPES.CLOSE, (event) => {
            this._trace(MESSAGE_TYPES.CLOSE, event);
            if (this.isMaster) {
                const index = this._registeredFrames.findIndex(frame => frame.data.id === event.data.id);
                if (index !== -1) {
                    this._registeredFrames.splice(index, 1);
                }
            }
            return this.close(event.data).then(success => {
                return { success };
            });
        });
        // Refresh
        postRobot.on(MESSAGE_TYPES.REFRESH, (event) => {
            this._trace(MESSAGE_TYPES.REFRESH, event);
            return this.refresh(event.data).then(success => {
                return { success };
            });
        });
        // PIN
        postRobot.on(MESSAGE_TYPES.PIN, (event) => {
            this._trace(MESSAGE_TYPES.PIN, event);
            return this.pin(event.data).then(success => {
                return { success };
            });
        });
        // HTTP-GET
        postRobot.on(MESSAGE_TYPES.HTTP_GET, (event) => {
            this._trace(MESSAGE_TYPES.HTTP_GET, event);
            return this.httpGET(event.data.relativeURL).then(result => {
                return { data: result.data, error: result.error };
            });
        });
        // HTTP-POST
        postRobot.on(MESSAGE_TYPES.HTTP_POST, (event) => {
            this._trace(MESSAGE_TYPES.HTTP_POST, event);
            return this.httpPOST(event.data.relativeURL, event.data.data).then(result => {
                return { data: result.data, error: result.error };
            });
        });
        // HTTP-PUT
        postRobot.on(MESSAGE_TYPES.HTTP_PUT, (event) => {
            this._trace(MESSAGE_TYPES.HTTP_PUT, event);
            return this.httpPUT(event.data.relativeURL, event.data.data).then((result) => {
                return { data: result.data, error: result.error };
            });
        });
        // HTTP-DELETE
        postRobot.on(MESSAGE_TYPES.HTTP_DELETE, (event) => {
            this._trace(MESSAGE_TYPES.HTTP_DELETE, event);
            return this.httpDELETE(event.data.relativeURL).then(result => {
                return { data: result.data, error: result.error };
            });
        });
        // Custom Events
        postRobot.on(MESSAGE_TYPES.CUSTOM_EVENT, (event) => {
            this._trace(MESSAGE_TYPES.CUSTOM_EVENT, event);
            if (this._eventListeners[event.data.event]) {
                this._eventListeners[event.data.event].forEach((listener) => {
                    listener(event.data.data);
                });
            }
            if (this._registeredFrames.length > 0) {
                this._registeredFrames.forEach(frame => {
                    postRobot.send(frame.source, MESSAGE_TYPES.CUSTOM_EVENT, event.data);
                });
            }
        });
    }

    /**
     * Fires or responds to an open event
     * @param packet any - packet of data to send with the open event
     */
    open(packet) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.OPEN]) {
                this._handlers[AppBridgeHandler.OPEN](packet, (success) => {
                    if (success) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.OPEN, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.OPEN} (callback)`, event);
                    if (event.data) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                }).catch((err) => {
                    reject(false);
                });
            }
        });
    }

    /**
     * Fires or responds to an close event
     * @param packet any - packet of data to send with the close event
     */
    update(packet) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.UPDATE]) {
                this._handlers[AppBridgeHandler.UPDATE](packet, (success) => {
                    if (success) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.UPDATE, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.UPDATE} (callback)`, event);
                    if (event.data) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                }).catch((err) => {
                    reject(false);
                });
            }
        });
    }

    /**
     * Fires or responds to an close event
     * @param packet any - packet of data to send with the close event
     */
    close(packet) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.CLOSE]) {
                this._handlers[AppBridgeHandler.CLOSE](packet, (success) => {
                    if (success) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.CLOSE, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.CLOSE} (callback)`, event);
                    if (event.data) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                }).catch((err) => {
                    reject(false);
                });
            }
        });
    }

    /**
     * Fires or responds to an close event
     * @param packet any - packet of data to send with the close event
     */
    refresh(packet) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.REFRESH]) {
                this._handlers[AppBridgeHandler.REFRESH](packet, (success) => {
                    if (success) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.REFRESH, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.REFRESH} (callback)`, event);
                    if (event.data) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                }).catch((err) => {
                    reject(false);
                });
            }
        });
    }

    /**
     * Fires or responds to an close event
     * @param packet any - packet of data to send with the close event
     */
    pin(packet) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.PIN]) {
                this._handlers[AppBridgeHandler.PIN](packet, (success) => {
                    if (success) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.PIN, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.PIN} (callback)`, event);
                    if (event.data) {
                        resolve(true);
                    } else {
                        reject(false);
                    }
                }).catch((err) => {
                    reject(false);
                });
            }
        });
    }

    /**
     * Fires or responds to an register event
     * @param packet any - packet of data to send with the event
     */
    register(packet = {}) {
        Object.assign(packet, { id: this.id, windowName: this.windowName });
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.REGISTER]) {
                this._handlers[AppBridgeHandler.REGISTER](packet, (windowName) => {
                    if (windowName) {
                        resolve(windowName);
                    } else {
                        resolve(null);
                    }
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.REGISTER, packet).then((event) => {
                    this._trace(`${MESSAGE_TYPES.REGISTER} (callback)`, event);
                    if (event.data) {
                        this.windowName = event.data.windowName;
                        resolve(event.data.windowName);
                    } else {
                        resolve(null);
                    }
                }).catch((err) => {
                    this.isMaster = true;
                    this._trace(`${MESSAGE_TYPES.REGISTER} - FAILED - (no parent)`, err);
                    resolve(null);
                });
            }
        });
    }

    /**
     * Fires or responds to an HTTP_GET event
     * @param packet any - packet of data to send with the event
     */
    httpGET(relativeURL) {
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.HTTP]) {
                this._handlers[AppBridgeHandler.HTTP]({ verb: HTTP_VERBS.GET, relativeURL: relativeURL }, (data, error) => {
                    resolve({ data, error });
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.HTTP_GET, { relativeURL }).then((event) => {
                    resolve({ data: event.data.data, error: event.data.error });
                }).catch((err) => {
                    reject(null);
                });
            }
        });
    }

    /**
     * Fires or responds to an HTTP_POST event
     * @param packet any - packet of data to send with the event
     */
    httpPOST(relativeURL, postData) {
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.HTTP]) {
                this._handlers[AppBridgeHandler.HTTP]({ verb: HTTP_VERBS.POST, relativeURL: relativeURL, data: postData }, (data, error) => {
                    resolve({ data, error });
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.HTTP_POST, { relativeURL: relativeURL, data: postData }).then((event) => {
                    resolve({ data: event.data.data, error: event.data.error });
                }).catch((err) => {
                    reject(null);
                });
            }
        });
    }

    /**
     * Fires or responds to an HTTP_PUT event
     * @param packet any - packet of data to send with the event
     */
    httpPUT(relativeURL, putData) {
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.HTTP]) {
                this._handlers[AppBridgeHandler.HTTP]({ verb: HTTP_VERBS.PUT, relativeURL: relativeURL, data: putData }, (data, error) => {
                    resolve({ data, error });
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.HTTP_PUT, { relativeURL: relativeURL, data: putData }).then((event) => {
                    resolve({ data: event.data.data, error: event.data.error });
                }).catch((err) => {
                    reject(null);
                });
            }
        });
    }

    /**
     * Fires or responds to an HTTP_DELETE event
     * @param packet any - packet of data to send with the event
     */
    httpDELETE(relativeURL) {
        return new Promise((resolve, reject) => {
            if (this._handlers[AppBridgeHandler.HTTP]) {
                this._handlers[AppBridgeHandler.HTTP]({ verb: HTTP_VERBS.DELETE, relativeURL: relativeURL }, (data, error) => {
                    resolve({ data, error });
                });
            } else {
                postRobot.sendToParent(MESSAGE_TYPES.HTTP_DELETE, { relativeURL }).then((event) => {
                    resolve({ data: event.data.data, error: event.data.error });
                }).catch((err) => {
                    reject(null);
                });
            }
        });
    }

    /**
     * Fires a custom event to anywhere in the application
     * @param event string - event name to fire
     * @param data any - data to be sent along with the event
     */
    fireEvent(event, data) {
        return new Promise((resolve, reject) => {
            postRobot.sendToParent(MESSAGE_TYPES.CUSTOM_EVENT, { event, data }).then((e) => {
                resolve(e);
            }).catch((err) => {
                reject(null);
            });
        });
    }

    /**
     * Adds an event listener to a custom event
     * @param event string - event name to listen to
     * @param callback function - callback to be fired when an event is caught
     */
    addEventListener(event, callback) {
        if (!this._eventListeners[event]) {
            this._eventListeners[event] = [];
        }
        this._eventListeners[event].push(callback);
    }
}
