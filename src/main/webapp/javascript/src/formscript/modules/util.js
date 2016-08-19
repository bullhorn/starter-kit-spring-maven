define([], function() {
    return {
        disableField: function(editRow) {
            if(editRow.length > 0) {
                if(editRow.find('select').length > 0) {
                    this.disableSelect(editRow);
                } else if(editRow.find('.orca-picker').length > 0) {
                    this.disableOrcaPicker(editRow);
                } else if(editRow.find('.hasDatepicker').length > 0) {
                    this.disableDatePicker(editRow);
                } else if(editRow.find('div[data-picker]').length > 0) {
                    this.disableBullhornPicker(editRow);
                } else if(editRow.find('input[type="text"]').length > 0) {
                    this.disableInput(editRow);
                } else if(editRow.find('textarea').length > 0) {
                    this.disableTextarea(editRow);
                } else if(editRow.find('input[type="radio"]').length > 0) {
                    this.disableRadios(editRow);
                }
            }
        },

        disableSelect: function(editRow) {
            editRow.find('select option:not(:selected)').prop('disabled', true);
        },

        disableOrcaPicker: function(editRow) {
            editRow.find('input.EditField.select2-offscreen').prop('readonly', true);
        },

        disableDatePicker: function(editRow) {
            var field = editRow.find('input.EditField.hasDatepicker');
            var name = field.prop('name');

            var disabled = $('<input />').prop({
                name: name+'Disabled',
                id: name+'Disabled',
                type: "text",
                class: "EditField"
            }).val(field.val()).prop('disabled', true);

            field.after(disabled).hide().siblings('img').hide();
        },

        disableBullhornPicker: function(editRow) {
            var name = editRow.prop('id').replace('editRow-','');
            var label = editRow.find('[name="' + name + '_display"]').val();

            var newInput = $('<input />').prop({
                class: "EditField",
                readonly: true,
                name: name+'Disabled',
                id: name+'Disabled'
            }).val(label);

            editRow.find('td.EditField').append(newInput).find('div[data-picker]').hide();
        },

        disableInput: function(editRow) {
            editRow.find('input.EditField').prop('readonly', true);
        },

        disableTextarea: function(editRow) {
            editRow.find('textarea.EditField').prop('readonly', true);
        },

        disableRadios: function(editRow) {
            editRow.find('input[type="radio"]:not(:checked)').prop('disabled', true);
        }
    };
});