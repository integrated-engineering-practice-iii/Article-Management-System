/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2019-05-28 15:51:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `userId` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `context` text NOT NULL,
  `display` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('2', '2', '2019-05-28 08:43:33', '2', '2', '2', '0');
INSERT INTO `news` VALUES ('3', '1', '2019-05-28 08:37:39', '1', '1', '1', '1');
INSERT INTO `news` VALUES ('4', '1', '2019-05-28 09:03:00', '1', '1', '1', '1');
INSERT INTO `news` VALUES ('7', '4444', '2019-05-28 15:44:10', '7', '国内', '4444', '1');
INSERT INTO `news` VALUES ('9', '2222', '2019-05-28 15:44:13', '7', '国际', '2222', '1');
INSERT INTO `news` VALUES ('10', '111', '2019-05-28 15:44:17', '7', '军事', '11', '1');
INSERT INTO `news` VALUES ('11', '222', '2019-05-28 15:44:20', '7', '军事', '222', '1');
INSERT INTO `news` VALUES ('12', '333', '2019-05-28 15:44:24', '7', '财经', '333', '1');
INSERT INTO `news` VALUES ('13', '444', '2019-05-28 15:44:27', '7', '娱乐', '444', '1');
INSERT INTO `news` VALUES ('14', '555', '2019-05-28 15:44:30', '7', '体育', '555', '1');
INSERT INTO `news` VALUES ('15', '666', '2019-05-28 15:44:33', '7', '国际', '666', '1');
INSERT INTO `news` VALUES ('16', '777', '2019-05-28 15:44:37', '7', '财经', '777', '1');
INSERT INTO `news` VALUES ('17', '888', '2019-05-28 15:44:42', '7', '娱乐', '888', '1');
INSERT INTO `news` VALUES ('18', '999', '2019-05-28 15:44:47', '7', '体育', '999', '1');
INSERT INTO `news` VALUES ('19', '122', '2019-05-28 15:44:52', '7', '国际', '122', '1');
INSERT INTO `news` VALUES ('20', 'qqq', '2019-05-28 15:38:24', '8', '国际', 'qqq', '1');
INSERT INTO `news` VALUES ('21', 'www', '2019-05-28 15:35:57', '8', '国内', 'www', '1');
INSERT INTO `news` VALUES ('22', 'bbb', '2019-05-28 15:50:16', '7', '国内', 'bbb', '1');
INSERT INTO `news` VALUES ('23', 'ccc', '2019-05-28 15:50:24', '7', '国内', 'ccc', '1');
INSERT INTO `news` VALUES ('24', 'ddd', '2019-05-28 15:50:28', '7', '国内', 'ddd', '1');
INSERT INTO `news` VALUES ('25', 'eee', '2019-05-28 15:50:32', '7', '国内', 'eee', '1');
INSERT INTO `news` VALUES ('26', 'fff', '2019-05-28 15:50:36', '7', '国内', 'fff', '1');
INSERT INTO `news` VALUES ('27', 'rrr', '2019-05-28 15:50:41', '7', '国内', 'rrr', '1');
INSERT INTO `news` VALUES ('28', 'yyy', '2019-05-28 15:50:45', '7', '国内', 'yyy', '1');
INSERT INTO `news` VALUES ('29', 'uuu', '2019-05-28 15:50:55', '7', '国内', 'uuu', '1');
INSERT INTO `news` VALUES ('30', 'iii', '2019-05-28 15:51:00', '7', '国内', 'iii', '1');
INSERT INTO `news` VALUES ('31', 'ooo', '2019-05-28 15:51:03', '7', '国内', 'ooo', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1');
INSERT INTO `user` VALUES ('2', 'wang', '123', '132');
INSERT INTO `user` VALUES ('3', 'wang', '123', '132');
INSERT INTO `user` VALUES ('4', 'wang', '123', '132');
INSERT INTO `user` VALUES ('5', '1', '1', '1');
INSERT INTO `user` VALUES ('6', 'sen', '123', '123');
INSERT INTO `user` VALUES ('7', 'zxc', '123', 'zxc');
INSERT INTO `user` VALUES ('8', 'asd', 'asd', 'asd');
