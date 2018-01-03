/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50558
 Source Host           : localhost
 Source Database       : trip

 Target Server Type    : MySQL
 Target Server Version : 50558
 File Encoding         : utf-8

 Date: 01/03/2018 15:16:23 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tb_admin`
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `content` varchar(32) DEFAULT NULL,
  `exp_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_admin`
-- ----------------------------
BEGIN;
INSERT INTO `tb_admin` VALUES ('1', 'admin', '123', 'faj@df', null, null), ('2', 'aaa', '123', 'fjal@fa', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_commodity`
-- ----------------------------
DROP TABLE IF EXISTS `tb_commodity`;
CREATE TABLE `tb_commodity` (
  `commodity_id` int(255) NOT NULL AUTO_INCREMENT,
  `commodity_name` varchar(32) DEFAULT NULL,
  `price` double(5,0) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `monthly_sales` int(32) DEFAULT NULL,
  `store_id` int(255) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_commodity`
-- ----------------------------
BEGIN;
INSERT INTO `tb_commodity` VALUES ('1', '真皮牛仔裤', '76', '真皮牛仔', '76', '1', null, null), ('2', '羊毛羽绒服', '233', '质量很好', '67', '1', null, null), ('3', '纯棉T恤', '65', '纯棉的哦', '1023', '1', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_dishes`
-- ----------------------------
DROP TABLE IF EXISTS `tb_dishes`;
CREATE TABLE `tb_dishes` (
  `dishes_id` int(255) NOT NULL AUTO_INCREMENT,
  `dishes_name` varchar(32) DEFAULT NULL,
  `price` double(5,2) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `monthly_sales` int(32) DEFAULT NULL,
  `restaurant_id` int(255) DEFAULT NULL,
  `area_code` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dishes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_dishes`
-- ----------------------------
BEGIN;
INSERT INTO `tb_dishes` VALUES ('1', '红烧牛肉', '56.00', '红烧牛肉一份', '90', '1', '010', null), ('2', '蒜炒白菜', '12.00', '蒜泥白菜一份', '80', '1', '010', null), ('3', '黄焖鸡小份', '14.90', '黄焖鸡', '100', '1', '010', null), ('4', '黄焖鸡+任意配菜', '34.00', '黄焖鸡+任意配菜', '122', '2', '010', null), ('5', '黄焖鸡米饭', '25.00', '黄焖鸡米饭', '122', '2', '010', null), ('6', '小份黄焖鸡', '28.00', '小份黄焖鸡+米饭', '133', '3', '020', null), ('7', '大份黄焖鸡', '31.00', '大分黄焖鸡+米饭不辣', '432', '3', '020', null), ('8', '小份黄焖鸡', '34.68', '小份黄焖鸡+饮料', '32', '4', '030', null), ('9', '香菇黄焖鸡', '54.00', '香菇黄焖鸡米饭套餐', '131', '5', '040', null), ('10', '鱼豆腐黄焖鸡', '63.00', '鱼豆腐黄焖鸡+米饭', '32', '5', '040', null), ('11', '小份黄焖鸡', '32.00', '黄焖鸡+土豆+青菜', '342', '6', '050', null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_image`
-- ----------------------------
DROP TABLE IF EXISTS `tb_image`;
CREATE TABLE `tb_image` (
  `image_id` int(255) NOT NULL AUTO_INCREMENT,
  `url` varchar(128) DEFAULT NULL,
  `image_name` varchar(128) DEFAULT NULL,
  `store_id` int(255) DEFAULT NULL,
  `commodity_id` int(255) DEFAULT NULL,
  `restaurant_id` int(255) DEFAULT NULL,
  `dishes_id` int(255) DEFAULT NULL,
  `viewpoint_id` int(255) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_image`
-- ----------------------------
BEGIN;
INSERT INTO `tb_image` VALUES ('1', '/Users/hurong/workspace/trip-server/com-trip-web/target/com.trip.web/upload/ab9b0b2a嵌入式.jpg', '嵌入式.jpg', null, null, '2', null, null, null, null), ('2', '/Users/hurong/upload/8af81bd7嵌入式.jpg', '嵌入式.jpg', null, null, '3', null, null, null, null), ('3', '/Users/hurong/upload/0e7c2d6f餐馆.jpeg', '餐馆.jpeg', null, null, '1', null, null, null, null), ('4', '/Users/hurong/upload/d011da13餐馆1.jpeg', '餐馆1.jpeg', null, null, '2', null, null, null, null), ('5', '/Users/hurong/upload/8b24eb5f餐馆2.jpeg', '餐馆2.jpeg', null, null, '3', null, null, null, null), ('6', '/Users/hurong/upload/b2358466餐馆3.jpg', '餐馆3.jpg', null, null, '4', null, null, null, null), ('7', '/Users/hurong/upload/0e1ef1ba餐馆4.jpg', '餐馆4.jpg', null, null, '5', null, null, null, null), ('8', '/Users/hurong/upload/b2abc782餐馆1.jpeg', '餐馆1.jpeg', null, null, '6', null, null, null, null), ('9', '/Users/hurong/upload/ba675a84美食.jpeg', '美食.jpeg', null, null, null, '1', null, null, null), ('10', '/Users/hurong/upload/72e02e8c美食1.jpeg', '美食1.jpeg', null, null, null, '2', null, null, null), ('11', '/Users/hurong/upload/cda625bb美食2.jpg', '美食2.jpg', null, null, null, '3', null, null, null), ('12', '/Users/hurong/upload/a31e2c02美食3.jpg', '美食3.jpg', null, null, null, '4', null, null, null), ('13', '/Users/hurong/upload/09952efd美食4.jpg', '美食4.jpg', null, null, null, '5', null, null, null), ('14', '/Users/hurong/upload/bd458bbb美食5.jpg', '美食5.jpg', null, null, null, '6', null, null, null), ('15', '/Users/hurong/upload/c733c990美食.jpeg', '美食.jpeg', null, null, null, '7', null, null, null), ('16', '/Users/hurong/upload/c0aa13ac美食1.jpeg', '美食1.jpeg', null, null, null, '8', null, null, null), ('17', '/Users/hurong/upload/ebf706f9美食3.jpg', '美食3.jpg', null, null, null, '9', null, null, null), ('18', '/Users/hurong/upload/80f57b17美食3.jpg', '美食3.jpg', null, null, null, '3', null, null, null), ('19', '/Users/hurong/upload/a3c3295e美食5.jpg', '美食5.jpg', null, null, null, '5', null, null, null), ('20', '/Users/hurong/upload/278e2bd2美食2.jpg', '美食2.jpg', null, null, null, '11', null, null, null), ('21', '/Users/hurong/upload/f2f83de6美食2.jpg', '美食2.jpg', null, null, null, '8', null, null, null), ('22', '/Users/hurong/upload/1a0a3e06美食2.jpg', '美食2.jpg', null, null, null, '8', null, null, null), ('23', '/Users/hurong/upload/9c4b607f风景3.jpeg', '风景3.jpeg', null, null, null, null, '1', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_restaurant`
-- ----------------------------
DROP TABLE IF EXISTS `tb_restaurant`;
CREATE TABLE `tb_restaurant` (
  `restaurant_id` int(255) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `restaurant_name` varchar(64) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `score` double(5,0) DEFAULT NULL,
  `monthly_sales` int(10) DEFAULT NULL,
  `area_code` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`restaurant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_restaurant`
-- ----------------------------
BEGIN;
INSERT INTO `tb_restaurant` VALUES ('1', 'aaa', '123', '杨记牛肉馆', '黎平县城休闲广场', '134', '5', '32', '010', null), ('2', 'aaa', '123', '杨宇黄焖鸡米饭', '北京市', '43', '3', '43', '010', null), ('3', 'aaa', '123', '杨铭宇黄焖鸡米饭', '北京市', '32', '4', '54', '020', null), ('4', 'aaa', '123', '黄记黄焖鸡米饭', '北京市', '4343', '4', '435', '030', null), ('5', 'aaa', '123', '一品粥', '北京市', '45245', '3', '44', '040', null), ('6', 'aaa', '123', '大东北黄焖鸡米饭', '北京市', '5245', '4', '54', '050', null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_route`
-- ----------------------------
DROP TABLE IF EXISTS `tb_route`;
CREATE TABLE `tb_route` (
  `route_id` int(255) NOT NULL AUTO_INCREMENT,
  `start_station` varchar(32) DEFAULT NULL,
  `end_station` varchar(32) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `ticket_type` int(2) DEFAULT NULL COMMENT '1-单程，2-往返',
  `duration` varchar(32) DEFAULT NULL COMMENT '运营时间',
  `viewpoint_id` int(255) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tb_store`
-- ----------------------------
DROP TABLE IF EXISTS `tb_store`;
CREATE TABLE `tb_store` (
  `store_id` int(255) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `store_name` varchar(32) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `score` double(5,0) DEFAULT NULL,
  `tel` varchar(32) DEFAULT NULL,
  `monthly_sales` int(32) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_store`
-- ----------------------------
BEGIN;
INSERT INTO `tb_store` VALUES ('1', 'aaa', '123', '鸿宇服饰', '黎平县城休闲广场', '4', '123453', '45', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_ticket`
-- ----------------------------
DROP TABLE IF EXISTS `tb_ticket`;
CREATE TABLE `tb_ticket` (
  `ticket_id` int(255) NOT NULL AUTO_INCREMENT,
  `ticket_name` varchar(32) DEFAULT NULL,
  `price` double(5,0) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL COMMENT '门票说明',
  `viewpoint_id` int(255) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_user`
-- ----------------------------
BEGIN;
INSERT INTO `tb_user` VALUES ('1', 'aaa', '123', '131df@fda', '135543', '丫丫', null, null), ('2', 'bbb', '123', 'gaf@fa3342', '23341', 'hello', null, null), ('3', 'ccc', '123', 'ccc@trip.com', '135543', '周周', null, null), ('4', 'ddd', '123', 'dd@fa3342', '23341', '滴滴', null, null), ('5', 'hhh', '123', 'ccc@trip.com', '135543', '周周', null, null), ('6', 'fff', '123', 'dd@fa3342', '23341', '滴滴', null, null), ('8', 'uuu', '123', 'ccc@trip.com', '135543', '周周', null, null), ('9', 'ggg', '123', 'ccc@trip.com', '135543', '周周', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `tb_viewpoint`
-- ----------------------------
DROP TABLE IF EXISTS `tb_viewpoint`;
CREATE TABLE `tb_viewpoint` (
  `viewpoint_id` int(255) NOT NULL AUTO_INCREMENT,
  `viewpoint_name` varchar(32) DEFAULT NULL,
  `star_level` varchar(5) DEFAULT NULL COMMENT '景点评级，例如：5A',
  `score` double(5,0) DEFAULT NULL COMMENT '评分',
  `address` varchar(64) DEFAULT NULL,
  `introduction` varchar(255) DEFAULT NULL COMMENT '景点简介',
  `note` varchar(255) DEFAULT NULL COMMENT '景点须知',
  `exp_content1` varchar(255) DEFAULT NULL,
  `exp_content2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`viewpoint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
