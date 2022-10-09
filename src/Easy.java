public class Easy {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee employee1 = new Employee("Юлия", "Владимировна", "Иванова", 1, 150000);
        Employee employee2 = new Employee("Татьяна", "Мечиславовна", "Клепча", 1, 100000);
        Employee employee3 = new Employee("Ирина", "Владимировна", "Жарновская", 2, 100000);
        Employee employee4 = new Employee("Ирина", "Серафимовна", "Погребная", 1, 80000);
        Employee employee5 = new Employee("Сергей", "Владимирович", "Лебедь", 3, 150000);
        Employee employee6 = new Employee("Светлана", "Владимировна", "Ермалюк", 4, 50000);
        Employee employee7 = new Employee("Татьяна", "Анатольевна", "Душина", 4, 100000);
        Employee employee8 = new Employee("Виталий", "Владимирович", "Коняев", 5, 50000);
        Employee employee9 = new Employee("Александр", "Владимирович", "Лавров", 1, 40000);
        Employee employee10 = new Employee("Елена", "Владимировна", "Колмакова", 2, 40000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;
        Employee[] employee = Arrays.copyOf(employees, 11);

        Arrays.stream(employees).forEach(System.out::println);
        System.out.println(employees.length);

    }


    public static void printEmployees() {
        for (Employee employees : employees) {
            System.out.println(employees);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;

    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;

    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname());


        }
    }
}


