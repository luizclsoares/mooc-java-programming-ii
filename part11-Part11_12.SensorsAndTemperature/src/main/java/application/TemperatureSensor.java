/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author luiz
 */
public class TemperatureSensor implements Sensor{
    private boolean temperatureSensor;

    public TemperatureSensor() {
        this.temperatureSensor = false;
    }

    @Override
    public boolean isOn() {
        return this.temperatureSensor;
    }

    @Override
    public void setOn() {
        this.temperatureSensor = true;
    }

    @Override
    public void setOff() {
        this.temperatureSensor = false;
    }

    @Override
    public int read() throws IllegalStateException{
        this.temperatureSensor = true;
        
        return new Random().nextInt(61) - 30;
    }
}
