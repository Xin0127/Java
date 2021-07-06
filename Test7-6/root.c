/*MapReduce实现词频统计*/
/opt/hadoop/hadoop-2.10.1/
/opt/hadoop/hadoop-2.10.1/share/hadoop
cd /opt/model/hadoop-2.10.1/share/hadoop/mapreduce/
ls
//.....jar ...
//hadoop-mapreduce-examples-2.10.1.jar
hdfs dfs -ls -R
jps
cd ../../../sbin/
./start-all.sh 
jps
hdfs dfs -ls -R
hdfs dfs -ls -R /
cd ../share/hadoop/mapreduce/
hadoop jar hadoop-mapreduce-examples-2.10.1.jar wordcount /data/wordcount/LICENSE.txt output//输出文件
hdfs dfs -cat /user/root/output/part-r-00000 //hdfs dfs -ls -R / 输出的最后一行
^C//退出
cd /opt/model/hadoop-2.10.1/sbin/
./stop-all.sh 
jps




/*Spark 安装配置*/
//1.Xftp下，两个tar.gz包，传输到opt/software，再解压传入opt/model
cd /opt/software
tar -zxvf scala-2.13.1.tgz -C /opt/model
tar -zxvf spark-3.0.0-preview2-bin-hadoop2.7.tgz -C /opt/model
cd /opt/model
ll
//2.配置环境变量
vi /etc/profile
export SCALA_HOME=/opt/model/scala-2.13.1
export PATH=$PATH:$SCALA_HOME/bin
//3.重新加载读取
source /etc/profile
//4.测试scala是否正常工作
scala -version

/*安装spark*/
//5.将文件"spark-env.sh.template"，重命名为"spark-env.sh"，并在结尾加入
export SCALA_HOME=/opt/model/scala-2.13.1
export JAVA_HOME=/opt/model/jdk1.8.0_241
export HADOOP_HOME=/opt/model/hadoop-2.10.1
export SPARK_HOME=/opt/model/spark-3.0.0-preview2-bin-hadoop2.7
export HADOOP_CONF_DIR=$HADOOP_HOME/etc/hadoop
export SPARK_MASTER_IP=192.168.65.22
export SPARK_EXECUTOR_MEMORY=1G
//6.重新加载配置文件
source /etc/profile
//7.将文件所有者改为hadoop用户 !!!
chown -R hadoop:hadoop /opt/model/spark-3.0.0-preview2-bin-hadoop2.7
//8.启动spark
su hadoop
cd /opt/model/spark-3.0.0-preview2-bin-hadoop2.7
./sbin/start-all.sh
//9.检查是否启动
jps
//10.输入网址检查 http://namecode:8080




/*Hadoop 安装配置*/
root
luky4026
//1.永久关闭防火墙
systemctl disable firewalld
//2.编辑->虚拟网络编辑器->NET模式，记录子网IP和编码
//例如，IP:192.168.xxx.0 编码:255.255.255.0
vi /etc/sysconfig/network-scripts/ifcfg-ens33
//3.配置修改：
BOOTPROTO=static
NETMASK=255.255.255.0//子网编码
IPADDR=192.168.xxx.22
GATEWAY=192.168.xxx.2//子网IP
DNS1=192.168.xxx.2//子网IP
PEERDNS=yes
...
ONBOOT=yes
//4.按“Esc”，输入“:wq",保存退出
//5.重启网络服务，显示【OK】即为成功
service network restart

/*设置主机名*/
//6.打开主机名配置文件
vi /etc/hostname
//7.删除"localdmain"语句,加上主机名
hadoop001
//8.按“Esc”，输入“:wq",保存退出

/*设置centos的host文件*/
//9.打开配置文件
vi /etc/hosts
//10.最下面加一行
192.168.xxx.22 hadoop001
//11.按“Esc”，输入“:wq",保存退出
//12.重启
reboot

/*设置windows的VMnet8网卡*/
//更改适配器选项->属性->协议版本4->勾选“使用下面的IP地址”，依次为：
192.168.xxx.23
255.255.255.0
192.168.xxx.2
//"确定"，退出

/*进入命令提示符*/
//C:\Users\昕昕> 后输入
ping 192.168.xxx.22
//...具有...字节的数据:...数据包...已发送...已接收...

//13.创建linux用户，并设置密码
useradd xin0127
passwd //输入密码并确认
//14.在/opt目录下创建两个目录并查看
cd /opt
mkdir software
mkdir model


/*将JDK HADOOP的tar.gz包通过Xftp，传到/opt/software目录下
1.新建会话"centos",主机设置为"192.168.xxx.22",用户名和密码输入root相关
2.打开会话"centos"中/opt/software目录，将JDK HADOOP的tar.gz包，拖过去*/

//15.进入/opt/software，查看并解压两个JDK HADOOP的tar.gz包到/opt/model目录下
cd /opt/software
ll
tar -zxvf jdk-8u241-linux-x64.tar.gz -C /opt/model
tar -zxvf hadoop-2.10.1.tar.gz -C /opt/model
//16.进入/opt/model,查看是否已解压完成
cd /opt/model
ll

//17.打开环境变量配置文件
vi /etc/profile
//18.在末尾添加如下：
export JAVA_HOME=/opt/model/jdk1.8.0_241
export PATH=$PATH:$JAVA_HOME/bin
export HADOOP_HOME=/opt/model/hadoop-2.10.1
export PATH=$PATH:$HADOOP_HOME/bin
export PATH=$PATH:$HADOOP_HOME/sbin
//19.按“Esc”，输入“:wq",保存退出
//20.系统重新读
source /etc/profile
//21.输入指令验证
java -version //jdk1.8...
hadoop version //hadoop2.10.1...

/*将model下的hadoop-2.10.1目录权限改为 xin0127用户*/
//22.进入/opt/model目录，并修改权限所有，查看
cd /opt/model
chown xin0127:xin0127 hadoop-2.10.1 -R
ll
//23.切换到xin0127用户
su xin0127

/*参数配置*/
//24.修改hadoop的相关配置参数
cd /opt/model/hadoop-2.10.1/etc/hadoop
//25.找到core-site.xml文件，并配置
vi core-site.xml
<configuration>
    <property>
        <name>fs.defaultFS</name>
        <value>hdfs://192.168.xxx.22:9000</value>
    </property>
    <property>
        <name>hadoop.tmp.dir</name>
        <value>/opt/model/hadoop-2.10.1/data/tmp</value>
    </property>
</configuration>
//26.找到hdfs-site.xml文件，并配置
vi hdfs-site.xml
<configuration>
    <property>
        <name>dfs.replication</name>
        <value>1</value>
    </property>
</configuration>
//27.修改JAVA_HOME的值
export JAVA_HOME=/opt/model/jdk1.8.0_241
//28.进入/opt/model/hadoop2.10.1目录
cd /opt/model/hadoop2.10.1

/*启动伪分布式*/
//1.格式化hadoop
bin/hdfs namenode -format
//2.启动namenode
sbin/hadoop-daemon.sh start namenode
//3.启动datanode
sbin/hadoop-daemon.sh start datanode
//4.使用jps检查
jps
//5.输入网址检查 http://192.168.xxx.22:50070