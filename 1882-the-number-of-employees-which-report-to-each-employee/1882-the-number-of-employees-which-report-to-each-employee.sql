SELECT 
    employee.reports_to AS employee_id, 
    manager.name AS name, 
    COUNT(DISTINCT employee.employee_id) AS reports_count, 
    ROUND(AVG(employee.age)) AS average_age
FROM Employees employee
JOIN Employees manager 
    ON employee.reports_to = manager.employee_id
GROUP BY employee.reports_to, manager.name;
