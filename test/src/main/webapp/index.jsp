<html>
<head>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js">
      </script>
      </head>
<body>
<h3>Jersey DB</h3>
<h4>Fetch Individual Employee details by Id</h4>
<form action="rest/myresource" method="GET">
Employee Id : <input type="text" name="id">
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>



 <h4>Fetch All the Employee details</h4>
<a href="rest/myresource/all">click to get all employee details</a>


<h4>Employee id to check vehicles details</h4>
<form action="rest/myresource/EmpVehi" method="GET">
Employee Id : <input type="text" name="id">
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>

<!-- <h2>Remove Employee by Id</h2>
<form action="rest/myresource/delete" method="DELETE">
Employee Id : <input type="text" name="id">
<input type="submit" value="Delete"><input type="reset" value="Reset">
</form> -->

<h4>Enter details to add vehicle</h4>
<form action="rest/myresource/AddVehicle" method="POST">
Employee Id : <input type="text" name="id"></br>
Vehicle Reg No : <input type="text" name="rn"></br>
Vehicle Comp Name: <input type="text" name="cn"></br>
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>


<h4>Add employee in json format</h4>
<form action="rest/myresource/AddEmployee" method="POST">
Employee Id : <input type="text" name="id"></br>
Employee Name : <input type="text" name="EmpName"></br>
Department : <input type="text" name="department"></br>
Salary : <input type="text" name="salary"></br>
Age : <input type="text" name="age"></br>
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>

<h4>Delete Employee by Employee Id</h4>
<!-- <form>
<input type ="text" value="submit">
<button onclick="makeDELETErequest()">
        Delete    </button>
           
        </form> -->
        <form action="rest/myresource/DeleteEmployee" method="POST">
Employee Id : <input type="text" name="id">
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>
 

<h4>To Delete an Employee Vehicle</h4>
<form action="rest/myresource/DeleteVehicle" method="POST">
Employee Id : <input type="text" name="id">
<input type="submit" value="Submit"><input type="reset" value="Reset">
</form>


    
  

</body>
    <script>
    
   
 function makeDELETErequest() {
        $.ajax({
            url: 'rest/myresource/DeleteEmployee',
            type: 'DELETE'
        });
    }
 
</script>
</html>
