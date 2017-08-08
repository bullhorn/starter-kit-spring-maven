requirejs.config({
    baseUrl: ".",
    shim: {
    },
    paths: {
        "formscript": "${applicationRoot}/javascript/formscript/main/formscript.min",

        "candidate": "${applicationRoot}/javascript/formscript/main/candidate.min",
        "clientcontact": "${applicationRoot}/javascript/formscript/main/clientcontact.min",
        "clientcorporation": "${applicationRoot}/javascript/formscript/main/clientcorporation.min",
        "joborder": "${applicationRoot}/javascript/formscript/main/joborder.min",
        "jobsubmission": "${applicationRoot}/javascript/formscript/main/jobsubmission.min",
        "lead": "${applicationRoot}/javascript/formscript/main/lead.min",
        "opportunity": "${applicationRoot}/javascript/formscript/main/opportunity.min",
        "placement": "${applicationRoot}/javascript/formscript/main/placement.min",
        "placementchangerequest": "${applicationRoot}/javascript/formscript/main/placementchangerequest.min",
        "sendout": "${applicationRoot}/javascript/formscript/main/sendout.min",

        "clientcorporationcustomobjectinstance1": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance1.min",
        "clientcorporationcustomobjectinstance2": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance2.min",
        "clientcorporationcustomobjectinstance3": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance3.min",
        "clientcorporationcustomobjectinstance4": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance4.min",
        "clientcorporationcustomobjectinstance5": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance5.min",
        "clientcorporationcustomobjectinstance6": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance6.min",
        "clientcorporationcustomobjectinstance7": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance7.min",
        "clientcorporationcustomobjectinstance8": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance8.min",
        "clientcorporationcustomobjectinstance9": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance9.min",
        "clientcorporationcustomobjectinstance10": "${applicationRoot}/javascript/formscript/main/clientcorporationcustomobjectinstances/clientcorporationcustomobjectinstance10.min",

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

        "modules": "${applicationRoot}/javascript/modules/",
        "lib": "${applicationRoot}/javascript/lib/",

        "swig": "${applicationRoot}/javascript/lib/swig/swig.min",
        "text": "${applicationRoot}/javascript/lib/require/text",
        "postRobot": "${applicationRoot}/javascript/lib/postrobot/post-robot.min",
        "appbridge": "${applicationRoot}/javascript/external/AppBridge.min"
    },
    config: {
        text: {
            useXhr: function (url, protocol, hostname, port) {
                return true;
            }
        }
    }
});

window.requireForFormScript = function( entity ) {
    if(entity && entity.length) {
        require([ entity ], function(formscript) {
            new formscript.default().init();
        });
    }
};