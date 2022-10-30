/*
 Navicat MySQL Data Transfer

 Source Server         : docker数据库
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : 192.168.172.3:3307
 Source Schema         : springcloudalibaba

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 30/10/2022 10:35:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shop_order
-- ----------------------------
DROP TABLE IF EXISTS `shop_order`;
CREATE TABLE `shop_order`  (
  `oid` int(0) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `uid` int(0) NOT NULL DEFAULT 0 COMMENT '用户id',
  `pid` int(0) NOT NULL DEFAULT 0 COMMENT '商品id',
  `number` int(0) NULL DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shop_order
-- ----------------------------
INSERT INTO `shop_order` VALUES (1, 0, 1, 1);

-- ----------------------------
-- Table structure for shop_product
-- ----------------------------
DROP TABLE IF EXISTS `shop_product`;
CREATE TABLE `shop_product`  (
  `pid` int(0) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `pname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '商品名称',
  `pprice` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '商品价格',
  `stock` int(0) NULL DEFAULT 0 COMMENT '商品库存',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shop_product
-- ----------------------------
INSERT INTO `shop_product` VALUES (1, '华为', 1000.00, 100);
INSERT INTO `shop_product` VALUES (2, '小米', 100.00, 100);
INSERT INTO `shop_product` VALUES (3, '苹果', 100.00, 100);
INSERT INTO `shop_product` VALUES (4, 'OPPO', 100.00, 100);

-- ----------------------------
-- Table structure for shop_user
-- ----------------------------
DROP TABLE IF EXISTS `shop_user`;
CREATE TABLE `shop_user`  (
  `uid` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '密码',
  `telephone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '手机号',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shop_user
-- ----------------------------
INSERT INTO `shop_user` VALUES (1, 'admin', 'admin', '13888888888');

SET FOREIGN_KEY_CHECKS = 1;
