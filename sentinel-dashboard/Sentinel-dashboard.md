# Sentinel Dashboard

Sentinel dashboard is a lightweight console that provides functions such as machine discovery, single-server resource monitoring, overview of cluster resource data, as well as rule management. To use these features, you only need to complete a few steps.
   
Note: The statistics overview for clusters only supports clusters with less than 500 nodes, and has a latency of about 1 to 2 seconds.

========================================================================================================================

To use the Sentinel dashboard, simply complete the following 3 steps.

## Get the Dashboard

You can download the latest dashboard JAR file from the Release Page.

You can also get the latest source code to build your own Sentinel dashboard：

- Download the Dashboard project.

- Run the following command to package the code into a FatJar: mvn clean package

## Start the Dashboard

Sentinel dashboard is a standard SpringBoot application, and you can run the JAR file in the Spring Boot mode.

windows cmd

    E:
    cd E:\WorkSpace\IdeaProjects\spring-cloud-alibaba-alice\sentinel-dashboard
    java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.7.0.jar

If there is conflict with the 8080 port, you can use -Dserver.port=new port to define a new port.

5.2.2 Configure the Dashboard

application.yml. 

    spring:
      cloud:
        sentinel:
          transport:
            port: 8719
            dashboard: localhost:8080

application.properties.

    spring.cloud.sentinel.transport.port=8719
    spring.cloud.sentinel.transport.dashboard=localhost:8080

The port number specified in spring.cloud.sentinel.transport.port will start an HTTP Server on the corresponding server of the application, and this server will interact with the Sentinel dashboard. For example, if a rate limiting rule is added in the Sentinel dashboard, the the rule data will be pushed to and recieved by the HTTP Server, which in turn registers the rule to Sentinel.

For more information about Sentinel dashboard, please refer to Sentinel Dashboard.

Sentinel dashboard address

localhost:8080

默认用户名和密码都是 sentinel

## Sentinel Endpoint

Sentinel provides an Endpoint internally with a corresponding endpoint id of sentinel.

http://localhost:8073/actuator/sentinel

sample output:

    {
        "blockPage": null,
        "appName": "sentinel",
        "consoleServer": "localhost:8080",
        "coldFactor": "3",
        "rules": {
            "systemRules": [
            ],
            "authorityRule": [
            ],
            "paramFlowRule": [
            ],
            "flowRules": [
            ],
            "degradeRules": [
            ]
        },
        "metricsFileCharset": "UTF-8",
        "filter": {
            "order": -2147483648,
            "urlPatterns": [
                "/*"
            ],
            "enabled": true
        },
        "totalMetricsFileCount": 6,
        "datasource": {
        },
        "clientIp": "192.168.31.1",
        "clientPort": "8720",
        "logUsePid": false,
        "metricsFileSize": 52428800,
        "logDir": "C:\\Users\\Administrator\\logs\\csp\\",
        "heartbeatIntervalMs": 10000
    }

