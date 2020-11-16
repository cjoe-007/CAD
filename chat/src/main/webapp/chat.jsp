<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Centro de autonomía digital</title>
</head>
<body>
	<h2>Sala de chat</h2>
	<form action="">
		<input id="campoNuevoUsuario" name="user" value="" type="text"> 
		<input id="btnNuevoUsuario" onclick="crearChat();" value="Ingresar al chat" type="button">
		
		<br/><br/>
		<textarea id="campoChat" rows="10" cols="30" readonly disabled></textarea>
		
		<br/>
		<input id="campoMensaje" name="message" value="" type="text" disabled>
		<input id="btnEnviar" onclick="enviar_mensaje();" value="Enviar mensaje" type="button" disabled>
		<br/><br/>
		<a href="index.jsf"> <input type="button" value=" <<Regresar" />
		</a>
	</form>

	<script type="text/javascript" src="resources/js/llamado.js">
	</script>
</body>
</html>