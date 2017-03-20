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
public class Fecha
{
    int dia,año;
    public static enum Mes{ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
    Mes  mes;
    public Fecha(int dia, int año, Mes mes)
    {
        this.dia = dia;
        this.año = año;
        this.mes = mes;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getAño()
    {
        return año;
    }

    public void setAño(int año)
    {
        this.año = año;
    }

    public Mes getMes()
    {
        return mes;
    }

    public void setMes(Mes mes)
    {
        this.mes = mes;
    }

    
    @Override
    public String toString()
    {
        return  + dia+"/"+mes.toString().toLowerCase()+"/"+año ;
    }
    
}
