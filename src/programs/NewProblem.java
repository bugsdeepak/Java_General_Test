package programs;

/*
* Problem Statement
Write a program that processes a list of Order objects to identify and summarize the highest revenue-generating customers. The program should include the following:

Data Structure:
An Order class with the fields:

orderId (String)
customerId (String)
orderValue (double)
orderDate (LocalDate)
Objective:
Generate a report of the top 3 customers based on total order value.
Filter out orders older than 2 years from today.
Use streams for processing and sorting.
Requirements:

Use Stream API for filtering, grouping, and sorting.
Use lambda expressions and method references.
Use Collectors for grouping and summarizing.
Ensure the code is clean and follows Java 8 standards.

Sample Input
List<Order> orders = Arrays.asList(
    new Order("O1", "C1", 1500.0, LocalDate.of(2023, 6, 15)),
    new Order("O2", "C2", 2000.0, LocalDate.of(2022, 4, 10)),
    new Order("O3", "C1", 1200.0, LocalDate.of(2021, 5, 20)),
    new Order("O4", "C3", 800.0, LocalDate.of(2020, 12, 25)),
    new Order("O5", "C2", 1800.0, LocalDate.of(2023, 8, 1)),
    new Order("O6", "C4", 2500.0, LocalDate.of(2023, 1, 12))
);

Expected Output
Top Customers:
1. Customer: C2, Total Order Value: 3800.0
2. Customer: C1, Total Order Value: 1500.0
3. Customer: C4, Total Order Value: 2500.0
 */

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewProblem {

    public static void main(String args[]) {

        LocalDate twoYearsBack = LocalDate.now().minusYears(2);

        List<Order> orders = Arrays.asList(
                new Order("O1", "C1", 1500.0, LocalDate.of(2023, 6, 15)),
                new Order("O2", "C2", 2000.0, LocalDate.of(2022, 4, 10)),
                new Order("O3", "C1", 1200.0, LocalDate.of(2021, 5, 20)),
                new Order("O4", "C3", 800.0, LocalDate.of(2020, 12, 25)),
                new Order("O5", "C2", 1800.0, LocalDate.of(2023, 8, 1)),
                new Order("O6", "C4", 2500.0, LocalDate.of(2023, 1, 12))
        );

        List<Order> newOrders = orders.stream().filter(a -> a.getOrderDate().isBefore(twoYearsBack) ).sorted().collect(Collectors.toList());
        newOrders.forEach( a -> System.out.println(a));


    } // end of main
    private void f(Order o) {

    }

}


class Order {

    private String orderId;
    private String customerId;
    private Double orderValue;
    private LocalDate orderDate;

    public Order(String orderId, String customerId, Double orderValue, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderValue = orderValue;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public String getCustomerId() {
        return customerId;
    }
    public String toString() {
        return orderId + " : " + customerId + " : " + orderDate;
    }

}
