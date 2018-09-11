SELECT * FROM bookstore;

show tables;

select * from bookstore.author;
select * from bookstore.book_mast;
select * from bookstore.category;
select * from bookstore.despatch; 
select * from bookstore.newpublisher; 
select * from bookstore.`order`;
select * from bookstore.publisher; 
select * from bookstore.purchase;

select book_mast.book_name, aut_name, cate_descrip, pub_name, book_price
from book_mast
inner join author on author.aut_id = book_mast.aut_id
inner join category on category.cate_id = book_mast.cate_id
inner join publisher on publisher.pub_id = book_mast.pub_id
inner join purchase on purchase.book_id = book_mast.book_id
;