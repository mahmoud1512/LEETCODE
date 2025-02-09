# Write your MySQL query statement below
select x.id from 
Weather x join Weather y
on Datediff(x.recordDate,y.recordDate)=1
where x.temperature > y.temperature;