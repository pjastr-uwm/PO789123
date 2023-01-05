import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class EmployeeDemo1
{
    public static void main(String[] args)
    {
        Employee[] personel = new Employee[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Employee("Harry Cracker", 75000, 2001, 12, 15);
        personel[1] = new Employee("Caroline Hacker", 50000, 2003, 10, 1);
        personel[2] = new Employee("Antony Tester", 40000, 2005, 3, 15);

        // zwieksz pobory każdego pracownika o 20%
        for (Employee e : personel) {
            e.raiseSalary(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Employee e : personel) {
            System.out.print("nazwisko = " + e.getName() + "\tid = " + e.getId());
            System.out.print("\tpobory = " + e.getSalary());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.getHireDay());
        }
        System.out.println();

        // Dodane w stosunku do poprzedniej wersji
        int n = Employee.getNextId(); // wywołanie metody statycznej
        System.out.println("Następny dostępny id = " + n);

    }
}

class Employee
{


    public Employee(String name, double salary, LocalDate hireDay)
    {
        this.name = name;
        this.salary = salary;

        this.hireDay = Date.from(hireDay.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Dodane w stosunku do poprzedniej wersji
        id = nextId;
        ++nextId;
    }

    public Employee(String name, double salary, int year, int month, int day)
    {
        this(name,salary,LocalDate.of(year, month-1, day));
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double procent)
    {
        double raise = salary * procent / 100;
        salary += raise;
    }

    // Dodane w stosunku do poprzedniej wersji
    public int getId()
    {
        return id;
    }

    // Dodane w stosunku do poprzedniej wersji
    public void setId()
    {
        id = nextId;
        ++nextId;
    }

    // Dodane w stosunku do poprzedniej wersji
    public static int getNextId()
    {
        return nextId;
    }

    private String name;
    private double salary;
    private Date hireDay;

    // Dodane w stosunku do poprzedniej wersji
    private int id;
    private static int nextId = 1;
}

