public class DZ5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Domi Webster", "Capter", "Domi@mail.com", "89199660881",20000,28);
        empCorp[1] = new Employee("Collin Webser", "Crime", "Collin@mailbox.com", "89199660882",30000,48);
        empCorp[2] = new Employee("Artem Motter", "Event", "Motter@mailbox.com", "89199660883",2500,43);
        empCorp[3] = new Employee("Ariana Flowers", "RP", "Ariana@mailbox.com", "89199660884",5000,18);
        empCorp[4] = new Employee("Miruka Angels", "Admin", "Miruka@mailbox.com", "89199660885",3000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}