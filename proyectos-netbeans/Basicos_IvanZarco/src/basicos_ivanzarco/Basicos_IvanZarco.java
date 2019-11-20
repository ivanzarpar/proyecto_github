/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos_ivanzarco;

/**
 *
 * @author ivan_
 */
public class Basicos_IvanZarco {
/**

     * Método para mostrar ejemplos de tipos numericos.

     */

    public static void numericos() {



        //Estos son los tipos básicos

        byte elmenor;

        short unpocomas;

        int elentero;

        long dosentero;

        float crece;

        double crecemas;



        //Ejemplos de asignación de valores a las variables de tipos básicos

        elentero = 10;

        crece = (float) 7.8;

        crecemas = 235.23;



        //Mostrar en pantalla el contendido de las variables de tipos básicos.

        System.err.println("Muestra un número entero");

        System.out.println(elentero);

        System.out.println("Muestra un número real");

        System.out.println(crece);

        System.out.println("Muestra un número real más grande que el anterior");

        System.out.println(crecemas);

    }

    public static void main(String[] args) {

       numericos();  

    }

    

}