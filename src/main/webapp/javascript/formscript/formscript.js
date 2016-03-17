require.config({
    "baseUrl": ".",
    shim : {
    },
    "paths": {
        "candidate": "${applicationRoot}/javascript/formscript/main/candidate",
        "clientcontact": "${applicationRoot}/javascript/formscript/main/clientcontact",
        "clientcorporation": "${applicationRoot}/javascript/formscript/main/clientcorporation",
        "joborder": "${applicationRoot}/javascript/formscript/main/joborder",
        "jobsubmission": "${applicationRoot}/javascript/formscript/main/jobsubmission",
        "lead": "${applicationRoot}/javascript/formscript/main/lead",
        "opportunity": "${applicationRoot}/javascript/formscript/main/opportunity",
        "placement": "${applicationRoot}/javascript/formscript/main/placement",
        "placementchangerequest": "${applicationRoot}/javascript/formscript/main/placementchangerequest",
        "handlebars": "${applicationRoot}/javascript/library/handlebars/handlebars.amd.min",
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

                require([ entity ]);
            }
        });
    }
};