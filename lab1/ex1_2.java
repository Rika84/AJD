//zadanie 1+2

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

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class ex1_2 {
    // dla zadania 1
    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }

        return sum / objects.length;
    }

    // dla zadania 2
    public static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }

        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Tetiana Simonova", 3800),
                new Employee("Olena Golis", 4200),
                new Employee("Alicja Krol", 5600)
        };

        // dodawanie do zadania 1
        double averageSalary = ex1_2.average(employees);
        System.out.printf("Average Salary: %.3f%n", averageSalary);

        // do zadania 2
        Measurable employeeWithLargestSalary = ex1_2.largest(employees);
        System.out.println("Employee with the Largest Salary: " + ((Employee) employeeWithLargestSalary).getName());
    }
}