/* Write your T-SQL query statement below */
SELECT id, movie, description, rating
FROM cinema
WHERE id % 2 = 1 AND description NOT LIKE '%boring%'
ORDER by 4 DESC
