import FormScript from 'formscript';

export default class Sendout extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}