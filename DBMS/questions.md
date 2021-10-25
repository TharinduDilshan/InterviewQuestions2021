# DBMS Theory Questions

## Question 1. What are ACID properties?
- **Atomicity :**
By this, we mean that either the entire transaction takes place at once or doesn’t happen at all. There is no midway i.e. transactions do not occur partially. 
- **Consistency :**
This means that integrity constraints must be maintained so that the database is consistent before and after the transaction. It refers to the correctness of a database.
- **Isolation :**
This property ensures that multiple transactions can occur concurrently without leading to the inconsistency of database state. Transactions occur independently without interference. Changes occurring in a particular transaction will not be visible to any other transaction until that particular change in that transaction is written to memory or has been committed. This property ensures that the execution of transactions concurrently will result in a state that is equivalent to a state achieved these were executed serially in some order. 
- **Durability:**
This property ensures that once the transaction has completed execution, the updates and modifications to the database are stored in and written to disk and they persist even if a system failure occurs. These updates now become permanent and are stored in non-volatile memory.

## Question 2. Explain the different languages present in DBMS
There are 4 main types of languages present in DBMS, namely:
- **DDL(Data Definition Language):**  It contains commands which are required to define the database.
*E.g., CREATE, ALTER, DROP, TRUNCATE, RENAME, etc.*
- **DML(Data Manipulation Language):** It contains commands which are required to manipulate the data present in the database.
*E.g., SELECT, UPDATE, INSERT, DELETE, etc.*
- **DCL(Data Control Language):**  It contains commands which are required to deal with the user permissions and controls of the database system.
*E.g., GRANT and REVOKE.*
- **TCL(Transaction Control Language):**  It contains commands which are required to deal with the transaction of the database.
*E.g., COMMIT, ROLLBACK, and SAVEPOINT.*

## Question 3. Explain different types of Normalization forms in a DBMS.
- **1NF :** It is known as the first normal form and is the simplest type of normalization that you can implement in a database. A table to be in its first normal form should satisfy the following conditions:
    - Every column must have a single value and should be atomic.
    - Duplicate columns from the same table should be removed.
    - Separate tables should be created for each group of related data and each row should be identified with a unique column.
- **2NF :** It is known as the second normal form. A table to be in its second normal form should satisfy the following conditions:
    - The table should be in its 1NF i.e. satisfy all the conditions of 1NF.
    - Every non-prime attribute of the table should be fully functionally dependent on the primary key i.e. every non-key attribute should be dependent on the primary key in such a way that if any key element is deleted then even the non_key element will be saved in the database.
- **3NF :** It is known as the third normal form. A table to be in its second normal form should satisfy the following conditions:
    - The table should be in its 2NF i.e. satisfy all the conditions of 2NF.
    - There is no transitive functional dependency of one attribute on any attribute in the same table.  
- **BCNF :** BCNF stands for Boyce-Codd Normal Form and is an advanced form of 3NF. It is also referred to as 3.5NF for the same reason. A table to be in its BCNF normal form should satisfy the following conditions:
    - The table should be in its 3NF i.e. satisfy all the conditions of 3NF.
    - For every functional dependency of any attribute A on B
(A->B), A should be the super key of the table. It simply implies that A can’t be a non-prime attribute if B is a prime attribute.

## Question 4. What is Denormalization?

Denormalization is a database optimization technique in which we add redundant data to one or more tables.

