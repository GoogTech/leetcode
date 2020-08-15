# Write your MySQL query statement below

# 使用 UPDATE 和 CASE...WHEN 语句
UPDATE salary SET sex = 
    CASE sex
        WHEN 'm' THEN 'f'
        ELSE 'm'
    END;
