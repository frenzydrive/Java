public class Dimensions {
    private final double width;
    private final double height;
    private final double lenght;

    public Dimensions(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public double getVolume() {
        double volume = width * height * lenght;
        return volume;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, lenght);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, lenght);
    }

    public Dimensions setLenght(double lenght) {
        return new Dimensions(width, height, lenght);
    }

    @Override
    public String toString() {
        return "{" +
                "Ширина: " + width +
                " Длина: " + lenght +
                " Высота: " + height +
                '}';
    }
}
