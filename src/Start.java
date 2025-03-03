import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {
        int valueDisplay;
        Scanner valueScanner = new Scanner(System.in);
        System.out.println("********************************************************");
        System.out.println("************ CALCULADORA DE CALCULATOR S.A *************");
        System.out.println("********************************************************");

        do {
            System.out.println("Introduzca una opción del menú:");
            System.out.println("1. Función Sumar");
            System.out.println("2. Función Restar");
            System.out.println("3. Función Multiplicar");
            System.out.println("4. Función Dividir");
            System.out.println("5. Función Número mayor de 3 números");
            System.out.println("6. Función Factorial");
            System.out.println("0. Salir");
            System.out.print("Introduzca una opción: ");

            valueDisplay = valueScanner.nextInt();
            System.out.println("");

            switch (String.valueOf(valueDisplay)) {
                case "1":
                    System.out.print("Introduzca el primer número flotante a sumar: ");
                    float sumNum1 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el segundo número flotante a sumar: ");
                    float sumNum2 = valueScanner.nextFloat();
                    System.out.println(
                            "La suma de " + sumNum1 + " y " + sumNum2 + " es " + Operations.addition(sumNum1, sumNum2));
                    System.out.println("");
                    break;

                case "2":
                    System.out.print("Introduzca el primer número flotante a restar: ");
                    float subNum1 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el segundo número flotante a restar: ");
                    float subNum2 = valueScanner.nextFloat();
                    System.out.println(
                            "La resta de " + subNum1 + " y " + subNum2 + " es "
                                    + Operations.subtraction(subNum1, subNum2));
                    System.out.println("");
                    break;

                case "3":
                    System.out.print("Introduzca el primer número flotante a multiplicar: ");
                    float multNum1 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el segundo número flotante a multiplicar: ");
                    float multNum2 = valueScanner.nextFloat();
                    System.out.println(
                            "La multiplicación de " + multNum1 + " y " + multNum2 + " es "
                                    + Operations.multiply(multNum1, multNum2));
                    System.out.println("");
                    break;

                case "4":
                    System.out.print("Introduzca el primer número flotante a dividir: ");
                    float diviNum1 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el segundo número flotante a dividir: ");
                    float diviNum2 = valueScanner.nextFloat();
                    if (diviNum2 == 0) {
                        System.err.println("Error division por 0");
                        System.out.println("");
                        break;
                    }
                    System.out.println(
                            "La división de " + diviNum1 + " y " + diviNum2 + " es "
                                    + Operations.divide(diviNum1, diviNum2));
                    System.out.println("");
                    break;

                case "5":
                    System.out.print("Introduzca el primer número flotante de los 3: ");
                    float greatNum1 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el segundo número flotante de los 3: ");
                    float greatNum2 = valueScanner.nextFloat();
                    System.out.println();
                    System.out.print("Introduzca el tercero número flotante de los 3: ");
                    float greatNum3 = valueScanner.nextFloat();
                    System.out.println("El número " + Operations.greaterNumber(greatNum1, greatNum2, greatNum3)
                            + " es el mayor de los 3 números");
                    System.out.println("");
                    break;

                case "6":
                    System.out.print("Introduzca un número para calcular el facotrial: ");
                    int factNum = valueScanner.nextInt();
                    System.out.print("");
                    if (factNum >= 0)
                        System.out.println("El factorial de " + factNum + " es " + Operations.factorial(factNum));
                    else {
                        System.err.print("Error valor inferio a 0, introduzca un valor superior a 0");
                    }
                    System.out.println("");
                    break;
                case "0":
                    System.out
                            .println("-------------------------");
                    System.out.println("El programa ha finalizado");
                    System.out.println("-------------------------");
                default:
                    System.out.println("");
                    break;
            }
            if (valueDisplay > 6) {
                System.out
                        .println(
                                "---------------------------------------------------------------------------------------");
                System.out.println("Opción errónea");
                System.out
                        .println(
                                "---------------------------------------------------------------------------------------");
            }
        } while (valueDisplay != 0);
        valueScanner.close();
    }
}
