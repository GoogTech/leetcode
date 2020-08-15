/* Write your T-SQL query statement below */

/* 首先使用 group by 进行数据汇总,其次使用 having 进行过滤: 使用 count(字段) 进行统计汇总数据,大于1的则为重复 */
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1
