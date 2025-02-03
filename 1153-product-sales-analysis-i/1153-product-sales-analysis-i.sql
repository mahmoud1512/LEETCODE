# Write your MySQL query statement below
select Product.product_name,sales.year,sales.price
from sales join Product
on sales.product_id=Product.product_id;