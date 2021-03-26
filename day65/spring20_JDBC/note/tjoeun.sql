
drop table jdbc_test purge;

 create table jdbc_test(
    int_data number not null,
    str_data varchar2(500) not null
 );
 
 insert into jdbc_test values(27, '±èÅÂÇü');