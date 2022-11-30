import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Вы находитесь на " + elevator.getCurrentFloor() + " этаже");
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}