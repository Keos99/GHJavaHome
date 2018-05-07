package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core.Competitor;
import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles.core.Obstacle;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
