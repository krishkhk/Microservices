package com.securityOauth.model;

public class Employee {
	
	 private String empId;
	    private String empName;
	    
	    public Employee() {
	    	
	    }
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + "]";
		}
	    
		
		
	    

}
