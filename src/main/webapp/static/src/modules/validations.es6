import $ from 'jquery';

class Validation {

    constructor(message, validate) {
        this._message = message;
        this._validate = validate;
    }

    get message() {
        return this._message;
    }

    set message(value) {
        this._message = value;
    }

    get validate() {
        return this._validate;
    }

    set validate(value) {
        this._validate = value;
    }

}

export default class Validations {

}

Validations.INTEGER = new Validation('must be only digits', (input) => {
    return $(input).val().length == 0 || /^\d+$/i.test($(input).val());
});

Validations.DECIMAL = new Validation('must be a valid number', (input) => {
    return $(input).val().length == 0 || /^\d+(\.\d{1,2})?$/i.test($(input).val());
});

Validations.REQUIRED = new Validation('must be populated', (input) => {
    var value = $(input).val();

    return $.trim(value.length) > 0;
});