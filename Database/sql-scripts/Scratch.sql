show databases;
use `hb-03-one-to-many`;
show tables;

desc course;
desc instructor;
desc instructor_detail;

select * from course;
select * from instructor;
select * from instructor_detail;

SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE course;
TRUNCATE TABLE instructor;
TRUNCATE TABLE instructor_detail;
SET FOREIGN_KEY_CHECKS = 1;
desc student;