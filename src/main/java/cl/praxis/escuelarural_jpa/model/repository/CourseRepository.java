package cl.praxis.escuelarural_jpa.model.repository;

import cl.praxis.escuelarural_jpa.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course,Integer> {
}
