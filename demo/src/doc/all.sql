drop table if exists `test`;
create table `test`(
    `id` bigint not null comment  'id',
    `name` varchar (50) comment '名称',
    `password` varchar (50) comment '密码',
    primary key (`id`)
)  default charset=utf8mb4 comment='测试';
insert into `test`(id,name,password) values(1,'测试','password');

drop table if exists `demo`;
create table `demo`(
                       `id` bigint not null comment  'id',
                       `name` varchar (50) comment '名称',
                       primary key (`id`)
)  default charset=utf8mb4 comment='测试';
insert into `demo`(id,name) values(1,'测试');


# DROP DATABASE  IF EXISTS `ms_storage`;
# CREATE DATABASE  `ms_storage`
#     DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
#
# USE ms_storage;

DROP TABLE IF EXISTS `ebook`;
CREATE TABLE `ebook` (
                             `id` bigint not null comment  'id',
                             `name` varchar(50)  comment '名称',
                             `category1_id` bigint   comment '分类1',
                             `category2_id` bigint   comment '分类2',
                             `description` varchar(20)    comment '描述',
                             `cover` varchar(200)    comment '封面',
                             `doc_count` int   comment '文档数',
                             `view_count` int   comment '阅读数',
                             `vote_count` int   comment '点赞数',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment ='电子书';

insert into `ebook`(id,name,description)values(1,'spring boot 入门教程','零基础入门java开发企业及开发框架');
insert into `ebook`(id,name,description)values(2,'vue  入门教程','零基础入门vue开发企业及开发前端框架');
insert into `ebook`(id,name,description)values(3,'python入门教程','零基础入门Python框架');
insert into `ebook`(id,name,description)values(4,'c++  入门教程','零基础入门框架');

#
# DROP DATABASE  IF EXISTS `ms_order`;
# CREATE DATABASE  `ms_order`
#     DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
#
# USE ms_order;
#
# DROP TABLE IF EXISTS `t_order`;
# CREATE TABLE `t_order` (
#                            `id` int(11) NOT NULL AUTO_INCREMENT,
#                            `user_id` varchar(50) DEFAULT NULL,
#                            `commodity_code` varchar(50) DEFAULT NULL  comment '商品编号',
#                            `count` int(11) DEFAULT 0,
#                            `amount` int(11) DEFAULT 0,
#                            PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# DROP DATABASE  IF EXISTS `ms_account`;
# CREATE DATABASE  `ms_account`
#     DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
#
# USE ms_account;
#
# DROP TABLE IF EXISTS `t_account`;
# CREATE TABLE `t_account` (
#                              `id` int(11) NOT NULL AUTO_INCREMENT,
#                              `user_id` varchar(50) DEFAULT NULL,
#                              `balance` int(11) DEFAULT 0  comment '账户余额',
#                              PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
#
# DROP DATABASE  IF EXISTS `ms_user`;
# CREATE DATABASE  `ms_user`
#     DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
#
# USE ms_user;
#
# DROP TABLE IF EXISTS `t_user`;
# CREATE TABLE `t_user` (
#                           `id` int(11) NOT NULL AUTO_INCREMENT,
#                           `username` varchar(50) DEFAULT NULL,
#                           `age` int(11) DEFAULT 0,
#                           PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;





