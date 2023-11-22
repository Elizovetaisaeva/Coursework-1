import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 10_000 + 1_000 * random.nextInt(0, 100);
            employees[i] = new Employee("name_" + i, salary, random.nextInt(1, 9));
        }
        list(employees);
        System.out.println();
        System.out.println(getEmployeeWithMinSalary(employees));
        System.out.println(getEmployeeWithMaxSalary(employees));
        System.out.println(getAvarageSalary(employees));
        System.out.println();
        listName(employees);
        increaseSalary(employees, 30);
        System.out.println();
        list(employees);


    }

    public static void list(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static void list(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }


    public static double getSum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }


    public static double getSum(Employee[] employees, int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
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

    public static Employee getEmployeeWithMinSalary(Employee[] employees, int department) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
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

    public static Employee getEmployeeWithMaxSalary(Employee[] employees, int department) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minEmployee != null && !(minEmployee.getSalary() < employee.getSalary())) return minEmployee;
            minEmployee = employee;
        }
        return minEmployee;
    }


    public static double getAvarageSalary(Employee[] employees) {
        return getSum(employees) / employees.length;
    }

    public static double getAvarageSalary(Employee[] employees, int department) {
        double sum = 0;
        int employeesNum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            employeesNum++;
            sum += employee.getSalary();
        }
        return sum / employeesNum;
        }



            public static void listName(Employee[]employees){
                for (Employee employee : employees) {
                    System.out.println(employee.getFulName());
                }
            }
            public static void increaseSalary(Employee[]employees,int percent) {
                for (Employee employee : employees) {
                    employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
                }
            }
                public static void increaseSalary(Employee[]employees,int percent, int department) {
                    for (Employee employee : employees) {
                        if (employee.getDepartment() != department) {
                            continue;
                        }
                        employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
                    }

            }
                    public static void listWithSalaryLess(Employee[] employees, double bound) {
                        for (Employee employee : employees) {
                            if (employee.getSalary() <= bound) {
                                System.out.println(employees);
                            }
                        }
                    }
                        public static void listWithSalaryMore(Employee[] employees, double bound) {
                            for (Employee employee : employees) {
                                if (employee.getSalary() > bound) {
                                    System.out.println(employees);
                                }
                            }
                    }


        }


