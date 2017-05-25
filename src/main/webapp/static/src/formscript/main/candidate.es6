import FormScript from 'formscript';

export default class Candidate extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}