insert into Category (id,name,image,description) values ('1','book','literatura','beletresica');
insert into Customer (id,email,first_Name,last_Name,Password,Address,Postcode,City,Phone) values (1,'bekakikalishvili@gmail.com','lilian','mircos','dushqu','birkestrase', 40233, 'dusseldorf', 015434232);
insert into Orders (id,order_No,order_Date,order_Total,shipping_Date,is_Delivered,Customer_id) values ('1',10,'2015-10-11',30,'2013-02-02','arvici','1');
insert into Product(id,product_Name,product_Desc,image1,image2,image3,Prece,Stock,Category_id) values ('1','cigni','arvici','dushqu1','dushqu2','dushqu3',40,'arvici','1');
insert into Order_Details (id,Qty,Price,Subtotal,Order_id,Product_id) values ('1','arvici',20,40,'1','1');