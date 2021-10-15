CREATE TABLE `t_item` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `factory_staff` varchar(30) DEFAULT NULL COMMENT '厂家人员',
  `factory` varchar(30) DEFAULT NULL COMMENT '厂家',
  `dept` varchar(30) DEFAULT NULL COMMENT '科室',
  `dept_staff` varchar(30) DEFAULT NULL COMMENT '科室负责人',
  `admin` varchar(30) DEFAULT NULL COMMENT '机房管理员名',
  `room` varchar(30) DEFAULT NULL COMMENT '机房名',
  `signin_time` bigint(20) DEFAULT NULL COMMENT '进入机房时间',
  `pre_signout_time` bigint(20) DEFAULT NULL COMMENT '预计离开机房时间',
  `signout_time` bigint(20) DEFAULT NULL COMMENT '离开时间',
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

