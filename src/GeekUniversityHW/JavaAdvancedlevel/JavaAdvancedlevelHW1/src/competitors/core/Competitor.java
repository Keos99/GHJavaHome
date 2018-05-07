package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core;

public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
    String getName();
}
