# My first Spring App

## [CURSO DE SPRING para INICIANTES | Tutorial de Java Spring](https://www.youtube.com/watch?v=YY_hf0FOIcU&ab_channel=FernandaKipper%7CDev)

### Complementos:

Iniciar:
https://start.spring.io/

Tem que incluir essa dependencia, senao nao roda no vscode

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
```

### GitHub com problemas de aceitar SSH



wendel@dev:~/first-spring-app$ git push -u origin master
Username for 'https://github.com': wfrsilva@gmail.com
Password for 'https://wfrsilva@gmail.com@github.com':
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/wfrsilva/first-spring-app.git/'

O GitHub descontinuou o uso de autenticação por senha para operações de Git via HTTPS. Agora, é necessário usar tokens de acesso pessoal (PAT - Personal Access Token) ou configurar a autenticação via SSH.


#### Solucão:

Gerar um token de acesso pessoal (PAT)
- Acesse sua conta do GitHub e vá para Configurações.
- No menu lateral, clique em Developer settings.
- Clique em Personal access tokens > Tokens (classic).
- Clique no botão Generate new token.
- Dê um nome ao token, selecione o escopo desejado (pelo menos selecione os escopos repo e workflow).
- Clique em Generate token e copie o token gerado. Atenção: você verá o token apenas uma vez, então copie-o e guarde-o em um lugar seguro.

  ![image](https://github.com/user-attachments/assets/057d630c-e422-4e04-b14f-9c0432f5c26c)


```
git remote set-url origin https://<TOKEN>@github.com/usuario/nome-do-repositorio.git
```

## Maven

Precisei instalar o maven no WSL:
```
sudo apt update
sudo apt install maven
```
Verificar a versao do Maven:
```
mvn -v
```

Depois de instalar e configurar o Maven:
```
mvn clean install
```
Instala muitas coisas, no futuro ver se realmente eh necessário.


##application.properties
```
(...)
server.port=8081
(...)
```

## Post
```
curl -X POST http://localhost:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
```
WSL da erro

```
curl -X POST http://127.0.0.1:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
```
```
curl -X POST http://10.0.0.113:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
```

```
wendel@dev:~/first-spring-app$ curl -X POST http://localhost:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
curl: (7) Failed to connect to localhost port 8081 after 1 ms: Couldn't connect to server


wendel@dev:~/first-spring-app$ curl -X POST http://127.0.0.1:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
curl: (7) Failed to connect to 127.0.0.1 port 8081 after 0 ms: Couldn't connect to server


wendel@dev:~/first-spring-app$ curl -X POST http://10.0.0.113:8081/hello-world \
-H "Content-Type: application/json" \
-d '{"name":"Codorna", "email":"codorna@org.com"}'
Hello Codorna Post codorna@org.com


wendel@dev:~/first-spring-app$
```




Problemas para rodar o curl + post no WSL, uma solucao foi ao inves do localhost, colocar o ip da maquina (10.0.0.113)
 
 
Configurar o Spring Boot para aceitar conexões de todas as interfaces, não apenas de localhost. Isso pode ser feito modificando o application.properties para escutar em todas as interfaces:

application.properties

```
server.address=0.0.0.0
```


fonte:
https://chatgpt.com/c/66f30847-318c-8012-a206-77809c1e4882



VScode Rest client
![image](https://github.com/user-attachments/assets/c93a639f-d3ce-4955-8218-ec5872e08ef7)
![image](https://github.com/user-attachments/assets/a055a2c6-9e78-4420-b6df-14dc649f4e10)

