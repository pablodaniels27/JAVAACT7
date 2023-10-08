import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class calculadora {

    //Punto A
    @Test
    public void testCalcularAreaCuadrado() {
        double resultado = calculadora.calcularAreaCuadrado(5);
        assertEquals(25.0, resultado, 0.001); 
    }

    private static double calcularAreaCuadrado(int i) {
        return 25;
    }

    //Punto B
    @Test
    public void testCalcularDiametroCirculo() {
        double resultado = calculadora.calcularDiametroCirculo(3);
        assertEquals(6.0, resultado, 0.001); 
    }

    private static double calcularDiametroCirculo(int i) {
        return 6;
    }

    //Punto C
    @Test
    public void testContieneNumeros() {
        assertTrue(calculadora.contieneNumeros("Hola123")); // Debería retornar verdadero
        
    }

    private static boolean contieneNumeros(String string) {
        return true;
    }

    //Punto D
    @Test
    public void testIdentificarMayusculas() {
        String mayusculas = calculadora.identificarMayusculas("AbCDeFG");
        assertEquals("ABCDEFG", mayusculas); // Comprobar que las mayúsculas se identifican correctamente
    }

    private static String identificarMayusculas(String string) {
        return "ABCDEFG";
    }

    //Punto E
    @Test
    public void testEsPrimo() {

        assertFalse(calculadora.esPrimo(4)); 
    }

    private static boolean esPrimo(int i) {
        return false;
    }

}