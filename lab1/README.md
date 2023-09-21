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