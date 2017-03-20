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
public class Profesor extends Persona
{
    private final int despacho;
   private final Asignatura asignatura;

    public Profesor(int despacho, String DNI, String nombre,Asignatura asignatura)
    {
        super(DNI, nombre);
        this.despacho = despacho;
        this.asignatura=asignatura;
        
    }

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append(super.toString());
        toret.append("\ndespacho:").append(despacho);
        toret.append(asignatura);
        return toret.toString();
    }

    
}
