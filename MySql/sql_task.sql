use Task
insert into customers values ('1', 'UK Collectables, Ltd.', 'Devon', 'Elizabeth', '(171) 555-2282', '12, Berkeley Gardens Blvd', 'gardens', 'Liverpool', 'gardens', 'WX1 6LT', 'UK', '1501', '92700.00')
insert into customers values('2', 'Canadian Gift Exchange Network', 'Tamuri', 'Yoshi ', '(604) 555-3392', '1900 Oak St.', 'aa', 'Vancouver', 'BC', 'V3F 2K1', 'Canada', '1323', '90300.00')

insert into customers values('3', 'Online Mini Collectables', 'Barajas', 'Miguel', '6175557555', '7635 Spinnaker Dr.', 'bb', 'Brickhaven', 'MA', '58339', 'USA', '1188', '68700.00')
insert into customers values('4',  'Toys4GrownUps.com', 'Young', 'Julie', '6265557265', '78934 Hillside Dr.', 'cc', 'Pasadena', 'CA', '90003', 'USA', '1166', '90700.00')
insert into customers values('5',   'Asian Shopping Network, Co', 'Walker', 'Brydey', '+612 9411 1555', 'Suntec Tower Three', '8 Temasek', 'Singapore', 'dd', '038988', 'Singapore', '1234', '0.00')
insert into customers values('6', 'Mini Caravy', 'Citeaux', 'Frédérique ', '88.60.1555', '24, place Kléber', 'ff', 'Strasbourg', 'gg', '67000', 'France', '1370', '53800.00')
insert into customers values('7','King Kong Collectables, Co.', 'Gao', 'Mike', '+852 2251 1555', 'Bank of China Tower', '1 Garden Road', 'Central Hong Kong', 'hh', 'ii', 'Hong Kong', '1621', '58600.00')
insert into customers values('8','Enaco Distributors', 'Saavedra', 'Eduardo ', '(93) 203 4555', 'Rambla de Cataluña, 23', 'jj', 'Barcelona', 'kk', '08022', 'Spain', '1702', '60300.00')
insert into customers values('9','Boards & Toys Co.', 'Young', 'Mary', '3105552373', '4097 Douglas Av.', 'll', 'Glendale', 'CA', '92561', 'USA', '1166', '11000.00')
insert into customers values('10', 'Natürlich Autos', 'Kloss', 'Horst ', '0372-555188', 'Taucherstraße 10', 'mm', 'Cunewalde', 'nn', '01307', 'Germany', '1231', '0.00')

select * from customers
DELETE FROM customers
WHERE customer_number = 202;


insert into employees values ('100', 'Murphy', 'Diane', 'x5800', 'dmurphy@classicmodelcars.com', '1', '0', 'President')
insert into employees values ('101', 'Patterson', 'Mary', 'x4611', 'mpatterso@classicmodelcars.com', '1', '100', 'VP Sales')
insert into employees values ('102', 'Firrelli', 'Jeff', 'x9273', 'jfirrelli@classicmodelcars.com', '1', '101', 'VP Marketing')
insert into employees values ('103', 'Patterson', 'William', 'x4871', 'wpatterson@classicmodelcars.com', '6', '102', 'Sales Manager (APAC)')
insert into employees values ('104', 'Bondur', 'Gerard', 'x5408', 'gbondur@classicmodelcars.com', '4', '102', 'Sale Manager (EMEA)')
insert into employees values ('105',  'Bow', 'Anthony', 'x5428', 'abow@classicmodelcars.com', '1', '1056', 'Sales Manager (NA)')
insert into employees values ('106',  'Jennings', 'Leslie', 'x3291', 'ljennings@classicmodelcars.com', '1', '105', 'Sales Rep')
insert into employees values ('107',   'Firrelli', 'Julie', 'x2173', 'jfirrelli@classicmodelcars.com', '2', '105', 'Sales Rep')
insert into employees values ('108',   'Vanauf', 'George', 'x4102', 'gvanauf@classicmodelcars.com', '3', '1143', 'Sales Rep')
insert into employees values ('109',  'Nishi', 'Mami', 'x101', 'mnishi@classicmodelcars.com', '5', '105', 'Sales Rep')
insert into employees values ('110', 'Jones', 'Barry', 'x102', 'bjones@classicmodelcars.com', '7', '105', 'Sales Rep')
 UPDATE employees
SET reports_to = '105'
WHERE employee_number=108;
select * from employees


insert into offices values('1', 'San Francisco', '+1 650 219 4782', '100 Market Street', 'Suite 300', 'CA', 'USA', '94080', 'NA')
insert into offices values('2', 'Boston', '+1 215 837 0825', '1550 Court Place', 'Suite 102', 'MA', 'USA', '02107', 'NA')
insert into offices values('3', 'NYC', '+1 212 555 3000', '523 East 53rd Street', 'apt. 5A', 'NY', 'USA', '10022', 'NA')
insert into offices values('4', 'Paris', '+33 14 723 4404', '43 Rue Jouffroy D\'abbans', 'aa', 'bb', 'France', '75017', 'EMEA')
insert into offices values('5', 'Tokyo', '+81 33 224 5000', '4-1 Kioicho', 'cc', 'Chiyoda-Ku', 'Japan', '102-8578', 'Japan')
insert into offices values('6', 'Sydney', '+61 2 9264 2451', '5-11 Wentworth Avenue', 'Floor #2', 'dd', 'Australia', 'NSW 2010', 'APAC')
insert into offices values('7', 'india', '+91 915874689', '5-11 Wentworth Avenue', 'Floor #2', 'ee', 'india', ' 2010', 'APAC')
select * from offices

insert into orderdetails values ('1000', 'S18_1749', '30', '136.00', '3')
insert into orderdetails values ('1001',  'S18_2248', '50', '55.09', '2')
insert into orderdetails values ('1002', 'S18_4409', '22', '75.46', '4')
insert into orderdetails values ('1003', 'S24_3969', '49', '35.29', '1')
insert into orderdetails values ('1004', 'S18_2325', '25', '108.06', '4')
insert into orderdetails values ('1005','S18_2795', '26', '167.06', '1')
insert into orderdetails values ('1006', 'S24_1937', '45', '32.53', '3')
insert into orderdetails values ('1007',  'S24_2022', '46', '44.35', '2')
insert into orderdetails values ('1008', 'S18_1342', '39', '95.55', '2')
insert into orderdetails values ('1009', 'S18_1367', '41', '43.13', '1')
select * from orderdetails
select * from orders

insert into orders values('1000', '2021-07-06', '2021-07-13', '2021-07-25', 'Shipped', 'aa', '1')
insert into orders values('1001', '2021-07-01', '2021-07-10', '2021-07-25', 'Shipped', 'aa', '2')
insert into orders values('1002', '2021-07-02', '2021-07-11', '2021-07-25', 'Shipped', 'bb', '3')
insert into orders values('1003', '2021-07-03', '2021-07-12', '2021-07-25', 'Shipped', 'cc', '4')
insert into orders values('1004', '2021-07-04', '2021-07-13', '2021-07-25', 'Shipped', 'dd', '5')
insert into orders values('1005', '2021-07-05', '2021-07-14', '2021-07-25', 'Shipped', 'ee', '6')
insert into orders values('1006', '2021-07-06', '2021-07-15', '2021-07-25', 'Shipped', 'ff', '7')
insert into orders values('1007', '2021-07-07', '2021-07-16', '2021-07-25', 'Shipped', 'gg', '8')
insert into orders values('1008', '2021-07-08', '2021-07-17', '2021-07-25', 'Shipped', 'hh', '9')
insert into orders values('1009', '2021-07-09', '2021-07-18', '2021-07-25', 'Shipped', 'ii', '10')


insert into payments values ('1', 'AB000010', '2021-07-25', '6066.12');
insert into payments values ('2', 'AB000001', '2021-07-25', '60660.23');
insert into payments values ('3', 'AB000002', '2021-07-25', '16066.34');
insert into payments values ('4', 'AB000003', '2021-07-25', '26066.45');
insert into payments values ('5', 'AB000004', '2021-07-25', '56066.56');
insert into payments values ('6', 'AB000005', '2021-07-25', '46066.67');
insert into payments values ('7', 'AB000006', '2021-07-25', '26066.78');
insert into payments values ('8', 'AB000007', '2021-07-25', '6066.89');
insert into payments values ('9', 'AB000008', '2021-07-25', '86066.09');
insert into payments values ('10', 'AB000009', '2021-07-25', '56066.01');
select * from payments;


insert into productlines values ('Classic Cars', 'Attention car enthusiasts: Make your wildest car ownership dreams come true. Whether you are looking for classic muscle cars, dream sports cars or movie-inspired miniatures, you will find great choices in this category. These replicas feature superb attention to detail and craftsmanship and offer features such as working steering system, opening forward compartment, opening rear trunk with removable spare wheel, 4-wheel independent spring suspension, and so on. The models range in size from 1:10 to 1:24 scale and include numerous limited edition and several out-of-production vehicles. All models include a certificate of authenticity from their manufacturers and come fully assembled and ready for display in the home or office.', 'aa', 'aa');
insert into productlines values ('Motorcycles', 'Our motorcycles are state of the art replicas of classic as well as contemporary motorcycle legends such as Harley Davidson, Ducati and Vespa. Models contain stunning details such as official logos, rotating wheels, working kickstand, front suspension, gear-shift lever, footbrake lever, and drive chain. Materials used include diecast and plastic. The models range in size from 1:10 to 1:50 scale and include numerous limited edition and several out-of-production vehicles. All models come fully assembled and ready for display in the home or office. Most include a certificate of authenticity.', 'bb','cc' );
insert into productlines values ('Planes', 'Unique, diecast airplane and helicopter replicas suitable for collections, as well as home, office or classroom decorations. Models contain stunning details such as official logos and insignias, rotating jet engines and propellers, retractable wheels, and so on. Most come fully assembled and with a certificate of authenticity from their manufacturers.', 'dd','ee');
insert into productlines values ('Ships', 'The perfect holiday or anniversary gift for executives, clients, friends, and family. These handcrafted model ships are unique, stunning works of art that will be treasured for generations! They come fully assembled and ready for display in the home or office. We guarantee the highest quality, and best value.', 'ff', 'ee');
insert into productlines values ('Trains', 'Model trains are a rewarding hobby for enthusiasts of all ages. Whether you\'re looking for collectible wooden trains, electric streetcars or locomotives, you\'ll find a number of great choices for any budget within this category. The interactive aspect of trains makes toy trains perfect for young children. The wooden train sets are ideal for children under the age of 5.', 'gg','hh');
insert into productlines values('Trucks and Buses', 'The Truck and Bus models are realistic replicas of buses and specialized trucks produced from the early 1920s to present. The models range in size from 1:12 to 1:50 scale and include numerous limited edition and several out-of-production vehicles. Materials used include tin, diecast and plastic. All models include a certificate of authenticity from their manufacturers and are a perfect ornament for the home and office.', 'ii','jj');
insert into productlines values('Vintage Cars', 'Our Vintage Car models realistically portray automobiles produced from the early 1900s through the 1940s. Materials used include Bakelite, diecast, plastic and wood. Most of the replicas are in the 1:18 and 1:24 scale sizes, which provide the optimum in detail and accuracy. Prices range from $30.00 up to $180.00 for some special limited edition replicas. All models include a certificate of authenticity from their manufacturers and come fully assembled and ready for display in the home or office.','kk','ll');
select * from productlines;


insert into products values('S24_2011', '18th century schooner', 'Ships', '1:24', 'Carousel DieCast Legends', 'All wood with canvas sails. Many extras including rigging, long boats, pilot house, anchors, etc. Comes with 4 masts, all square-rigged.', '1898', '82.34', '122.89');
insert into products values('S18_3136', '18th Century Vintage Horse Carriage', 'Vintage Cars', '1:18', 'Red Start Diecast', 'Hand crafted diecast-like metal horse carriage is re-created in about 1:18 scale of antique horse carriage. This antique style metal Stagecoach is all hand-assembled with many different parts.\r\n\r\nThis collectible metal horse carriage is painted in classic Red, and features turning steering wheel and is entirely hand-finished.', '5992', '60.74', '104.72');
insert into products values('S24_2841', '1900s Vintage Bi-Plane', 'Planes', '1:24', 'Autoart Studio Design', 'Hand crafted diecast-like metal bi-plane is re-created in about 1:24 scale of antique pioneer airplane. All hand-assembled with many different parts. Hand-painted in classic yellow and features correct markings of original airplane.', '5942', '34.25', '68.51');
insert into products values('S18_3140', '1903 Ford Model A', 'Vintage Cars', '1:18', 'Unimax Art Galleries', 'Features opening trunk,  working steering system', '3913', '68.30', '136.59');
insert into products values('S18_2432', '1926 Ford Fire Engine', 'Trucks and Buses', '1:18', 'Carousel DieCast Legends', 'Gleaming red handsome appearance. Everything is here the fire hoses, ladder, axes, bells, lanterns, ready to fight any inferno.', '2018', '24.92', '60.77');
insert into products values('S18_2625', '1936 Harley Davidson El Knucklehead', 'Motorcycles', '1:18', 'Welly Diecast Productions', 'Intricately detailed with chrome accents and trim, official die-struck logos and baked enamel finish.', '4357', '24.23', '60.57');
insert into products values('S18_1889', '1948 Porsche 356-A Roadster', 'Classic Cars', '1:18', 'Gearbox Collectibles', 'This precision die-cast replica features opening doors, superb detail and craftsmanship, working steering system, opening forward compartment, opening rear trunk with removable spare, 4 wheel independent spring suspension as well as factory baked enamel finish.', '8826', '53.90', '77.00');
insert into products values('S32_3207', '1950\'s Chicago Surface Lines Streetcar', 'Trains', '1:32', 'Gearbox Collectibles', 'This streetcar is a joy to see. It has 80 separate windows, electric wire guides, detailed interiors with seats, poles and drivers controls, rolling and turning wheel assemblies, plus authentic factory baked-enamel finishes (Green Hornet for Chicago and Cream and Crimson for Boston).', '8601', '26.72', '62.14');
insert into products values('S50_1392', 'Diamond T620 Semi-Skirted Tanker', 'Trucks and Buses', '1:50', 'Highway 66 Mini Classics', 'This limited edition model is licensed and perfectly scaled for Lionel Trains. The Diamond T620 has been produced in solid precision diecast and painted with a fire baked enamel finish. It comes with a removable tanker and is a perfect model to add authenticity to your static train or car layout or to just have on display.', '1016', '68.29', '115.75');
insert into products values('S18_3259', 'Collectable Wooden Train', 'Trains', '1:18', 'Carousel DieCast Legends', 'Hand crafted wooden toy train set is in about 1:18 scale, 25 inches in total length including 2 additional carts, of actual vintage train. This antique style wooden toy train model set is all hand-assembled with 100% wood.', '6450', '67.56', '100.84');
select * from product