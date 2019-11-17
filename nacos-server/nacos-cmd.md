2.下载源码或者安装包
你可以通过源码和发行包两种方式来获取 Nacos。

从 Github 上下载源码方式

git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos clean install -U
ls -al distribution/target/

// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin

下载编译后压缩包方式

您可以从 最新稳定版本 下载 nacos-server-$version.zip 包。

unzip nacos-server-$version.zip 或者 tar -xvf nacos-server-$version.tar.gz
cd nacos/bin

3.启动服务器

Linux/Unix/Mac
启动命令(standalone代表着单机模式运行，非集群模式):

cd /home/rock/nacos/bin

sh startup.sh -m standalone

cat /home/rock/nacos/logs/start.out

如果您使用的是ubuntu系统，或者运行脚本报错提示[[符号找不到，可尝试如下运行：

bash startup.sh -m standalone

Windows
启动命令：

cmd startup.cmd

或者双击startup.cmd运行文件。

注册中心地址：http://192.168.31.131:8848/nacos/#/login

默认用户密码：nacos/nacos

4.服务注册&发现和配置管理

服务注册

curl -X POST 'http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=nacos.naming.serviceName&ip=20.18.7.10&port=8080'

服务发现

curl -X GET 'http://127.0.0.1:8848/nacos/v1/ns/instance/list?serviceName=nacos.naming.serviceName'

发布配置

curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test&content=HelloWorld"

获取配置

curl -X GET "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test"

5.关闭服务器

Linux/Unix/Mac

cd /home/rock/nacos/bin

sh shutdown.sh

Windows

cmd shutdown.cmd

或者双击shutdown.cmd运行文件。
