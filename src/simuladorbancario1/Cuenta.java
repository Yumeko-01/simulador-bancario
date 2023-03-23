/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario1;

/**
 *
 * @author medin
 */
public class Cuenta {
    
    //Atributos
    private String nombre;
    private String correo;
    private String cedula;
    private Cuenta_Ahorros ahorro;
    private Cuenta_Corriente corriente;
    private CDT cdt;
    private int mesesSimulacion;
    
    //contructores

    public Cuenta() {
        this.ahorro=new Cuenta_Ahorros();
        this.corriente=new Cuenta_Corriente();
        this.cdt=new CDT();
    }

    public Cuenta(String nombre, String correo, String cedula, Cuenta_Ahorros ahorro, Cuenta_Corriente corriente, CDT cdt, int mesesSimulacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.ahorro = ahorro;
        this.corriente = corriente;
        this.cdt = cdt;
        this.mesesSimulacion = mesesSimulacion;
    }
    
    //Sets and gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Cuenta_Ahorros getAhorro() {
        return ahorro;
    }

    public void setAhorro(Cuenta_Ahorros ahorro) {
        this.ahorro = ahorro;
    }

    public Cuenta_Corriente getCorriente() {
        return corriente;
    }

    public void setCorriente(Cuenta_Corriente corriente) {
        this.corriente = corriente;
    }

    public CDT getCdt() {
        return cdt;
    }

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }

    public int getMesesSimulacion() {
        return mesesSimulacion;
    }

    public void setMesesSimulacion(int mesesSimulacion) {
        this.mesesSimulacion = mesesSimulacion;
    }

    //to String
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", correo=" + correo + ", cedula=" + cedula + ", ahorro=" + ahorro + ", corriente=" + corriente + ", cdt=" + cdt + ", mesesSimulacion=" + mesesSimulacion + '}';
    }
    
    //metodo saldo de cuentas
    private void saldoscuentas(){
        this.corriente.consignar(this.cdt.getValorLiquidacion());
    }
    
    
}
