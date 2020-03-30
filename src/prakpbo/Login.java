/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prakpbo;

import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Login {
       
    public static void main(String[] args) {
        GUI g = new GUI(); 
    }
}
class GUI extends JFrame {
   String pass="12345";
   final JTextField fusername = new JTextField(15);
   final JPasswordField fpassword = new JPasswordField(8);

   JLabel lusername = new JLabel(" Username ");
   JLabel lpassword = new JLabel(" Password ");
   JButton btnLogin = new JButton("Login");
   JButton btnCancel = new JButton("Cancel");

public GUI() {
    
    setTitle("LOGIN");
	setDefaultCloseOperation(3);
	setSize(330,175);
        setLocation(750,400);
        
    setLayout(null);
	add(lusername);
	add(fusername);
        add(lpassword);
	add(fpassword);
        add(btnLogin);
        add(btnCancel);
        
        lusername.setBounds(10,15,120,20);
        fusername.setBounds(140,15,150,20);
        lpassword.setBounds(10,40,120,20);
        fpassword.setBounds(140,40,150,20);
        btnLogin.setBounds(165,80,100,20);
        btnCancel.setBounds(50,80,100,20);
        
        btnLogin.addActionListener((ActionEvent e) -> {
            if(fusername.getText().equalsIgnoreCase("Admin") && pass.equalsIgnoreCase(fpassword.getText()))
            {
                PrakPBO pbo = new PrakPBO();
                pbo.setVisible(true);
                dispose();
            } else 
            {
                JOptionPane.showMessageDialog(null, "Login gagal! Username atau Password salah");
            }
    });
        setVisible(true);
}
}
