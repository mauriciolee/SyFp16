/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author danylee
 */
public class Cuenta {
    int cuenta;
    int cliente;

    private Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getCliente() {
        return cliente;
    }
    
    public double checkSaldo () {
        return saldo;
    }
    public double saldo = 0.0;
    
         
    
    public void deposito(double dinero)throws WrongAmountException
    {
        if (dinero <= 0.0)
        {
            throw new WrongAmountException ("amount");
        }
        else 
        {
            saldo = saldo + dinero;
        }
        
    }
    
    public void retiro(double billete)throws SaldoInsuficienteException
    {
        if(billete >0.0)
        {
            throw new SaldoInsuficienteException ("saldo insufiente");
        }
        else 
        {
             saldo = saldo - billete;
        }
    }
    
    public static void main (String[]args) throws WrongAmountException
    {
        Cuenta x = new Cuenta();
    }

    public Cuenta(int cuenta, int cliente) {
        this.cuenta = cuenta;
        this.cliente = cliente;
    }
        
    
            
    

    
}
