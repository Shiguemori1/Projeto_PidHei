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
<title>Pid Hei</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/projeto" rel="stylesheet">
<link rel="sortcut icon" href="img/pidgeyIcone.ico" type="image/ico" />
<c:import url="Style.jsp" />
</head>
<!-- background="img/fundo.jpg" colocar essa imagem dentro da tag body -->
<body>
	<c:import url="Menu.jsp" />
	<h1 id="titulo">Pid Hei</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<br> <br> <br> <br>
				<div class="lead">
					<div class="transbox">
						<p>Um programa para ajudar as empresas nas criações de novos
							projetos e ajuda na comunicação.</p>
					</div>
				</div>
				<div class="col-md-4"></div>
			</div>
			<div class="col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-xs-4"></div>
			<div class="col-xs-4">
				<div class="center-block">
					<img src="img/hora_pipoca.jpg" class="img-responsive" />
				</div>
			</div>
			<div class="col-xs-4"></div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>