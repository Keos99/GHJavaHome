package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core.Competitor;
import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles.core.Obstacle;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
