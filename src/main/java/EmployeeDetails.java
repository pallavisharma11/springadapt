import java.util.*;
public class EmployeeDetails {
	
	 
    private List<Employee> EmployeesList = new ArrayList<Employee>();
 
    
//    public String getName() { return name; }
// 
//    
//    public void setName(String name) { this.name = name; }
// 
    
    public List<?> getEmployeesList() {
		return EmployeesList;
	}


	public void setEmployeesList(List<?> employeesList) {
		EmployeesList = (List<Employee>) employeesList;
	}


	public String toString() { return "hello"; }

}
