package cl.praxis.escuelarural_jpa.model.services;

import cl.praxis.escuelarural_jpa.model.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(int id);
    boolean create(Course c);
    boolean update(Course c);
    boolean delete(int id);
}
