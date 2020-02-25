SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status = true;
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
--отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MAX(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
--отобразите средний вес роботов
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = true;
DELETE FROM Jaegers WHERE status = false;
