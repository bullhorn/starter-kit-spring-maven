import example from 'text!${applicationRoot}/templates/example.html';

export default class TemplatesConfig {

    static get() {
        return {
            example: example
        };
    }

}