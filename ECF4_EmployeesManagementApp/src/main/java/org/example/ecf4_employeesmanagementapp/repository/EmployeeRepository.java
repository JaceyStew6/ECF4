package org.example.ecf4_employeesmanagementapp.repository;

import jakarta.ws.rs.NotFoundException;
import org.example.ecf4_employeesmanagementapp.model.Employee;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepository extends BaseRepository<Employee> {

    public EmployeeRepository(){
        super();
    }

    @Override
    public Employee add(Employee entity) {
        Transaction transaction= null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        try {
            session = sessionFactory.openSession();
            employee = session.get(Employee.class, id);
            if (employee == null){
                throw new NotFoundException("Patient not found");
            }
            employee.getJob();
            employee.getWage();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employee;
    }

    @Override
    public Employee update(Employee entity) {
        Transaction transaction = null;

        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public boolean delete(Employee entity) {
        Transaction transaction = null;
        boolean result = false;
        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
            result = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }

    public List<Employee> findAllEmployees(){
        List<Employee> employees = null;
        try {
            session = sessionFactory.openSession();
            employees = session.createQuery("from Employee").list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return employees;
    }
}
