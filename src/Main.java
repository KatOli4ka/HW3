public class Main {
    public static void main(String[] args) {

        int age = 33;
        if (age>=18){
        System.out.println("Поздравляем с совершеннолетием!");    }
else{
            System.out.println("Вы не достигли совершеннолетия");}
        int age1=13;
        if (age1<18){
            System.out.println("Вы еще не достигли совершеннолетия. Подождите еще немного");}
   else{
            System.out.println("Вы уже совершеннолетний");}
        int kidAge=8;
        if (kidAge>=7)  {
            System.out.println("Ребенок уже ходит в школу");

        }else {
            System.out.println("Ребенок еще не может ходить в школу");}
       int man=19;
        if (man>=18)        {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }else {
            System.out.println("Человек еще не закончил школу и не может отправляться в университет");}
        int manAge=26;
        if (manAge>=24)       {
            System.out.println("Мужчина окончил университет и ему пора искать первую работу");
        }else {
            System.out.println("Мужчина еще не окончил университет и не может искать первую работу");}
        int totalCapacity=102;
        int seat=60;
        int standing=totalCapacity-seat;
        if (totalCapacity>=102){
                    System.out.println("Вагон полностью забит");        }

else{
    System.out.println("В вагоне есть свободные места");}
if(seat>=60){
    System.out.println("В вагоне нет свободных сидячих мест");}
else{
    System.out.println("В вагоне есть свободные сидячие места");}
}}