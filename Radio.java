/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioPackage;
import java.lang.String;
import java.text.DecimalFormat;
/**
 *
 * @author OscarIvan
 */
public class Radio implements iRadio {

    boolean isOn; 
    String frecuency;
    String station; 
    MemoryBoton[] Memorias = new MemoryBoton[13];
    DecimalFormat df = new DecimalFormat("##.#");
    
    
    public Radio(){
        isOn = false;
        frecuency ="AM";
        station = "530";    
        
    }
    
    @Override
    public void OnOff() {
        isOn = !isOn;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public String getFrecuency() {
        return frecuency;
    }

    @Override
    public void changeFrecuency() {        
        if (frecuency == "AM"){
            frecuency = "FM";
            station = "87.9";
        } else{
            frecuency = "AM";
            station = "530";
        }
    }

    @Override
    public String getStation() {
        return station;
    }
    
    @Override
    public void setStation(String s) {
        station = s;
    }

    @Override
    public void Forward() {
        if (frecuency == "AM")
        {
            if (Integer.parseInt(station) < 1610)               
                station = Integer.toString(Integer.parseInt(station) + 10);
            else
                station = "530";
        }            
        else
        {
            if (Double.parseDouble(station) < 107.9)               
                station = df.format(Double.parseDouble(station) + 0.2);
            else
                station = "87.9";        
        }
            
    }

    @Override
    public void Backward() {
        if (frecuency == "AM")
        {
            if (Integer.parseInt(station) > 530)               
                station = Integer.toString(Integer.parseInt(station) - 10);
            else
                station = "1610";
        }            
        else
        {
            if (Double.parseDouble(station) > 87.9)               
                station = df.format(Double.parseDouble(station) - 0.2);
            else
                station = "107.9";        
        }
    }

    @Override
    public void setMemory(int Position) {
        if (Position > 0 && Position <13)            
            Memorias[Position] = new MemoryBoton(frecuency, station);
    }
    
    @Override
    public String getMemory(int Position) {
        if (Position > 0 && Position <13)            
            return Memorias[Position].Push();
        else
            return "";
    }


    @Override
    public String ToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("isON:");
        sb.append(isOn);
        sb.append(" Frecuency:");
        sb.append(frecuency);
        sb.append(" Station:");
        sb.append(station);
        
        return sb.toString();

    }
    
}
