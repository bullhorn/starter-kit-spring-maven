<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="dataTablesDivWrapper">
	<div class="container2">
		<div id="containerEH">
			<div id="demo_jui">
				<table id="${tableName}" class="display">
					<thead>
						<tr>
							<c:forEach var="entry" items="${columnsMap}">
								<th><c:out value="${entry.value.fieldLabel}"/></th>
							</c:forEach>
						</tr>
					</thead>
					<tbody></tbody>
				</table>
			</div>
		</div>
		<div id="formAddNewRowContainer">
			<!--Form to handle adding new entity. This form is dynamic and will adjust itself depending on the setup of the
			jpa entity in question. The setup is done in the service class for the jpa entity.-->
			<form:form id="${tableName}_formAddNewRow" action="/${customUrl}/add" commandName="newEntity" title="Add new ${entityName}">
				<div id="idHolder" class="hide"></div>

				<div id="tableWrapper" class="modal hide fade">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h3>Add</h3>
					</div>
					<div id="tableWrapperInner" class="modal-body">
						<label id="lblAddError" class="error"></label>
						<table id="${tableName}_formTable">
							<c:forEach var="entityEntry" items="${columnsMap}" varStatus="currentRow">
								<tr class="${entityEntry.value.fieldType.cssClass} ${entityEntry.value.showOnForm.cssClass} formRow">
									<td><label class="formLabel" for="<c:out value="${entityEntry.value.fieldName}" />">
										<c:out value="${entityEntry.value.fieldLabel}"/>
									</label> <c:if test="${entityEntry.value.required == true}">
										<div class="required">*</div>
									</c:if></td>
									<td><c:choose>
										<c:when test="${entityEntry.value.fieldType.cssClass == 'select'}">
											<c:choose>
												<c:when test="${entityEntry.value.showOnForm.cssClass == 'hideOnForm'}">
													<form:select path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}" readonly="true">
														<option></option>
														<form:options items="${dropDownFiller[entityEntry.value.fieldName]}"/>
													</form:select>
												</c:when>
												<c:otherwise>
													<form:select path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}">
														<option></option>
														<form:options items="${dropDownFiller[entityEntry.value.fieldName]}"/>
													</form:select>
												</c:otherwise>
											</c:choose>
										</c:when>
										<c:when test="${entityEntry.value.fieldType.cssClass == 'yesNo'}">
											<c:choose>
												<c:when test="${entityEntry.value.showOnForm.cssClass == 'hideOnForm'}">
													<form:select path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}" readonly="true">
														<option></option>
														<form:options items="${dropDownFiller['yesNo']}"/>
													</form:select>
												</c:when>
												<c:otherwise>
													<form:select path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}">
														<option></option>
														<form:options items="${dropDownFiller['yesNo']}"/>
													</form:select>
												</c:otherwise>
											</c:choose>
										</c:when>
										<c:when test="${entityEntry.value.fieldType.cssClass == 'textarea'}">
											<form:textarea path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}"/>
										</c:when>
										<c:otherwise>
											<form:input type="${entityEntry.value.fieldType.inputType}" path="${entityEntry.value.fieldName}" rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}"/>
										</c:otherwise>
									</c:choose></td>
									<td id="${entityEntry.value.fieldName}Error">
										<form:errors path="${entityEntry.value.fieldName}" cssClass="error"/></td>
								</tr>
							</c:forEach>
						</table>
					</div>

					<div id="buttonWrapper" class="modal-footer">
						<button id="${tableName}_EditRowButton" value="Save" class="btn btn-primary hide">Save</button>
						<button id="${tableName}_btnAddNewRowOk" value="Ok" class="add_row btn btn-primary">Add</button>
						<button id="${tableName}_btnAddNewRowCancel" value="cancel" class="delete_row btn btn-default">Cancel
						</button>
					</div>
				</div>
			</form:form>
		</div>
		<div id="editFormPlaceHolder"></div>
	</div>
</div>