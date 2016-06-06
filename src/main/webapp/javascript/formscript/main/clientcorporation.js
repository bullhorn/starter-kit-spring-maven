define([], function() {
    $(function() {
        var engage = {
            adminUserTypes: '${client.admin.usertypes}'.split(','),

            isUserAdmin: function() {
                var userTypeID = window.parent.cache.get('AppData').userInformation.userData.userType.id;

                return this.adminUserTypes.indexOf(userTypeID) >= 0;
            },

            disableCreditCheck: function() {
                $('[name="customText2"]').find('option:not(:selected)').prop('disabled', true);
            }
        };

        if(!engage.isUserAdmin()) {
            engage.disableCreditCheck();
        }
    });
});