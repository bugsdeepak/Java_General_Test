package core;

public class Fake_Employee {
  
  private int empCode;
  private String empName;
  
  public int getEmpCode() {
    return empCode;
  }

  public String getEmpName() {
    return empName;
  }
  
  @Override
  public String toString() {
    return "Fake_Employee [empCode=" + empCode + ", empName=" + empName + "]";
  }

  Fake_Employee(int empCode, String empName) {
    this.empCode = empCode;
    this.empName = empName;
  }

/*  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empCode;
    result = prime * result + ((empName == null) ? 0 : empName.hashCode());
    return result;
  }*/

/*  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fake_Employee other = (Fake_Employee) obj;
    if (empCode != other.empCode)
      return false;
    if (empName == null) {
      if (other.empName != null)
        return false;
    } else if (!empName.equals(other.empName))
      return false;
    return true;
  }*/

}
