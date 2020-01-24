package Controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aliali.AjoutIHM;
import aliali.Dao;

public class AjoutControl implements ActionListener {
AjoutIHM glob;
public AjoutControl(AjoutIHM oo) {
	glob= oo;}
	@Override
public void actionPerformed(ActionEvent e)
	     {
    Dao dao = new Dao();
    dao.ajouter(glob.nom.getText(), glob.prenom.getText(), glob.note.getText(),glob.moyenne.getText());
 	glob.lab1.setText("nam");//change label text
	     }

	
	
	
	
}
