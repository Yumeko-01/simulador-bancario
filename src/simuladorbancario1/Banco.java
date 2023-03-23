/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario1;

/**
 *
 * @author medin
 */
public class Banco {
   
    //Atributos
    private String nombre;
    private String correo;
    private String nit;
    private Cuenta primera;
    private Cuenta segunda;
    
    //contructor

    public Banco() {
        this.primera=new Cuenta();
        this.segunda=new Cuenta();
    }

    public Banco(String nombre, String correo, String nit, Cuenta primera, Cuenta segunda) {
        this.nombre = nombre;
        this.correo = correo;
        this.nit = nit;
        this.primera = primera;
        this.segunda = segunda;
    }
    
    //Sets and Gets

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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Cuenta getPrimera() {
        return primera;
    }

    public void setPrimera(Cuenta primera) {
        this.primera = primera;
    }

    public Cuenta getSegunda() {
        return segunda;
    }

    public void setSegunda(Cuenta segunda) {
        this.segunda = segunda;
    }
    
    //to String

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", correo=" + correo + ", nit=" + nit + ", primera=" + primera + ", segunda=" + segunda + '}';
    }
    
    
    
}
