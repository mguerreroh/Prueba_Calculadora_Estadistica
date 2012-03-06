/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package appcalculadora;

import java.util.ArrayList;

/**
 *
 * @author pcsiecon
 */
public class Calculadora {

    // Declaracion de la coleccion de numeros
    private ArrayList<Numero> numeros;

    public Calculadora(){
        // Instanciar la coleccion de numeros
        numeros = new ArrayList<Numero>();
    }
    
    public void registrarDato(double dato){
        // Crear un nuevo dato numerico
        Numero numero = new Numero(dato);
        // Ponerlo como parte de la coleccion
        numeros.add(numero);
    }

    public int getCantidadDatos(){
        return numeros.size();
    }

    public double calcularSumatoria(){
        double resultado = 0;
        for(Numero numero : numeros)
            resultado += numero.getValor();
        return resultado;
    }

    public double calcularPromedio(){
        double resultado = 0;
        if (! numeros.isEmpty())
           resultado = calcularSumatoria()/numeros.size();
        return resultado;
    }

    public double obtenerDatoMayor(){
        double mayor = obtenerPrimeroSiExiste();
        for(Numero numero : numeros){
            double valor = numero.getValor();
            if (valor > mayor)
                mayor = valor;
        }
        return mayor;
    }

    public double obtenerDatoMenor(){
        double menor = obtenerPrimeroSiExiste();
        for(Numero numero : numeros){
            double valor = numero.getValor();
            if (valor < menor)
                menor = valor;
        }
        return menor;  
    }

    private double obtenerPrimeroSiExiste() {
        double numero = 0;
        if (!numeros.isEmpty()) {
            numero = numeros.get(0).getValor();
        }
        return numero;
    }

}
