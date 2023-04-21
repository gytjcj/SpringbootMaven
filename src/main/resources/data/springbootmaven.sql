/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : hongzhi

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 05/08/2022 12:20:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for deviceinfo_notsecret
-- ----------------------------
DROP TABLE IF EXISTS `deviceinfo_notsecret`;
CREATE TABLE `deviceinfo_notsecret`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `deviceid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备编号',
  `deviceassetid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备资产编号',
  `devicetype` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备类型',
  `manufacturersinfo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '制造厂家',
  `devicemodel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '型号',
  `applicationname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属应用系统',
  `currentusedepartment` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用部门',
  `currentinstalllocation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用地点',
  `currentuseperson` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用人 ',
  `currentpersonincharge` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '责任人',
  `IPaddress` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `distributiondate` date NULL DEFAULT NULL COMMENT '派发日期',
  `secretinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密级',
  `madein` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '是否国产',
  `serialnumber` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '序列号',
  `CPUinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'CPU',
  `meminfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '内存',
  `hdiskinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '硬盘',
  `hdisksn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '硬盘序列号',
  `OSinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作系统',
  `DBinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '数据库',
  `appinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主要应用软件',
  `remarkinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '非涉密设备信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of deviceinfo_notsecret
-- ----------------------------
INSERT INTO `deviceinfo_notsecret` VALUES (10, '设备 编号', '设备资产编号', '打印机', '设备制造厂家', '设备 型号', '所属应用系统', '使用 部门', '安装使用位置', '使 用 人', '责 任 人', 'IP 地 址', '2022-03-09', '第一级', '是', '序列号', 'CPU', '内存', '硬盘', '硬盘序列号', '操作 系统', '数据 库', '主要应用软件', '备 注');
INSERT INTO `deviceinfo_notsecret` VALUES (11, '设备 编号2', '设备资产编号2', '打印机', '设备制造厂家2', '设备 型号2', '所属应用系统2', '使用 部门2', '安装使用位置2', '使 用 人2', '责 任 人2', 'IP 地 址2', '2022-03-09', '第二级', '是', '序列号2', 'CPU2', '内存2', '硬盘2', '硬盘序列号2', '操作 系统2', '数据 库2', '主要应用软件2', '备 注2');
INSERT INTO `deviceinfo_notsecret` VALUES (12, '设备 编号3', '设备资产编号3', '打印机', '设备制造厂家3', '设备 型号3', '所属应用系统3', '使用 部门3', '安装使用位置3', '使 用 人3', '责 任 人3', 'IP 地 址3', '2022-03-09', '第三级', '是', '序列号3', 'CPU3', '内存3', '硬盘3', '硬盘序列号3', '操作 系统3', '数据 库3', '主要应用软件3', '备 注3');
INSERT INTO `deviceinfo_notsecret` VALUES (13, '设备 编号4', '设备资产编号4', '打印机', '设备制造厂家4', '设备 型号4', '所属应用系统4', '使用 部门4', '安装使用位置4', '使 用 人4', '责 任 人4', 'IP 地 址4', '2022-03-09', '第四级', '是', '序列号4', 'CPU4', '内存4', '硬盘4', '硬盘序列号4', '操作 系统4', '数据 库4', '主要应用软件4', '备 注4');

-- ----------------------------
-- Table structure for deviceinfo_secret
-- ----------------------------
DROP TABLE IF EXISTS `deviceinfo_secret`;
CREATE TABLE `deviceinfo_secret`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `deviceid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备编号',
  `deviceassetid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备资产编号',
  `devicetype` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '设备类型',
  `manufacturersinfo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '制造厂家',
  `devicemodel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '型号',
  `applicationname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属应用系统',
  `currentusedepartment` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用部门',
  `currentinstalllocation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用地点',
  `currentuseperson` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用人 ',
  `currentpersonincharge` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '责任人',
  `IPaddress` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `distributiondate` date NULL DEFAULT NULL COMMENT '派发日期',
  `secretinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密级',
  `madein` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '是否国产',
  `serialnumber` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '序列号',
  `CPUinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'CPU',
  `meminfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '内存',
  `hdiskinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '硬盘',
  `hdisksn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '硬盘序列号',
  `OSinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作系统',
  `DBinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '数据库',
  `appinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主要应用软件',
  `remarkinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '涉密设备信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of deviceinfo_secret
-- ----------------------------
INSERT INTO `deviceinfo_secret` VALUES (3, '设备 编号', '设备资产编号', '笔记本', '设备制造厂家', '设备 型号', '所属应用系统', '使用 部门', '安装使用位置', '使 用 人', '责 任 人', 'IP 地 址', '2022-03-09', '绝密', '是', '序列号2022', 'CPU', '内存', '硬盘', '硬盘序列号', '操作 系统', '数据 库', '主要应用软件', '备 注436456769');
INSERT INTO `deviceinfo_secret` VALUES (4, '设备 编号1', '设备资产编号1', '笔记本', '设备制造厂家1', '设备 型号1', '所属应用系统1', '使用 部门1', '安装使用位置1', '使 用 人1', '责 任 人1', 'IP 地 址1', '2022-03-09', '机密', '否', '序列号1', 'CPU1', '内存1', '硬盘1', '硬盘序列号1', '操作 系统1', '数据 库1', '主要应用软件1', '备 注1');
INSERT INTO `deviceinfo_secret` VALUES (5, '设备 编号2', '设备资产编号2', '笔记本', '设备制造厂家2', '设备 型号2', '所属应用系统2', '使用 部门2', '安装使用位置2', '使 用 人2', '责 任 人2', 'IP 地 址2', '2022-03-09', '秘密', '是', '序列号2', 'CPU2', '内存2', '硬盘2', '硬盘序列号2', '操作 系统2', '数据 库2', '主要应用软件2', '备 注2');
INSERT INTO `deviceinfo_secret` VALUES (6, '设备 编号3', '设备资产编号3', '笔记本', '设备制造厂家3', '设备 型号3', '所属应用系统3', '使用 部门3', '安装使用位置3', '使 用 人3', '责 任 人3', 'IP 地 址3', '2022-03-09', '机密', '否', '序列号3', 'CPU3', '内存3', '硬盘3', '硬盘序列号3', '操作 系统3', '数据 库3', '主要应用软件3', '备 注3');
INSERT INTO `deviceinfo_secret` VALUES (7, '设备 编号4', '设备资产编号4', '打印机', '设备制造厂家4', '设备 型号4', '所属应用系统4', '使用 部门4', '安装使用位置4', '使 用 人4', '责 任 人4', 'IP 地 址4', '2022-03-09', '秘密', '否', '序列号4', 'CPU4', '内存4', '硬盘4', '硬盘序列号4', '操作 系统4', '数据 库4', '主要应用软件4', '备 注4');

-- ----------------------------
-- Table structure for devicetransfer
-- ----------------------------
DROP TABLE IF EXISTS `devicetransfer`;
CREATE TABLE `devicetransfer`  (
  `devicetransferid` int NOT NULL AUTO_INCREMENT COMMENT '设备移交编号',
  `deviceassetid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL COMMENT '设备资产编号',
  `deviceid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL COMMENT '设备编号',
  `currentusedepartment` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '变更后的使用部门',
  `currentinstalllocation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '变更后的安装（使用）位置',
  `currentuseperson` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '变更后的使用人',
  `currentpersonincharge` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '变更后的责任人',
  `oldusedepartment` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '上任使用部门',
  `oldinstalllocation` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '上任安装（使用）位置',
  `olduseperson` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '上任使用人',
  `oldpersonincharge` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '上任责任人',
  `transferdate` datetime NULL DEFAULT NULL COMMENT '移交时间',
  PRIMARY KEY (`devicetransferid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_cs_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of devicetransfer
-- ----------------------------

-- ----------------------------
-- Table structure for devicetype
-- ----------------------------
DROP TABLE IF EXISTS `devicetype`;
CREATE TABLE `devicetype`  (
  `devicetypeid` int NOT NULL AUTO_INCREMENT,
  `devicetypename` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`devicetypeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '设备类型字典' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of devicetype
-- ----------------------------
INSERT INTO `devicetype` VALUES (1, '笔记本');
INSERT INTO `devicetype` VALUES (2, '打印机');

-- ----------------------------
-- Table structure for maintainrecord
-- ----------------------------
DROP TABLE IF EXISTS `maintainrecord`;
CREATE TABLE `maintainrecord`  (
  `maintainrecordid` int NOT NULL AUTO_INCREMENT COMMENT '维修编号',
  `deviceassetid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL COMMENT '设备资产编号',
  `deviceid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL COMMENT '设备编号',
  `repairasktime` datetime NULL DEFAULT NULL COMMENT '报修时间',
  `repairaskoffice` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '报修处室',
  `repairaskpeople` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '报修人',
  `responsetime` datetime NULL DEFAULT NULL COMMENT '响应时间',
  `repairinfo` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT '未修复' COMMENT '是否修复',
  `repairfinishtime` date NULL DEFAULT NULL COMMENT '修复时间',
  `faulttype` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '故障类型',
  `failurecause` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '故障原因',
  `resolvemethod` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '解决方法',
  `sparepart` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '备件情况',
  `satisfactioninfo` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '本次维修满意度',
  `receiver` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '维修人',
  `description` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '故障简要描述',
  `remarkinfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`maintainrecordid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_cs_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of maintainrecord
-- ----------------------------
INSERT INTO `maintainrecord` VALUES (1, '设备资产编号', '设备 编号', '2022-03-09 10:00:07', '工程部', '李四', NULL, '已修复', '2022-03-09', '故障类型', '故障原因', '备件情况', '解决方法', '满意', NULL, '三分大赛广东省', NULL);
INSERT INTO `maintainrecord` VALUES (2, '设备资产编号2', '设备 编号2', '2022-03-09 10:16:53', '工程部2', '王五', '2022-03-09 10:17:11', '已修复', '2022-03-09', '故障类型', '故障原因', '备件情况', '解决方法', '一般', '李四', '放', NULL);
INSERT INTO `maintainrecord` VALUES (3, '0527', '编号2504', '2022-05-31 19:32:05', '处室30456', '万二麻子', '2022-05-31 19:33:36', '已修复', '2022-05-31', '让2453', '22', '56436', '喏惹', '满意', '李四', '都对公司拟非拉饿了', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456');

SET FOREIGN_KEY_CHECKS = 1;
