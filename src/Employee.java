public class Employee {

    private static int counter =0;

    private Integer id;

    private String name;

    private String patronymic;

    private String surname;

    private int department;

    private int salary;

    public static int getCounter() {
        return counter;
    }

    //public static void setCounter(int counter) {
    // kr01.Easy.Employee.counter = counter;
    // }

    public Integer getId() {
        return id;
    }

    // public void setId(Integer id) {
    //     this.id = id;
    //}

    public String getName() {
        return name;
    }

    //public void setName(String name) {
    //   this.name = name;
    //}

    public String getPatronymic() {
        return patronymic;
    }

    //public void setPatronymic(String patronymic) {
    //    this.patronymic = patronymic;
    //}

    public String getSurname() {
        return surname;
    }

    //public void setSurname(String surname) {
    //   this.surname = surname;
    //}

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "kr01.Easy.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, String patronymic, String surname, int department, int salary){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;


    }

}








