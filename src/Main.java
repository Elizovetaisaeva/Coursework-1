import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 10_000 + 10_000 * random.nextDouble();
            employees[i] = new Employee("name_" + i, salary, random.nextInt(1, 9));
        }
        list(employees);
        System.out.println();
        System.out.println(getEmployeeWithMinSalary(employees));
        System.out.println(getEmployeeWithMaxSalary(employees));
        System.out.println(getAvarageSalary(employees));
        System.out.println();
        listName(employees);
    }

    public static void list(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static double getSum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;

    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || minEmployee.getSalary() < employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static double getAvarageSalary(Employee[] employees) {
        return getSum(employees) / employees.length;
    }

    public static void listName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFulName());
        }
    }
}


