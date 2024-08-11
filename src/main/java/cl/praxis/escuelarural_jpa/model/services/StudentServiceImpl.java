package cl.praxis.escuelarural_jpa.model.services;

import cl.praxis.escuelarural_jpa.model.entities.Student;
import cl.praxis.escuelarural_jpa.model.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Student s) {
        Student student = repository.save(s);
        return student != null;
    }

    @Override
    public boolean update(Student s) {
        return repository.save(s) != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exists = repository.existsById(id);
        if (exists){
            repository.deleteById(id);
        }
        return exists;
    }
}
