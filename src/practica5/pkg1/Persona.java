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
public class Persona
{

    private String email;
    private  String nombre;

    public Persona(String email, String nombre)
    {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append("Email:");
        toret.append(getEmail());
        toret.append("\nNombre:");
        toret.append(getNombre());

        return toret.toString();
    }

}
