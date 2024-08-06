package worker;

public class Manager extends Worker {
    public Manager(String name, String midName, String surName, String phone, String position, int salary, int birth, int bMonth, int bDay) {
        super(name, midName, surName, phone, position, salary, birth, bMonth, bDay);
    }

    //2. Опишите класс руководителя, наследник от сотрудника.
    // Перенесите статический метод повышения зарплаты в класс руководителя
    // модифицируйте метод таким образом, чтобы он мог поднять заработную
    // плату всем, кроме руководителей. В основной программе создайте
    // руководителя и поместите его в общий массив сотрудников. Повысьте
    // зарплату всем сотрудникам и проследите, чтобы зарплата руководителя
    // не повысилась.
    public static void increaser(Worker[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                if (!(emp[i] instanceof Manager)) {
                    emp[i].increaseSalary(increment);
                }
            }
        }
    }
}