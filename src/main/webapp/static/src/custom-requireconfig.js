requirejs.config({
    baseUrl: "/javascript/",
    paths: {
        'jquery': 'lib/jquery/jquery.min',
        'jquery-alerts': 'lib/jquery/jquery.alerts-custom',
        'jquery-editable': 'lib/jquery/jquery.jeditable.mini',
        'jquery-editable-datepicker': 'lib/jquery/jquery.jeditable.datepicker',
        'datatables': 'lib/jquery/jquery.dataTables',
        'jquery-datatables-editable': 'lib/jquery/jquery.dataTables.editable',
        'jquery-validate': 'lib/jquery/jquery.validate.min',
        'jquery-blockui': 'lib/jquery/jquery.blockUI',
        'jquery-form': 'lib/jquery/jquery.form',
        'bootstrap': 'lib/bootstrap/bootstrap.min',
        'bootbox': 'lib/bootstrap/bootbox.min',
        'bootstrap-datepicker': 'lib/bootstrap/bootstrap-datetimepicker.min',
        'select2': 'lib/select2/select2.min',
        'moment': 'lib/moment/moment',
        'postRobot': 'lib/postrobot/post-robot.min',
        'appbridge': 'external/AppBridge.min'
    },
    shim: {
        'jquery-alerts': {
            deps: [
                'jquery'
            ],
            export: 'jQuery.alerts'
        },
        'jquery-blockui': {
            deps: [
                'jquery'
            ],
            export: 'jQuery.blockUI'
        },
        'jquery-form': {
            deps: [
                'jquery'
            ],
            export: 'jQuery.fn.ajaxSubmit'
        },
        'jquery-validate': {
            deps: [
                'jquery'
            ],
            export: 'jQuery.fn.validate'
        },
        'jquery-editable': {
            deps: [
                'jquery'
            ],
            export: 'jQuery.fn.editable'
        },
        'jquery-editable-datepicker': {
            deps: [
                'jquery', 'jquery-editable', 'bootstrap', 'bootstrap-datepicker', 'moment'
            ]
        },
        'jquery-datatables-editable': {
            deps: [
                'jquery', 'jquery-editable', 'jquery-editable-datepicker', 'datatables'
            ],
            export: 'jQuery.fn.makeEditable'
        },
        'select2': {
            deps: [
                'jquery'
            ],
            exports: 'jQuery.fn.select2'
        },
        'lib/orca/orca-pickers': {
            deps: [
                'jquery', 'select2'
            ],
            exports: 'jQuery.fn.orcaPicker'
        },
        'bootstrap': {
            deps: [
                'jquery'
            ]
        },
        'bootstrap-datepicker': {
            deps: [
                'jquery', 'bootstrap', 'moment'
            ],
            exports: 'jQuery.fn.datepicker'
        },
        'bootbox': {
            deps: [
                'jquery', 'bootstrap'
            ],
            exports: 'bootbox'
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