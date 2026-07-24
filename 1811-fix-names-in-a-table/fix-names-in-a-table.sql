# Write your MySQL query statement below
select user_id, concat(
    UPPER(LEFT(name,1)),
    LOWER(SUBSTRING(Name,2))
)as name FROM Users ORDER BY user_id;
