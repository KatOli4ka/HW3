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


int age13=13;
if (age13>=2 && age13<=6){
    System.out.println("Если возраст человека равен "+age13+", то ему нужно ходить в детский сад");}
else{
    System.out.println("Если возраст человека равен "+age13+", то он не может уже ходить в детский сад");}
if (age13>=7 && age13<=18){
    System.out.println("Если возраст человека равен "+age13+", то ему нужно ходить в школу");}
else{
    System.out.println("Если возраст человека равен "+age13+", то он не может ходить в школу");}
if (age13>18 && age13<24){
    System.out.println("Если возраст человека равен "+age13+", то ему нужно ходить в университет");}
else{
        System.out.println("Если возраст человека равен "+age13+", то он не может ходить в университет");}
if (age13>=24){
    System.out.println("Если возраст человека равен "+age13+", то ему нужно ходить на работу");}
else{
    System.out.println("Если возраст человека равен "+age13+", то он не может ходить на работу");}


        int age3=13;
        if (age3<5){
            System.out.println("Если ребенку "+age3+", то он не может кататься на аттракционе");}
        else{
            System.out.println("Если ребенку "+age3+", то он может кататься на аттракционе");}
        if (age3>=5 && age3<14){
            System.out.println("Если ребенку "+age3+", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");}
        else{
            System.out.println("Если ребенку "+age3+", то он не может кататься на аттракционе");}
        if (age3>=14){
            System.out.println("Если ребенку "+age3+", то он может кататься без сопровождения взрослого");}
        else{
            System.out.println("Если ребенку "+age3+", то он не может кататься на аттракционе");}

}}