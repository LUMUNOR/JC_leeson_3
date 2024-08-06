package org.example;

import worker.Manager;
import worker.Worker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985,2,5),
                new Worker("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973,3,10),
                new Manager("Evgeniy","Ivanovich", "Lukianov",
                        "8(920)406-09-64",
                        "Big manager",100000,1997,10,24),
                new Worker("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963,12,5),
                new Worker("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990,1,1),
                new Worker("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983,7,30)
        };

        printCompany(workers);
        for (int i = 0; i < workers.length; i++) {
            Manager.increaser(workers, 10, 5000);
        }
        System.out.println();
        printCompany(workers);

        System.out.println();
        compareDate(workers[2],8,8,2024);
        compareDate(workers[2],24,10,1997);
        compareDate(workers[2],8,8,1996);

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