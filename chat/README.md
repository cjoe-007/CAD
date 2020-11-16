#Blog y Chat

Estimados CAD, un gusto saludarlos, les comento que de los ejercicios enviados escogí dos el del Blog y el Chat, a continuación describo como ejecutar en sus ambientes.

Herramientas utilizadas
- Windows 10
- Eclipse Oxygen
- Maven 3.6.3
- git 
- wildfly-21.0.0.Final
- Java 8


Repositorios:
- Proyecto: https://github.com/cjoe-007/CAD/tree/main/chat
- Servidor y proyecto: https://drive.google.com/drive/folders/1FN-J1YCGdtRQSofYSZ-evWIYl7NqKPJh

Para generar este proyecto se debe: 

1. Bajar el proyecto (Ver en la sección Repositorio de este documento).

2. Tener instalado maven, una vez que tengan esto en una consola acceder hasta la carpeta del proyecto y digitar: "mvn clean install"

3. Bajar el servidor en este caso  wildfly-21.0.0.Final (Ver en la sección Repositorio de este documento).

4. De la carpeta del proyecto, dirigirse hacia target y copiar el war "chat.war", este archivo pegarlo en el servidor dentro de standalone/deployments, el servidor que les copio ya se encuentra con la última versión del proyecto.

5. Para que se levante el servidor dentro del mismo tienen un archivo .bat que se llama "EAP 7.0.bat", dentro de este deberían cambiar la ruta donde guardaro el servidor descomprimido en mi caso "F:\servers\wildfly-21.0.0.Final\bin".

6. En un navegador ingresar a la url: http://localhost:8080/chat/

7. Para el blog como se pedía que se guarde externamente en este caso se va a guardar en la carpeta bin del servidor un txt llamado blog, ahí si modifican la próxima vez aparecerá los cambios en el blog.

8. El chat deben ingresar en distintas pestañas o navegadores y podrán chatear.

De antemano muchas gracias por la oportunidad, quedo atento a cualquier duda, comentario o sugerencia.

Gracias 

José.



