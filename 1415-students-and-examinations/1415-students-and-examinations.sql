# Write your MySQL query statement below
select stu.student_id as student_id, stu.student_name as student_name, sub.subject_name as subject_name, count(e.subject_name) as attended_exams
from Students stu
CROSS JOIN Subjects sub
LEFT JOIN Examinations e 
    ON stu.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY stu.student_id, stu.student_name, sub.subject_name
ORDER BY stu.student_id, sub.subject_name;