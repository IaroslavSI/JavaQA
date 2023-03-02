package Lesson5;

class Employee {
    String fullname, position, email, phone;
    int salary, age;

    Employee(String fullname,
             String position,
             String email,
             String phone,
             int salary,
             int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("Ф.И.О.: " + fullname + " | Должность: " + position
                + " | email: " + email + " | Телефон: " + phone + " | Зарплата: " + salary + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Сидоров Кирилл Петрович", "Директор", "sidorovkirill@smail.ru",
                "+79001115555", 150000, 50);
        employees[1] = new Employee("Иванова Светлана Александровна", "Зам. директора", "ivanovasvetlana@smail.ru", "+79002225555",
                50000, 40);
        employees[2] = new Employee("Петров Игорь Сергеевич", "Менеджер", "petrovigor@smail.ru",
                "+79003335555", 45000, 30);
        employees[3] = new Employee("Смирнов Сергей Иванович", "Менеджер", "smirnovsergey@smail.ru",
                "+79004445555", 75000, 41);
        employees[4] = new Employee("Савельева Ирина Петровна", "Менеджер", "savelievairina@smail.ru",
                "+79005555555", 40000, 26);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
