public class Main {
    public static void main(String[] args) {
//Создать класс Voter (Избиратель) , содержащий поля имя, адрес, возраст а также конструктор, геттеры и сеттеры.
// При создании должно быть учтено, что минимальный возраст в Германии для участия в выборах - 16 лет.
        Voter vasya = new Voter("Vasya", "Berlin", 16);
        Voter petya = new Voter();
        System.out.println(vasya.name);
        System.out.println(vasya.address);
        System.out.println(vasya.age);
        System.out.println(vasya.getAge());
        System.out.println(vasya.getName());
        System.out.println(vasya.getAddress());
        vasya.setAge(15);
        vasya.setAddress("London");
        System.out.println("New adress Vasya: " + vasya.getAddress());
    }
}