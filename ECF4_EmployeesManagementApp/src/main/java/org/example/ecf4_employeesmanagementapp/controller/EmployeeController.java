package org.example.ecf4_employeesmanagementapp.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.ecf4_employeesmanagementapp.model.Employee;
import org.example.ecf4_employeesmanagementapp.service.EmployeeService;

import java.util.List;

@Path("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Inject EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GET
    @Path("/get")
    @Produces("application/json")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee postEmployee (Employee employee){
        return employeeService.save(
                employee.getId(),
                employee.getLastName(),
                employee.getFirstName(),
                employee.getWage(),
                employee.getDepartment(),
                employee.getJob());
    }



}
/*  //UPDATE
    @POST
    @Path("/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car updateCar(@PathParam("id") int id, @QueryParam("brand") String brand, @QueryParam("manufacturingYear") String manufacturingYear, @QueryParam("color") String color){
        for (Car car : FakeDB.cars) {
            if (car.getId() == id) {
                car.setBrand(brand);
                car.setManufacturingYear(manufacturingYear);
                car.setColor(color);
                return car;
            }
        }
        throw new NotFoundException("Car with ID " + id + " not found");
    }

    // DELETE BY INDEX
    @DELETE
    @Path("{id}")
    public int delete(@PathParam("id") int id){
        FakeDB.cars.remove(id-1);
        return id;
    }
}*/
