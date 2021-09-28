<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="java.util.List, br.com.gulliver.project.parques.servlet.Parque"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traveller - Parques de São Paulo</title>
</head>
<body>
<h1>Parques de São Paulo</h1>
<table border="1">
    <tr>
        <th>Nome do Parque</th>
        <th>Horário de Funcionamento</th>
        <th>Localização</th> 
    </tr>
       
  	<c:forEach items="${parques}" var="parque">
  		<tr>
	  		<td><a href="${parque.urlSiteOficial}" title="${parque.descricao}"> ${parque.nome}</a></td>
	  		<td>${parque.horarioFuncionamento}</td>
	  		<td>${parque.localizacao}</td>
	  		<td>
				<a href="/gulliver-project-list-parques/editParque?id=${parque.id}">Editar </a>
			   	<a href="/gulliver-project-list-parques/removeParque?id=${parque.id}">Excluir </a>
			</td>
  		</tr>
	</c:forEach>

   
</table>
</body>
</html>