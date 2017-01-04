package sportify.model;

import java.time.LocalDate;

/**
 * Created by admin on 04/01/17.
 */
public class Workout {

    private int id;
    private LocalDate date;
    private String userName;
    private Sports sport;
    int duration;

    public Workout(int id, LocalDate date, String userName, Sports sport, int duration) {
        this.id = id;
        this.date = date;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Sports getSport() {
        return sport;
    }

    public void setSport(Sports sport) {
        this.sport = sport;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
