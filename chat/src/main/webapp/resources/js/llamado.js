var nombreUsuario;
var websocket = new WebSocket("ws://localhost:8080/chat/chat");

websocket.onmessage = function(evt) { 
	campoChat.innerHTML += evt.data + "\n";
};

function crearChat() {
    nombreUsuario = campoNuevoUsuario.value;
    websocket.send("*** " + nombreUsuario + " se ha unido!!");
    campoNuevoUsuario.disabled = true;
    btnNuevoUsuario.disabled = true;
    campoChat.disabled = false;
    campoMensaje.disabled = false;
    btnEnviar.disabled = false;
}

function enviar_mensaje() {
    websocket.send(nombreUsuario + ": " + campoMensaje.value);
    campoMensaje.value ='';
}