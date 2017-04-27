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
public class Conversor5 {

    public double celciusParaFarenheit(double c) {
        return (c / 5) * 9 + 32;
    }
    
    public double celciusParaKelvin(double c) {
        return c + 273;
    }
    
    public double kelvinParaCelcius(double k) {
        return k - 273;
    }
    
    public double kelvinParaFarenheit(double k) {
        return (k - 273) / 5 * 9 + 32;
    }
    
    public double farenheitParaCelcius(double f) {
        return (f - 32) / 9 * 5 ;
    }
    
    public double farenheitParaKelvin(double f) {
        return (f - 32) / 9 * 5 + 273;
    }
    
}