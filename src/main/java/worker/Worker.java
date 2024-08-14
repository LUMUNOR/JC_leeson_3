package worker;

//1. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением созданного перечисления.
// Добавить геттеры,сеттеры.

public class Worker {
    private static final int CURRENT_YEAR = 2024;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;
    int bMonth;
    int bDay;
    Genders gender;

    public Worker(String name, String midName, String surName, String phone, String position, int salary, int birth, int bMonth, int bDay, Genders gender) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
        this.bMonth = bMonth;
        this.bDay = bDay;
        this.gender = gender;
    }


    /**
     * Сравнение дат происходит путем представления дады в виде двоичного числа:
     * первые 5 разрядов - день, следующие 4 разряда - месяц и последующие разряды - год.
     * @param dd день
     * @param mm месяц
     * @param yyyy год
     * @return разница дат
     */
    public int compare(int dd, int mm, int yyyy) {
        int start = bDay + (bMonth << 6) + (birth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return start - income;
    }

    protected void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static void increaser(Worker[] emp, int age, int increment) {
        for (Worker worker : emp) {
            if (worker.getAge() > age) {
                worker.increaseSalary(increment);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Сотрудник{" +
                        "имя='%s', отчество='%s', фамилия='%s'" +
                        ", должность='%s', теефон='%s'" +
                        ", зарплата=%d, возраст=%d, пол=%s}'",
                name, midName, surName, position, phone, salary, getAge(),getStringGender());
    }


    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public Genders getGender(){return gender;}

    public String getStringGender(){
        if (this.gender == Genders.MALE) return "Муж.";
        else return "Жен.";
    }

    public void setGender(Genders gender){this.gender = gender;}
}
