public class Main {
    public static void main(String[] args) {
        Arithmetic digits = new Arithmetic(5, 5);
        System.out.println("Сумма чисел: " + digits.plus());
        System.out.println("Произведение чисел: " + digits.multiply());
        System.out.println("Максимальное число: " + digits.max());
        System.out.println("Минимальное число: " + digits.min());
    }
}