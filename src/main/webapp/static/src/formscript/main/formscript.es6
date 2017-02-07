import Util from 'modules/util.min';

export default class FormScript  {

    constructor() {
        this.apiKey = '${apikey}';
        this.applicationRoot = '${applicationRoot}';
        this.util = new Util();
    }

    init() {
        if(this.run) {
            this.run(this.hideBlockUi);
        } else {
            console.error('Error running formscript, no "run" method defined');
        }
    }

    hideBlockUi() {
        $('#block-form-script').remove();
    }

}