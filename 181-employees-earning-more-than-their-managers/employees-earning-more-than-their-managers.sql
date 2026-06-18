# Write your MySQL query statement below
SELECT employ.name AS Employee FROM Employee AS employ
         JOIN Employee AS manager ON employ.managerId = manager.id
          WHERE employ.salary > manager.salary;