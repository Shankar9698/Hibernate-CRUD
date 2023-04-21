package org.example;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student_Table")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "First_Name",nullable = false)
    String fName;
    @Column(name = "Last_Name",nullable = false)
    String lName;
    @Column(name = "Student_EmailId")
    String email;
    @Column(name = "School_Name")
    String schoolName;
    @Column(name = "Student_Address")
    String address;
}
