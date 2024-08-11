package cl.praxis.escuelarural_jpa.model.services;

import cl.praxis.escuelarural_jpa.model.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    boolean create(Student s);
    boolean update(Student s);
    boolean delete(int id);
}
