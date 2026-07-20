# Write your MySQL query statement below

# Note that equal author_id and viewer_id indicate the same person.

select distinct author_id as id     #
from Views
where author_id = viewer_id
order by id asc
