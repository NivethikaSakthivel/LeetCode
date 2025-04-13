SELECT 
  d.name AS Department,
  e.name AS Employee,
  e.salary AS Salary
FROM (
  SELECT 
    e.*,
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS rank_in_dept
  FROM Employee e
) e
JOIN Department d ON e.departmentId = d.id
WHERE e.rank_in_dept <= 3;