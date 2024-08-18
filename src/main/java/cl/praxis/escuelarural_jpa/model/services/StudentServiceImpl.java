package cl.praxis.escuelarural_jpa.model.services;

import cl.praxis.escuelarural_jpa.model.entities.Student;
import cl.praxis.escuelarural_jpa.model.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public boolean create(Student s) {
        Student student = repository.save(s);
        return student != null;
    }

    @Override
    @Transactional
    public boolean update(Student s) {
        return repository.save(s) != null;
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
