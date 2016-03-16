<jsp:include page="/WEB-INF/jsp/main/dependencies/datatablesFramework.jsp" />
<jsp:include page="/WEB-INF/jsp/main/dataTables/dataTablesDefaultLayout.jsp" />
<jsp:include page="/WEB-INF/jsp/main/dataTables/dataTablesFunctionality.jsp" />

<script type="text/javascript">
    $(document).ready(function() {
        $("#${tableName}").bhDataTable({});
    });
</script>