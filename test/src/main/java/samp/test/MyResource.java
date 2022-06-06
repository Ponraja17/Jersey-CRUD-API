
package samp.test;



import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.db.Bean;
import com.db.CreateTable;



@Path("/myresource")
public class MyResource {
	 Bean B=new Bean();
	 CreateTable C=new CreateTable(B);
	
	// Individual Employee detail by id
	 @GET
     public String getEmployee(@QueryParam("id") String id) {		 
	       
	    	B.setId(id);
	    	
	    	return C.IndEmployee(B);
	 }
	
	 @GET
	@Path("all")
	 @Produces(MediaType.APPLICATION_JSON)
	    public String getAllEmployee() {
		 //spublic ArrayList<String> getAllEmployee() {
	 
	    return C.AllEmployee(B);
	 }
	 
	    @GET
		 @Path("EmpVehi")
	     public String getEmployeeVehicle(@QueryParam("id") String id) {		 
		       
		    	B.setId(id);
		    	
		    	return C.getEmployeeVehicle(B);
		 }
	    
	    @DELETE

	    public String DeleteEmp() {
	    	System.out.println("R");
			return "DID";
	    	
	    }
	    
	    
	    @POST
	    @Path("AddEmployee")
	     public String produceJSON( 
	    		@FormParam("id") String id,
	    		@FormParam("EmpName") String EmpName,
	    		@FormParam("department") String department,
	    		@FormParam("salary") String salary,
	    		@FormParam("age") String age) {
	 B.setId(id);
	 B.setEmpName(EmpName);
	 B.setDepartment(department);
	 B.setSalary(salary);
	 B.setAge(age);
	       
	 
	        return B.Informat();
	 
	    }
	    
	    
	    @POST
	    @Path("AddVehicle")
	    public String AddVehicle(
	    		@FormParam("rn")String rn,
	    		@FormParam ("cn") String cn,
	    		@FormParam("id")String id) {
	    	B.setRn(rn);
	    	B.setCn(cn);
	    	B.setId(id);
			return C.AddVehicle(B);
	    	
	    }
	
    @POST
    @Path("DeleteEmployee/{id}")
    public String DeleteEmployee(@PathParam("id")String id) {
   B.setId(id);
    return C.DeleteEmployee(B);
    	 }
	    
    @POST
    @Path("DeleteVehicle")
    public String DeleteVehicle(@FormParam("id")String id) {
   B.setId(id);
    return C.DeleteVehicle(B);
    	 }
	    
    
}
