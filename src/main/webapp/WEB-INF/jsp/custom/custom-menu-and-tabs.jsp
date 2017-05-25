<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/styles/custom/custom-menu-and-tabs.min.css" />
</head>
<body class="container-fluid">
    <section>
        <h3>
            User Information
        </h3>
        <table>
            <tbody>
                <tr>
                    <td>
                        <label>
                            Corporate User Name:
                        </label>
                    </td>
                    <td>
                        ${data.corporateUserName}
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>
                            Corporate User Department:
                        </label>
                    </td>
                    <td>
                        ${data.corporateUserPrimaryDepartment}
                    </td>
                </tr>
            </tbody>
        </table>
    </section>

    <section>
        <h3>${data.entityType} Information</h3>

        <table>
            <tbody>
                <tr>
                    <th>
                        ${data.entityType} IDs
                    </th>
                    <th>
                        ${data.entityType} Names
                    </th>
                </tr>
                <c:forEach items="${data.nameIdMap}" var="nameId">
                    <tr>
                        <td>
                            ${nameId.key}
                        </td>
                        <td>
                            ${nameId.value}
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </section>
</body>
</html>