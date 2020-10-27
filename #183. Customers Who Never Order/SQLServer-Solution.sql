/* Write your T-SQL query statement below */
SELECT Name as Customers
FROM Customers c LEFT JOIN Orders o
ON c.Id = o.CustomerId
WHERE o.Id IS NULL
