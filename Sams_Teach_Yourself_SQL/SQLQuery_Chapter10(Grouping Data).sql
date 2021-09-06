/*In this lesson, you�ll learn how to group data so that you can summarize
subsets of table contents. This involves two new SELECT statement clauses: the
GROUP BY clause and the HAVING clause. */
Or products offered by vendors who offer a single product, or only those who
offer more than 10 products? */
--BY clause
FROM OrderItems
GROUP BY order_num
HAVING SUM(quantity) >= 100
ORDER BY order_num;
FROM OrderItems
GROUP BY items
HAVING COUNT(*) >= 3
ORDER BY items, order_num; 