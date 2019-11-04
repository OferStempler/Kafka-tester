1. Run zookeer server


2. Run kafka server:
2.1 (Dont forget to define your kafka logs in Kafka_Home\config\server.properties -> log.dirs=Kafka_Home/kafka-logs



go to kafka home: 
win cmd: .\bin\windows\kafka-server-start.bat .\config\server.properties

If Kafka fails with to start:
1. stop zk
2. delete zookeeper log file:  zookeeper-3.x.x\bin\zookeeper-3.x.xdata\version-2\ and delete the latest log.xx files
3. restart zk.
4. restart kafka.


Test with Postman:
http://localhost:9000/kafka/publish?message=1234
