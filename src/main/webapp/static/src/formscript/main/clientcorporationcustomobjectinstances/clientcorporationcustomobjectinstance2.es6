import FormScript from 'formscript';

export default class ClientCorporationCustomObjectInstance2 extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}