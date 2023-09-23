# Nota:
-> as pastas não estão devidamente organizadas. A pasta "myweatherradar corresponde ao exercício 1.2 (lab1_2)<br />
-> A pasta "ex1_4_docker" corresponde ao exercício 1.4 (lab1_4)

## What to include in the notebook? 
This should be a notebook that you (or other learner) could 
use for study; during the lab activities: take note of key concepts, save some important/useful
links, maybe paste some key visuals on the topics being addressed, etc. Think of the notebook 
as a “notes to self” resource, explaining and summarizing the key concepts and practices of the 
lab.

## Ex3
### alínea e
Para mudar o nível do logger de level "info" para "debug" e mostrar as respetivas mensagens:
logger.debug("Debug Message Logged !!!");
logger.info("Info Message Logged !!!");
em
<Loggers>
    	<!--        AQUI -->
        <Root level="debug" additivity="false">
            <AppenderRef ref="console" />
        </Root>
</Loggers>
-> funciona por hierarquia, se tiver o debug, apresenta o info também!!
error, warning, info e debug são os níveis existentes.
Recomenda-se usar o logger, em vez do SOUT para fazer debug

### alínea f
git log --reverse mostra o histórico dos commits

## Ex4
Docker is an open source platform that enables developers to build, deploy, run, update and manage containers—standardized, executable components that combine application source code with the operating system (OS) libraries and dependencies required to run that code in any environment.<br /><br />

-> A container is a sandboxed process running on a host machine that is isolated from all other processes running on that host machine.<br />

-> Quando aparece o erro: Error saving credentials: error storing credentials - err: exit status 1, out: `error getting credentials - err: exit status 1, out: `exit status 2: gpg: decryption failed: No secret key“<br />
 
significa que é preciso trocar entre o dcoker cliente e o docker daemon com este comando: `docker context ls`