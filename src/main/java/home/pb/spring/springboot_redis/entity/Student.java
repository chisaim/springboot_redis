package home.pb.spring.springboot_redis.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Student implements Serializable{

    private static final long serialVersionUID = -4229061249368211959L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int gender;

    private Date registerTime;//入学时间



}
