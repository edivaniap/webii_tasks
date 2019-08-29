<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Servlet</title>
</head>
<body>
	<form action="logar" method="post">
		<h1>Bem vindo!</h1>
		<fieldset>
			<p>
				<input type="text" name="nomeUsuario" placeholder="Usuário..." />
			</p>
			<p>
				<input type="password" name="senha" placeholder="Senha..." />
			</p>
			<p>
				<input type="submit" value="Logar">
			</p>
		</fieldset>
	</form>
</body>
</html>