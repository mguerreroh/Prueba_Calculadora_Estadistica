/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import appcalculadora.Numero;
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
public class NumeroTest {

    public NumeroTest() {
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
    public void testNumeroCreadoDebeRetornarSuValor(){
        // Arrange
        double dato = 10;
        Numero numero = new Numero(dato);
        // Act
        double retornado = numero.getValor();
        // Assert
        assertEquals(dato, retornado , 0);
    }



}