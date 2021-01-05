<p> Esse exemplo mostra como criar uma aplicação usando quarkus com as seguintes funcionalidades:  </p>

- consumir api externa;
- conexão combanco de dados e persistência de objetos;

<p> Para rodar a aplicação localmente: </p>

- Usando o Intellij: comando mvn install quarkus:dev
- Usando o prompt do windows: navegar até o direório do projeto e rodar o comando mvn install docker:dev
- Criando imagem nativa: cmd /c 'call "path_to_bat_visual_studio\vcvars64.bat" && mvn package -Pnative'


<p> A imagem nativa é um executável que sobe a aplicação de maneira absurdamente rápida. </p>
