<%@ page import="br.ufrn.imd.aulaservlet.dominio.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Inicial Servlet</title>
</head>
<body>
<p>
 Usuário: <b> <%= ((Usuario) session.getAttribute("usuario")).getNome() %> </b>
</p> 
</body>
</html>