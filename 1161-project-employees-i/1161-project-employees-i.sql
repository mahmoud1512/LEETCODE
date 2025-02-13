# Write your MySQL query statement below
select project_id,Round(Avg(experience_years),2) as average_years
from Project join Employee
on Project.employee_id=Employee.employee_id
group by project_id