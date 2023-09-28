# Lab 2 - 108712

## what is jetty
Jetty is a web server which can be easily embedded into Java applications.

## Ex2.1 a

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