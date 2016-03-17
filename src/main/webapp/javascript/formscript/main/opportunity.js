define([], function() {
    $(function() {
        var id = window.parent.cache.get('AppData').userInformation.userData.id;

        console.log(id);
    });
});