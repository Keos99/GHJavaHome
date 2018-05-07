package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors;

import GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core.Competitor;

public class Team {
    private String teamname;
    public Competitor competitors[] = new Competitor[4];
    Cat cat;
    Dog dog;
    HumanFirst humanFirst;
    HumanSecond humanSecond;

    public Team(String teamname,String catname,String dogname,String humanfirstname,String humansecondname) {
        this.teamname = teamname;
        cat = new Cat(catname);
        dog = new Dog(dogname);
        humanFirst = new HumanFirst(humanfirstname);
        humanSecond = new HumanSecond(humansecondname);
        competitors[0] = cat;
        competitors[1] = dog;
        competitors[2] = humanFirst;
        competitors[3] = humanSecond;
    }

    Competitor getCompetitors(int competitornumber){
      return competitors[competitornumber];
    }

    public void showTeamResult(){
        for (int i = 0; i < competitors.length; i++) {
            competitors[i].showResult();
        }
    }

    public void showTeam(){
        System.out.println("В соревновании учавствует комманда: " + teamname + "!");
        System.out.println("\tУчастники комманды:");
        for (int i = 0; i < competitors.length; i++) {
            System.out.println("\t\t" + competitors[i].getName());
        }
        System.out.println();
    }

    public void showOnDistanceTeam(){
        System.out.println("Прошел/ не прошел соревнования");
        for (int i = 0; i < competitors.length; i++) {
            System.out.println(competitors[i].getName() + " статус: " + competitors[i].isOnDistance());
        }
    }

    public void showWhoOnDistance(){
        System.out.println("Прошли дистанцию:");
        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i].isOnDistance()){
                System.out.println(competitors[i].getName() + "прошел дистанцию!!! Поздравляем!!!");
            }
        }
    }

    public void showResultTeam(){
        for (int i = 0; i < competitors.length; i++) {
            competitors[i].showResult();
        }
    }
}
