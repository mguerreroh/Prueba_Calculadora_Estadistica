/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import appcalculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class CalculadoraTest {

    public CalculadoraTest() {
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

    @Test
    public void testCalculadoraDebeRegistrarDatoIngresado() {
        // Arrange
        double dato = 10;
        int esperado = 1;
        Calculadora calculadora = new Calculadora();        
        // Act
        calculadora.registrarDato(dato);
        int devuelto = calculadora.getCantidadDatos();
        // Assert
        assertEquals(esperado, devuelto);
    }

    @Test
    public void testCalculadoraDebeSumarDatosIngresados(){
        // Arrange
        double n1 = 10, n2 = 20, n3 = 30;
        double esperado = 60;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        calculadora.registrarDato(n3);
        double devuelto = calculadora.calcularSumatoria();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebePromediarDatosIngresados(){
        // Arrange
        double n1=10, n2=20;
        double esperado = 15;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        double devuelto = calculadora.calcularPromedio();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebePromediarSinDatos(){
        // Arrange
        double esperado = 0;
        Calculadora calculadora = new Calculadora();
        // Act
        double devuelto = calculadora.calcularPromedio();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebeObtenerElDatoMayor(){
        // Arrange
        double n1=0, n2=10, n3=5, n4=7;
        double esperado = 10;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        calculadora.registrarDato(n3);
        calculadora.registrarDato(n4);
        double devuelto = calculadora.obtenerDatoMayor();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebeObtenerElDatoMayorDeNumerosNegativos(){
        // Arrange
        double n1=-5, n2=-10, n3=-5, n4=-7;
        double esperado = -5;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        calculadora.registrarDato(n3);
        calculadora.registrarDato(n4);
        double devuelto = calculadora.obtenerDatoMayor();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebeObtenerElDatoMenor(){
        // Arrange
        double n1=2, n2=10, n3=1, n4=7;
        double esperado = 1;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        calculadora.registrarDato(n3);
        calculadora.registrarDato(n4);
        double devuelto = calculadora.obtenerDatoMenor();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }

    @Test
    public void testCalculadoraDebeObtenerElDatoMenorDeNegativos(){
                // Arrange
        double n1=-2, n2=-10, n3=-1, n4=-7;
        double esperado = -10;
        Calculadora calculadora = new Calculadora();
        // Act
        calculadora.registrarDato(n1);
        calculadora.registrarDato(n2);
        calculadora.registrarDato(n3);
        calculadora.registrarDato(n4);
        double devuelto = calculadora.obtenerDatoMenor();
        // Assert
        assertEquals(esperado, devuelto, 0);
    }


}