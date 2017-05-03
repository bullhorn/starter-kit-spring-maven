import Util from 'modules/util.min';

export default class FormScript  {

    constructor() {
        this.apiKey = '${apikey}';
        this.applicationRoot = '${applicationRoot}';
        this.util = new Util();
    }

    init() {
        if(this.run) {
            try {
                this.run(this.hideBlockUi);
            } catch(error) {
                this.hideBlockUi();

                console.error('Error running form script: '+error);
            }
        } else {
            console.error('Error running formscript, no "run" method defined');
        }
    }

    whenAjaxDone(promises, callback) {
        $.when.apply($, promises).always(callback);
    }

    hideBlockUi() {
        $('#block-form-script').remove();
    }

}