package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCHelloWorld {

	public static void query() {

		try {

			// QUERY
			// Carichiamo un driver di tipo 1 (bridge jdbc-odbc)
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);

			// Creiamo la stringa di connessione
			String url = "jdbc:mysql://localhost:3306/provadb";

			// Otteniamo una connessione con username e password
			Connection con = DriverManager.getConnection(url, "root", "paganoant");

			// Creiamo un oggetto Statement per poter interrogare il db
			Statement cmd = con.createStatement();

			// Eseguiamo una query e immagazziniamone i risu3ltati
			// in un oggetto ResultSet
			String qry = "SELECT * FROM attori";
			ResultSet res = cmd.executeQuery(qry);

			// Stampiamone i risultati riga per riga
			while (res.next()) {
				System.out.println("--------------------");
				System.out.println("codice attore:" + res.getInt("CODATTORE"));
				System.out.println("nome:" + res.getString("NOME"));

			}

			// UPDATE
			// update("PROVA33", 4);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update(String nome, int codAttore) throws SQLException {
		Connection dbConnection = null;
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE attori SET NOME = ? " + " WHERE CODATTORE = ?";

		try {
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);

			// Creiamo la stringa di connessione
			String url = "jdbc:mysql://localhost:3306/provadb";

			// Otteniamo una connessione con username e password
			dbConnection = DriverManager.getConnection(url, "root", "paganoant");

			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, nome);
			preparedStatement.setInt(2, codAttore);

			// execute update SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is updated to DBUSER table!");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	
}
