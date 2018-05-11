package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW5.src;

public class MyThreads extends Thread {
    private static final int SIZE;
    private static final int H;

    static {
        SIZE = 10_000_000;
        H = SIZE/2;
    }

    public void method1(){
        float[] array = new float[SIZE];
        long starttime = System.currentTimeMillis();
        //System.out.println(starttime);

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        //System.out.println(System.currentTimeMillis());
        //long finishtimearrayinit = System.currentTimeMillis() - starttime;
        //System.out.println(finishtimearrayinit);

        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        //System.out.println(System.currentTimeMillis());
        //showArray(array, "array");
        long finishmatharray = System.currentTimeMillis() - starttime;
        System.out.println("Время расчета метода Method1: " + finishmatharray);
        System.out.println();


    }

    public void method2() throws InterruptedException {
        float[] array2 = new float[SIZE];
        float[] halfarray = new float[H];
        float[] halfarray2 = new float[H];

        long starttime2 = System.currentTimeMillis();

        for (int i = 0; i < array2.length; i++) {
            array2[i] = 1;
        }

        //long finishtimearrayinit2 = System.currentTimeMillis() - starttime2;
        //System.out.println(finishtimearrayinit2);

        System.arraycopy(array2,0,halfarray,0,H);
        System.arraycopy(array2,H,halfarray2,0,H);

        long arraycopytime = System.currentTimeMillis() - starttime2;
        System.out.println("Массивы разделены: " + arraycopytime);
        System.out.println();
/*
        new Thread(() -> {
            for (int i = 0; i < halfarray.length; i++) {
                halfarray[i] = (float) (halfarray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            showArray(halfarray,"halfarray");
        }).start();

        new Thread(() -> {
            for (int i = 0; i < halfarray2.length; i++) {
                halfarray2[i] = (float) (halfarray2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            showArray(halfarray2,"halfarray2");
        }).start();
*/
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < halfarray.length; i++) {
                halfarray[i] = (float) (halfarray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            //showArray(halfarray,"halfarray");
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < halfarray2.length; i++) {
                halfarray2[i] = (float) (halfarray2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            //showArray(halfarray2,"halfarray2");
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long timearraymathend = System.currentTimeMillis() - starttime2;
        System.out.println("Массивы просчитаны: " + timearraymathend);
        System.out.println();

        System.arraycopy(halfarray,0,array2,0,H);
        System.arraycopy(halfarray2,0,array2,H,H);

        //showArray(array2,"array2");
        long timeendmethod2 = System.currentTimeMillis() - starttime2;
        System.out.println("Массивы соеденены: " + timeendmethod2);
    }
/*
    public void showArray(float[] array, String arrayname){
        System.out.println("Массив " + arrayname);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ячейка " + i + " массива " + arrayname + " : " + array[i]);
        }
        System.out.println();
    }
*/
}
