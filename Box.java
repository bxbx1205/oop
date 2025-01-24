public class Box {

    private int length, width, height;

    private double dLength, dWidth, dHeight;

    public Box(int length, int width, int height) {

        this.length = length;

        this.width = width;

        this.height = height;

    }

    public Box(double length, double width, double height) {

        this.dLength = length;

        this.dWidth = width;

        this.dHeight = height;

    }

    public int getVolume() {

        return length * width * height;

    }

    public double getDoubleVolume() {

        return dLength * dWidth * dHeight;

    }

    public static void main(String[] args) {

        Box intBox = new Box(3, 4, 5);

        Box doubleBox = new Box(3.5, 4.5, 5.5);

        System.out.println("Volume of integer box: " + intBox.getVolume());

        System.out.println("Volume of double box: " + doubleBox.getDoubleVolume());

    }

}
