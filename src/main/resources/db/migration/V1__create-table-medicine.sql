create table medicine(
	id bigint not null auto_increment,
	name varchar(100) not null,
	via varchar(100) not null,
	lote varchar(100) not null,
	quantity varchar(100) not null,
	expiration varchar(100) not null,
	laboratory varchar(100) not null,
	
	primary key (id)
);
