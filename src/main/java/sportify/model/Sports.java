package sportify.model;

/**
 * Created by admin on 04/01/17.
 */
public enum Sports {

    GYM(10),
    JOGGING(5),
    TEAM_SPORTS(7),
    TENNIS(7),
    YOGA(3),
    BADMINTON(6),
    GOLF(3);

    private final int points;

    Sports(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
