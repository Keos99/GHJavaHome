package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.FirstTask;

public class Letters {
    private String valueSet = "Aa";
    private final String VALUESETA = "Aa";
    private final String VALUESETB = "Bb";
    private final String VALUESETC = "Cc";
    private int a = 1;
    private int b = 1;
    private int c = 1;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    synchronized void A() {
        while (a < 6){
            if (valueSet.equals(VALUESETB) || valueSet.equals(VALUESETC))
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if (valueSet.equals(VALUESETA)) {
                System.out.print("A");
                valueSet = VALUESETB;
                a++;
                notifyAll();
            }
        }
    }

    synchronized void B() {
        while (b < 6){
            if (valueSet.equals(VALUESETA) || valueSet.equals(VALUESETC))
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if (valueSet.equals(VALUESETB)) {
                System.out.print("B");
                valueSet = VALUESETC;
                b++;
                notifyAll();
            }
        }
    }

    synchronized void C() {
        while (c < 6){
            if (valueSet.equals(VALUESETA) || valueSet.equals(VALUESETB))
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if (valueSet.equals(VALUESETC)) {
                System.out.print("C");
                valueSet = VALUESETA;
                c++;
                notifyAll();
            }
        }
    }
}
