/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

/**
 *
 * @author alumno
 */
public class ReunionPeriodica extends Reunion{
    public static enum Frecuencia{DIARIO,SEMANAL,MENSUAL,ANUAL};
    private Frecuencia frecuencia;

    public ReunionPeriodica(Frecuencia frecuencia, Hora hora, Fecha fecha, String nombreReunion, int maxAsistentes) {
        super(hora, fecha, nombreReunion, maxAsistentes);
        this.frecuencia = frecuencia;
    }

    

   

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }

   
    @Override
    public String toString() {
        StringBuilder toret=new StringBuilder();
        toret.append("Reunion:").append(super.toString());
        toret.append("\nFrecuencia:").append(frecuencia.toString().toLowerCase());
        return    toret.toString();
    }
    
    
    
}
