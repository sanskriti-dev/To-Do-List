<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<html>
    <head></head>
<body>
    <sql:setDataSource var = "db" driver = "com.mysql.jdbc.Driver"

url = "jdbc:mysql://localhost:3309/d1"
user = "root" password = "123456"/>
  <sql:update dataSource = "${db}" var = "result">
                    INSERT INTO todo VALUES ("${param.todos}");
                </sql:update>
                    <meta http-equiv="refresh" content="0;url=index.jsp">
    </body>
</html>
