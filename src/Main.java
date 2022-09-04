public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 15;

        if (age>=2 && age<=6) {
            System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в детский сад");
        } else {
            if (age>=7 && age<18) {
                System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в школу");
            } else {
                if (age>=18 && age<24) {
                System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в университет");
            }else {
                if (age>24) {
                    System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить на работу");
                }
            }
            }
        }
        System.out.println();
        System.out.println("Задание 2");

        if (age<5) {
            System.out.println("Если ребенку "+ age+ " года, то он не может кататься на аттракционе");
        } else {
            if (age>=5 && age<14) {
                System.out.println("Если ребенку "+ age+ " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                    System.out.println("Если возраст человека равен "+ age + " , то он может кататься без сопровождения взрослого");
                }
            }

        }

    }
