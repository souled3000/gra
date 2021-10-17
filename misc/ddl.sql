CREATE TABLE `t_item` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `factorystaff` varchar(30) DEFAULT NULL COMMENT '厂家人员',
  `factory` varchar(30) DEFAULT NULL COMMENT '厂家',
  `dept` varchar(30) DEFAULT NULL COMMENT '科室',
  `deptstaff` varchar(30) DEFAULT NULL COMMENT '科室负责人',
  `adm` varchar(30) DEFAULT NULL COMMENT '机房管理员名',
  `room` varchar(30) DEFAULT NULL COMMENT '机房名',
  `signintime` bigint(20) DEFAULT NULL COMMENT '进入机房时间',
  `presignouttime` bigint(20) DEFAULT NULL COMMENT '预计离开机房时间',
  `signouttime` bigint(20) DEFAULT NULL COMMENT '离开时间',
  `status` int(5) DEFAULT 0 COMMENT '状态0:进行中;1：归档',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '机房管理员',
  `pwd` varchar(30) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_room` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '机房名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

