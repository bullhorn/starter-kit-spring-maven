import FormScript from 'formscript';

export default class JobOrder extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}