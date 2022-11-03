import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //suma
        funciones f = new funciones();
       System.out.println("La suma es: "+f.suma(1,2,3));

       //coche
        coche c = new coche();
        c.setNpuertas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese puertas del coche")));
        c.addpuertas();
        System.out.println("El coche ahora tiene "+c.getNpuertas()+" puertas");

    }
}