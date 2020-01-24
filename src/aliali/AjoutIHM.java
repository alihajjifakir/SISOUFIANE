package aliali;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controles.AjoutControl;

public class AjoutIHM extends JFrame {
	JButton annuler ;
	JButton ok1,ok2,ok3,ok4 ;
	public JLabel lab1;
	       JLabel lab2 ;
	       JLabel lab3;
	       JLabel lab4 ;
	public JLabel p;
	public JTextField nom ;
	public JTextField prenom ;
	public JTextField note ;
	public JTextField moyenne ;
	
	
	public AjoutIHM() {
		 
	getContentPane().setLayout(null);
	ok1 = new JButton("AJOUTE"); // le seule button actif ds cette frame d apres la commande d eclarer dernnier ligne ok1.addActionListener(new AjoutControl(this));
	ok2 = new JButton("MODIFE");
	ok3 = new JButton("SUPRIMER");
	ok4 = new JButton("ARRETER");
	annuler = new JButton("Annuler");
	lab1 = new JLabel("NAME");//
	lab2 = new JLabel("LAST Name");
	lab3 = new JLabel("note");
	lab4 = new JLabel("note moy");
	p=new JLabel();
	ImageIcon s= new ImageIcon("C:\\Users\\ALI\\Pictures\\vlcsnap-2020-01-12-01h25m50s870.png");
	p.setIcon(s);
	nom = new JTextField();//  JTextField   muni ???d une methode d entrer qui permet de scanner des string????????
	prenom = new JTextField();
	note = new JTextField();
	moyenne = new JTextField();
	                                 // GESTIONS DE DIMENTIONS  setBounds 
	p.setBounds(00,0000,1000,1000);
	ok1.setBounds(10, 320, 110, 30);
	ok2.setBounds(130, 320, 110, 30);
	ok3.setBounds(260, 320, 110, 30);
	ok4.setBounds(390, 320, 110, 30);
	
	annuler.setBounds(400,360, 80, 60);   //pr le buttou ok
	lab1.setBounds(30, 30, 100, 30);
	lab2.setBounds(30, 90, 100, 30);
	lab3.setBounds(30, 130, 100, 30);
	lab4.setBounds(30, 190, 100, 30);
	
	nom.setBounds(130, 30, 100, 30);// pour les champs d ecriture a remplir question sur la classe JTextField
	prenom.setBounds(130, 90, 100, 30);// est ce jtexte field permis d enregestre a partir du clavier??
	note.setBounds(130, 130, 100, 30);// est ce que cette enregestrement localise ds les objet nom prenom note meyenne
	moyenne.setBounds(130, 190, 100, 30);//
	                                 // 13 taches
	getContentPane().add(lab1);
	getContentPane().add(nom);
	getContentPane().add(lab2);
	getContentPane().add(prenom);
	getContentPane().add(lab3);
	getContentPane().add(note);
	getContentPane().add(lab4);
	getContentPane().add(moyenne);
	getContentPane().add(ok1);
	getContentPane().add(ok2);
    getContentPane().add(ok3);
    getContentPane().add(ok4);
    getContentPane().add(annuler);
    getContentPane().add(p);
	ok1.addActionListener(new AjoutControl(this));
	// pour activer les autres buttons il suffit de les declarer comme ok1.addActionListener(new AjoutControl(this))
	//ou ActionListener est........... et AjoutControl est une class deja declare ds un autre fchie et le mot this
	// et le mots this --> = l objet ?????
	setBounds(100, 100, 6000, 6000);
	setVisible(true);
      }
}
