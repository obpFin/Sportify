package sportify.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by admin on 04/01/17.
 */
@Entity
public class Excercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    @ManyToOne
    private User user;
    private ExcercisesEnum excerEnum;
    int duration;

    public Excercise() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ExcercisesEnum getExcerEnum() {
        return excerEnum;
    }

    public void setSport(ExcercisesEnum sport) {
        this.excerEnum = excerEnum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
