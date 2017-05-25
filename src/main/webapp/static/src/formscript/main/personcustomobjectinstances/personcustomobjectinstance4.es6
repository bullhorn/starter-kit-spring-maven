import FormScript from 'formscript';

export default class PersonCustomObjectInstance4 extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}