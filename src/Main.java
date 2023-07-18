public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task50();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        short age = 20;
        if (age >= 18) {
            System.out.println("если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        short temperature = 2;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        short speed = 230;
        if (speed <= 60) {
            System.out.println("Если скорость равна " + speed + " то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость равна " + speed + " то придется заплатить штраф.");
        }
    }
    private static void task4() {
        System.out.println("Задача 4");
        int age = 68;
        if (age < 2) {
            System.out.println("Если возраст человека " + age + " то ему пора спать");
        }
        else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age < 18) {
            System.out.println(" Если возраст человека " + age + " то ему нужно ходить в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека " + age + " то его место в университете");
        }
        else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека " + age + " то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека " + age + " то можно и отдохнуть");
        }
    }
 private static void task5() {
     System.out.println("Задача 5");
     int age = 12;
     boolean middleAge = age >= 5 && age <= 14;
     boolean withEscort = true;
     if (age < 5) {
         System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе");
     }
     else if (middleAge && withEscort) {
         System.out.println("Если возраст ребенка равен " + age + " и он в сопровождении взрослого, то он может кататься на аттракционе");
     } else if (middleAge) {
         System.out.println("Если возраст ребенка равен " + age + " но он не в сопровождении взрослого, то он не может кататься на аттракционе");
     }
     else if (age >14) {
         System.out.println(" Если возраст ребенка равен " +age + " он может кататься на аттракционе без сопровождения взрослого");
     }
 }
    private static void task50() {
        System.out.println("Задача 5.1, второй вариант решения, но требует указания наличия сопровождения");
        int age = 12;
        boolean withEscort = false;
        boolean middleAge = age >= 5 && age <= 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то не может кататься на аттракционе");
        } else if (age > 14 || withEscort && middleAge) {
            System.out.println("данный ребенок может кататься на аттракционе");
        } else {
            System.out.println("данный ребенок  не может кататься на аттракционе");
        }
    }
    private static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;
        int passengersWithSeatPlace = 52;
        int passengersWithStandingPlace =34;
        int passengersCommon = passengersWithSeatPlace + passengersWithStandingPlace;
        int ticketsSeatPlace = seatPlace - passengersWithSeatPlace;
        int ticketStandingPlace = standingPlace - passengersWithStandingPlace;
        if (passengersCommon == capacity) {
            System.out.println("В вагоне нет мест");
        }
        else if (passengersWithSeatPlace < seatPlace) {
            System.out.println("В вагоне есть " + ticketsSeatPlace+ " сидячих мест");
        }
        if (passengersWithStandingPlace < standingPlace) {
            System.out.println(" В вагоне есть " + ticketStandingPlace + " стоячих мест");
        }
    }
    private static void task7() {
        System.out.println(" Задача 7");
        int one = 1;
        int two = 5;
        int three = 5;
        boolean equality = one == two || one == three || two==three;
        if (one > two && one > three) {
            System.out.println("наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("наибольшее число " + two);
        } else if (three > one && three > two) {
            System.out.println("наибольшее число " + three);
        }
        else if (equality && one>two || one >three) {
            System.out.println("наибольшее число " + one);
        }
        else if (equality && two > one || two > three) {
            System.out.println("наибольшее число " + two);
        }
        else if (equality && three > one || three > two) {
            System.out.println("наибольшее число " + three);
        }
    }
}