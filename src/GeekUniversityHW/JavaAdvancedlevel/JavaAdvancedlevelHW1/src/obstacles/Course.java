package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.Team;
import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles.core.Obstacle;

public class Course {

    Obstacle obstacle[] = {
            new Cross(700),
            new Wall(500),
            new Water(700)
    };

    public void doIt(Team team){
        for (int i = 0; i < team.competitors.length; i++) {
            for (int j = 0; j < obstacle.length; j++) {
                obstacle[j].doIt(team.competitors[i]);
            }
        }
    }
}
