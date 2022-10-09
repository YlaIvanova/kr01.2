public class Medium {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static Employee findMinSalaryEmployeeOfDepartment(int departmentNumber) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departmentNumber) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalaryEmployeeOfDepartment(int departmentNumber) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departmentNumber) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int calculateTotalSalaryOfDepartment(int departmentNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static float calculateAverageSalaryOfDepartment(int departmentNumber) {
        int nembersCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                sum += employee.getSalary();
                nembersCount++;
            }
            return sum / (float) nembersCount;
        }

        public static void increaseSalaryOfDepartment ( int departmentNumber, int percent){
            for (Employee employee : employees) {
                if (employee.getDepartment() == departmentNumber) {
                    int currentSalary = employee.getSalary();
                    employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
                }
            }
        }
        public static void printDepartment ( int departmentNumber){
            for (Employee employee : employees) {
                if (employee.getDepartment() == departmentNumber) {
                    System.out.println(employee);
                }
            }
        }

        public static void printEmployeeWithLessSalaryDepartment ( int salary){
            for (Employee employee : employees) {
                if (employee.getSalary() < salary) {
                    System.out.println(employee);
                }
            }
        }

        public static void printEmployeeWithMoreSalaryDepartment ( int salary){
            for (Employee employee : employees) {
                if (employee.getSalary() >= salary) {
                    System.out.println(employee);
                }


            }
        }
    }
}