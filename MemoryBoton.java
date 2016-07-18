/*
 * Hoja de trabajo #1
 *Josue Cifuentes #15275
 *Josue Jacobs #15041
 *José Pablo Muñoz #15258
 *Marcel Velásquez #15345
 */
package EjercicioRadio;

/**
 *
 * @author OscarIvan
 */
public class MemoryBoton{

    String frecuency;
    String station; 
    
    public MemoryBoton (String frecuency, String station)
    {
        this.frecuency= frecuency;
        this.station = station;
    }
    public String Push() {
        return frecuency.concat("|").concat(station);
    }
    
    public void Hold(String frecuency, String station) {
        this.frecuency = frecuency;
        this.station = station;
    }
    
}
