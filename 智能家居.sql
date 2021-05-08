create database 智能家居;
use 智能家居;
create table 照明系统 (
    用户名 int primary key auto_increment,
    卧室床头灯开启时间 datetime,
    卧室床头灯关闭时间 datetime,
    客厅灯指定光强 int,
    卫生间灯开启时间 datetime,
    卫生间灯关闭时间 datetime
);
create table 通风和采光系统(
    用户名 int primary key auto_increment,
    客厅窗帘开启时间 datetime,
    客厅窗帘关合时间 datetime,
    卧室窗帘开启时间 datetime,
    卧室窗帘关合时间 datetime,
    指定关窗噪声 int,
    指定开窗噪声 int,
    晾衣架暴晒光强 int,
    晾衣架暴晒温度 decimal(3,2),
    晾衣架阴干光强 int,
    晾衣架阴干温度 decimal(3,2)
);
create table 家电控制系统(
    用户名 int primary key auto_increment,
    空调开启时间 datetime,
    空调关闭时间 datetime,
    洗衣机开启时间 datetime,
    洗衣机洗涤时间长度 datetime,
    电热水器洗衣温度 decimal(3,2),
    电热水器冷设温度 decimal(3,2),
    电热水器热设温度 decimal(3,2),
    电视机开启时间 datetime,
    电视机关闭时间 datetime
);
create table 安防系统(
    用户名 int primary key auto_increment,
    防水警戒高度 decimal(3,2),
    防火警戒温度 decimal(3,2),
    防火警戒烟雾浓度 decimal(3,2),
    门锁对应门卡号 int,
    门锁对应密码 int
);