2.1
use NIIT;
select Faculty_Id,Batch_Id from FacultyDetails,BatchDetails;

2.2

use NIIT;
select*from Student_Status,BatchDetails where Student_Status.AFeedbackGiven=BatchDetails.Batch_Id;

2.3

use NIIT;
select distinct Faculty_Id,Student_Id from FacultyDetails left join  Student_Status on  Faculty_Id=TFeedbackGiven;

2.5

use NIIT;
select Student_Id from StudentDetails UNION select Faculty_Id from FacultyDetails;
