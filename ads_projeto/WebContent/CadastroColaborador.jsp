<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/3.3/examples/starter-template/">

<title>Cadastrar Cliente</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="starter-template.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]--
    <c:import url="Style.jsp" />
</head>
<body>
	<!-- importa o menu do sistema -->
<c:import url="Menu.jsp" />
<!-- conteiner principal -->
<div class="container">
	<div class="row">
		<h1>Cadastro Colaborador</h1>
		<div class="lead">
			<p>Digite os dados do colaborador para cadastrar</p>
		</div>
	</div>

	<form action="manter_filmes.do" method="POST">
		<div class="form-group">
			<div class=row>
				<div class="col-md-3">
					<label>Nome:</label><input type="text" class="form-control"
						name="titulo" required />
				</div>
				<div class="col-md-3">
					<label>Sobrenome:</label><input type="text" class="form-control"
						name="titulo" required />
				</div>

				<div class="col-md-5">
					<label>E-mail:</label><input type="text" class="form-control"
						name="titulo" required />
				</div>
				<div class="col-md-3">
					<label>Senha:</label><input type="data" class="form-control"
						name="data" required />
				</div>
				<div class="col-md-3">
					<label>CPF:</label><input type="data" class="form-control"
						name="data" required />
				</div>
				<div class="col-md-3">
					<label>Telefone:</label><input type="data" class="form-control"
						name="data" required />
				</div>
			</div>
		</div>


		<div id="actions" class="row">
			<div class="col-md-12">
				<button type="submit" class="btn btn-primary" name="acao"
					value="btn-inserir-de-inserir-filme-jsp">Inserir</button>
				<a href="index.jsp" class="btn btn-default">Voltar</a>
			</div>
		</div>
	</form>
</div>
<!-- /.container -->


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="js/vendor/jquery.min.js"><\/script>')
</script>
<script src="js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>