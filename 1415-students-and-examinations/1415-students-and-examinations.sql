# Write your MySQL query statement below
select s.student_id,s.student_name,ss.subject_name,count(e.subject_name) as attended_exams
from Students s cross join Subjects ss left join Examinations e
on s.student_id=e.student_id and ss.subject_name = e.subject_name
group by s.student_id, s.student_name , ss.subject_name
order by s.student_id, ss.subject_name;