<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SICONE - Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://fonts.googleapis.com/css?family=Opens+Sans"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="css/fontawesome-all.min.css" />
<link rel="stylesheet" type="text/css" href="css/style_login.css" />
<script src="main.js"></script>
</head>

<body>
	<%
		String msg = (String) session.getAttribute("MENSAGEM");
		if (msg != null) {
			session.setAttribute("MENSAGEM", null);
	%>
	<h3>
		<script>("<%=msg%>
			")
		</script>
	</h3>
	<%
		}
	%>

	<!-- start LOGIN page -->
	<div class="meio">
		<header>
		<h1>
			<img src="imgs/sicone_logo.png" alt="" width="600" height="600">
		</h1>
		<h1>Sistema Integrado de Controle de Estoque</h1>
		</header>
		<form name="login" method="post" action="">
			<input type="text" name="id" id="TXTUSER" placeholder="ID" /> <input
				type="password" name="senha" id="TXTPASS" placeholder="Senha" /> </br>
			<button type="submit" id="btnEntrar">Entrar</button>
		</form>
	</div>
	<!-- end LOGIN page-->
</body>

</html>