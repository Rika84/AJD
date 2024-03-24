//zadanie 1

interface Measurable {
    double getMeasure();
}

class Employee implements Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Tetiana Simonova", 3800),
                new Employee("Olena Golis", 4200),
                new Employee("Alicja Krol", 5600)
        };

        double averageSalary = ex1.average(employees);
        System.out.printf("Average Salary: %.3f%n", averageSalary);
    }

    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
}
