import FormScript from 'formscript';

export default class ClientCorporation extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}