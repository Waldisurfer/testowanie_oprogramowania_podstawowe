package dev.karolkoltun.expenses;

import dev.karolkoltun.currency.Currency;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HomeFinancesServiceTest {
    @Test
    void shouldCreateExpense()  {
        //Given
        LocalDate date = LocalDate.of(2020,12,21);
        BigDecimal amount = BigDecimal.valueOf(100);
        Category category = Category.GIFTS;

        //When
        Expense expense = new Expense(date, amount, "Empik", category);

        //Then
        assertEquals(BigDecimal.valueOf(100), expense.getAmount());
    }
    @Test
    void shouldAddExpense() {
        //Given
        HomeFinancesService homeFinancesService = new HomeFinancesService();
        LocalDate date = LocalDate.now();
        BigDecimal amount = BigDecimal.valueOf(250);
        Category category = Category.OTHERS;

        //When
        Expense expense = new Expense(date, amount, "Biedronka", category);
        Expense expense1 = new Expense(date, amount, "Blabla", category);
        expense1.setCurrency(Currency.EUR);

        homeFinancesService.addExpense(expense);
        List<Expense> expenseList = homeFinancesService.getAllExpenses();

        //Then
        assertEquals(1, expenseList.size());
        assertEquals(Currency.EUR, expense1.getCurrency());

        Expense addedExpense = expenseList.get(0);
        assertEquals(expense, addedExpense);

    }
    @BeforeEach
    HomeFinancesService homeFinancesService = new HomeFinancesService();

    @Test
    void addingExpensesHomework() {
        //Given

    }




}