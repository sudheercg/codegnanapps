package methodreferences.instancemethods;

public class MathExample {
    public static void main(String[] args) {
        // Absolute value
        int absValue = Math.abs(-20);
        System.out.println("Absolute value of -20: " + absValue);

        // Maximum of two numbers
        int maxValue = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20: " + maxValue);

        // Square root
        double sqrtValue = Math.sqrt(64);
        System.out.println("Square root of 64: " + sqrtValue);

        // Power
        double powerValue = Math.pow(2, 3);
        System.out.println("2 to the power of 3: " + powerValue);

        // Rounding
        long roundValue = Math.round(5.7);
        System.out.println("Rounded value of 5.7: " + roundValue);

        // Random number
        double randomValue = Math.random();
        System.out.println("Random value: " + randomValue);

        // Trigonometric functions
        double sinValue = Math.sin(Math.toRadians(30));
        System.out.println("Sine of 30 degrees: " + sinValue);

        double cosValue = Math.cos(Math.toRadians(60));
        System.out.println("Cosine of 60 degrees: " + cosValue);

        double tanValue = Math.tan(Math.toRadians(45));
        System.out.println("Tangent of 45 degrees: " + tanValue);
    }
}
