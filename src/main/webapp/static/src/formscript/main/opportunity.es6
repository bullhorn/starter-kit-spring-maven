import FormScript from 'formscript';

export default class Opportunity extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}