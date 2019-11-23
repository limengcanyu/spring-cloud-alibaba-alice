# RocketMQ

Download & Build from Release

Click here to download the 4.4.0 source release. Also you could download a binary release from here.

Now execute the following commands to unpack 4.4.0 source release and build the binary artifact.

      > unzip rocketmq-all-4.4.0-source-release.zip
      > cd rocketmq-all-4.4.0/
      > mvn -Prelease-all -DskipTests clean install -U
      > cd distribution/target/apache-rocketmq

Start Name Server

      > nohup sh bin/mqnamesrv &
      > tail -f ~/logs/rocketmqlogs/namesrv.log
      The Name Server boot success...

Start Broker

      > nohup sh bin/mqbroker -n localhost:9876 &
      > tail -f ~/logs/rocketmqlogs/broker.log 
      The broker[%s, 172.30.30.233:10911] boot success...

Send & Receive Messages

Before sending/receiving messages, we need to tell clients the location of name servers. RocketMQ provides multiple ways to achieve this. For simplicity, we use environment variable NAMESRV_ADDR

     > export NAMESRV_ADDR=localhost:9876
     > sh bin/tools.sh org.apache.rocketmq.example.quickstart.Producer
     SendResult [sendStatus=SEND_OK, msgId= ...
    
     > sh bin/tools.sh org.apache.rocketmq.example.quickstart.Consumer
     ConsumeMessageThread_%d Receive New Messages: [MessageExt...

Shutdown Servers

    > sh bin/mqshutdown broker
    The mqbroker(36695) is running...
    Send shutdown request to mqbroker(36695) OK
    
    > sh bin/mqshutdown namesrv
    The mqnamesrv(36664) is running...
    Send shutdown request to mqnamesrv(36664) OK
