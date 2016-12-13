/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Una.lab2.swing;
import javax.swing.*;
import java.awt.GridLayout;
/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame {
  JTextField nombre = new JTextField(15);
  JTextField telefono = new JTextField(15);
  JButton limpiar = new JButton("Limpiar");
  JButton aceptar = new JButton("Registar");
  GridLayout family = new GridLayout(4,4,5,5);
   
   
      String[] genero = { "Masculino", "Femenino"};
    JComboBox formatBox = new JComboBox(genero);

    public Lab2() {
        super("Panel");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel nombreLabel = new JLabel("Nombre: ");
        JLabel telefonoLabel = new JLabel("Telefono: ");
       
        
    
        nombreLabel.setName("lblUsername");
        telefonoLabel.setName("lblPassword");
        
        nombre.setName("Nombre");
        telefono.setName("Telefono");
        
        limpiar.setName("Limpiar");
       
        panel.setLayout(family);
       
        panel.setName("Form");
        panel.add(nombreLabel);
        panel.add(nombre);
        panel.add(telefonoLabel);
        panel.add(telefono);
       
        panel.add(aceptar);
        panel.add(limpiar);
        JLabel formatLabel = new JLabel("Genero:");
        panel.add(formatLabel);
        panel.add(formatBox);
        
        add(panel);
        setVisible(true);
    }
    
   
    
    


    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
     
    public static void main(String[] args) {
        Lab2.setLookAndFeel();
        Lab2 auth = new Lab2();
    }
    
}
