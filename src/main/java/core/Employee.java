package main.java.core;

public class Employee {
  
  private int empCode;
  private String empName;
  
  public int getEmpCode() {
    return empCode;
  }

  public String getEmpName() {
    return empName;
  }
  
  Employee(int empCode, String empName) {
    this.empCode = empCode;
    this.empName = empName;
  }
  
  public boolean equals(Object obj) {
    if(!(obj instanceof Employee)){
      return false;
    }
    
    Employee newEmp = (Employee)obj;
    if(newEmp.getEmpCode() == empCode && empName.equals(newEmp.getEmpName())) {
      return true;
    } else {
      return false;
    }
  }
  
  public int hascode() {
    return empCode;
  }
}
