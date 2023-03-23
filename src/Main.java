public class  Main {

    static String randomString = "java";

    static final double PI = 3.14;
    public static void main(String[] args) {

        System.out.println(randomString);

        System.out.println(PI);

        int x = 1;

        System.out.println(x);

        int y = x + 1;

        System.out.println(y);

        System.out.println("This is the largest double we can have: " + Double.MAX_VALUE);

        double a = 5.8;

        System.out.println(a);

        int doubleToInt = (int) a;

        System.out.println(doubleToInt);

        String doubleToString = String.valueOf(a);

        System.out.println(doubleToString);

        int stringToInt = Integer.parseInt(doubleToString);

        System.out.println(stringToInt);

    }
}