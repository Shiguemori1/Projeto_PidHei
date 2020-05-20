<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Lista de Projetos</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/projeto" rel="stylesheet">
<link rel="sortcut icon" href="img/pidgeyIcone.ico" type="image/ico" />
<c:import url="Style.jsp" />
</head>
<body>
	<c:import url="Menu.jsp" />
	
	<!-- Teste Tabela  -->
		<table class="table table-striped">
					<thead>
						<tr>
							<th>&nbsp;</th>
							<th>Número do Projeto</th>
							<th>Nome do Projeto</th>
							<th>Tamanho Funcional</th>				
						</tr>
					</thead>
					<tbody>
						<c:forEach var="filme" items="${filmes}">
							<tr>
								<td>
									<div class="checkbox">
										<label>
											<input type="checkbox" name="box${filme.id}" onClick="tratarBotoes(this)">
										</label>
									</div>
								</td>
								<td>${filme.id}</td>
								<td>${filme.titulo}</td>
								<td>${filme.titulo}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
	
	
	<!-- Fim Teste Tabela -->

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>