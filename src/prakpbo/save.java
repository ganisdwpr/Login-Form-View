/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class save extends JFrame {
    String nama, jeniskelamin, agama, hobi;
    
    JLabel lnama = new JLabel(" Nama Lengkap");
    JLabel lJenkel = new JLabel(" Jenis Kelamin");
    JLabel lagama = new JLabel(" Agama   ");
    JLabel lhobi = new JLabel(" Hobi     ");
    JLabel saveNama= new JLabel();
    JLabel saveJenkel= new JLabel();
    JLabel saveAgm= new JLabel();
    JLabel saveHobi= new JLabel();
    
    public save(String nama, String jeniskelamin, String agama, String hobi){
        setTitle("Tampilan");
	setDefaultCloseOperation(3);
	setSize(350,180);
        setLocation(750,400);

        this.nama= nama;
        this.jeniskelamin=jeniskelamin;
        this.agama=agama;
        this.hobi=hobi;
        saveNama.setText(nama);
        saveJenkel.setText(jeniskelamin);    
        saveAgm.setText(agama); 
        saveHobi.setText(hobi);
        
        setLayout(null);
        add(lnama);
        add(lJenkel);
        add(lagama);
        add(lhobi);
        add(saveNama);
        add(saveJenkel);
        add(saveAgm);
        add(saveHobi);

        lnama.setBounds(10,10,120,20);
	lJenkel.setBounds(10,35,120,20);
        lagama.setBounds(10,60,120,20);
        lhobi.setBounds(10,90,120,20);
        saveNama.setBounds(110,10,120,20);
	saveJenkel.setBounds(110,35,120,20);
        saveAgm.setBounds(110,60,120,20);
        saveHobi.setBounds(110,90,150,20);

        setVisible(true);
}
}