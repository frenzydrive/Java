public class Elevator {
    int currentFloor = 1;
    int maxFloor;
    int minFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Этаж задан неверно");
        }else if (currentFloor != floor) {
            while (currentFloor < floor )
                moveUp();
            System.out.println("Текущий этаж: " + currentFloor);
        }else if (currentFloor != floor) {
            while (currentFloor >  floor)
                moveDown();
            System.out.println("Текущий этаж: " + currentFloor);
        }else if (currentFloor == floor) {
        }
    }
}
