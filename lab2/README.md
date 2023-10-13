# Lab 2 - 108712

## what is jetty
Jetty is a web server which can be easily embedded into Java applications.

## Ex2.1 a

STEPS:

### 3.3
2023-09-28 11:45:18.819:INFO::main: Logging initialized @61ms
2023-09-28 11:45:18.835:INFO:oejs.Server:main: jetty-9.2.15.v20160210
2023-09-28 11:45:18.876:INFO:oejs.ServerConnector:main: Started ServerConnector@3b5672{HTTP/1.1}{0.0.0.0:8680}
2023-09-28 11:45:18.876:INFO:oejs.Server:main: Started @120ms
org.eclipse.jetty.server.Server@71dac704 - STARTED
 += qtp764977973{STARTED,8<=8<=200,i=3,q=0} - STARTED
 |   +- 13 qtp764977973-13 TIMED_WAITING @ sun.misc.Unsafe.park(Native Method) IDLE
 |   +- 15 qtp764977973-15-selector-ServerConnectorManager@5a884276/1 RUNNABLE @ sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
 |   +- 18 qtp764977973-18-acceptor-0@efcb9dd-ServerConnector@3b5672{HTTP/1.1}{0.0.0.0:8680} RUNNABLE @ sun.nio.ch.ServerSocketChannelImpl.accept0(Native Method)
 |   +- 12 qtp764977973-12 TIMED_WAITING @ sun.misc.Unsafe.park(Native Method) IDLE
 |   +- 14 qtp764977973-14 TIMED_WAITING @ sun.misc.Unsafe.park(Native Method) IDLE
 |   +- 16 qtp764977973-16-selector-ServerConnectorManager@5a884276/2 RUNNABLE @ sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
 |   +- 17 qtp764977973-17-selector-ServerConnectorManager@5a884276/3 RUNNABLE @ sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
 |   +- 11 qtp764977973-11-selector-ServerConnectorManager@5a884276/0 RUNNABLE @ sun.nio.ch.EPollArrayWrapper.epollWait(Native Method)
 += ServerConnector@3b5672{HTTP/1.1}{0.0.0.0:8680} - STARTED
 |   +~ org.eclipse.jetty.server.Server@71dac704 - STARTED
 |   +~ qtp764977973{STARTED,8<=8<=200,i=3,q=0} - STARTED
 |   += org.eclipse.jetty.util.thread.ScheduledExecutorScheduler@439f5b3d - STARTED
 |   +- org.eclipse.jetty.io.ArrayByteBufferPool@123772c4
 |   += HttpConnectionFactory@2d363fb3{HTTP/1.1} - STARTED
 |   |   +- HttpConfiguration@7d6f77cc{32768/8192,8192/8192,https://:0,[]}
 |   += org.eclipse.jetty.server.ServerConnector$ServerConnectorManager@5a884276 - STARTED
 |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector@e2d56bf keys=0 selected=0 id=0
 |   |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:600)
 |   |   |   +- sun.nio.ch.EPollSelectorImpl@22a4c0e9 keys=0
 |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector@5fdef03a keys=0 selected=0 id=1
 |   |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:600)
 |   |   |   +- sun.nio.ch.EPollSelectorImpl@6aa3133b keys=0
 |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector@3b22cdd0 keys=0 selected=0 id=2
 |   |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:600)
 |   |   |   +- sun.nio.ch.EPollSelectorImpl@43dd3562 keys=0
 |   |   +- org.eclipse.jetty.io.SelectorManager$ManagedSelector@1e81f4dc keys=0 selected=0 id=3
 |   |       +- org.eclipse.jetty.io.SelectorManager$ManagedSelector.select(SelectorManager.java:600)
 |   |       +- sun.nio.ch.EPollSelectorImpl@766609af keys=0
 |   +- sun.nio.ch.ServerSocketChannelImpl[/0:0:0:0:0:0:0:0:8680]
 |   +- qtp764977973-18-acceptor-0@efcb9dd-ServerConnector@3b5672{HTTP/1.1}{0.0.0.0:8680}
 |
 +> sun.misc.Launcher$AppClassLoader@7d4991ad
     +- file:/tmp/cp_axgqf9m3ofr4h2l6jje3rtnqp.jar
     +- sun.misc.Launcher$ExtClassLoader@13221655

### 3.5
2023-09-28 11:46:40.279:INFO::main: Logging initialized @65ms
2023-09-28 11:46:40.303:INFO:oejs.Server:main: jetty-9.2.15.v20160210
2023-09-28 11:46:40.357:INFO:oejs.ServerConnector:main: Started ServerConnector@532760d8{HTTP/1.1}{0.0.0.0:8680}
2023-09-28 11:46:40.358:INFO:oejs.Server:main: Started @146ms

- `String msg = request.getParameter("msg");` 
- `http://127.0.0.1:8680/?msg=”Hard workers welcome!”`

## Ex 2.2

[Servlet Parameters Example](https://examples.javacodegeeks.com/java-development/enterprise-java/servlet/java-servlet-url-parameters-example/)

-> Neste exercćio tive que ir "pelo caminho mais difícil, uma vez que uso VS Code em vez do IntelIj. Por este razão tive que fazer os seguintes passos: </br>
 - Depois de adaptar o código, dar build no projeto: mvn clean package
 - Criei um dockerfile na root do projeto onde especifica a imagem (Tomcat) -> FROM tomcat:latest; e copiar o "war" file para a diretoria de webapps do tomcat -> COPY ./target/JakartaWebStarter-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
 - Depois foi apenas fazer build da imagem do docker (docker compose build) e dar deploy (docker compose up -d).
 - Finalmente, ao aceder ao site através de `http://localhost:8080/JakartaWebStarter-1.0-SNAPSHOT/`, conseguimos aceder à nossa webapp.
 
### Test training

2.1 Server-side programming with servlets:

Servlets are Java classes that run on the server and handle client requests.
They must be deployed into a Servlet Container (e.g., Tomcat) to be used.
HttpServlet is the most commonly used type of Servlet.
Servlet Containers handle multiple requests concurrently.
Servlets receive requests from the server and process them.
You can implement an embedded server using Jetty.
You can adapt an example to allow users to send custom messages as URL parameters.
Potential Test Questions:

What is a Servlet, and how does it differ from a standard Java class?
Explain the role of a Servlet Container in server-side programming with servlets.
What is an embedded server, and how does it differ from a dedicated application server?
How can users send custom messages as URL parameters to a Servlet?
Describe the key steps involved in implementing a Servlet using Jetty.
2.2 Server-side programming and application servers (Tomcat):

In enterprise scenarios, dedicated application servers like Apache Tomcat are commonly used.
You can run Tomcat in a Docker container.
Jakarta EE applications can be created for web development.
Servlets can be used within Jakarta EE applications.
You can deploy a Jakarta EE application as a ".war" (Web Archive) file.
Docker and docker-compose can be used for deployment.
Potential Test Questions:

What are dedicated application servers, and why are they used in enterprise scenarios?
Explain the process of running Apache Tomcat in a Docker container.
What is Jakarta EE, and how can you create a Jakarta EE web application?
What is the purpose of a ".war" file in Jakarta EE web development?
How can Docker and docker-compose be used for deploying Jakarta EE applications?
2.3 Introduction to web development with Spring Boot:

Spring Boot is a rapid application development platform built on the Spring Framework.
It simplifies configuration and allows for the creation of production-grade applications.
Spring Initializr can be used to create Spring Boot projects.
Spring Boot projects can be built and run using Maven or the provided Maven wrapper.
Spring Boot can serve web content using embedded servers.
Spring Boot supports REST endpoints.
Potential Test Questions:

What is Spring Boot, and how does it simplify application development?
Explain the role of Spring Initializr in creating Spring Boot projects.
How can you build and run a Spring Boot application using Maven?
Describe how Spring Boot serves web content using embedded servers.
What is a REST endpoint, and how can you create one using Spring Boot?

Na secção 2.4, abordamos a capacidade do Jakarta EE para criar aplicações complexas e robustas para cenários exigentes. Frequentemente, não é necessário um servidor de aplicações completo, mas sim recursos suficientes para executar aplicações web/serviços web. Vários servidores oferecem uma versão "reduzida" associada a um "Perfil Web" adequado, por exemplo, para implementar uma API sobre HTTP, como exemplificado no guia anterior sobre RESTful.

a) Criar um serviço web (API REST) para disponibilizar citações aleatórias de filmes/séries, com suporte para três endpoints listados abaixo.

Notas:

Não é necessário usar um banco de dados real; considere usar informações "estáticas" por enquanto.
Todas as respostas devem ser formatadas como dados JSON.
Endpoints:

Método GET api/quote: Retorna uma citação aleatória (sem especificar o programa).
Método GET api/shows: Lista todos os programas disponíveis (para os quais existe pelo menos uma citação). Cada programa deve ter um identificador/código para conveniência.
Método GET api/quotes?show=<show_id>: Retorna as citações existentes para o programa/filme especificado.
Certifique-se de enviar as alterações para o servidor remoto!

Potenciais perguntas de teste:

O que é o Jakarta EE, e por que é útil para criar aplicações robustas?
Explique a ideia de um "Perfil Web" em Jakarta EE e quando ele é apropriado.
Como você pode criar um serviço web (API REST) para oferecer citações aleatórias usando Jakarta EE?
Quais são os três endpoints necessários para este serviço e qual é a finalidade de cada um?
Como você formataria as respostas deste serviço web?

*****************************************************************************

## Ex 2.4

-> Controler:
private static final String quote = "Hello, gorgeous.";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/quote")
	**************** mudamos aqui o url
	public Greeting greeting() {
		return new Greeting(counter.incrementAndGet(), quote);
	}
