package aliali;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Connection cnx;
	Statement st;
	ResultSet rs;

	public Dao() {
		String chaine= "jdbc:mysql://localhost:3306/gestionetudiant";
        // la criation du lien/ bridge/ pilot / driver/ entre base de donnes SQL et code java
try {
Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Chargement avec succès");
} catch (ClassNotFoundException e1) {
                    System.out.println("Problème driver");
e1.printStackTrace();
}
        //  parametres de cnx mot de pass adresse 
try {
cnx = DriverManager.getConnection(chaine,"root",null);//cnx objet
                     System.out.println("Cnx avec succès");
} catch (SQLException e1) {
                     System.out.println("pb de cnx");
e1.printStackTrace();
		}
	}

	public String login(String a, String pw) {
		String requete = "select * from user where login ='" + a + "'";
		try {
			st = cnx.createStatement();
			rs = st.executeQuery(requete);

			if (rs.next()) {
				if (pw.equals(rs.getString(2)))
					return "correct";
				else
					return "hello";
			} else
				return "hello";
		} catch (SQLException e) {

			e.printStackTrace();
			return "hello";

		}

	}
	public String ajouter(String nom, String prenom, String note, String notemoy) {
		String com = "insert into etudiant (nom,prenom,note,notemoyenne) values ('"+nom+"','"+prenom+"',"+Double.parseDouble(note)+","+Double.parseDouble(notemoy)+")";
		try {
			st = cnx.createStatement();
		//	rs = st.executeQuery(requete);
		int i = 	st.executeUpdate(com);
		System.out.println("Qdded ..." + i );
			
		} catch (SQLException e) {

			e.printStackTrace();
			return "hello";

		}
		return com;}
	
	
}