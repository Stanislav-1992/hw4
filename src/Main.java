public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 18;
        int ageOne = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то нужно немного подождать");
        }
        if (ageOne <= 18) {
            System.out.println("Если возраст человека равен " + ageOne + ", то нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + ageOne + ", то он совершеннолетний");
        }

        //Задача 2
        System.out.println("Задача 2");
        int temperaturePlus = 7;
        int temperatureMinus = -1;

        if (temperaturePlus < 5) {
            System.out.println("На улице " + temperaturePlus + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperaturePlus + " градусов, можно идти без шапки");
        }

        if (temperatureMinus > 5) {
            System.out.println("На улице " + temperatureMinus + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureMinus + " градус, нужно надеть шапку");
        }

        // Задача 3
        System.out.println("Задача 3");
        int speedOne = 75;
        int speedTwo = 30;

        if (speedOne >= 60) {
            System.out.println("Если скорость " + speedOne + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedOne + ", то можно ездить спокойно");
        }

        if (speedTwo < 60) {
            System.out.println("Если скорость " + speedTwo + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speedTwo + ", то придется заплатить штраф");
        }

        // Задача 4
        System.out.println("Задача 4");
        int humanAge = 20;
        if (humanAge >= 2 && humanAge <=6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <=17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то его место в университете");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходить на работу");
        }

        // Задача 5
        System.out.println("Задача 5");
        int child = 16;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + " то ему нельзя кататься на аттракционе");
        } else if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + " то можно кататься на аттракционе в сопровождении взрослого");
        } else if (child >= 14) {
            System.out.println("Если возраст ребенка равен " + child + " то можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        System.out.println("Задача 6");
        int passengersPlace = 120;
        int seatPlace = 60;
        int standPlace = passengersPlace - seatPlace;
        int passengers = 20;
        if (passengers == passengersPlace) {
            System.out.println("Вагон польностью забит");
        } if (passengersPlace > passengers) {
            System.out.println("В вагоне есть свободные места");
        } if (passengers < standPlace) {
            System.out.println("В вагоне есть свободные стоячие места");
        } if (passengers < seatPlace) {
            System.out.println("В вагоне есть свободные сидячие места");
        }

        // Задача 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }

    }
    }
