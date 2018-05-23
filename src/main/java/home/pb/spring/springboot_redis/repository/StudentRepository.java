package home.pb.spring.springboot_redis.repository;

import home.pb.spring.springboot_redis.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
