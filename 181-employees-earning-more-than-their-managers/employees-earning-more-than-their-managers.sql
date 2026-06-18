# Write your MySQL query statement below
SELECT employ.name AS Employee
FROM Employee employ
JOIN Employee manager
ON employ.managerId = manager.id
WHERE employ.salary > manager.salary;