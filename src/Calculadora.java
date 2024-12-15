import java.util.Scanner;

public class Calculadora {
    public static int menu() {
        int op;

        do {
            System.out.println("*-* Menu *-*");
            System.out.println("-------------");
            Scanner input = new Scanner(System.in);
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Opção: ");

            op = input.nextInt();
            if (op < 1 || op > 4) {
                System.out.println("Operação inválida");
            }

        } while (op < 1 || op > 4);

        return op;
    }

    public static float entradaDados() {
        System.out.println(" Entrada de dados ");
        System.out.println(" -----------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        float n = input.nextFloat();
        return n;
    }

    public static float adicao(float n1, float n2) {
        System.out.println("*-* Adição *-*");
        System.out.println("---------------");
        return n1 + n2;
    }

    public static float subtracao(float n1, float n2) {
        System.out.println("*-* Subtração *-*");
        System.out.println("-----------------");
        return n1 - n2;
    }

    public static float multiplicacao(float n1, float n2) {
        System.out.println("*-* Multiplicação *-*");
        System.out.println("---------------------");
        return n1 * n2;
    }

    public static float divisao(float n1, float n2) {
        System.out.println("*-* Divisão *-*");
        System.out.println("----------------");
        return n1 / n2;
    }

    public static void imprimir(float resultado) {
        System.out.println("*-* Resultado *-*");
        System.out.println("-----------------");
        System.out.println("Resultado: " + resultado);
    }

    public static float controlador(int op, float n1, float n2) {
        System.out.println("*-* Controlador *-*");
        System.out.println("-------------------");
        float result = 0;

        switch (op) {
            case 1:
                result = adicao(n1, n2);
                break;
            case 2:
                result = subtracao(n1, n2);
                break;
            case 3:
                result = multiplicacao(n1, n2);
                break;
            case 4:
                result = divisao(n1, n2);
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("*-* MAIN *-*");
        int op = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float resultado = controlador(op, n1, n2);
        imprimir(resultado);
    }
}
