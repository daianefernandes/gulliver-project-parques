<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:url value = "/editParque" var="linkServletEditParque" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traveller - Editar Dados do Parque</title>
</head>
<body>
	<form action="${linkServletEditParque}" method="post" >
		Nome: <input type="text" name="nome" value="${parque.nome}"/>
		<input type="hidden" name="id" value="${parque.id}" />
		<input type="submit" />
	</form>
</body>
</html>