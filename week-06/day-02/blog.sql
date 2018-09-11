create database blog;

use blog;

create table users (
	id int primary key auto_increment,
	name varchar(30),
	age int 

);

insert into users (name, age) values('sanyi', 30);
insert into users (name, age) values('viktor', 37);
insert into users (name, age) values('léna', 4);

select * from users;

create table posts(

	id int primary key auto_increment,
	title varchar(100),
    content text,
    author_id int
    );
    
    insert into posts (title, content, author_id) values ('New blogpost', 'Nice new blogpost', 1);
    insert into posts (title, content, author_id) values ('New blogpost', 'Absolute short blogpost', 2);
    insert into posts (title, content, author_id) values ('New blogpost', 'Wow, one more post', 2);
    
    select * from posts
    join users on posts.author_id = users.id;
    
    select name, count(posts.id) from users
    left join posts on posts.author_id = users.id
    group by users.name
	order by users.name;
    
    update posts 
    set content = 'Absolute short post'
    where id = 2;
    
    delete from posts where id = 1;
    
    select * from posts;
    