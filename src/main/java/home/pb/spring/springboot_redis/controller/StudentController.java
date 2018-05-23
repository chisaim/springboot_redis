package home.pb.spring.springboot_redis.controller;

import home.pb.spring.springboot_redis.entity.Student;
import home.pb.spring.springboot_redis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/save")
    public Student save(Student student){
        return service.save(student);
    }

    @RequestMapping("/exists")
    public Student existsById(int id){
        System.out.println("StudentController.existsById-----id=" + id +",开始获取数据");
        return service.findOne(id);
    }

    @RequestMapping("/delete")
    public void deleteCacheById(int id){
        System.out.println("StudentController.deleteCacheById-----id=" + id +",开始清楚缓存");
        service.deleteCacheById(id);
    }

}
