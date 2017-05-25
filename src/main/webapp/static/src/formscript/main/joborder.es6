import FormScript from 'formscript';
import LockJobFields from 'modules/lockjobfields.min';

export default class JobOrder extends FormScript {

    constructor() {
        super();
        this.lockJobFields = new LockJobFields();
    }

    run(callback) {
        let promises = [];

        let isEdit = $('a.SubTierNavSelected[data-automation-id="Edit"]').length > 0;

        if(isEdit) {
            promises = promises.concat(this.lockJobFields.init());
        }

        this.whenAjaxDone(promises, callback);
    }

}