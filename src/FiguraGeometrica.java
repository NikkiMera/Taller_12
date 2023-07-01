class FiguraGeometrica {
    private int opcionFigura;

    public FiguraGeometrica(int opcionFigura) {
        this.opcionFigura = opcionFigura;
    }

    public void calcular(int opcionCalculo) {
        if (opcionFigura == 1) { // Triángulo
            Triangulo triangulo = new Triangulo();
            triangulo.calcular(opcionCalculo);
        } else if (opcionFigura == 2) { // Cuadrado
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.calcular(opcionCalculo);
        } else if (opcionFigura == 3) { // Círculo
            Circulo circulo = new Circulo();
            circulo.calcular(opcionCalculo);
        } else {
            System.out.println("Figura no válida.");
        }
    }
}