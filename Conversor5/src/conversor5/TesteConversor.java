/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor5;

/**
 *
 * @author diego
 */
public class TesteConversor {
    
    public static void main(String[] args) {
        Conversor5 conversor = new Conversor5();
        System.out.println(conversor.celciusParaFarenheit(27.9));
        System.out.println(conversor.celciusParaKelvin(21));
        System.out.println(conversor.kelvinParaCelcius(294));
        System.out.println(conversor.kelvinParaFarenheit(294));
        System.out.println(conversor.farenheitParaCelcius(82.22));
        System.out.println(conversor.farenheitParaKelvin(69.8));
    }
    
}
