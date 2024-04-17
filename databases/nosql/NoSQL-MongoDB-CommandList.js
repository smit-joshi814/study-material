/* Creating Database */
// use DATABASE_NAME  -> It Will Create The database If Not Exist and Mount it
/*
ex. 
    use NoSQL_Collage
*/

/* To Check How many databases Available  */
// show dbs

/* To Create Collection */
db.CreateCollection('NameOfCollection', 'OptionsToBeUse')
/* OPTIONS 

capped (Boolean) ->  (Optional) If true, enables a capped collection. 
                        Capped collection is a fixed size  collection that 
                        automatically overwrites its oldest entries when it 
                        reaches its  maximum size. If you specify true, you 
                        need to specify size parameter also.

autoIndexId (Boolean) -> (Optional) If true, automatically create index on _id field. 
                            Default value is false.

size (Number)   ->  (Optional) Specifies a maximum size in bytes for
                    a capped collection. If capped is true, then you
                    need to specify this field also.


max (Number) -> (Optional) Specifies the maximum number of documents allowed
                in the capped  collection

*/

/* Droping DATABASE */
db.dropDatabase()  // it will drop the current database you are in

/* Dropping Collection */
db.CollectionName.drop()    // It will Drop The Specified Collection


/* Inserting Documents 
There are 3 Methods
1. insert()
2. insertOne()
3. insertmany()
*/
// sytex insert
db.CollectionName.insert({
    // Data To be Inserted
    studentId:1,
    studentName:"Smit Joshi"
})


// Syntex insertOne
db.CollectionName.insertOne({
    // data To be inserted
    studentId:1,
    studentName:"Vijay"
})

// Syntex insertMany
db.CollectionName.insertMany([
    // Array of data to be Inserted
    {
        studentId:1,
        studentName:"Smit Joshi"
    },
    {
        studentId:2,
        studentName:"Switi patel"
    }
])

/* Querying Document 
method: find()
*/
db.CollectionName.find()
// To Display This Data In Formated Way
db.CollectionName.find().pretty()

/* Querying Document with Certain condition */
db.CollectionName.find({Condition})
// example: suppose I Want to search data From A Collection Where name Of The Student is switi
db.Students.find({name:"switi"})


