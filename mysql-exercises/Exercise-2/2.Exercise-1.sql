use NIIT;
select*from FacultyDetails where Faculty_Email=Null;


1.2
use NIIT;
select Faculty_Id,Faculty_Name,Faculty_Track,Faculty_Location from FacultyDetails where Faculty_Experience>4;

1.3
use NIIT;
select*from ModuleDetails where Module_Duration>150;

1.4
use NIIT;
select Faculty_Id,Faculty_Name,Faculty_Qualification from FacultyDetails where Not Faculty_Qualification="Bachelor of Technology";

1.5
use NIIT;
select*from ModuleDetails where Module_Duration between 100 and 200 ;

1.6
use NIIT;
select Faculty_Id,Faculty_Name from FacultyDetails where Faculty_Name Like "A%";

1.7
use NIIT;
select Faculty_Id,Faculty_Name from FacultyDetails where Faculty_Name Like "%M%";

1.8
use NIIT;
select*from ModuleDetails where Module_Name=Null;
