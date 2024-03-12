public class Main {
    private static final int EMPLOYEE_NUMBER = 10;


    public static void main(String[] args) {


        final Employee[] employees = new Employee[EMPLOYEE_NUMBER];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        employees[1] = new Employee("Петров Христофор Петрович", 1, 110_000);
        employees[2] = new Employee("Чубатый Сидор Сидорович", 2, 120_000);
        employees[3] = new Employee("Иванова Мария Ивановна", 2, 150_000);
        employees[4] = new Employee("Сидорова Феодора Павловна", 3, 155_000);
        employees[5] = new Employee("Железкин Федор Федорович", 3, 200_000);
        employees[6] = new Employee("Пушкин Александр Сергеевич", 4, 250_000);
        employees[7] = new Employee("Путин Иван Владимирович", 4, 350_000);
        employees[8] = new Employee("Мишустин Петр Петрович", 5, 270_000);
        employees[9] = new Employee("Греф Христофор Петрович", 5, 770_000);

        for (int i = 0; i < employees.length; i++) {


            System.out.println(employees[i]);
        }


        printEmployees(employees);
        System.out.println(" Суммарная зарплата = " + getSalarySum(employees));
        System.out.println(" Сотрудник с минимальной зарплатой = " + getMinSalary(employees));
        System.out.println(" Сотрудник с максимальной зарплатой =" + getMaxSalary(employees));
        System.out.println(" Средняя зарплата = "+ getAverageSalary(employees));
        printFullNameEmployees(employees);
    }


    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    private static int getSalarySum(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();

        }
        return salarySum;
    }

    private static Employee getMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;


            }
        }
        return employeeWithMinSalary;

    }

    private static Employee getMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;


            }
        }
        return employeeWithMaxSalary;


    }
    private static double getAverageSalary(Employee[] employees){
        int salarySum = getSalarySum(employees);
        return (double) salarySum/employees.length;


    }
    private static void printFullNameEmployees(Employee[]employees){
        for (Employee employee: employees) {
            System.out.println(employee.getFullName());
            
        }
    }
}







