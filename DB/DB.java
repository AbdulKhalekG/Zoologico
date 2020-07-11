package DB;

import java.sql.Statement;

import java.sql.Connection; 
import 	java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import 	java.sql.SQLException;

public class DB {

	//Atributos
	private static DB DB = new DB();
	static Connection conn;
	static Statement stmt;
	static PreparedStatement pstmt;
	static ResultSet rs;
	
	private String driverDB = "org.postgresql.Driver";
	private String dbUser = "postgres";
	private String dbName = "ZOOLOGICO";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String passwordDB = "equisde";
	
	private String animalesDB = "tabla";
	
	private int idanimalDB = 0;
	private String NombreDB = "nombre";
	private int edadDB = 0;
	private int alturaDB = 0;
	private String generoDB = "genero";
	private String comportamientoDB = "comportamiento";
	
	
	//parte 2
		private DB() {
			try {
				Class.forName(driverDB);
				this.conn = DriverManager.getConnection(urlDB, dbUser, passwordDB);
				System.out.println("Conexion establecida");
				
				} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				} 
			
		}
		
		//parte 3
		public static DB getInstances() {
			return DB;
			} 
		
		//parte 4
		public ResultSet dbid(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("id")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbnombre(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("nombre")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbedad(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("edad")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbaltura(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("altura")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbgenero(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("genero")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbcomportamiento(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("comportamiento")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			}
              
		}