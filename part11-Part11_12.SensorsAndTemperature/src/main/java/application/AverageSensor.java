/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> list;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.list = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {  
        for(Sensor sensor : this.sensors){
            if(sensor.isOn() == false){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {   
        int numbers = (int) this.sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .orElse(0);
                
        list.add(numbers);
        
        return numbers;
    }

    public List<Integer> readings() {
        return list;
    }
}
