package comgipoong.jpa03.client;

import comgipoong.jpa03.domain.Employee;
import comgipoong.jpa03.repository.EmployeeDAO;

import java.util.List;

public class RelationMappingClientByJDBC {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employeeList = employeeDAO.getEmployeeList();

        for(Employee employee : employeeList) {
            System.out.println(employee.getName() + "직원의 부서명 : " +
            employee.getDept().getName());
        }
    }
}
