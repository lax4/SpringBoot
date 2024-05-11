<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Registration second form</h1>
<form:form method="POST" modelAttribute="user" action="/result">
    <table border="2">
        <tr>
            <td>User Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>password</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td>Conform password</td>
            <td><form:password path="cnfmPassword"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>choose gender:</td>
            <td><form:radiobuttons path="gender" items="${genders}"/></td>
            
        </tr>
        <tr>
            <td>Course:</td>
            <td><form:select path="courses">
                <form:option value="" label="please select"/>
                <form:options value="" items="${courses}"/>
            </form:select></td>
        </tr>
        <tr>
            <td>batchs</td>
            <td><form:checkboxes path="batchs" items="${batchs}"/></td>
           
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="register"/></td>
        </tr>
    </table>
</form:form>