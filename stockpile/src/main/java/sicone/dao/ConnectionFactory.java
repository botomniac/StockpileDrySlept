package sicone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {

	private static final String DRIVER = "";
	private static final String URL = "";
	private static final String USER = "";
	private static final String PASSWORD = "";

	/**
	 * metodo responsavel por criar conexao com o banco.
	 * 
	 * @return
	 */
	public Connection createConnection() {
		Connection connection = null;

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			System.out.println("Erro ao criar conexão com o banco de dados: " + URL);
			e.printStackTrace();
		}

		return connection;
	}

	public void closeConnection(Connection connection, PreparedStatement pstmt, ResultSet rs) {

		try {
			if (connection != null) {
				connection.close();
			}

			if (pstmt != null) {
				pstmt.close();
			}

			if (rs != null) {
				rs.close();
			}

		} catch (Exception e) {
			System.out.println("Erro ao fechar conexão com o banco de dados: " + URL);
			e.printStackTrace();
		}
	}
}
