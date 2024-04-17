// CREATING cOLLECTIONS
db.createCollection("Customer_Master");
db.createCollection("Branch_Master");
db.createCollection("Account_Master");

// INSERTING DOCUMENTS IN Customer_Master
db.Customer_Master.insertMany([
    {
        Customer_Id: "C101",
        Customer_Name: "John",
        Customer_Address: "NY",
        Customer_Type: "Cash",
        Customer_Age: 29
    },
    {
        Customer_Id: "C102",
        Customer_Name: "Jeremy",
        Customer_Address: "NJ",
        Customer_Purchase_Amount: 5000,
        Customer_Age: 31
    },
    {
        Customer_Id: "C103",
        Customer_Name: "Mac",
        Customer_Address: "Pune",
        Customer_Purchase_Amount: 3000,
        Customer_Age: 25
    },
    {
        Customer_Id: "C104",
        Customer_Name: "Pattick",
        Customer_Purchase_Amount: 1000,
        Customer_Rating: "A",
        Customer_Age: 21
    },
    {
        Customer_Id: "C105",
        Customer_Name: "Jelina",
        Customer_Address: "NJ",
        Customer_Type: "Cash",
        Customer_Age: 19
    }
]);

// INSERTING DOCUMENTS IN Branch_Master
db.Branch_Master.insertMany([
    {
        Branch_No: "B11",
        Branch_Name: "BHManinagar",
        Total_Assest: 15000,
        Branch_Address: "Ahmedabad1",
        Count_staff: 21
    },
    {
        Branch_No: "B12",
        Branch_Name: "BHPaldi",
        Total_Debt: 17000,
        Branch_Address: "Ahmedabad2",
        Count_Customers: 5750
    },
    {
        Branch_No: "B13",
        Branch_Name: "BHVasna",
        Total_Assest: 21000,
        Branch_Address: "Ahmedabad3",
        Count_staff: 15
    },
    {
        Branch_No: "B14",
        Branch_Name: "BHSatelite",
        Total_Debt: 25000,
        Branch_Address: "Ahmedabad4",
        Count_Customers: 2100
    },
    {
        Branch_No: "B15",
        Branch_Name: "BHCGroad",
        Total_Pending_Due: 45000,
        Branch_Address: "Ahmedabad5",
        Count_staff: 10
    }
]);

//INSERTING DOCUMENTS INTO Account_Master
db.Account_Master.insertMany([
    {
        Account_No: "A1100",
        Account_Type: "Savings",
        Amount: 3500,
        Mode_of_operation: "Single",
        Description: "Intrest_rate_high"
    },
    {
        Account_No: "A1101",
        Account_Type: "Recurring",
        Amount: 4500,
        No_of_times_operated: 250,
        Employee_reference: "Yes"
    },
    {
        Account_No: "A1103",
        Account_Type: "Savings",
        Amount: 10000,
        Mode_of_operation: "Joint",
        Description: "Just_opened"
    },
    {
        Account_No: "A1107",
        Account_Type: "Recurring",
        Amount: 9500,
        No_of_times_operated: 110,
        Employee_reference: "Yes"
    },
    {
        Account_No: "A1109",
        Account_Type: "Savings",
        Amount: 5500,
        Mode_of_operation: "Single",
        Employee_reference: "No"
    }
]);


// CREATING COLLECTION EMPLOYEE
db.createCollection("Employee");

// INSERTING DOCUMENTS INTO EMPLOYEE
db.Employee.insertMany([
    {
        Employee_No: "E11",
        Employee_Name: "Jeremy",
        Designation: "Developer",
        Salary: 40000,
        Employee_Age: 39,
        Product_Name: "Banking"
    },
    {
        Employee_No: "E12",
        Employee_Name: "Dylan",
        Skill_Area: "Coding",
        Salary: 25000,
        Employee_Age: 45,
        Product_Name: "Banking"
    },
    {
        Employee_No: "E13",
        Employee_Name: "Roma",
        Designation: "Developer",
        Salary: 27000,
        Experience_years: 5,
        Outsourcing: "No"
    },
    {
        Employee_No: "E14",
        Employee_Name: "Mac",
        Skill_Area: "Coding",
        Salary: 35000,
        Experience_years: 15,
        Product_Name: "Online_shopping_portal",
    },
    {
        Employee_No: "E15",
        Employee_Name: "Mita",
        Skill_Area: "Analysis",
        Salary: 45000,
        Employee_Age: 28,
        Outsourcing: "Yes"
    },
    {
        Employee_No: "E16",
        Employee_Name: "Nita",
        Designation: "QA",
        Salary: 20000,
        Experience_years: 7,
        Outsourcing: "No"
    },
    {
        Employee_No: "E17",
        Employee_Name: "Priya",
        Skill_Area: "Testing",
        Salary: 55000,
        Experience_years: 10,
        Product_Name: "Online_shopping_portal"
    },
    {
        Employee_No: "E18",
        Employee_Name: "Priyanka",
        Designation: "Analyst",
        Salary: 58000,
        Employee_Age: 43,
        Outsourcing: "Yes"
    }
]);

// 1. Compute the average salary of employee on the basis of their skill area.
db.Employee.aggregate({
    $group: {
        _id: "$Skill_Area",
        average_salary: { "$avg": "$Salary" }
    }
});

// 2. Find the maximum amount from account collection for each account type.
db.Account_Master.aggregate({
    $group: {
        _id: "$Account_Type",
        max_amount: { "$max": "$Amount" }
    }
});

//3. Find the minimum of purchase amount from customer collection according to their address i.e. address wise
db.Customer_Master.aggregate({
    $group: {
        _id: "$Customer_Address",
        min_purchase_amount: { "$min": "$Customer_Purchase_Amount" }
    }
});

//4. Find the total amount from account collection according to mode of operation. i.e. total amount should be displayed for ‘single mode’ and total amount needs to be displayed for ‘joint mode’. 
db.Account_Master.aggregate({
    $group: {
        _id: "$Mode_of_operation",
        total_amount: { "$sum": "$Amount" }
    }
});

// 5. Find the total of salary field of an employee.
db.Employee.aggregate({
    $group: {
        _id: "",
        total_salary: { "$sum": "$Salary" }
    }
});

// 6. Find the average salary of an employee.
db.Employee.aggregate({
    $group: {
        _id: "",
        average_salary: { "$avg": "$Salary" }
    }
});

// 7. Find the minimum and maximum amount of account collection. (two separate queries have to be formed.)
db.Account_Master.aggregate({
    $group: {
        _id: "",
        minimum: { "$min": "$Amount" }
    }
});

db.Account_Master.aggregate({
    $group: {
        _id: "",
        maximum: { "$max": "$Amount" }
    }
});

// 8. Find the minimum and maximum amount of account collection. (in one query)
db.Account_Master.aggregate({
    $group: {
        _id: "",
        minimum: { "$min": "$Amount" },
        maximum: { "$max": "$Amount" }
    }
});

// 1. Display first and last document from account master on the basis of account type.
db.Account_Master.find({ Account_Type: "Savings" }).limit(1);   // FIRST
db.Account_Master.find({ Account_Type: "Savings" }).limit(-1);  // LAST

//2. Add a new field no_resource_occupied into employee master where the salary is greater than 25000.
db.Employee.updateMany({ Salary: { $gt: 25000 } }, { $set: { no_resource_occupied: "" } });

//3. Add the new field no_of_customers to each document in branch_master.
db.Branch_Master.updateMany({}, { $set: { no_of_customers: "" } });

// 4. Add 1000 INR to salary of every employee in organization.
db.Employee.updateMany({}, { $inc: { Salary: 1000 } });

// 5. Add 5000 INR to salary of only those employees where designation is QA.
db.Employee.updateMany({ Designation: "QA" }, { $inc: { Salary: 5000 } });

// 6. Decrease debt of 5000 for paldi branch in branch master table
db.Branch_Master.updateOne({ Branch_Name: "BHPaldi" }, { $inc: { Total_Debt: -5000 } });

// 7. Add a new field query_solved in employee master.
db.Employee.updateMany({}, { $set: { query_solved: "" } });

// 8. Remove the filed – query_solved from employee master.
db.Employee.updateMany({}, { $unset: { query_solved: "" } });

// 9. Multiply salary of an employee to 0.5 where designation is business analyst.
db.Employee.updateMany({ Designation: "Analyst" }, { $mul: { Salary: 0.5 } });

// 10.	Create the following collection – inventory and insert the following two documents:
// a.	(name:”craft paper”, color(red,silver,pink,blue)
// b.	(name: ”crayons”, color(red,green,silver,gloden,black )
db.createCollection("inventory");
db.inventory.insertMany([
    {
        name: "craft paper",
        color: ["red", "silver", "pink", "blue"]
    },
    {
        name: "crayons",
        color: ["red", "green", "silver", "gloden", "black"]
    }
]);

// 11.	Insert a new color – ‘green’ for craft paper. (insert a new element into existing array)
db.inventory.updateOne({ name: "craft paper" }, { $push: { color: { $each: ['green'] } } });

// 12.	Insert two new colors – ‘yellow’ and ‘blue’ for crayons. 
db.inventory.updateOne({ name: "crayons" }, { $push: { color: { $each: ['yellow', 'blue'] } } });

// 13.	Try to insert the red color for the craft paper. It should be inserted as the color is already there. (use suitable operator)
// db.inventory.updateOne({ name: "craft paper" }, { $addToSet: { color: { $each: ['red'] } } });
db.inventory.updateOne({ name: "craft paper" }, { $push: { color: { $each: ['red'] } } });

// 14.	Add a new filed Branch_Status into branch master for all documents with default value ‘open’. 
db.Branch_Master.updateMany({}, { $set: { Branch_Status: "open" } });

// 15.	Make the following changes into employee master.
// a.	Change the filed name Product_Name to System_name for all documents wherever applicable. 
db.Employee.updateMany({}, { $rename: { Product_Name: "System_name" } });
// b.	Change the filed name skill_area to Expertise where the name of the employee is mita.
db.Employee.updateOne({ Employee_Name: "Mita" }, { $rename: { Skill_Area: "Expertise" } });
