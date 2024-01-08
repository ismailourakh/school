package com.ensa.microservicetransfer.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class Student {
    @Id
    private String student_id;
    private String name;


    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "cour_id")
    private cour cour;


    public Student() {
    }

    public strudent(String strudentId) {
        this.id = strudentId;
    }

    public String getStrudentId() {
        return id;
    }

    public void setStrudentId(String studentId) {
        this.id = studentId;
    }
}
