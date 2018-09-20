<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>SICONE Login</title>
		<link rel="icon" href="./imgs/favicon.png" type="image/x-icon" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/fontawesome-all.min.css" />
		
		<script src="main.js"></script>
	</head>

	<body>
		<%
			String msg = (String) session.getAttribute("MENSAGEM");
			if (msg != null) {
				session.setAttribute("MENSAGEM", null);
		%>
		<h3>
			<script>("<%=msg%>")</script>
		</h3>
		<%
			}
		%>

		<header>
			<h1>
				<img src="imgs/sicone_logo.png" alt="SICONE" width="600" height="500">
			</h1>
			<h1>Sistema Integrado de Controle de Estoque</h1>
		</header>
		
		
		<form name="login" method="post" action="">
  			<div class="form-group">
    			<label for="exampleInputEmail1">ID</label>
    			<input type="text" class="form-control form-control-lg" id="TXTUSER" aria-describedby="emailHelp" placeholder="Insira seu ID">
    			<small id="emailHelp" class="form-text text-muted">Não compartilhe seu ID ou senha com ninguém.</small>
  			</div>
		  	<div class="form-group">
		    	<label for="exampleInputPassword1">Password</label>
		    	<input type="password" class="form-control form-control-lg" id="TXTPASS" placeholder="Insira sua Senha">
		  	</div>
  			<button type="submit" class="btn btn-primary" id="btnEntrar">Entrar</button>
		</form>

	</body>

</html>