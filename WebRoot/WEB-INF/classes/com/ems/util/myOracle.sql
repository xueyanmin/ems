select * from t_user_2

创建T_USER_2表
create table t_user_2(
	id integer primary key,
	username varchar2(22),
	realname varchar2(22),
	password varchar2(32),
	sex varchar2(3)
)
查询
select username,password from 
     	t_user_2 where username='123456' and password='1313'
创建序列
create sequence seq_2 start with 1

添加数据
insert into t_user_2 (id,username,realname,password,sex) values (seq_2.nextval,'1','2','3','4');

通过id查询数据
select id,username,realname,password,sex from t_user_2 where id=1

mybatis默认序列
select seq_2.nextval from dual


update t_person set name='110',salary=100,age=20 where id=7

insert into t_person (id,name,salary,age) 
values (seq_person_1.nextval,'坜',4665,20);
select seq_person_1.nextval from dual
select * from t_person
create table t_person(
	id integer primary key,
	name varchar2(32),
	salary number(10,2),
	age number(3)
)
commit
create sequence seq_person_1
insert into t_person values (seq_person_1.nextval,'jon',19000,20);
insert into t_person values (10,'jon',19000,20);
select id,name,salary,age
from t_person

delete t_person where id=10


