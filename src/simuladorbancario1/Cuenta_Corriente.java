/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario1;

/**
 *
 * @author medin
 */
public class Cuenta_Corriente {
    
    //Atributos
    private double saldo;
   
    //contructor

    public Cuenta_Corriente() {
        
    }

    public Cuenta_Corriente(double saldo) {
        this.saldo = saldo;
        
    }
    
    //Sets and Gets

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    //to String

    @Override
    public String toString() {
        return "Cuenta_Corriente{" + "saldo=" + saldo + '}';
    }
    //metodos de negocios
    public void consignar(double valor){
        this.saldo=this.saldo+valor;
    }   
    
}
