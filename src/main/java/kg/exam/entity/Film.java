package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Film")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="age_IsGreater")
    private Boolean IsGreater;

}
