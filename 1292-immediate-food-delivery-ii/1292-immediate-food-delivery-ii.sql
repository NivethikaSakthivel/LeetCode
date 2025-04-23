# Write your MySQL query statement below
select round(sum(case 
    when d.order_date=d.customer_pref_delivery_date then 1
    else 0
    end)*100.0 / count(*)
    ,2)
as immediate_percentage
from Delivery d
join (
    select customer_id, min(order_date) as first_order_date
    from Delivery
    group by customer_id
) f
on d.customer_id=f.customer_id and d.order_date=f.first_order_date;