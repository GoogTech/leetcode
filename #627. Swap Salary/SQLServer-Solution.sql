/* Write your T-SQL query statement below */

/* 使用 UPDATE 和 CASE...WHEN 语句 */
update salary set sex = 
    case sex
        when 'm' then 'f'
        else 'm'
    end;
