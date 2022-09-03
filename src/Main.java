public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age=199;
        boolean age18=age>=18;
        if (age18) {
            System.out.println("Поздравляем, это совершеннолетие!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }
        System.out.println();
        System.out.println("Задание 2");
        boolean age7_18=age>=7 && age<18;
        boolean age18_24=age>=18 && age<24;
        boolean age24=age>=24;

        if (age7_18) {
            System.out.println("ребенок ходит в школу!");
        }
        if (age18_24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
        System.out.println("Задание 3");
        int capacity= 102;
        int sit=60;
        int people=102;

        if (people<sit) {
            System.out.println("в вагоне есть сидячие и стоячие места");
        }
        if (people>=sit && people<capacity) {
            System.out.println("в вагоне есть только стоячие места");
        }
        if (people==capacity) {
            System.out.println("в вагоне нет мест");
        }

    }
}