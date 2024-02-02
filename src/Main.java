public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
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
        int passengers = 90;
        int busySeatPlace = 30;  // 30 занятых сидячих
        int busyStandPlace = passengers - busySeatPlace; //60 занятых стоячих
        int freeSeatPlace = seatPlace - busySeatPlace;  // 30 free
        System.out.println(freeSeatPlace);
        int freeStandPlace = standPlace - busyStandPlace; //0 free
        System.out.println(freeStandPlace);
        if (passengers == passengersPlace) {
            System.out.println("Вагон польностью забит");
            if (passengersPlace > passengers) {
                System.out.println("В вагоне есть свободные места");
            }
        } else if (freeStandPlace > 0) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else if (freeSeatPlace > 0 ) {
            System.out.println("В вагоне есть свободные сидячие места");
        }


        // Задача 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }

    }
    }
