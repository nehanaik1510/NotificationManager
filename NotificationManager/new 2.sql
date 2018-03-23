create keypspace entitymanager with replication = {'class':'NetworkTopologyStrategy','dc1': 2 };

create table Product
(id int,productName varchar,
productDescription varchar,productPrice int,
productModelNumber varchar, primary key(id,productName,productPrice));