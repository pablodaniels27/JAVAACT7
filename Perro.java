import java.util.Scanner;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    // Constructor
    public Perro(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método comer
    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + tipoComida + " en cantidad de " + cantidadGramos + " gramos.");
        // Agregar lógica adicional si es necesario
    }

    // Método ladrar
    public String ladrar() {
        return "guau guau";
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese los datos del primer perro: ");
            System.out.print("Nombre: ");
            String nombrePerro1 = scanner.nextLine();
            System.out.print("Raza: ");
            String razaPerro1 = scanner.nextLine();
            System.out.print("Edad: ");
            int edadPerro1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Peso: ");
            double pesoPerro1 = Double.parseDouble(scanner.nextLine());

            Perro perro1 = new Perro(nombrePerro1, razaPerro1, edadPerro1, pesoPerro1);

            System.out.println("Ingrese los datos del segundo perro: ");
            System.out.print("Nombre: ");
            String nombrePerro2 = scanner.nextLine();
            System.out.print("Raza: ");
            String razaPerro2 = scanner.nextLine();
            System.out.print("Edad: ");
            int edadPerro2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Peso: ");
            double pesoPerro2 = Double.parseDouble(scanner.nextLine());

            Perro perro2 = new Perro(nombrePerro2, razaPerro2, edadPerro2, pesoPerro2);

            perro1.comer("croquetas", 300);
            System.out.println(perro1.ladrar());

            perro2.comer("carne", 500);
            System.out.println(perro2.ladrar());
        } catch (NumberFormatException e) {
            System.out.println("Error al ingresar datos numéricos. Inténtelo de nuevo.");
        } finally {
            scanner.close();
        }
    }
}
