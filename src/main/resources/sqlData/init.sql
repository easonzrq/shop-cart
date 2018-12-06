create database shopcart;

use shopcart;

CREATE TABLE `account_user` (
   `id` varchar(32) NOT NULL,
   `password` varchar(255) DEFAULT NULL,
   `user_name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

  CREATE TABLE `category` (
   `id` varchar(32) NOT NULL,
   `category_name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

 CREATE TABLE `product` (
   `id` varchar(32) NOT NULL,
   `category` varchar(255) DEFAULT NULL,
   `count` int(11) DEFAULT NULL,
   `description` varchar(255) DEFAULT NULL,
   `product_name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

  CREATE TABLE `shop_cart` (
   `id` varchar(32) NOT NULL,
   `product_id` varchar(255) DEFAULT NULL,
   `user_id` varchar(255) DEFAULT NULL,
   `count` int(11) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `role` (
   `id` varchar(32) NOT NULL,
   `role_name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

 CREATE TABLE `permission` (
   `id` varchar(32) NOT NULL,
   `permission_name` varchar(255) DEFAULT NULL,
   `url` varchar(255) default Null,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

 CREATE TABLE `role_user` (
   `id` varchar(32) NOT NULL,
   `user_id` varchar(32) DEFAULT NULL,
   `role_id` varchar(32) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

  CREATE TABLE `permission_role` (
   `id` varchar(32) NOT NULL,
   `role_id` varchar(32) DEFAULT NULL,
   `permission_id` varchar(32) DEFAULT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

insert into `shopcart`.`account_user` values(replace(uuid(),'-',''),'opgwin','Admin');
insert into `shopcart`.`account_user` values(replace(uuid(),'-',''),'opgwin','zrq');
insert into `shopcart`.`account_user` values(replace(uuid(),'-',''),'opgwin','test');

insert into `shopcart`.`category` values(replace(uuid(),'-',''),'食品');
insert into `shopcart`.`category` values(replace(uuid(),'-',''),'日用品');
insert into `shopcart`.`category` values(replace(uuid(),'-',''),'餐具');

insert into `shopcart`.`product` values(replace(uuid(),'-',''),'食品',31,'知名企业产品','上好佳');
insert into `shopcart`.`product` values(replace(uuid(),'-',''),'食品',20,'知名企业产品','乐事');
insert into `shopcart`.`product` values(replace(uuid(),'-',''),'餐具',5,'知名企业产品','松拓刀');

insert into `role` values ("1a3d87aef8ff11e8be52543530a47de6","Admin");
insert into `role` values ("1a458e7ef8ff11e8be52543530a47de6","User");

insert into `role_user` values(replace(UUID(),'-',''),"4f986841f45311e887c2543530a47de6","1a3d87aef8ff11e8be52543530a47de6");
insert into `role_user` values(replace(UUID(),'-',''),"23742ca3f45411e887c2543530a47de6","1a458e7ef8ff11e8be52543530a47de6");

insert into `permission` values("9c6d7850f90011e8be52543530a47de6","product","/product/**");
insert into `permission` values("9c775bdff90011e8be52543530a47de6","shopcart","/shopcart/**");

/*Admin赋权product和shopcart的权限*/
insert into `permission_role` values(replace(UUID(),'-',''),"1a3d87aef8ff11e8be52543530a47de6","9c6d7850f90011e8be52543530a47de6");
insert into `permission_role` values(replace(UUID(),'-',''),"1a3d87aef8ff11e8be52543530a47de6","9c775bdff90011e8be52543530a47de6");