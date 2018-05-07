package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW1.src.competitors.core;

public abstract class Animal implements Competitor {
    private String type;
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean onDistance;
    private boolean canSwim;
    private int rundistance;
    private int jumpheight;
    private int swimdistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, boolean onDistance, boolean canSwim) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = onDistance;
        this.canSwim = canSwim;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        rundistance = distance;
        if (distance <= maxRunDistance){
            System.out.println(type + " " + name + " успешно справился с бегом");
        } else {
            System.out.println(type + " " + name + " не прошел дистанцию по бегу");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (!canSwim){
            System.out.println(type + " " + name + " не умеет плавать!");
            System.out.println();
            return;
        }
        swimdistance = distance;
        if (distance <= maxSwimDistance){
            System.out.println(type + " " + name + " успешно проплыл дистанцию!");
            System.out.println();
        } else {
            System.out.println(type + " " + name + " не справился с плаванием");
            System.out.println();
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        jumpheight = height;
        if (height <= maxJumpHeight){
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(type + " " + name + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        if (onDistance){
            System.out.println(type + " " + name + ":");
            System.out.println("Бег:");
            System.out.println("\tможет пробежать: " + maxRunDistance + "\n\tпробежал: " + rundistance);
            System.out.println("Плавание:");
            System.out.println("\tможет проплыть: " + maxSwimDistance + "\n\tпереплыл: " + swimdistance);
            System.out.println("Прыжки");
            System.out.println("\tможет перепрыгнуть: " + maxJumpHeight + "\n\tперепрыгнул: " + jumpheight);
            System.out.println(type + " " + name + " прошел дистанцию: " + onDistance);
            System.out.println();
        } else {
            System.out.println(name + " Не прошел дистанцию");
            System.out.println();
        }
    }
}
