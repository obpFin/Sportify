package sportify.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by admin on 04/01/17.
 */
@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    @ManyToOne
    private User user;
    private SportsEnum sport;
    int duration;

    public Workout(int id, LocalDate date, User user, SportsEnum sport, int duration) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.sport = sport;
        this.duration = duration;
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

    public SportsEnum getSport() {
        return sport;
    }

    public void setSport(SportsEnum sport) {
        this.sport = sport;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
