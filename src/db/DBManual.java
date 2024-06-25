package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManual {

	public static Connection conexao = null;

	public static Connection getConnection() {

		try {

			// Carregue o driver JDBC

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Defina as informações de conexão com o banco de dados

			String url = "jdbc:mysql://localhost:3306/jdbc";

			String usuario = "root";

			String senha = "mySql35678024";

			// Crie a conexão

			conexao = DriverManager.getConnection(url, usuario, senha);

		} catch (ClassNotFoundException e) {
			throw new DbException(e.getMessage());

		} catch (SQLException e) {
			throw new DbException(e.getMessage());

		} 
		return conexao;
	}
		
		public static void closeConection() {

			try {

				if (conexao != null) {

					conexao.close();

				}

			} catch (SQLException e) {
				throw new DbException(e.getMessage());

			}

		}
		
		public static void closeStatement(Statement st) {
			if(st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					throw new DbException(e.getMessage());
				}
			}
		}
		

}
