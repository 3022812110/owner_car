/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : as

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 06/08/2023 04:41:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `year` int(11) NULL DEFAULT NULL,
  `brand` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `model` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (1, 'C001', 2018, 'BMW', 'X5');
INSERT INTO `car` VALUES (2, 'C002', 2020, 'Audi', 'A4');
INSERT INTO `car` VALUES (3, 'C003', 2019, 'Tesla', 'Model 3');
INSERT INTO `car` VALUES (4, 'C004', 2017, 'Toyota', 'Camry');
INSERT INTO `car` VALUES (5, 'C005', 2021, 'Honda', 'Civic');
INSERT INTO `car` VALUES (6, 'C0001', 2023, 'BYD', 'M');
INSERT INTO `car` VALUES (8, 'C0001', 2023, 'BYD', 'B');

-- ----------------------------
-- Table structure for owner
-- ----------------------------
DROP TABLE IF EXISTS `owner`;
CREATE TABLE `owner`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `last_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `birth_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of owner
-- ----------------------------
INSERT INTO `owner` VALUES (1, 'Joh', 'Joh', '1990-01-01');
INSERT INTO `owner` VALUES (2, 'Mike', 'Mike', '1985-05-10');
INSERT INTO `owner` VALUES (3, 'Jack', 'Jack', '1992-07-15');
INSERT INTO `owner` VALUES (4, 'Yuoh', 'Yuoh', '1988-11-20');
INSERT INTO `owner` VALUES (5, 'San', 'San', '1995-03-25');

-- ----------------------------
-- Table structure for owner_car
-- ----------------------------
DROP TABLE IF EXISTS `owner_car`;
CREATE TABLE `owner_car`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `owner_id` int(11) NULL DEFAULT NULL,
  `car_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `owner_id`(`owner_id`) USING BTREE,
  INDEX `car_id`(`car_id`) USING BTREE,
  CONSTRAINT `owner_car_ibfk_1` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `owner_car_ibfk_2` FOREIGN KEY (`car_id`) REFERENCES `car` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of owner_car
-- ----------------------------
INSERT INTO `owner_car` VALUES (1, 1, 5);
INSERT INTO `owner_car` VALUES (2, 1, 2);
INSERT INTO `owner_car` VALUES (3, 1, 3);
INSERT INTO `owner_car` VALUES (4, 2, 2);
INSERT INTO `owner_car` VALUES (5, 2, 4);
INSERT INTO `owner_car` VALUES (6, 2, 5);
INSERT INTO `owner_car` VALUES (7, 3, 3);
INSERT INTO `owner_car` VALUES (8, 4, 1);
INSERT INTO `owner_car` VALUES (9, 4, 4);
INSERT INTO `owner_car` VALUES (10, 5, 2);
INSERT INTO `owner_car` VALUES (11, 5, 5);
INSERT INTO `owner_car` VALUES (12, 4, 2);

SET FOREIGN_KEY_CHECKS = 1;
