package aliali;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controle implements ActionListener{
Ihm ihm;

public void actionPerformed(ActionEvent e) {
Dao vv = new Dao();
if("correct".equals(vv.login(ihm.login.getText(), ihm.pw.getText()))) {
AjoutIHM aiohm = new AjoutIHM();

	System.out.println("ok");
}
else System.out.println("no");
}

public Controle(Ihm ss) {
ihm = ss;
}
}