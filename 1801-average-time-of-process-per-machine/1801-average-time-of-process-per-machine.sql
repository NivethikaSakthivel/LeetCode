select s.machine_id, round(avg(e.timestamp-s.timestamp),3) as processing_time
from Activity s, Activity e
where s.machine_id=e.machine_id
and s.process_id = e.process_id
and s.activity_type = "start" and e.activity_type = "end"
group by s.machine_id;

-- SELECT 
--     s.machine_id,
--     ROUND(AVG(e.timestamp - s.timestamp), 3) AS processing_time
-- FROM 
--     Activity s, Activity e
-- WHERE 
--     s.machine_id = e.machine_id 
--     AND s.process_id = e.process_id 
--     AND s.activity_type = 'start' 
--     AND e.activity_type = 'end'
-- GROUP BY 
--     s.machine_id;
