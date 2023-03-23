/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario1;

import java.util.Scanner;

/**
 *
 * @author medin
 */
public class Cuenta_Ahorros {
    
    //constante
    public final static double PORCENTAJE_INTERES=0.6;
    
    //Atributos
    private double saldo;
    private double interes;
    
    //constructor

    public Cuenta_Ahorros() {
    }

    public Cuenta_Ahorros(double saldo, double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }
    
    //Sets and Gets

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta_Ahorros{" + "saldo=" + saldo + ", interes=" + interes + '}';
    }
    
    //metodos de negocios
    public void consignar(double valor){
        this.saldo=this.saldo+valor;
    }
    
    //calcular el interes de un mes
    public double calcularintereses(){
        this.interes=this.saldo*Cuenta_Ahorros.PORCENTAJE_INTERES;
        return this.interes;
    }
    //Retirar
    public double retirar(double valor){
        this.saldo=this.saldo-valor;
        return this.saldo;
    }
    
    
}
