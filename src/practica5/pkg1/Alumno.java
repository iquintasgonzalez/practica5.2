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
public class Alumno extends Persona
{
   private final String planEstudios;

    public Alumno(String planEstudios, String DNI, String nombre)
    {
        super(DNI, nombre);
        this.planEstudios = "Bolonia";
    }
    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append(super.toString());
        toret.append("\nPlan de estudios:").append(planEstudios);
        
        return toret.toString();
    }

}
