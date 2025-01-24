    public class Multiplier {

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int multiply(int a, int b, int c) {
            return a * b * c;
        }

        public static float multiply(float a, float b) {
            return a * b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static void main(String[] args) {
            System.out.println(Multiplier.multiply(11, 11));
            System.out.println(Multiplier.multiply(11, 11, 11));
            System.out.println(Multiplier.multiply(11.0f, 11.0f));
            System.out.println(Multiplier.multiply(11.0, 11.0));
        }
    }