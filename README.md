# CSV_Data_Migration 

## **Details of functionality**

Migrate data from a CSV file into MySQL database.

Checks for duplicates based on ID and other erroneous data.

Basic CLI.

### **Design Patterns**

Factory pattern is used to generate employeeDTO's

Singleton is used for the in-program storage/sorting and for the connection to the db.


### Summary:

Runtime is about 200ms from reading data to complete storage insertion for 10k items from test data set.

Without db, program runs in roughly 10ms from read to store of in-program storage collection.






