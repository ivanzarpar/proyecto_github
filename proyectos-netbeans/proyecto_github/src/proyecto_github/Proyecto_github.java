/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_github;

/**
 *
 * @author ivan_
 */
public class Proyecto_github {

    String nombre = "";
    double notadeseada = 0;
    double notareal = 0;

    public static String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("La calificación de " + args[2] + " : ");// TODO code application logic here
    }

}
