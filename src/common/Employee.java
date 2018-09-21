package common;

public class Employee implements Comparable<Employee> {
    
    private int empID;
    
    private String empName = null;
    
    public Employee(int empId, String empName) {
        this.empID = empId;
        this.empName = empName;
    }
    
    public Employee() {
        
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int compareTo(Employee another) {
        
        return (this.empID < another.empID ? -1 : 
            (this.empID == another.empID ? 0 : 1));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + empID;
        result = PRIME * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Employee other = (Employee) obj;
        if (empID != other.empID)
            return false;
        if (empName == null) {
            if (other.empName != null)
                return false;
        } else if (!empName.equals(other.empName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("ID = ");
        str.append(empID);
        str.append(" Name = ");
        str.append(empName);
        return str.toString();
    }
    
}
