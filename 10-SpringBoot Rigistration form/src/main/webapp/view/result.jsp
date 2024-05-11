<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="2">
    <tr>
        <td>User Name:</td>
        <td>${users.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${users.email}</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${users.gender}</td>
    </tr>
    <tr>
        <td>Choose the following Course</td>
        <td>
            <c:forEach var="course" items="${users.courses}">
                <c:out value="${course}"/>
            </c:forEach>
        </td>
    </tr>
    <tr>
        <td>You have chosen the following batch</td>
        <td>
            <c:forEach var="batch" items="${users.batchs}">
                <c:out value="${batch}"/>
            </c:forEach>
        </td>
    </tr>
</table>
