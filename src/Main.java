import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");


        int opcionFigura = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Seleccione qué desea calcular:");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");


        int opcionCalculo = scanner.nextInt();

        FiguraGeometrica figura = new FiguraGeometrica(opcionFigura);
        figura.calcular(opcionCalculo);

        scanner.close();
    }
}
