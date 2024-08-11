package cl.praxis.escuelarural_jpa.controllers;

import cl.praxis.escuelarural_jpa.model.entities.Course;
import cl.praxis.escuelarural_jpa.model.entities.Student;
import cl.praxis.escuelarural_jpa.model.services.CourseService;
import cl.praxis.escuelarural_jpa.model.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;
    private final CourseService courseService;

    public StudentController(StudentService service, CourseService courseService) {
        this.service = service;
        this.courseService = courseService;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("students", service.findAll());
        return "studentList";
    }

    @GetMapping("/{id}")
    public String findByID(@PathVariable("id") int id, Model model){
        model.addAttribute("student", service.findById(id));
        model.addAttribute("courses", courseService.findAll());
        return "editStudent";
    }

    @PostMapping
    public String updateStudent(@ModelAttribute Student student, @RequestParam("courseId") int courseId) {
        Course course = courseService.findById(courseId);
        student.setCourse(course);
        service.update(student);
        return "redirect:/students";
    }

    @GetMapping("/new")
    public String toCreate(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.findAll());
        return "newStudent";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Student student, @RequestParam("courseId") int courseId){
        Course course = courseService.findById(courseId);
        student.setCourse(course);
        boolean result = service.create(student);
        return "redirect:/students";
    }

    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id) {
        boolean result = service.delete(id);
        return "redirect:/students";
    }
}