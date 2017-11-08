<%--@elvariable id="customUrl" type="java.lang.String"--%>
<%--@elvariable id="allowAdd" type="java.lang.Boolean"--%>
<%--@elvariable id="tableName" type="java.lang.String"--%>

<script type="text/javascript">
	$(document).ajaxStop($.unblockUI);

	(function ($) {
		$.fn.dialog = function (action, options) {
			var modalBox = $(this).children('.modal');

			if ($.type(action) === "string" && action.toLowerCase() === 'open') {
				modalBox.modal();
			} else if ($.type(action) === "string" && action.toLowerCase() === 'close') {
				modalBox.modal('hide');
			} else if ($.type(action) === "string" && action.toLowerCase() === 'toggle') {
				modalBox.modal('toggle');
			} else {
				modalBox.modal('hide');
			}
		}
	})(jQuery);

	(function ($) {
		$.fn.button = function (options) {
			var button = $(this);
			if (options && options.class) button.attr("class", options.class);
			if (options && options.label) button.html(options.label);
		}
	})(jQuery);

	//function to populate the form with the edit values when editing using the form instead of inline editing
	(function ($) {
		$.fn.populateForm = function (json, attr) {
			var form = $(this);

			$.each(json.result, function (key, value) {
				form.find('[' + attr + '="' + value.id + '"]').val(value.value);
			});

		};
	})(jQuery);

	$('.dataTable > tbody  > tr').on('click', function () {
		$("#${tableName}_btnDeleteRow").addClass('disabled');

		$('.dataTable > tbody  > tr').each(function () {
			if ($(this).hasClass('row_selected')) {
				$("#${tableName}_btnDeleteRow").removeClass('disabled');
				return false;
			}
		});
	});

	(function ($) {
		$.fn.bhDataTable = function (tableConfig) {
			var tableName = '${tableName}';
			//remove old data table editable form from page
			$("body div[role='dialog']").remove();

			setDefaults(tableConfig);
			
			var standardTable = $(this).dataTable({
				"bServerSide": true,
				"sAjaxSource": tableConfig.sAjaxSource,
				"sServerMethod": "POST",
				"bProcessing": true,
				"sPaginationType": "full_numbers",
				"bRetrieve": true,
				"bDestroy": true,
				"bDeferRender": true,
				"sDom":  tableConfig.sDom,
				"aaSorting": tableConfig.aaSorting,
				"aoColumns": [${columnConfigDataTables}],
				"fnDrawCallback": function (oSettings, json) {
					// This is a terrible hack to stop the pagination controls from going
					// out of vertical alignment in IE9. I think the issue is related to
					// the slow loading time from the REST API. - MG 2013-10-20
					setTimeout(function () {
						$('.dataTables_paginate').hide().show();
					}, 100);
					
					if(tableConfig.fnDrawCallback) {
						tableConfig.fnDrawCallback(oSettings, json);
					}
				},
				"fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {

					$('.fg-toolbar').css('width', $("#"+tableName).css('width'));
					$('button', nRow).button();

					$(".table-action-EditData", nRow).on("click", function () {
						tableConfig.loadEditForm(nRow, aData, iDisplayIndex, iDisplayIndexFull);
						return false;
					});
					
					if(tableConfig.fnRowCallback) {
						tableConfig.fnRowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull);
					}
				}
			}).makeEditable({
				sUpdateURL: tableConfig.sUpdateURL,
				sDeleteURL: tableConfig.sDeleteURL,
				sAddDeleteToolbarSelector: "#" + tableName + "_length",
				sAddURL: tableConfig.sAddURL,
				sAddNewRowFormId: tableName + "_formAddNewRow",
				sAddNewRowButtonId: tableName + "_btnAddNewRow",
				sAddNewRowOkButtonId: tableName + "_btnAddNewRowOk",
				sAddNewRowCancelButtonId: tableName + "_btnAddNewRowCancel",
				sDeleteRowButtonId: tableName + "_btnDeleteRow",

				oAddNewRowButtonOptions: {
					label: "Add",
					icons: {
						primary: 'ui-icon-plus'
					},
					class: "btn btn-primary"
				},
				oDeleteRowButtonOptions: {
					label: "Remove",
					icons: {
						primary: 'ui-icon-trash'
					},
					class: "btn btn-danger disabled"
				},
				fnShowError: function (message, action) {
                    switch (action) {
                        case "update":
                            bootbox.dialog({
                                title: 'Update failed',
                                message: message,
                                buttons: {
                                    ok: {
                                        label: "OK",
                                        className: "btn-primary",
                                        callback: function () {
                                        }
                                    }
                                }
                            });

                            break;
                        case "delete":
                            bootbox.dialog({
                                title: 'Delete failed',
                                message: message,
                                buttons: {
                                    ok: {
                                        label: "OK",
                                        className: "btn-primary",
                                        callback: function () {
                                        }
                                    }
                                }
                            });

                            break;
                        case "add":
                            $("#lblAddError").html(message);
                            $("#lblAddError").show();
                            $("#" + tableName + "_btnAddNewRowOk").prop('disabled', false);
                            break;
                    }
				},
				fnOnDeleting: function (tr, id, fnDeleteRow) {
                    if (id) {
                        bootbox.dialog({
                            title: 'Confirm Delete',
                            message: 'Please confirm that you want to delete the record',
                            buttons: {
                                ok: {
                                    label: "Yes",
                                    className: "btn-primary",
                                    callback: function () {
                                        fnDeleteRow(id);

                                        $("#${tableName}_btnDeleteRow").addClass('disabled');
                                    }
                                },

                                cancel: {
                                    label: "Cancel",
                                    className: "btn-default",
                                    callback: function () {
                                    }
                                }
                            }
                        });
                    }
					return false;
				},
				fnStartProcessingMode: function () {
					$("#processing_message").dialog();
				},
				fnEndProcessingMode: function () {
					$("#processing_message").dialog("close");
				},
				aoColumns: [${columnConfigDataTablesEditable}],
				aoTableActions: [{
					sAction: "EditData",
					sServerActionURL: "/${customUrl}/add",
					oFormOptions: {autoOpen: false, modal: true}
				}]
			});

			//Overriding standard search behavior to search when enter is hit instead of any key
			//$('.dataTables_filter input').unbind('keypress keyup').bind('keypress keyup', function(e){
			//  if ($(this).val().length > 0 && e.keyCode != 13) return;
			//   standardTable.fnFilter($(this).val());
			// });

			//Hides the add and delete button depending on the setting for this table
			if (${allowAdd} == false
			)
			{
				$("#" + tableName + "_btnAddNewRow").css("display", "none");
			}

			if (${allowDelete} == false)
			{
				$("#" + tableName + "_btnDeleteRow").css("display", "none");
			}

			//hides the fields not relevant on the add new entity form
			$('.hideOnForm').css('display', 'none');

			//turns date fields into date pickers
			$('#Date').datetimepicker({
				format: '${applicationDateFormat}'
			});

			// make buttons pretty
			$(".button").button();

			//add edit form click functionality
			$("#" + tableName + "_EditRowButton").on("click", function (event) {
				var form = $("#" + tableName + "_formAddNewRow");

				//validate the form
				if (form.valid()) {
					//get id from idHolder
					var entityID = $("#idHolder").attr("name");
					var formData = form.serialize();

					$("#" + tableName + "_formAddNewRow").css('cursor', 'wait');
					$.customBlockUI();
					$.ajax({
						type: "POST",
						url: tableConfig.postformedit + entityID,
						data: formData,
						dataType: "json",
						success: function (data) {
							$("#" + tableName + "_formAddNewRow").css('cursor', 'default');
							$("#idHolder").attr("name", "");
							//reload data

							//var nNodes = standardTable.fnGetNodes(0);
							standardTable.fnDraw();
							//fake a dialog close
							$(form)[0].reset();
							$(".error", $(form)).html("");
							$("#" + tableName + "_btnAddNewRowCancel").click();
							$.unblockUI();

						},
						error: function (xhr, ajaxOptions, thrownError) {
							$("#" + tableName + "_formAddNewRow").css('cursor', 'default');
							form.find("#lblAddError").show().append(xhr.responseText);
							$.unblockUI();
						}
					});
				}
				//avoid executing the actual submit
				return false;
			});

			$("#" + tableName + "_btnAddNewRow").on("click", function (event) {
				$("#" + tableName + "_btnAddNewRowOk").show();
				$("#" + tableName + "_EditRowButton").hide();
				$("#" + tableName + "_formAddNewRow")[0].reset();
			});
		};
	})(jQuery);


	function setDefaults(tableConfig) {
		if (!tableConfig.sAjaxSource) {
			tableConfig.sAjaxSource = "/${customUrl}/data";
		}
		if (!tableConfig.sUpdateURL) {
			tableConfig.sUpdateURL = "/${customUrl}/edit";
		}
		if (!tableConfig.sDeleteURL) {
			tableConfig.sDeleteURL = "/${customUrl}/delete";
		}
		if (!tableConfig.sAddURL) {
			tableConfig.sAddURL = "/${customUrl}/add";
		}
		
		if(!tableConfig.sDom) {
			tableConfig.sDom = 'lfrtip ';
		}
		
		if(!tableConfig.aaSorting) {
			tableConfig.aaSorting = [[0,'asc']];
		}

		if (!tableConfig.postformedit) {
			tableConfig.postformedit = "/${customUrl}/postformedit?entityID=";
		}

		if (!tableConfig.loadEditForm) {
			tableConfig.loadEditForm = function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {
				var tableName = '${tableName}';
				$("#mainColumn").css('cursor', 'wait');
				$.customBlockUI();
				var entityID = aData[0];
				$("#" + tableName + "_formAddNewRow")[0].reset();
				$.ajax({
					type: "GET",
					url: "/${customUrl}/prepareformedit?entityID=" + entityID,
					dataType: "json",
					cache: false,
					success: function (data) {
						$("#mainColumn").css('cursor', 'default');
						
						if(tableConfig.loadEditFormCallback) {
							tableConfig.loadEditFormCallback(data);
						}

						$("#" + tableName + "_formAddNewRow").populateForm(data, 'id');

						//stuff the entityID in the idHolder in the form for later use
						$("#idHolder").attr("name", entityID);
						//$("#"+tableName+"_btnAddNewRow").click();
						$("#" + tableName + "_formAddNewRow").dialog("open");
//						$("#" + tableName + "_formAddNewRow").dialog("option", "width", "500");
//						$("#" + tableName + "_formAddNewRow").dialog("option", "position", {my: "center", at: "top", of: window});
						$("#" + tableName + "_btnAddNewRowOk").hide();
						$("#" + tableName + "_EditRowButton").show();
						$.unblockUI();
					},
					error: function (xhr, ajaxOptions, thrownError) {
						$("#mainColumn").css('cursor', 'default');
						$.unblockUI();
						alert("Error " + xhr.status + ": " + thrownError);
					}
				});
			}
		}

	}
</script>
