package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.ThirdTask;

public class MFU{
    Object object1 = new Object();
    Object object2 = new Object();


    public void scan (){
        synchronized (object1){
            System.out.flush();
            System.out.println("Отсканированно");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print (){
        synchronized (object2){
            System.out.flush();
            System.out.println("Отпечатано....1,2,3 страницы....");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
