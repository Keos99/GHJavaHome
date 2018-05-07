package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.Team;
import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.obstacles.Course;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Лига диванных аналитиков","Шредингер зе Кет","Барбос XIV","Генрих V","Владимир Владимирович Спайдермен");
        Course course = new Course();

        team.showTeam();
        course.doIt(team);
       // team.showTeamResult();
       // team.showOnDistanceTeam();
       // team.showWhoOnDistance();
        team.showResultTeam();

    }
}
