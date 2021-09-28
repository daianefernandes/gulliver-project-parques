<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traveller - Cadastro de Parques</title>
</head>
<body>
	<h1>Cadastro de Parques</h1>
	<form action="/gulliver-project-list-parques/newParque" method="post" >
	Nome: <input type="text" name="nome"/>
	Localização: <input type="text" name="localizacao"/>
	Site: <input type="url" name="site"/>
	<input type="submit" />
	</form>

</body>
</html>