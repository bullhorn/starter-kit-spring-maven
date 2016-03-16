<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/jsp/main/dependencies/datatablesFramework.jsp" />
        <jsp:include page="/WEB-INF/jsp/main/dataTables/dataTablesFunctionality.jsp" />

        <script type="text/javascript">
           // Example on how to configure the datatables with custom parameters. See the dataTablesFunctionality.jsp setDefaults for
           // available configuration points.
            $(document).ready(function() {
                $("#${tableName}").bhDataTable({
                    "sAjaxSource" : "/${customUrl}/data?CustomParameter=${CustomParameter}",
                    "sUpdateURL" : "/${customUrl}/edit?CustomParameter=${CustomParameter}",
                    "sDeleteURL" : "/${customUrl}/delete?CustomParameter=${CustomParameter}",
                    "sAddURL" : "/${customUrl}/add?CustomParameter=${CustomParameter}",
                    "postformedit" : "/${customUrl}/postformedit?CustomParameter=${CustomParameter}&entityID="
                });
            });
        </script>
    </head>
    <body>
        <div id="content">
            <div id="viewWrapper">
                <div class="subHeadlineWrapper">
                    <h3>Example Data Table</h3>
                </div>
                <jsp:include page="/WEB-INF/jsp/main/dataTables/dataTablesDefaultLayout.jsp" />
            </div>
        </div>
    </body>
</html>
