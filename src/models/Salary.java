package models;

public record Salary(
        double from,
        double to,
        boolean gross,
        Currency currency
) {}
