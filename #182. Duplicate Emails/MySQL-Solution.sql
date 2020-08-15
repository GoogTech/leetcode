# Write your MySQL query statement below

# HAVING 是在 GROUP BY 之后做一个补充筛选,而分组选用的字段是Email,
# 所以 COUNT(*) 函数是针对 Email 里面的内容进行分别计数, 即 COUNT(*) > 1 表示指定 email 的出现次数不止一次
SELECT Email FROM Person GROUP BY Email HAVING COUNT(*) > 1
