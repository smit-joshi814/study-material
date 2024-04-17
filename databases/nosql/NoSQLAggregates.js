db.createCollection("student_database");

db.student_database.insertMany([
    {
        S_name:"Smit Joshi",
        S_roll_no:18,
        NoSQL:30,
        Python:50,
        OOAD:34,
        CCV:37,
        DAA:41,
        interests:["Bloging","Writing","Coading"]
    },
    
    {
        S_name:"Vijay Joshi",
        S_roll_no:8,
        NoSQL:34,
        Python:40,
        OOAD:24,
        CCV:27,
        DAA:31,
        interests:["Accounting","Teaching","Dancing"]
    },
    {
        S_name:"Tejasvi sharma",
        S_roll_no:1,
        NoSQL:40,
        Python:50,
        OOAD:44,
        CCV:47,
        DAA:45,
        interests:["Reading","Writing"]
    },
    {
        S_name:"Hiten Joshi",
        S_roll_no:17,
        NoSQL:40,
        Python:40,
        OOAD:36,
        CCV:38,
        DAA:31,
        interests:["Bloging","Writing"]
    },
    {
        S_name:"Hiten Thakkar",
        S_roll_no:48,
        NoSQL:40,
        Python:39,
        OOAD:38,
        CCV:30,
        DAA:21,
        interests:["Travelling","Reading"]
    }
]);