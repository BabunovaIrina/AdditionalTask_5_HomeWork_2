public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурка", 4, 5);
        System.out.println("Кошку зовут - " + cat.getName());
        System.out.println("Ее возраст - " + cat.getAge());
        System.out.println("Ее вес - " + cat.getWeight());
    }
}
