/*
 * Hoja de trabajo #1
 *Josue Cifuentes #15275
 *Josue Jacobs #15041
 *José Pablo Muñoz #15258
 *Marcel Velásquez #15345
 */
package EjercicioRadio;


import java.lang.String;
/**
 *
 * @author OscarIvan
 */
public interface iRadio {
    public void OnOff();
    public boolean isOn();
    public String getFrecuency();
    public void changeFrecuency();
    public String getStation();   
    public void Forward();
    public void Backward();
    public void setMemory(int Position);
    public String ToString();
}
