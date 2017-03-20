/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class Practica51
{

    public static void main (String[] args)
    {
        /*System.out.println("Sistema financiero");

        Cuenta c = new Cuenta( Cuenta.Tipo.AHORRO, 100, .05 );
        System.out.println( c );

        c.ingresa( 50 );
        c.ingresa( 120 );
        c.aplicaInteres();
        System.out.println( c );
        try
        {
            c.reintegra(0);
        } catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        Prestamo p = new Prestamo( 12, 10000, .10 );
        System.out.println( p );

        p.amortiza();
        p.amortiza();
        System.out.println( p );
        
        Empleado e = new Empleado("Ines",  Cuenta.Tipo.LIBRETA, 1000, .05);
        
        e.ingresa(800);
        System.out.println(e);
*/
       // Asignatura asi=new Asignatura("PROII",6);
        //Profesor prof= new Profesor(45,"445534234h","MATIAS",asi);
       
       // System.out.println(prof);
        Hora hora=new Hora(17,30,00);
        Fecha fecha=new Fecha(20,2017,Fecha.Mes.MARZO);
        Persona persona1=new Persona("ajhdjas@jashdkja.com","Ines");
        Persona persona2=new Persona("jasdgjkas@ajsdh.es","Nacho");
        
       ReunionPeriodica reunion=new ReunionPeriodica(ReunionPeriodica.Frecuencia.ANUAL,hora,fecha,"Examen",3);
        reunion.insertar(persona2);
        reunion.insertar(persona1);
        
        System.out.println(reunion.toString());
    }
}

