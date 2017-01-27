require.config({
    "baseUrl": ".",
    shim : {
    },
    "paths": {
        "util": "${applicationRoot}/javascript/formscript/modules/util.min",
        "templates": "${applicationRoot}/javascript/formscript/modules/templates.min",
        "candidate": "${applicationRoot}/javascript/formscript/main/candidate.min",
        "clientcontact": "${applicationRoot}/javascript/formscript/main/clientcontact.min",
        "clientcorporation": "${applicationRoot}/javascript/formscript/main/clientcorporation.min",
        "joborder": "${applicationRoot}/javascript/formscript/main/joborder.min",
        "jobsubmission": "${applicationRoot}/javascript/formscript/main/jobsubmission.min",
        "lead": "${applicationRoot}/javascript/formscript/main/lead.min",
        "opportunity": "${applicationRoot}/javascript/formscript/main/opportunity.min",
        "placement": "${applicationRoot}/javascript/formscript/main/placement.min",
        "placementchangerequest": "${applicationRoot}/javascript/formscript/main/placementchangerequest.min",
        "swig": "${applicationRoot}/javascript/library/swig/swig.min",
        "text": "${applicationRoot}/javascript/library/require/text",

        "personcustomobjectinstance1": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance1.min",
        "personcustomobjectinstance2": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance2.min",
        "personcustomobjectinstance3": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance3.min",
        "personcustomobjectinstance4": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance4.min",
        "personcustomobjectinstance5": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance5.min",
        "personcustomobjectinstance6": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance6.min",
        "personcustomobjectinstance7": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance7.min",
        "personcustomobjectinstance8": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance8.min",
        "personcustomobjectinstance9": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance9.min",
        "personcustomobjectinstance10": "${applicationRoot}/javascript/formscript/main/personcustomobjectinstances/personcustomobjectinstance10.min",
        "clientcorporationcustomobjectinstance1": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance1.min",
        "clientcorporationcustomobjectinstance2": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance2.min",
        "clientcorporationcustomobjectinstance3": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance3.min",
        "clientcorporationcustomobjectinstance4": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance4.min",
        "clientcorporationcustomobjectinstance5": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance5.min",
        "clientcorporationcustomobjectinstance6": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance6.min",
        "clientcorporationcustomobjectinstance7": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance7.min",
        "clientcorporationcustomobjectinstance8": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance8.min",
        "clientcorporationcustomobjectinstance9": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance9.min",
        "clientcorporationcustomobjectinstance10": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance10.min"
    },
    config:{
        text:{
            useXhr: function(url, protocol, hostname, port){
                return true;
            }
        }
    }
});

window.requireForPs = function( entity ) {
    if(entity && entity.length) {
        $.ajax({
            url: "${applicationRoot}/styles/formscript/" + entity + ".css",
            dataType: "text",
            success: function (data) {
                $("head").append("<style>" + data + "</style>");

                require([ entity ], function() {
                    $('#block-form-script').remove();
                });
            },
            error: function() {
                $('#block-form-script').remove();
            }
        });
    }
};