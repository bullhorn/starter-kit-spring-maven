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

}