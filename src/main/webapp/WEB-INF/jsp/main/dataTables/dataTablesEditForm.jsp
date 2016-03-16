<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:include page="/WEB-INF/jsp/main/dependencies/datatablesFramework.jsp" />


<script type="text/javascript">
	$(document).ready(function() {

		$("#submitEntityForm").on("click", function() {
			alert("submit?");
		});

	});
</script>

<div id="editFormWrapper">
	<!--Form to handle adding new entity. This form is dynamic and will adjust itself depending on the setup of the
			jpa entity in question. The setup is done in the service class for the jpa entity.-->
	<form:form id="formEditEntity" commandName="editEntity" title="Edit ${entityName}">
		<label id="lblAddError" class="error"></label>
		<table>
			<c:forEach var="entityEntry" items="${columnsMap}" varStatus="currentRow">
				<tr class="${entityEntry.value.fieldType.cssClass} ${entityEntry.value.showOnForm.cssClass}">
					<th><label for="<c:out value="${entityEntry.value.fieldName}" />"><c:out
								value="${entityEntry.value.fieldLabel}" /></label> <c:if test="${entityEntry.value.required}">
							<span class="red">*</span>
						</c:if></th>
				</tr>
				<tr class="${entityEntry.value.fieldType.cssClass} ${entityEntry.value.showOnForm.cssClass}">

					<c:choose>
						<c:when test="${entityEntry.value.fieldType.cssClass == 'select'}">
							<th><form:select items="${dropDownFiller[entityEntry.value.fieldName]}"
									path="${entityEntry.value.fieldName}" rel="${currentRow.index}"
									cssClass="${entityEntry.value.fieldType.cssClass}" /></th>
						</c:when>
						<c:when test="${entityEntry.value.fieldType.cssClass == 'yesNo'}">
							<th><form:select items="${dropDownFiller['yesNo']}" path="${entityEntry.value.fieldName}"
									rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}" /></th>
						</c:when>
						<c:otherwise>
							<th><form:input type="${entityEntry.value.fieldType.inputType}" path="${entityEntry.value.fieldName}"
									rel="${currentRow.index}" cssClass="${entityEntry.value.fieldType.cssClass}" /></th>
						</c:otherwise>
					</c:choose>


					<td><form:errors path="${entityEntry.value.fieldName}" cssClass="error" /></td>
				</tr>

			</c:forEach>
		</table>
		<button id="submitEntityForm" value="Ok" class="add_row">Save</button>
		<button id="${tableName}_btnAddNewRowCancel" value="cancel" class="delete_row">Cancel</button>
	</form:form>

</div>

