package cl.praxis.escuelarural_jpa.model.services;

import cl.praxis.escuelarural_jpa.model.entities.Course;
import cl.praxis.escuelarural_jpa.model.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public boolean create(Course c) {
        Course course = repository.save(c);
        return course != null;
    }

    @Override
    @Transactional
    public boolean update(Course c) {
        return repository.save(c) != null;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        boolean exists = repository.existsById(id);
        if (exists) {
            repository.deleteById(id);
        }
        return exists;
    }
}
