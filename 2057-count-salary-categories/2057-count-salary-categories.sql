with salarycat as (
    select 'Low Salary' as category
    union all
    select 'Average Salary'
    union all
    select 'High Salary'
),
accountgrp as (
select case when income<20000 then "Low Salary"
    when income between 19999 and 50000 then "Average Salary"
    else "High Salary"
    end as category, count(*) as accounts_count
from Accounts
group by category
)
select sc.category, coalesce(ag.accounts_count, 0) as accounts_count
from salarycat sc
left join accountgrp ag on sc.category=ag.category;
