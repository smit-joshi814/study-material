// use NoSQLMid;


/*  SET 1  */

// Creating The Collection
db.createCollection("Freshman");

db.Freshman.insertMany([
    {
        Freshma_Name: "Smit Joshi",
        Address: "Deesa",
        Area_of_intrest: "Parita",
        Certification_course: "Java Hero",
        Age: 21,
        Score_Entrance: 80
    },
    {
        Freshma_Name: "Tejasv Modi",
        Address: "Patan",
        Area_of_intrest: "Web Desisning",
        Certification_course: "Web Developing",
        Age: 21,
        Score_Entrance: 50
    },
    {
        Freshma_Name: "Nisha",
        Address: "Ranuj",
        Area_of_intrest: "Dancing",
        Certification_course: "Dancer's Things",
        Age: 22,
        Score_Entrance: 30
    }
]);

// 1. Display the details of the Freshman whose entrance exam score is greater than 40.

db.Freshman.find({
    Score_Entrance: { $gt: 40 }
});


// 2. Change the interest area of Parita to Analysis. 
db.Freshman.updateMany({ Area_of_intrest: "Parita" }, { $set: { Area_of_intrest: "Analysis" } });

// 3. Display details of Freshman who are not living in Ahmedabad and Delhi (use nor operator)
db.Freshman.find({
    $nor: [
        { Address: "Ahmedabad" },
        { Address: "Delhi" }
    ]
});

/* SET 1 ENDS */



/* SET 2 */
db.createCollection("Employee");

db.Employee.insertMany([
    {
        Name: "Laxman",
        Address: "Surat",
        Experience: "2 years",
        Department: "Purchase",
        Age: 21,
        Rating: 4
    },
    {
        Name: "Ram",
        Address: "Ayodhya",
        Experience: "1 Year",
        Department: "Sales",
        Age: 19,
        Rating: 9
    },
    {
        Name: "Hanuman",
        Address: "Ahmedabad",
        Experience: "2 years",
        Department: "Sales",
        Age: 22,
        Rating: 5
    }
]);

// 1.	DISPLAY THE DETAILS OF THE EMPLOYEE WHOSE RATING IS GREATER THAN 5.

db.Employee.find({
    Rating: { $gt: 5 }
});


// 2.	CHANGE THE DEPARTMENT OF RAM TO PURCHASE.
db.Employee.updateOne({ Name: "Ram" }, { $set: { Department: "Purchase" } });

// 3.	DISPLAY DETAILS OF EMPLOYEE WHO ARE NOT LIVING IN AHMEDABAD AND SURAT (USE NOR OPERATOR).
db.Employee.find({
    $nor: [
        { Address: "Ahmedabad" },
        { Address: "Surat" }
    ]
});

/* SET 2 ENDS */

/* SET 3 START */

db.createCollection("Selller");

db.Seller.insertMany([
    {
        Name: "Smit",
        Address: "Ahmedabad",
        Products_Supplied: ["Brush", "Colgate", "Buiscuits"],
        T_C: true,
        Age: 28,
        Type: "x type",
        Total_Order: 1200,
        Pending_order: 100
    },
    {
        Name: "Switi",
        Address: "Bhavnagar",
        Products_Supplied: ["Chocolets", "Milk", "Buiscuits"],
        T_C: true,
        Age: 21,
        Type: "y type",
        Total_Order: 100,
        Pending_order: 50
    },
    {
        Name: "Tejasv",
        Address: "Surat",
        Products_Supplied: ["Cosmatics", "Hurbal", "Shempoo"],
        T_C: true,
        Age: 25,
        Type: "z type",
        Total_Order: 200,
        Pending_order: 10
    }
]);

// 1. Display the details of the Seller whose age is greater than 25.
db.Seller.find({ Age: { $gt: 25 } });


// 2. Change the T_C of Sumit to “Allow_Credit”.
db.Seller.updateMany({ T_C: true }, { $rename: { "T_C": "Allow_Credit" } });

// 3. Display details of Seller who are not living in Ahmedabad and Bhavnagar (use nor operator).
db.Seller.find({
    $nor: [
        { Address: "Ahmedabad" },
        { Address: "Bhavnagar" }
    ]
});

/* SET 3 ENDS */

/* SET 4 ENDS */
db.createCollection("Dealer");

db.Dealer.insertMany([
    {
        Name: "Shyam",
        Address: "Deesa",
        Product_name: "Dairy Milk",
        T_C: true,
        Age: 21,
        Amount: 5000
    },
    {
        Name: "Smit Joshi",
        Address: "Rajkot",
        Product_name: "Parle-G",
        T_C: true,
        Age: 21,
        Amount: 15500
    },
    {
        Name: "Drashti Joshi",
        Address: "Ahmedabad",
        Product_name: "Bread",
        T_C: true,
        Age: 20,
        Amount: 2000
    }
]);

// 1. Display the details of the Dealer whose amount is greater than 15000.
db.Dealer.find({ Amount: { $gt: 15000 } });

// 2. Change the Adress of Dealer name Shyam to Pune.
db.Dealer.updateOne({ Name: "Shyam" }, { $set: { Address: "Pune" } });

// 3. Display details of Dealer who are not living in Rajkot and Ahmedabad (use nor operator).
db.Dealer.find({
    $nor: [
        { Address: "Ahmedabad" },
        { Address: "Rajkot" }
    ]
});

/* SET 4 ENDS */

/* SET 5 STARTS */

db.createCollection("Associate");

db.Associate.insertMany([
    {
        Name: "Smita",
        Address: "Surat",
        Area_of_Expertise: "Wed Development",
        Certification_course: "Web Dev+",
        Age: 21,
        Score_Entrance: 80
    },
    {
        Name: "Switi",
        Address: "Surat",
        Area_of_Expertise: "Java Developer",
        Certification_course: "Java Zero To Hero",
        Age: 32,
        Score_Entrance: 89
    },
    {
        Name: "Vijay",
        Address: "Rajkot",
        Area_of_Expertise: "Accounting",
        Certification_course: "Accounting Masters",
        Age: 30,
        Score_Entrance: 60
    }
]);

// 1. Display the details of Associate whose age is less than 30.
db.Associate.find({ Age: { $lt: 30 } });
// 2. Change the address of Smita to Ahmedabad.
db.Associate.updateOne({ Name: "Smita" }, { $set: { Address: "Ahmedabad" } });
// 3. Display details of Associate who are not living in Rajkot and Surat (use nor operator)
db.Associate.find({
    $nor: [
        { Address: "Rajkot" },
        { Address: "Surat" }
    ]
});