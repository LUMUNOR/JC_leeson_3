package org.example;

import worker.Genders;
import worker.Manager;
import worker.Worker;


public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985,2,5, Genders.MALE),
                new Worker("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973,3,10, Genders.MALE),
                new Manager("Evgeniy","Ivanovich", "Lukianov",
                        "8(920)406-09-64",
                        "Big manager",100000,1997,10,24, Genders.MALE),
                new Worker("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963,12,5, Genders.MALE),
                new Worker("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990,1,1, Genders.FEMALE),
                new Worker("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983,7,30, Genders.FEMALE)
        };

        printCompany(workers);
        celebrate(workers);

    }

    //2. Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
    // написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
    // а мужчин с 23 февраля, если сегодня соответствующий день.
    enum Parties{NONE, NEW_YEAR, MARCH_8, FEB_23};// Перечисление дней
    private static final Parties today = Parties.MARCH_8;//Назначение сегоднешнего праздника

    private static void celebrate(Worker[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].getName() + ", с Новым Годом!");
                    break;
                case FEB_23:
                    if (emp[i].getGender() == Genders.MALE)
                        System.out.println(emp[i].getName() + ", с днем Защитника Отечества!");
                    break;
                case MARCH_8:
                    if (emp[i].getGender() == Genders.FEMALE)
                        System.out.println(emp[i].getName() + ", с международным женским днем!");
                    break;
                default:
                    System.out.println(emp[i].getName() + ", с добрым утром!");
            }
        }
    }

    public static void printCompany(Worker[] worker){
        for (Worker workers : worker) {
            System.out.println(workers.toString());
        }
    }

    public static void compareDate(Worker worker, int day, int mont, int year){
        if (worker.compare(day,mont,year) < 0){
            System.out.println(worker.getName()+" родился раньше");
        } else if ((worker.compare(day,mont,year) > 0)) {
            System.out.println(worker.getName()+" родился позже");
        }
        else {
            System.out.println(worker.getName()+" родился именно в этот день");
        }
    }
}