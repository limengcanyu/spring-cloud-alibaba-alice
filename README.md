# spring-cloud-alibaba-alice

## Spring Cloud Alibaba

Spring Cloud Alibaba provides a one-stop solution for distributed application development. It contains all the components required to develop distributed applications, making it easy for you to develop your applications using Spring Cloud.

With Spring Cloud Alibaba, you only need to add some annotations and a small amount of configurations to connect Spring Cloud applications to the distributed solutions of Alibaba, and build a distributed application system with Alibaba middleware.

### Features

- Flow control and service degradation：flow control, circuit breaking and system adaptive protection with Sentinel.

- Service registration and discovery：instances can be registered with Nacos and clients can discover the instances using Spring-managed beans. Supports Ribbon, the client side load-balancer via Spring Cloud Netflix.

- Distributed Configuration：using Nacos as a data store

- Event-driven：building highly scalable event-driven microservices connected with Spring Cloud Stream RocketMQ Binder

- Message Bus: link nodes of a distributed system with Spring Cloud Bus RocketMQ

- Distributed Transaction：support for distributed transaction solution with high performance and ease of use with Seata

- Dubbo RPC：extend the communication protocols of Spring Cloud service-to-service calls by Dubbo RPC

- Alibaba Cloud Object Storage：Spring Resource Abstraction for OSS. Alibaba Cloud Object Storage Service (OSS) is an encrypted, secure, cost-effective, and easy-to-use object storage service that enables you to store, back up, and archive large amounts of data in the cloud

### Getting Started

The easiest way to get started is by including the Spring Cloud BOM and then adding spring-cloud-alibaba-dependencies to your application’s classpath. If you don’t want to include all of the Spring Cloud Alibaba features you can add individual starters for the features you would like.

The spring-cloud-alibaba-dependencies dependency in pom:

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.1.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

The Spring Cloud Alibaba & Spring Cloud & Spring Boot compatibility table: ​

    Spring Cloud Version      Spring Cloud Alibaba Version      Spring Boot Version
    --------                  --------                          --------
    Spring Cloud Greenwich    2.1.x.RELEASE                     2.1.x.RELEASE
    Spring Cloud Finchley     2.0.x.RELEASE                     2.0.x.RELEASE
    Spring Cloud Edgware      1.5.x.RELEASE                     1.5.x.RELEASE

========================================================================================================================
## nacos-discovery-consumer

feign test
http://127.0.0.1:8071/echo-feign/12345

http://127.0.0.1:8071/actuator/health
output:

    {
        "status": "UP"
    }


http://127.0.0.1:8071/actuator/nacos-discovery
output:

    {
        "subscribe": [
        ],
        "NacosDiscoveryProperties": {
            "serverAddr": "192.168.31.131:8848",
            "endpoint": "",
            "namespace": "",
            "watchDelay": 30000,
            "logName": "",
            "service": "nacos-discovery-consumer",
            "weight": 1,
            "clusterName": "DEFAULT",
            "namingLoadCacheAtStart": "false",
            "metadata": {
                "preserved.register.source": "SPRING_CLOUD"
            },
            "registerEnabled": true,
            "ip": "192.168.31.1",
            "networkInterface": "",
            "port": 8071,
            "secure": false,
            "accessKey": "",
            "secretKey": "",
            "heartBeatInterval": null,
            "heartBeatTimeout": null,
            "ipDeleteTimeout": null
        }
    }

========================================================================================================================
## nacos-discovery-provider

