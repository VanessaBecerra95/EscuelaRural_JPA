package cl.praxis.escuelarural_jpa.model.repository;

import cl.praxis.escuelarural_jpa.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}