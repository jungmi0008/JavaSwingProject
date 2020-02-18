-- cms
create table cmsdb (
    id number(10,0) primary key,
    name varchar2(45) not null,
    gender varchar2(45) not null,
    phone varchar2(45) not null,
    address varchar2(100) not null
);

create sequence cms_seq;