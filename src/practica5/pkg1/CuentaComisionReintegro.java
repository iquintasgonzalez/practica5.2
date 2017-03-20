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
public class CuentaComisionReintegro extends Cuenta
{
    
    public CuentaComisionReintegro(Tipo t, double s, double i)
    {
        super(t, s, i);
    }
    @Override
    public void reintegra(double v) throws Exception
    {
        if ( v > getSaldo() ) {
            throw new Exception( "saldo sobrepasado con: " + v );
        }

        saldo -= v;
    }

    /** Aplica el interés, aumentando el saldo */
    @Override
    public void aplicaInteres()
    {
        saldo += ( getSaldo() * getInteres() );
    }
    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();

        toret.append( "Cuenta " );
        toret.append( getTipo().toString().toLowerCase() );
        toret.append( ": " );
        toret.append( super.toString() );

        return toret.toString();
    }
    
}
