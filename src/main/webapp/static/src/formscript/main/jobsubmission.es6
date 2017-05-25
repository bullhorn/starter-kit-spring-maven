import FormScript from 'formscript';

export default class JobSubmission extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}