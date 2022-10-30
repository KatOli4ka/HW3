public class Main {
    public static void main(String[] args) {

        int age = 33;
        if (age>=18){
        System.out.println("Поздравляем с совершеннолетием!");    }

        int age1=13;
        if (age1<18){
            System.out.println("Вы еще не достигли совершеннолетия. Подождите еще немного");

    }
        int kidAge=8;
        if (kidAge>=7)  {
            System.out.println("Ребенок уже ходит в школу");

        }
        int man=19;
        if (man>=18)        {
            System.out.println("Мужчина закончил школу и может отправляться в университет");
        }
        int manAge=26;
        if (manAge>=24)       {
            System.out.println("Мужчина окончил университет и ему пора искать первую работу");
        }
        int totalCapacity=102;
        int seat=60;
        int standing=totalCapacity-seat;
        if (totalCapacity>=102){
                    System.out.println("Вагон полностью забит");        }



    }
}