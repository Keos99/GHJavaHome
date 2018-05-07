package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core.Competitor;
import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles.core.Obstacle;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}