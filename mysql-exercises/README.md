                                                                        ****Exercise-1

Let’s now focus on the online feedback system for NIIT. As per the design participants have to develop the required table structure by using ANSI SQL Syntax.

Exercise 1:-

After completing the hands-on exercises, you will be able to: Understand How to Create Tables.

Problem Statement:

Participants have to create all the tables as per the structure mentioned below:-

FacultyDetails

Field	Description	Type	Size

Faculty_Id	Unique ID to every Faculty	Character	20

Title	Title of Faculty	Character	7

Faculty_Name	Name of Faculty	Character	30

Faculty_Location	Location of Faculty	Character	30

Faculty_Track	Like JAVA, .Net, Mainframe	Character	15

Faculty_Qualification	Like MCA,B. Tech	Character	100

Faculty_Experiance	Experience of Faculty Like 2,4 years	Integer	11

Faculty_Email	Email Id of Faculty	Character	100

Faculty_Password	Login password of Faculty	Character	20

Batch Details

Field	Description	Type	Size

Batch_Id	Unique ID to every batch	Character	20

Batch_Faculty	Batch owner name	Character	30

Batch_DEPT_Name	Business unit to which batch belongs	Character	30

Module Details

Field	Description	Type	Size

Module_Id	Unique ID to every module like J2SE, J2EE	Character	20

Module_Name	Name of module like Core Java SE 1.6	Character	40

Module_Duration	Duration in hrs	Integer	11

Student Details

Field	Description	Type	Size

Student_Id	Unique ID to every Student	Character	20

Title	Like Mr. , Mrs. Etc	Character	7

Student_Name	Name of Student	Character	30

Student_Location	Location of Student	Character	30

Student_Track	Like JAVA, .Net, Mainframe	Character	15

Student_Qualification	Like MCA,B. Tech	Character	200

Student_Email	Email Id of Student	Character	100

Student_Password	Login password of Student	Character	20

Questions

Field	Description	Type	Size

Question_Id	Unique ID to every question	Character	20

Module_Id	Module id from module	Character	20

Question_Text	Actual feedback question	Character	900

Student_Status

Field	Description	Type	Size

Student_Id	Student Id from Student_Info	Character	20

Module_Id	Module Id from module	Character	20

Start_Date	Date when Student batch started	Character	20

End_Date	Date when Student batch ended	Character	20

AFeedbackGiven	Flag to test whether Student has given feedback or not	Character	20

TFeedbackGiven	Flag to test whether Faculty has given feedback or not	Character	20

Faculty_Feedback

Field	Description	Type	Size

Faculty_Id	Faculty Id from Faculty_Info	Character	20

Question_Id	Question Id from Questions	Character	20

Batch_Id	Batch Id from batch_Info	Character	20

Module_Id	Module Id from module	Character	20

Faculty_Rating	Rating given by Faculty for a perticular question	Integer	11

Student_Feedback

Field	Description	Type	Size

Student_Id	Student Id from Student_Info	Character	20

Question_Id	Question Id from Questions	Character	20

Module_Id	Module Id from module	Character	20

Student_Rating	Rating given by Student for a perticular question	Integer	11

Login_Details

Field	Description	Type	Size

User_Id	User id for login	Character	20

User_Password	Password to authenticate user	Character	20

Deliverables Expected:

All Tables creation as per details mentioned above ***


Exercise 2:-

After completing the hands-on exercises, you will be able to:

Understand how to alter table

Problem Statement:

Modify the table Student_Status to include following two columns:

Column Name: Batch_Id

Details: Batch Id from batch_Info

Data Types: Character

Size: 20

Column Name: Faculty_Id

Details: Trainer Id from faculty_Info

Data Types: Character

Size: 20

Modify two columns data types of the table Student_Status as follows:

Start_Date

Desired Type: Date

End_Date

Desired Type: Date

Deliverables Expected:

New Columns in BatchDetails & facultyDetails & changed column data types

Exercise 3:-

After completing the hands-on exercises, you will be able to:

Insert data into tables

Problem Statement:

Insert below details into table:

FacultyDetails

Field	Description	Type	Size

Faculty_Id	Unique ID to every Faculty	Character	20

Title	Title of Faculty	Character	7

Faculty_Name	Name of Faculty	Character	30

Faculty_Location	Location of Faculty	Character	30

Faculty_Track	Like JAVA, .Net, Mainframe	Character	15

Faculty_Qualification	Like MCA,B. Tech	Character	100

Faculty_Experiance	Experience of Faculty Like 2,4 years	Integer	11

Faculty_Email	Email Id of Faculty	Character	100

Faculty_Password	Login password of Faculty	Character	20

F001,Mr.,PANKAJ GHOSH,Pune,Java,Bachelor of Technology,12,Pankaj.Ghosh@alliance.com,fac1@123

F002,Mr.,SANJAY RADHAKRISHNAN ,Bangalore,DotNet,Bachelor of Technology,12,Sanjay.Radhakrishnan@alliance.com,fac2@123

F003,Mr.,VIJAY MATHUR,Chennai,Mainframe,Bachelor of Technology,10,Vijay.Mathur@alliance.com,fac3@123

F004,Mrs.,NANDINI NAIR,Kolkata,Java,Master of Computer Applications,9,Nandini.Nair@alliance.com,fac4@123

F005,Miss.,ANITHA PAREKH,Hyderabad,Testing,Master of Computer Applications,6,Anitha.Parekh@alliance.com,fac5@123

F006,Mr.,MANOJ AGRAWAL ,Mumbai,Mainframe,Bachelor of Technology,9,Manoj.Agrawal@alliance.com,fac6@123

F007,Ms.,MEENA KULKARNI,Coimbatore,Testing,Bachelor of Technology,5,Meena.Kulkarni@alliance.com,fac7@123

F009,Mr.,SAGAR MENON ,Mumbai,Java,Master of Science In Information Technology,12,Sagar.Menon@alliance.com,fac8@123


Batch Details

Field	Description	Type	Size

Batch_Id	Unique ID to every batch	Character	20

Batch_Faculty	Batch owner name	Character	30

Batch_DEPT_Name	Business unit to which batch belongs	Character	30

B001,MRS.SWATI ROY,MSP

B002,MRS.ARURNA K,HEALTHCARE

B003,MR.RAJESH KRISHNAN,LIFE SCIENCES

B004,MR.SACHIN SHETTY,BFS

B005,MR.RAMESH PATEL,COMMUNICATIONS

B006,MRS.SUSAN CHERIAN,RETAIL & HOSPITALITY

B007,MRS.SAMPADA JAIN,MSP

B008,MRS.KAVITA REGE,BPO

B009,MR.RAVI SEJPAL,MSP


Module Details

Field	Description	Type	Size

Module_Id	Unique ID to every module like J2SE, J2EE	Character	20

Module_Name	Name of module like Core Java SE 1.6	Character	40

Module_Duration	Duration in hrs	Integer	11

O10SQL,Oracle 10g SQL ,16

O10PLSQL,Oracle 10g PL/ SQL ,16

J2SE,Core Java SE 1.6,288

J2EE,Advanced Java EE 1.6,80

JAVAFX,JavaFX 2.1,80

DOTNT4,.Net Framework 4.0 ,50

SQL2008,MS SQl Server 2008,120

MSBI08,MS BI Studio 2008,158

SHRPNT,MS Share Point ,80

ANDRD4,Android 4.0,200

EM001,Instructor,0

EM002,Course Material,0

EM003,Learning Effectiveness,0

EM004,Environment,0

EM005,Job Impact,0

TM001,Attendees,0

TM002,Course Material,0

TM003,Environment,0

Student Details

Field	Description	Type	Size

Student_Id	Unique ID to every Student	Character	20

Title	Like Mr. , Mrs. Etc	Character	7

Student_Name	Name of Student	Character	30

Student_Location	Location of Student	Character	30

Student_Track	Like JAVA, .Net, Mainframe	Character	15

Student_Qualification	Like MCA,B. Tech	Character	200

Student_Email	Email Id of Student	Character	100

Student_Password	Login password of Student	Character	20

A001,Miss.,GAYATHRI NARAYANAN,Gurgaon,Java,Bachelor of Technology,Gayathri.Narayanan@hp.com,tne1@123

A002,Mrs.,RADHIKA MOHAN,Kerala,Java,Bachelor of Engineering In Information Technology,Radhika.Mohan@cognizant.com,tne2@123

A003,Mr.,KISHORE SRINIVAS,Chennai,Java,Bachelor of Engineering In Computers,Kishore.Srinivas@ibm.com,tne3@123

A004,Mr.,ANAND RANGANATHAN,Mumbai,DotNet,Master of Computer Applications,Anand.Ranganathan@finolex.com,tne4@123

A005,Miss.,LEELA MENON,Kerala,Mainframe,Bachelor of Engineering In Information Technology,Leela.Menon@microsoft.com,tne5@123

A006,Mrs.,ARTI KRISHNAN,Pune,Testing,Master of Computer Applications,Arti.Krishnan@cognizant.com,tne6@123

A007,Mr.,PRABHAKAR SHUNMUGHAM,Mumbai,Java,Bachelor of Technology,Prabhakar.Shunmugham@honda.com,tne7@123


Questions

Field	Description	Type	Size

Question_Id	Unique ID to every question	Character	20

Module_Id	Module id from module	Character	20

Question_Text	Actual feedback question	Character	900

Q001,EM001,Instructor knowledgeable and able to handle all your queries

Q002,EM001,All the topics in a particular course handled by the trainer without any gaps or slippages

Q003,EM002,The course materials presentation, handson, etc. refered during the training are relevant and useful.

Q004,EM002,The Hands on session adequate enough to grasp the understanding of the topic.

Q005,EM002,The reference materials suggested for each module are adequate.

Q006,EM003,Knowledge and skills presented in this training are applicatible at your work

Q007,EM003,This training increases my proficiency level

Q008,EM004,The physical environment e.g. classroom space, air-conditioning was conducive to learning.

Q009,EM004,The software/hardware environment provided was sufficient for the purpose of the training.

Q010,EM005,This training will improve your job performance.

Q011,EM005,This training align with the business priorities and goals.

Q012,TM001,Participants were receptive and had attitude towards learning.

Q013,TM001,All participats gained the knowledge and the practical skills after this training.

Q014,TM002,The course materials presentation, handson, etc. available for the session covers the entire objectives of the course.

Q015,TM002,Complexity of the course is adequate for the particpate level.

Q016,TM002,Case study and practical demos helpful in understanding of the topic

Q017,TM003,The physical environment e.g. classroom space, air-conditioning was conducive to learning.

Q018,TM003,The software/hardware environment provided was adequate for the purpose of the training.


Student_Status

Field	Description	Type	Size

Student_Id	Student Id from Student_Info	Character	20

Module_Id	Module Id from module	Character	20

Start_Date	Date when Student batch started	Character	20

End_Date	Date when Student batch ended	Character	20

AFeedbackGiven	Flag to test whether Student has given feedback or not	Character	20

TFeedbackGiven	Flag to test whether Faculty has given feedback or not	Character	20

A001,O10SQL,B001,F001,2000-12-15,2000-12-25

A002,O10SQL,B001,F001,2000-12-15,2000-12-25

A003,O10SQL,B001,F001,2000-12-15,2000-12-25

A001,O10PLSQL,B002,F002,2001-2-1,2001-2-12

A002,O10PLSQL,B002,F002,2001-2-1,2001-2-12

A003,O10PLSQL,B002,F002,2001-2-1,2001-2-12

A001,J2SE,B003,F003,2002-8-20,2002-10-25

A002,J2SE,B003,F003,2002-8-20,2002-10-25

A001,J2EE,B004,F004,2005-12-1,2005-12-25

A002,J2EE,B004,F004,2005-12-1,2005-12-25

A003,J2EE,B004,F004,2005-12-1,2005-12-25

A004,J2EE,B004,F004,2005-12-1,2005-12-25

A005,JAVAFX,B005,F006,2005-12-4,2005-12-20

A006,JAVAFX,B005,F006,2005-12-4,2005-12-20

A006,SQL2008,B006,F007,2007-6-21,2007-6-28

A007,SQL2008,B006,F007,2007-6-21,2007-6-28

A002,MSBI08,B007,F006,2009-6-26,2009-6-29

A003,MSBI08,B007,F006,2009-6-26,2009-6-29

A004,MSBI08,B007,F006,2009-6-26,2009-6-29

A002,ANDRD4,B008,F005,2010-6-5,2010-6-28

A005,ANDRD4,B008,F005,2010-6-5,2010-6-28

A003,ANDRD4,B009,F005,2011-8-1,2011-8-20

A006,ANDRD4,B009,F005,2011-8-1,2011-8-20


Deliverables Expected:

All records inserted in tables ***


Exercise 4:-

After completing the hands-on exercises, you will be able to:

Understand how to delete data from table.


Problem Statement:

Remove following record form Student_Status table

A003,J2EE,B004,F004,2005-12-1,2005-12-25


Deliverables Expected:

Removed record from associate status.
***

Exercise 5:-

After completing the hands-on exercises, you will be able to:

Understand how to perform TOP N records.


Problem Statement:

Fetch first five faculty who have maximum years of experience & display there details.


Deliverables Expected:

Top five experience faculty. ***

Exercise 6:-

After completing the hands-on exercises, you will be able to:

Understanding how to drop table.

Problem Statement:

Remove table Login_Details from database.

Deliverables Expected:

No table found message while querying Login_Details table. ***



                                        ****Exercise-2******

Exercise 1:-

After completing this MR exercises you will be able to implement Operators inside SQL queries.

Problem Statement:

Exercise 1.1:

Write a query to fetches and displays all the faculties details who don’t have an email id.

Exercise 1.2:

Write a query to display the id, name, track and location of all Faculties who’s Experience are greater than 4 years.

Exercise 1.3:

Select all the modules whose duration > 150.

Exercise 1.4:

Select all the Faculty Id, Faculty name whose qualification is not ‘Bachelor of Technology’.

Exercise 1.5:

Select all the modules whose duration is between 100 and 200.

Exercise 1.6:

Display the Faculty Id, Faculty name with first name starting with ‘A’

Exercise 1.7:

Display the Faculty Id, Faculty name whose first name contains a character ‘M’

Exercise 1.8:

Display the names of all the modules where the module name does not exists.
***

Exercise 2:-

After completing this MR exercises you will be able to implement Functions inside SQL queries.

Problem Statement:

Exercise 2.1:

Write a query to display the module name and module duration of the entire modules.

Exercise 2.2:

Write a query to display list of all the module id and module names with first letter capital of module name from ModuleDetails table.

Exercise 2.3:

Write a query to display the module id and the number of days between the current date and module start date from Student_Status table.

Exercise 2.4:

Write a query to concatenate the Module Name and Module id in the below mentioned format and display all the modules from the moduleDetails table. “Module Id is Module_Id and Module Name is Module Name”

Exercise 2.5:

Write a query to display all the Module Name in upper case.

Exercise 2.6:

Write a query to display all the characters between 2 to 4 of the Module name column for all the modules in the ModuleDetails table.

Exercise 2.7:

Write a query which will return the total count of all the students.

Exercise 2.8:

Write a query to display the total faculty members not having their email ID.

                                                   ** Exercise-3**
Exercise 1:-

After completing this MR exercises you will be able to implement Order By and Group By inside SQL queries.

Problem Statement:

Exercise 1.1:

Write a query to fetch and display the number of students enrolled for modules on a specific date grouped by start date and display start date and total number of students.

Exercise 1.2:

Write a query to fetch and display the number of students enrolled for modules where faculty id is ‘F001’ grouped by start date and display start date and total number of students.

Exercise 1.3:

Write a query to fetch and display the number of students enrolled for modules where faculty id is ‘F001’ grouped by module start date and display module start date and total number of students where the total number of students > 2.

Exercise 1.4:

Write a query to fetch and display all the modules in ascending order of module duration.

Exercise 1.5:

Write a query to fetch and display the student’s name, their module enrolled (module name and module id). Order them according to their name.
***

Exercise 2:-

After completing this MR exercises you will be able to implement various types of functions inside SQL queries.

Problem Statement:

Exercise 2.1:

Write a query to fetch and display faculty_id and batch_id which will fetch all the combinations of faculty IDs and batch IDs.


Exercise 2.2:

Write a query to fetch and display the records of all the details from Student_Status and batch_info, wherever batch_id is common in both the tables.

Exercise 2.3:

Write a query to fetch and display the student IDs of the students tagged to faculty and all the faculty IDs irrespective of whether there are any students tagged to them or not.

Exercise 2.4:

Write a query to fetch and display the student IDs of the students tagged to faculties and all the faculty IDs irrespective of whether there are any students tagged to them or not.

Exercise 2.5:

Write a query to fetch and display the student IDs of all the students and faculty IDs of all faculties irrespective of whetherthese is any association between students and faculty Ids and vice versa.




