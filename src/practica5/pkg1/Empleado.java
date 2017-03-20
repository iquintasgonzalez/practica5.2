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
public class Empleado extends Cuenta
{
    String nombre;
    double salario;

    public Empleado( String nombre,Tipo t, double s, double i)
    {
        super(t, s, i);
        this.nombre=nombre;
    }

    
    @Override
    public void ingresa(double v)
    {
        saldo += v;
    }

    @Override
    public String toString()
    {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + saldo + ",cuenta"+'}';
    }
    
}
