import FormScript from 'formscript';

export default class ClientContact extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}