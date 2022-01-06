package info3.gestion_employee.controller;

import info3.gestion_employee.model.Employee;
import info3.gestion_employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @RestController
    @RequestMapping("/api/v1")
    public class EmployeeController {
        @Autowired
        private EmployeeRepository employeeRepository;

        @GetMapping("/Employee")
        public List<Employee> getAllEmployee() {
            return employeeRepository.findAll();
        }

        @GetMapping("/Employee/{id}")
        public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
                 {
            Employee employee = (employeeRepository.findById(employeeId)).get();

            return ResponseEntity.ok().body(employee);
        }

        @PostMapping("/Employee")
        public Employee createEmployee( @RequestBody Employee employee) {
            return employeeRepository.save(employee);
        }

        @PutMapping("/Employee/{id}")
        public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                       @RequestBody Employee employeeDetails) {

            Employee employee = (employeeRepository.findById(employeeId)).get();


            employee.setEmailId(employeeDetails.getEmailId());
            employee.setLastName(employeeDetails.getLastName());
            employee.setFirstName(employeeDetails.getFirstName());
            final Employee updatedEmployee = employeeRepository.save(employee);
            return ResponseEntity.ok(updatedEmployee);
        }

        @DeleteMapping("/Employee/{id}")
        public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
                {
            Employee employee = (employeeRepository.findById(employeeId)).get();


            employeeRepository.delete(employee);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
            return response;
        }
}
