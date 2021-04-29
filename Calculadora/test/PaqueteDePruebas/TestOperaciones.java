package PaqueteDePruebas;

import calculadora.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOperaciones {

    public TestOperaciones() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test para la clase Suma
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 2;
        int b = 1;
        int rEsperado = 3;
        int rObtenido = Operaciones.suma(a, b);
        assertEquals(rEsperado, rObtenido);
    }

    /**
     * Test para la clase resta
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 2;
        int b = 1;
        int rEsperado = 1;
        int rObtenido = Operaciones.resta(a, b);
        assertEquals(rEsperado, rObtenido);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 2;
        int b = 1;
        int rEsperado = 2;
        int rObtenido = Operaciones.multiplicacion(a, b);
        assertEquals(rEsperado, rObtenido);
    }
    
    @Test
    public void testDivision() {
        System.out.println("multiplicacion");
        int a = 2;
        int b = 0;
        String rEsperado = "no se puede dividir entre cero";
        int rObtenido = Operaciones.division(a, b);
        assertEquals(rEsperado, rObtenido);
    }
}