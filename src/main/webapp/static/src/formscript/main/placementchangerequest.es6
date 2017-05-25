import FormScript from 'formscript';

export default class PlacementChangeRequest extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}