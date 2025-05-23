SELECT ROUND(
    COUNT(DISTINCT player_id) / 
    (SELECT COUNT(DISTINCT player_id) FROM Activity),
    2
) AS fraction
FROM Activity
where (player_id, date_sub(event_date, interval 1 day))
in (
    select player_id, min(event_date) as first_login from Activity group by player_id
);