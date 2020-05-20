<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<img src="img/pidgeyTexto.png" /> <a class="navbar-brand"
				href="index.jsp">PidHei</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="Login.jsp">Login</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false">Listas</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item"
							href="ListarProjetos.jsp">Projetos</a></li>
						<li><a class="dropdown-item" href="ListarClientes.jsp">Clientes</a></li>
						<li><a class="dropdown-item"
							href="ListarColaboradores.jsp">Colaboradores</a></li>
					</ul></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false">Cadastros</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item"
							href="CadastroProjeto.jsp">Projetos</a></li>
						<li><a class="dropdown-item" href="CadastroCliente.jsp">Clientes</a></li>
					</ul></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
<br>
<br>
<br>
<br>