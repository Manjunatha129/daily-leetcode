# Write your MySQL query statement below
select customer_id from Customer 
GROUP BY customer_id
HAVING COUNT(DISTINCT PRODUCT_KEY) = (SELECT COUNT(*) FROM Product);