import FormScript from 'formscript';

export default class ClientCorporationCustomObjectInstance1 extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}