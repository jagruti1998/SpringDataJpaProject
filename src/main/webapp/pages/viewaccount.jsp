<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<html>
    <head><title>Bank Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
       <style type="text/css">
         h3{
    color: #DC143C;padding: 20px;margin-right: 33px;font-family: Cursive,Lucida Handwriting;
          }
          #td{
    color: #DC143C;font-family: Cursive,Lucida Handwriting;
           }
           #td2{
           font-family: Cursive,Lucida Handwriting;
}
         a{
           margin-left: 20px;font-family: Cursive,Lucida Handwriting;margin-top: 25px;
         }
         table{
           margin-left: 20px;font-size: 120%;
         }
       </style> 
    </head>
    <body>
 
         <sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/sample1"
                           user="root"  password="root"/>
 
        <sql:query dataSource="${dbsource}" var="result">
            SELECT * from bankdetails where id=?;
            <sql:param value="${param.id}" />
        </sql:query>
    <h3>Bank Details</h3>
        <form>
            <table>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                      <td id="td">Bank Name :</td><td id="td2"><c:out value="${row.name}"/></td></tr>
                   <tr><td id="td">Branch Name :</td><td id="td2"><c:out value="${row.branch}"/></td></tr>
                   <tr><td id="td">Swift Address :</td><td id="td2"><c:out value="${row.address}"/></td></tr>
                   <tr><td id="td">Account Number :</td><td id="td2"><c:out value="${row.accno}"/></td> </tr>
                   <tr><td  id="td">Currency Type :</td><td id="td2"><c:out value="${row.curr}"/></td> </tr>
                </c:forEach>
            </table>
        </form>
        <a href="view" class="btn btn-danger">Go Back</a>
    
</body>
</html>