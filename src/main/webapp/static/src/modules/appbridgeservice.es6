import { AppBridge } from 'appbridge';

export default class AppBridgeService {

    constructor(id) {
        if(!id) {
            id = `customAppBridge${Math.floor(Math.random() * 10000)}`
        }

        this.bridge = new AppBridge(id);
        this.bridge.tracing = true;
        this.bridge.register();
    }

    close() {
        this.bridge.close({});
    }

    refresh() {
        this.bridge.refresh({});
    }

    open(type, entityType, entityId) {
        if(!entityId) {
            entityId = -1;
        }

        this.bridge.open({
            type: type,
            entityType: entityType,
            entityId: entityId.toString()
        });
    }

    openAdd(entityType, entityId) {
        this.open('add', entityType, entityId);
    }

    openOverview(entityType, entityId) {
        this.open('record', entityType, entityId);
    }

    httpGet(url) {
        return this.bridge.httpGET(url);
    }

    httpPut(url) {
        return this.bridge.httpPUT(url);
    }

    httpPost(url) {
        return this.bridge.httpPOST(url);
    }

    httpDelete(url) {
        return this.bridge.httpDELETE(url);
    }

}