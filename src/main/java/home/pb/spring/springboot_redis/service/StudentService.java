package home.pb.spring.springboot_redis.service;

import home.pb.spring.springboot_redis.entity.Student;
import home.pb.spring.springboot_redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;


    @Transactional
    public Student save(Student student){
        student.setRegisterTime(new Date());
        return repository.save(student);
    }

    @Cacheable("student")
    public Student findOne(int id){
        System.out.println("（未使用缓存）-->existsById,Id=" + id);
        return repository.findOne(id);
    }

    @CacheEvict("student")
    public void deleteCacheById(int id){
        System.out.println("删除缓存，但不删除数据库。");
//        repository.deleteById(id);
    }

}
