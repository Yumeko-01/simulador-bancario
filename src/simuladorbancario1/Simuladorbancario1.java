/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorbancario1;

/**
 *
 * @author medin
 */
public class Simuladorbancario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco banco=new Banco();
        banco.setNombre("Mi propio Banco");
        banco.setCorreo("banco@Gamil.com");
        banco.setNit("90000001");
        System.out.println("Datos del banco" +banco.toString());
        
        //crear cuentas ahorro, corriente y cdt
        Cuenta_Ahorros ahorro=new Cuenta_Ahorros(1500000,0);
        Cuenta_Corriente corriente=new Cuenta_Corriente(500000);
        CDT cdt=new CDT(1000000, new Fecha(16,6,2022),0,12);
        
        //crear cuenta
        Cuenta cuenta=new Cuenta("Gonzalo jimenez", "gonzalo@gamil.com","7900000",ahorro,corriente,cdt,0);
        
        //asociar la cuenta al banco
        banco.setPrimera(cuenta);
        
        //mostrar banco
        System.out.println("Datos del banco" +banco.toString());
        
        //asociar cuentas ahorros;corrientes,CDT
        cuenta.setAhorro(ahorro);
        cuenta.setCorriente(corriente);
        cuenta.setCdt(cdt);
        
        //consignar en ahorros
        System.out.println("Cuenta de ahorros" + ahorro.toString());
        ahorro.consignar(500000);
        System.out.println("Cuenta de ahorros" + ahorro.toString());
        
        //calcular intereses
        System.out.println("los intereses son " + ahorro.calcularintereses());
        
        //retirar ahorros
        System.out.println("Retiro de 700000 es " + ahorro.retirar(700000));
        System.out.println("Cuenta ahorros " + ahorro.toString());
        
        
        System.out.println("Abrir CDT: " );
        
        cdt.abrirCDT(new Fecha(21,3,2023), 34000,2);
        System.out.println("CDT " + cdt.toString());
        
        System.out.println("Cerra CDT");
        cdt.LiquidarCDT(34000, 12, 0);
        System.out.println("CDT" + cdt.toString());
    }
    
}
