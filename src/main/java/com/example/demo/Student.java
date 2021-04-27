package com.example.demo;
import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="student_data")
@Table(name = "student_data",
        uniqueConstraints ={
        @UniqueConstraint(name ="student_unique_email",columnNames = "email")}
)

public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String name ;
    @Column(
            name = "section"
    )
    private Integer section ;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"

    )

    private String email;
    @Column(
            name = "dob",
            nullable = false,
            columnDefinition = "DATE"
    )


    private LocalDate dob;
    @Column(
            name = "dept",
            nullable = false,
            columnDefinition = "TEXT"

    )

    private String dept;


    public Student() {
    }

    public Student(String name, Integer section, String email, LocalDate dob, String dept) {

        this.name = name;
        this.section = section;
        this.email = email;
        this.dob = dob;
        this.dept = dept;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section=" + section +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", dept='" + dept + '\'' +
                '}';
    }
}

