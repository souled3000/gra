/**
revoke all on *.* from 'crm'@'%';
drop user crm@'%';
drop database crm;

**/

create schema crm default character set utf8 collate utf8_general_ci;

create user 'crm'@'%' identified by 'crm';
grant all on crm.* to 'crm'@'%';

create user 'crm'@'localhost' identified by 'crm';
grant all on crm.* to 'crm'@'localhost';

flush  privileges;
