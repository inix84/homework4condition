public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 28;
        if (age >= 18) {
            System.out.println("Поздравляем, это совершеннолетие!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }
        System.out.println();
        System.out.println("Задание 2");
        if (age>=7 && age<18) {
            System.out.println("ребенок ходит в школу!");
        } else {
            if (age >= 18 && age < 24) {
                System.out.println("человек уже закончил школу и может отправляться в университет");
            } else {
                if (age >= 24) {
                    System.out.println("человек окончил университет и ему пора искать первую работу");
                }
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        int capacity= 102;
        int sit=60;
        int people=102;

        if (people<sit) {
            System.out.println("в вагоне есть сидячие и стоячие места");
        } else {
            if (people >= sit && people < capacity) {
                System.out.println("в вагоне есть только стоячие места");
            } else {
                System.out.println("в вагоне нет мест");
            }
        }
    }
}