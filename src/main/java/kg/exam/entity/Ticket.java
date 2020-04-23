package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="place_No")
    private Integer placeNo;
    @Column(name="price")
    private Integer price;
    @OneToMany
    @JoinColumn(name="film_id")
    private Film film;



}
