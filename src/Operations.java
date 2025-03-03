public class Operations {
    public static float addition(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtraction(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static float divide(float num1, float num2) {
        return num1 / num2;
    }

    public static float greaterNumber(float num1, float num2, float num3) {
        float result = num1;
        for (int i = 3; i > 0; i--) {
            if (result < num2)
                result = num2;
            else if (result < num3)
                result = num3;

        }

        return result;
    }

    public static int factorial(int num) {
        int result = num;
        if (num == 0)
            return 1;
        for (int i = num; i > 1; i--) {
            result *= (i - 1);
        }
        return result;
    }

}
