package com.db;

	
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
    import java.sql.ResultSetMetaData;


	public class CreateTable {
		ResultSet rs=null;
		int id,j=0;
		String query,cn,status,rn;
		String row=" ";
		//ArrayList<String> data=new ArrayList<String>();
		
		// Connecting DB using constructor
		public CreateTable(Bean B) {
			
			ConnectDB objConnectDB=new ConnectDB();
			B.setConnection(objConnectDB.getConnection());
			
		}
		
		//  Fetch Employee details by ID
		public String IndEmployee(Bean B) {
			
	
		try {
		
			query="select * from employee where id=?";
				
		    PreparedStatement pst =B.getConnection().prepareStatement(query);
			

			id=Integer.parseInt(B.getId());
			pst.setInt(1,id);
			rs=pst.executeQuery();
		
			 ResultSetMetaData metadata = rs.getMetaData();
			 int columnCount = metadata.getColumnCount();
			 
			 // Loop to Print Data
			 while (rs.next()) {
			  for (int i = 1; i <= columnCount; i++) {
			   String m=metadata.getColumnName(i);
			   String d=rs.getString(i);
			      row+=(m + " : "+d+", ");
			      
			    }
			 }

		
			
			System.out.println("Finished");		
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return row;

	}
		
		// Fetch all employee details
		
		public String AllEmployee(Bean B) {
			//public ArrayList<String> AllEmployee(Bean B) {
			try {
				
				query="select * from (select * from employee union all select * from weekendshiftemployees) a";
				
				PreparedStatement pst =B.getConnection().prepareStatement(query);

				rs=pst.executeQuery();
			
				 ResultSetMetaData metadata = rs.getMetaData();
				 int columnCount = metadata.getColumnCount();
				 
				 // Loop to Print Data
				 while (rs.next()) {
				  for (int i = 1; i <= columnCount; i++) {
				   String m=metadata.getColumnName(i);
				   String d=rs.getString(i);
				      row+=(m + " : "+d+", ");
				      
				    }
				 // data.add(row);
				  
		           }
	        System.out.println("Finished");		
				
			} catch (Exception e) {
				e.printStackTrace();
		    }
			return row;
		}
		
		
		// Fetch vehicle by empID
		public String getEmployeeVehicle(Bean B) {
			
	try {
			
				query="select f.vehicleregno,f.vehiclecompname from((select id from employee union all select id from weekendshiftemployees) as e inner join empvehicles v on e.id=v.employeeid) as f where f.id=? ";
					
				PreparedStatement pst =B.getConnection().prepareStatement(query);
				

				id=Integer.parseInt(B.getId());
				pst.setInt(1,id);
				rs=pst.executeQuery();
			
				 ResultSetMetaData metadata = rs.getMetaData();
				 int columnCount = metadata.getColumnCount();
				 
				 // Loop to Print Data
				 while (rs.next()) {
				  for (int i = 1; i <= columnCount; i++) {
				   String m=metadata.getColumnName(i);
				   String d=rs.getString(i);
				      row+=(m + " : "+d+", ");
				      
				    }
				 }

			
				
				System.out.println("Finished");		
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			return row;

		}
		
		// Add Vehicle to employee by id
		
		public String AddVehicle(Bean B) {
			try {
				
				query="insert into empvehicles(vehicleregno,vehiclecompname,employeeid) values(?,?,?)";
					
				PreparedStatement pst =B.getConnection().prepareStatement(query);
				
				rn=B.getRn();
				cn=B.getCn();

				id=Integer.parseInt(B.getId());
				pst.setString(1,rn);
				pst.setString(2, cn);
				pst.setInt(3,id);
				int r=pst.executeUpdate();
	if(r==1) {
		status="Updated";
	}
	else {
		status="Failed";
	}
			System.out.println("Finished");		
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			return status;

		}
		public String DeleteEmployee(Bean B) {
try {
				
				query="delete from employee where employee.id=?";
					
				PreparedStatement pst =B.getConnection().prepareStatement(query);
				
				id=Integer.parseInt(B.getId());

				
				pst.setInt(1,id);
			
				int r=pst.executeUpdate();
	if(r==1) {
		status="Deleted";
	}
	else {
		status="Failed";
	}
			System.out.println("Finished");		
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			return status;

		}
		public String DeleteVehicle(Bean B) {
			try {
							
							query="delete from empvehicles v where v.employeeid=?";
								
							PreparedStatement pst =B.getConnection().prepareStatement(query);
							
							id=Integer.parseInt(B.getId());

							
							pst.setInt(1,id);
						
							int r=pst.executeUpdate();
				if(r==1) {
					status="Vehicle removed";
				}
				else {
					status="Failed";
				}
						System.out.println("Finished");		
							
						} catch (Exception e) {
							e.printStackTrace();
							
						}
						return status;

					}
		}
		
	


