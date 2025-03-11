SELECT emp.name
FROM Employee emp
JOIN Employee mng
ON emp.id = mng.managerId
GROUP BY mng.managerId
HAVING COUNT(mng.managerId) >= 5