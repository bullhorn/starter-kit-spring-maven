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
        "text": "${applicationRoot}/javascript/library/require/text"
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