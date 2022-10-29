CREATE TABLE `shop_order` (
  `oid` int NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `uid` int NOT NULL DEFAULT '0' COMMENT '用户id',
  `pid` int NOT NULL DEFAULT '0' COMMENT '商品id',
  `number` int DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `shop_product` (
  `pid` int NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `pname` varchar(255) DEFAULT '' COMMENT '商品名称',
  `pprice` decimal(10,2) DEFAULT '0.00' COMMENT '商品价格',
  `stock` int DEFAULT '0' COMMENT '商品库存',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `shop_user` (
  `uid` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '密码',
  `telephone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '手机号',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;