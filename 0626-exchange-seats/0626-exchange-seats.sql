# Write your MySQL query statement below
select s1.id as id,
    case when s1.id%2=1 and s1.id+1<=(select max(id) from Seat) then (select student from Seat where id=s1.id+1)
    when s1.id%2=0 then (select student from Seat where id=s1.id-1)
    else s1.student
    end as student
from Seat s1
order by s1.id;