import { AppBridge } from 'appbridge';

export default class AppBridgeService {

    constructor(id) {
        this.bridge = new AppBridge(id);
        this.bridge.tracing = true;
        this.bridge.register();
    }

    close() {
        this.bridge.close({});
    }

}