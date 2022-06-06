package com.db;

	import java.sql.Connection;
	import java.sql.DriverManager;


	public class ConnectDB {
		
		public Connection getConnection() {
			String host="localhost";
			String port="5432";
			String DBname="excersise";
			String Username="postgres";
			String Password="Rajasalvatore29@";
			
			Connection connection=null;
			
			try {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection
						("jdbc:postgresql://"+host+":"+port+"/"+DBname+"",""+Username+"",""+Password+"");
				if(connection!=null) {
					System.out.println("Connected");
				}
				else {
					System.out.println("Not connected");
				}
				
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return connection;
		}

	}
