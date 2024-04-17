
-- Creating Database
CREATE DATABASE SQLMid;

-- Selecting Database for Use
use SQLMid;

-- SET 1 MYSQL ----------

-- Creating Table CUST_DETAILS
CREATE TABLE CUST_DETAILS(
    CustomerID int primary key,
    CustomerFirstName varchar(50),
    CustomerCity varchar(20),
    CustomerEmailID varchar(50),
    CustomerGender varchar(6)
);

-- Creating Table PRODUCT_DETAILS
CREATE TABLE PRODUCT_DETAILS(
    ProductID int primary key,
    Product_Name varchar(100),
    ProductDescription varchar(255),
    ProductQty DECIMAL(2),
    ProductCost DECIMAL(6,2)
);

DESC CUST_DETAILS;
DESC PRODUCT_DETAILS;

-- Adding Three Records In Each Table
INSERT INTO CUST_DETAILS (
    CustomerID,
    CustomerFirstName,
    CustomerCity,
    CustomerEmailID,
    CustomerGender
) VALUES
(1,'Smit Joshi','Deesa','smitjoshi814@gmail.com','Male'),
(2,'Vijay Joshi','Patan','vijayJoshi12@gmail.com','Male'),
(3,'Viahva Joshi','Ahmedabad','vishu4@gmail.com','Female');


INSERT INTO PRODUCT_DETAILS(
    ProductID,
    Product_Name,
    ProductDescription,
    ProductQty,
    ProductCost 
) VALUES
(101,'Parle-G','Ek Bar Khao Khate hi reh jao',10,4.8),
(102,'LED',"It's Show Time",10,9999.99),
(103,'LCD','Full HD Display',10,8999.99);

-- 1. Add an additional field C_ CustomerLastName in CUST_DETAILS table.

ALTER TABLE CUST_DETAILS ADD C_CustomerLastName varchar(50);


-- 2. Change the cost of product to 1000 where Product_ID is 102. 
UPDATE PRODUCT_DETAILS SET ProductCost=1000 WHERE ProductID=102;

-- 3. . Display only those records from Product where the name of the product is LED or LCD. (Do not use OR)
 SELECT * FROM PRODUCT_DETAILS WHERE Product_Name IN('LED','LCD');

--  SET 1 MYSQL ENDS ------------


-- SET 2 MYSQL  ------------------

-- CREATING TABLE Publisher_DETAILS
CREATE TABLE Publisher_DETAILS(
Publisher_ID int primary key,
Publisher_Name varchar(50),
Publisher_City varchar(30)
);


-- CREATING TABLE ORDERS
CREATE TABLE ORDERS(
OrderNo int Primary Key,
Order_Date Date,
OrderAmount DECIMAL(6,2)
);


-- INSERTING Three Records In Each ONE
INSERT INTO Publisher_DETAILS(
Publisher_ID,
Publisher_Name,
Publisher_City
) VALUES
(1,'Smit Joshi','Ahmedabad'),
(2,'Vijay Joshi','Mumbai'),
(3,'Jinal Patel','Surat');


INSERT INTO ORDERS(
OrderNo ,
Order_Date ,
OrderAmount
) VALUES
(1, '2003-07-29',8999.99),
(2, '2003-08-02',899.99),
(3, '2003-09-09',4599.99);


-- 1. Add an additional field Publisher_Email in Publisher_DETAILS table. 
ALTER TABLE Publisher_DETAILS ADD Publisher_Email varchar(40);


-- 2. Change the OrderAmount to 5000 where OrderNo is 3
UPDATE ORDERS SET OrderAmount=5000 WHERE OrderNo=3;

-- 3. Display only those records from Publisher where the Publisher_city is Ahmedabad or Mumbai. (Do not use OR )
SELECT * FROM Publisher_DETAILS WHERE Publisher_city IN ('Ahmedabad','Mumbai');

--  SET 2 ENDS  -------------

-- SET 3 MYSQL ----------

-- Creating table PATIENT
CREATE TABLE PATIENT(
Patient_ID int primary Key,
Patient_Name varchar(50),
Patient_Age DECIMAL(2),
Charges DECIMAL(6,2),
Patient_Gender VARCHAR(6)
);


-- Creating table DOCTOR_DETAILS
CREATE TABLE DOCTOR_DETAILS(
Doct_ID int primary key,
DoctFName VARCHAR(50),
salary DECIMAL(7,2),
D_Age DECIMAL(2),
Experience DECIMAL(2)
);

-- Inserting Three Records In Each ONE

INSERT INTO PATIENT(
Patient_ID,
Patient_Name,
Patient_Age,
Charges,
Patient_Gender
)VALUES
(1, 'Vikas',28,999.99,'Male'),
(2, 'Sakshi',30,499.99,'Female'),
(3, 'Sarthak',17,899.99,'Male');

INSERT INTO DOCTOR_DETAILS(
Doct_ID,
DoctFName,
salary,
D_Age,
Experience
)VALUES
(1,'Drashti',20000,29,2),
(2,'Bhavik',10000,39,10),
(3,'Vijay',20000,48,18);

-- 1. Add an additional field DoctLName in DOCTOR_DETAILS table. 
ALTER TABLE DOCTOR_DETAILS ADD DocLName varchar(20);

-- 2. Change the Charges to 2000 where Patient_ID is 3. 
UPDATE PATIENT SET Charges=2000 WHERE Patient_ID=3;

-- 3. Display only those records from DOCTOR_DETAILS where the salary is 10000 or 20000. (Do not use OR)
SELECT * FROM DOCTOR_DETAILS WHERE salary IN(10000,20000);

-- SET 3 ENDS 

-- SET 4 MYSQL

-- CREATING ARTIST TABLE
CREATE TABLE ARTIST(
    A_ID INT PRIMARY KEY,
    A_NAME VARCHAR(50),
    A_AGE VARCHAR(50),
    A_EXPERIENCE DECIMAL(2),
    A_Salary DECIMAL(7,2),
    A_gender VARCHAR(6),
    email VARCHAR(50)
);

-- CREATING PAINTING TABLE
CREATE TABLE Painting(
    Painting_ID int PRIMARY key,
    PaintingName VARCHAR(50),
    Category VARCHAR(30),
    Price DECIMAL(7,2)
);

-- INSERTING THREE RECORDS IN ECH ONE
INSERT INTO ARTIST(
            A_ID,
          A_NAME,
           A_AGE,
    A_EXPERIENCE,
        A_Salary,
        A_gender,
           email
)VALUES
(1,'Smit Joshi',21,2,70000,'Male','smitjoshi@gmail.com'),
(2,'Vishva Joshi',20,1,30000,'Female','vaishujoshi@gmail.com'),
(3,'Vijay Joshi',27,4,90000,'Male','joshivijay34@gmail.com');

INSERT INTO Painting(
     Painting_ID,
    PaintingName,
        Category,
           Price
)VALUES
(101,'Radha Shyam','Abstract art',90000),
(102,'Wild Life','Oil painting',50000),
(103,'Peace','Spray Painting',40000);

-- 1. Add an additional field City in ARTIST table.
ALTER TABLE ARTIST ADD City varchar(20);

-- 2. Change the Category to Oil painting where Painting_ID is 101.
UPDATE Painting SET Category="Oil Painting" WHERE Painting_ID=101;

-- 3. Display only those records from Painting where the Category is Oil painting or Abstract art.(Do not use OR)
SELECT * FROM Painting WHERE Category IN("Oil Painting","Abstract art");

-- SET 4 ENDS

-- SET 5 MYSQL

-- CREATING TABLE ACCOUNT_MASTER
CREATE TABLE ACCOUNT_MASTER(
    AccountNo int primary KEY,
    AccountHoldername VARCHAR(50),
    A_City VARCHAR(30),
    AccountType VARCHAR(10),
    AccountBalance DECIMAL(7,2)
);

-- CREATING TABLE TRANSACTIOn_DETAILS
CREATE TABLE TRANSACTION_DETAILS(
    TransactionID int PRIMARY KEY,
    AccountNo int,
    TransactionType VARCHAR(10),
    TransactionAmount DECIMAL(6,4),
    Foreign Key (AccountNo) REFERENCES ACCOUNT_MASTER(AccountNo)
);

-- INSERTING THREE RECORDS IN EACH TABLE

INSERT INTO ACCOUNT_MASTER(
    AccountNo,
    AccountHoldername,
    A_City,
    AccountType,
    AccountBalance
)VALUES
(101,"Rakesh","Deesa","saving",99999.99),
(102,"Suresh","Ahmedabad","current",7999.99),
(103,"Smit Joshi","Deesa","saving",28999.99);

INSERT INTO TRANSACTION_DETAILS(
    TransactionID,
    AccountNo,
    TransactionType,
    TransactionAmount
) VALUES
(1,101,"UPI",3000),
(2,102,"Cash",10000),
(3,103,"Credit Card",6000);


-- 1. Add an additional field TransactionDate in TRANSACTION_DETAILS table.
ALTER TABLE TRANSACTION_DETAILS ADD TransactionDate DATE;
-- 2. Change the status of AccountType to “Current” where AccountNo is 101.
UPDATE ACCOUNT_MASTER SET AccountType="current" WHERE AccountNo=101;

-- 3. Display only those records from ACCOUNT_MASTER where the name is “Rakesh” or “Suresh”. (Do not use OR) 
SELECT * FROM ACCOUNT_MASTER WHERE AccountHolderName IN ("Rakesh","Suresh");


-- END SET 5