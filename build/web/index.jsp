<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
<head>
	<title>To-Do List App</title>
	<!--<link rel="stylesheet" type="text/css" href="main.css">-->
	<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.js" ></script>
        <style type="text/css" >
            .container{
	width: 40%;
	margin: 100px auto;
	/*border: 1px solid black;*/
}
input{
	font-size: 21px;
	color: white;
	background-color: #FBAB76;
	width: 100%;
	padding: 13px 13px 13px 20px;
	box-sizing: border-box;
	border: 3px solid rgba(0,0,0,0);
}

::placeholder { 
   color: #F76707;
}

h1{
	background-color: #343A40;
	margin: 0;
	padding: 10px 20px;
	font-size: 36px;
	font-weight: normal;
	color: white;
}
.id1{
    color:black;
}
i{
	font-size: 80%;
	cursor: pointer;
	padding-right: 2px;
}

#rr{
	border-radius: 3px;
}

body{
	background-color: #F76707;
	color: #F76707;
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

li{
	height: 40px;
	line-height: 40px;
	background-color: #FEF0E7;
	margin: 3px 0;
	padding: 8px 8px 8px 26px;
	font-size: 26px;
}

.done{
	color:gray;
	text-decoration: line-through;
}
a{ color: inherit; } 
        </style>
</head>
<body>
     <sql:setDataSource var = "db" driver = "com.mysql.jdbc.Driver"

url = "jdbc:mysql://localhost:3309/d1"
user = "root" password = "123456"/>
    <form method="POST" action="insert.jsp" >
        <div class="container">
		<h1 id="rr"> <i class="fas  fa-list-ul"></i> TO  DOS</h1>
        <input id="rr" type="text" placeholder="Enter a new To-Do" name="todos">
                <sql:query dataSource = "${db}" var = "result">
SELECT * from todo;
</sql:query>
<c:forEach var = "row" items = "${result.rows}">
                   <ul>
                       
                <li><c:out value = "${row.todos}"/>  <a href ="delete?param1=${row.todos}"><i class="far fa-trash-alt"></i></a></li>
		    </ul>
</c:forEach>
<input class="id1" type="submit" value="SUBMIT" name="submit" />
	</div>
    </form>

	
	
    <script type="text/javascript" >
        $("ul").on("click","li",function(){
// jquery only on existing elements
	$(this).toggleClass("done");
} );

$("ul").on("click", "span", function(argument) {
	$(this).parent().fadeOut(1000,function(){
		// $(this).remove();
	});
	event.stopPropagation();
});

$("input").keypress( function(event){
	if (event.which === 13) {
		var todo = $(this).val();
                delete(todo);
		$(this).val("");
		$("ul").append("<li id=\"rr\" > "+ todo + " <span><i class=\"fas fa-trash-alt\"></i></span> </li>");

	}
} );
    </script>
</body>
</html>