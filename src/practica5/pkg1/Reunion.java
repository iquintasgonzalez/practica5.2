/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

/**
 *
 * @author Nacho
 */
public class Reunion 
{

    private String nombreReunion;
    private final Hora hora;
    private final Fecha fecha;
    private final Persona[] asistentes;
    private int numAsistentes;

    public Reunion(Hora hora,Fecha fecha, String nombreReunion,int maxAsistentes)
    {
        asistentes=new Persona[maxAsistentes];
        this.hora=hora;
        this.fecha=fecha;
        this.nombreReunion = nombreReunion;
        numAsistentes=0;
        
    }
    public int numAsistentes(){
        return numAsistentes;
    }
    public int maxAsistentes(){
        return asistentes.length;
    }

    public String getNombreReunion()
    {
        return nombreReunion;
    }

    public void setNombreReunion(String nombreReunion)
    {
        this.nombreReunion = nombreReunion;
    }
    public void insertar(Persona persona){
        asistentes[numAsistentes]=persona;
        numAsistentes++;
    }
    

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append(nombreReunion);
        toret.append("\nFecha:").append(fecha.toString());
        toret.append("\nHora:").append(hora.toString());
        for(int i=0;i<numAsistentes;i++){
            toret.append("\n");
            toret.append(asistentes[i]);
        }
        
        return toret.toString();
    }

  
}
