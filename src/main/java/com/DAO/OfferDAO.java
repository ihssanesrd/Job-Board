package com.DAO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OfferDAO {

private java.sql.Connection connection;
	
	public OfferDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver O.K.");
			
			String url ="jdbc:mysql://localhost:3306/miniprojet";
			String user = "root";
			String passwd = "";
		
			java.sql.Connection con = DriverManager.getConnection(url,user,passwd);
			this.connection = con;
			System.out.println("Connexion effective !");			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("the connection failed");
			
		}
	}

	public void select() {
		String sql = "SELECT * FROM offer";
		try {
			Statement smt = this.connection.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("FONCTION") + " " + 
						rs.getString("VILLE") + " " + rs.getString("EXPERIENCE") + " " + rs.getString("NIVEAU_ETUDE") + " " + rs.getString("TYPE_CONTRAT")+ " " + rs.getString("SOFT_SKILLS")+ " " + rs.getString("TYPE_JOB")+ " " + rs.getString("COMPETANCE"));
			}
			/*Statement smtselect = this.connection.createStatement();
			String SQL = "SELECT * FROM livre";
			ResultSet rs = smtselect.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getString("Nom")+" "+rs.getString("Auteur")+" "+rs.getLong("ISBN")+rs.getInt("En_Stock")+rs.getDouble("Prix"));
			}
			rs.close();
			smtselect.close();
			this.connection.close();*/
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("the selection failed");
			
		}
	}

}


/*
 //3-Interrogation de la BD
			Statement smt=con.createStatement();
			     //Execution de SELECT
			String sql="SELECT * from livre";
			ResultSet rs= smt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("Nom")+" "+rs.getString("Auteur")+" "+rs.getLong("ISBN")+rs.getInt("En_Stock")+rs.getDouble("Prix"));
			}
 */
/*
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver O.K.");
			
			   //2-Connection à la BD
			String protocole="jdbc:mysql:";
			String ip="localhost";
			String port="3306";
			String NomBase="exercice2";
			
			String url=protocole+"//"+ip+":"+port+"/"+NomBase;
			String user="root";
			String password="";
			
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection effective !");
			
			public void insert(Livre L) {
				try {
					String sqlInsert = "INSERT INTO francophone VALUES ('" + L.getName() + "','" + L.getAuthor() + "','" + L.getISBN() + "','" + L.getNbr_stock() + "','" + L.getPrice() + "')";
					Statement smtinsert = this.connection.createStatement();
					smtinsert.executeUpdate(sqlInsert);
					System.out.println("the insertion succeded");
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("the insertion failed");
				}
			}
			
			
			
				//Execution de Insert
			/*String SQL="INSERT INTO livre (Nom,Auteur,ISBN,En_Stock,Prix) VALUES ('"+		
					 title+"','"+E1.getPrenom()+"','"+E1.getFiliere()
					 +"')";
			int rs2=smt.executeUpdate(SQL); 
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
*/