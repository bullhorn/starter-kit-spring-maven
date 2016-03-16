<script type="text/javascript">
    //function to populate the form with the edit values when editing using the form instead of inline editing
    (function($) {
        $.fn.populateForm = function(json, attr) {
            var form = $(this);


            $.each(json.result,
                    function(key, value) {
                        form.find('[' + attr + '="' + value.id + '"]').val(
                                value.value);
                    });

        };
    })(jQuery);

    (function($) {
        $.fn.dataTableExt.oApi.fnReloadAjax = function(oSettings, sNewSource,
                fnCallback, bStandingRedraw) {
            if (typeof sNewSource != 'undefined' && sNewSource != null) {
                oSettings.sAjaxSource = sNewSource;
            }
            this.oApi._fnProcessingDisplay(oSettings, true);
            var that = this;
            var iStart = oSettings._iDisplayStart;

            oSettings.fnServerData(oSettings.sAjaxSource, [], function(json) {
                /* Clear the old information from the table */
                that.oApi._fnClearTable(oSettings);

                /* Got the data - add it to the table */
                for ( var i = 0; i < json.aaData.length; i++) {
                    that.oApi._fnAddData(oSettings, json.aaData[i]);
                }

                oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
                that.fnDraw();

                if (typeof bStandingRedraw != 'undefined'
                        && bStandingRedraw === true) {
                    oSettings._iDisplayStart = iStart;
                    that.fnDraw(false);
                }

                that.oApi._fnProcessingDisplay(oSettings, false);

                /* Callback user function - for event handlers etc */
                if (typeof fnCallback == 'function' && fnCallback != null) {
                    fnCallback(oSettings);
                }
            }, oSettings);
        }
    })(jQuery);

    (function($) {
        $.customBlockUI = function() {
            $.blockUI({
                //theme: true,
                message : '',
                overlayCSS : {
                    backgroundColor : '#fff',
                    opacity : 0.6,
                    cursor : 'wait'
                }
            });

        };
    })(jQuery);

    (function ($) {
        $.fn.button = function (options) {
            var button = $(this);
            if (options && options.class) button.attr("class", options.class);
            if (options && options.label) button.html(options.label);
        }
    })(jQuery);
</script>
