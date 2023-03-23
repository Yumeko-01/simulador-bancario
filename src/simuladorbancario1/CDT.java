/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario1;

/**
 *
 * @author medin
 */
public class CDT {
    
    //constante
    public final static double PORCENTAJE_INTERES=0.6;
    
    //Atributos
    private double ValorApertura;
    private Fecha fechaApertura;
    private double valorLiquidacion;
    private int meses;
    
    //constructor

    public CDT() {
    }

    public CDT(double ValorApertura, Fecha fechaApertura, double valorLiquidacion, int meses) {
        this.ValorApertura = ValorApertura;
        this.fechaApertura = fechaApertura;
        this.valorLiquidacion = valorLiquidacion;
        this.meses = meses;
    }
    
    //sets and gets

    public double getValorApertura() {
        return ValorApertura;
    }

    public void setValorApertura(double ValorApertura) {
        this.ValorApertura = ValorApertura;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getValorLiquidacion() {
        return valorLiquidacion;
    }

    public void setValorLiquidacion(double valorLiquidacion) {
        this.valorLiquidacion = valorLiquidacion;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    //to String

    @Override
    public String toString() {
        return "CDT{" + "ValorApertura=" + ValorApertura + ", fechaApertura=" + fechaApertura + ", valorLiquidacion=" + valorLiquidacion + ", meses=" + meses + '}';
    }
    
    //abrir cdt
    public void abrirCDT(Fecha apertura,double valor, int meses){
        this.fechaApertura=apertura;
        this.ValorApertura=valor;
        this.meses=meses;
    }
    
    //liquidar CDT
    public void LiquidarCDT(double valor,int meses,double intereses){
        intereses=valor*CDT.PORCENTAJE_INTERES*meses;
        this.valorLiquidacion=intereses+valor;
        
    }
    
}
