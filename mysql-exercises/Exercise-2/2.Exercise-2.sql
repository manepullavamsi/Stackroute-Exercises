2.1
use NIIT;
select Module_Name,Module_Duration from ModuleDetails;

2.2
use NIIT;
select Module_Name,Module_Id from ModuleDetails where Module_Name Like "A%";

2.3
use NIIT;
select datediff(current_date(),Start_Date) from Student_Status;

2.4
use NIIT;
select concat("Module Id is ",Module_Id," and Module Name is ",Module_Name) from ModuleDetails;

2.5
use NIIT;
select Upper(Module_Name) as Module_Name from ModuleDetails;

2.6
use NIIT;
select substring(Module_Name,2,4) from ModuleDetails;

2.7
use NIIT;
select count(*) from StudentDetails;

2.8
use NIIT;
select Faculty_Email from FacultyDetails where Faculty_Email is Null;
