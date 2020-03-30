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
public class PrakPBO extends JFrame {
    String nama, jeniskelamin, agama, hobby;
    
    final JTextField fnama = new JTextField(20);

    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
    JRadioButton rbPria = new JRadioButton("Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");
    JLabel lagm = new JLabel(" Agama ");
    String[] namaAgama =
        {"Islam", "Katolik", "Kristen", "Budha", "Hindu"};
    JComboBox cmbAgm = new JComboBox(namaAgama);
    JLabel lhobby = new JLabel(" Hobi ");
    JCheckBox cbSeBol = new JCheckBox("Sepakbola ");
    JCheckBox cbBasket = new JCheckBox("Basket ");
    JButton btnSave = new JButton("Save");
  
    JLabel hnama = new JLabel();
    JLabel hJenkel = new JLabel();
    JLabel hagama = new JLabel();
    JLabel hHobi = new JLabel();
    
    public PrakPBO() {
    setTitle("BIODATA");
	setDefaultCloseOperation(3);
	setSize(350,220);
        setLocation(750,400);
        
	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagm);
	add(cmbAgm);
	add(lhobby);
	add(cbSeBol);
	add(cbBasket);
	add(btnSave);
        add(hnama);
        add(hJenkel);
        add(hagama);
        add(hHobi);
        
	
	lnama.setBounds(10,15,120,20);
	fnama.setBounds(130,15,150,20);
	ljeniskelamin.setBounds(10,39,120,20);
	rbPria.setBounds(125,39,100,20);
	rbWanita.setBounds(225,39,100,20);
	lagm.setBounds(10,62,150,20);
	cmbAgm.setBounds(130,62,150,20);
	lhobby.setBounds(10,85,120,20);
	cbSeBol.setBounds(125,85,100,20);
	cbBasket.setBounds(225,85,150,20);
	btnSave.setBounds(110,125,120,20);
    
    btnSave.addActionListener((ActionEvent e) -> {
    if(fnama.getText().length() == 0){
        JOptionPane.showMessageDialog(null, "Nama belum diisi!");
    } else{
        nama = fnama.getText();
        
            if(rbPria.isSelected()){
                jeniskelamin = rbPria.getText();
            } else if(rbWanita.isSelected()){
                jeniskelamin = rbWanita.getText();
            }
                agama = (String) cmbAgm.getSelectedItem();
        
            if(cbSeBol.isSelected()&&cbBasket.isSelected())
            {
                hobby = cbSeBol.getText() + " dan " +cbBasket.getText();
            } else if(cbSeBol.isSelected()){
                hobby = cbSeBol.getText();
            } else if(cbBasket.isSelected()){
                hobby = cbBasket.getText();
            }     
    save sv = new save(nama, jeniskelamin, agama, hobby);
    sv.setVisible(true);
    } dispose();
});
        setVisible(true);
   }


}
