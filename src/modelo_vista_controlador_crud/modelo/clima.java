/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_vista_controlador_crud.modelo;

/**
 *
 * @author Miguel
 */
public class clima {
    
    
private double temperature=0;
private double pressure = 0;
private double altitude  = 0;
private double  air_quality = 0 ;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Veamos cual es el pedo aquí jiji ");
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getAir_quality() {
        return air_quality;
    }

    public void setAir_quality(double air_quality) {
        this.air_quality = air_quality;
    }

    
}
