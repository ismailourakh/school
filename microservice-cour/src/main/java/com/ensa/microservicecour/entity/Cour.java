package com.school.microservicecour.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cour {

    @Id
    private String courId;

    private String name;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private student student;

}
public Cour() {
}

public strudent(String CourId) {
    this.courId = CourId;
}

public String getCourId() {
    return courid;
}

public void setCourId(String courId) {
    this.id = courId;
}
}

