package worker;

public class Manager extends Worker {
    public Manager(String name, String midName, String surName, String phone, String position, int salary, int birth, int bMonth, int bDay, Genders gender) {
        super(name, midName, surName, phone, position, salary, birth, bMonth, bDay, gender);
    }

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