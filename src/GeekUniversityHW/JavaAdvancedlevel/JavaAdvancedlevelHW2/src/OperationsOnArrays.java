package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW2.src;

public class OperationsOnArrays {

    public void sumAllCells(String[][] cells) throws MySizeArrayException {
        int sum = 0;


        if ((cells.length != 4)&&(cells[0].length != 4)) {
            System.out.println("Размер введенного массива" + cells.length + " x " + cells[0].length + ".");
            throw new MySizeArrayException("Ошибочный размер массива! Принимаем только 4 х 4!");
        }

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (!isNumeric(cells[i][j])){
                    try {
                        throw new MyArrayDataException("В ячейке не число!");
                    } catch (MyArrayDataException e){
                        System.err.println("Ячейка " + i + "." + j + " содержит: " + cells[i][j]);
                        System.err.println(e);
                        continue;
                    }
                } else {
                    sum += Integer.parseInt(cells[i][j]);
                }
            }
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);

    }

    public boolean isNumeric(String cell){
        try {
            Integer.parseInt(cell);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public void arrayInit(String[][] cells){
        int nums = 10;
        char chars = 'A';
        int count = 0;

        for (int i = 0; i < cells.length; i++) {
            if (i <= 1){
                for (int j = 0; j < cells[i].length; j++) {
                    cells[i][j] = String.valueOf(nums);
                    nums += 10;
                }
            } else {
                for (int j = 0; j < cells[i].length; j++) {
                    cells[i][j] = String.valueOf(chars);
                    chars += 10;
                }
            }
        }
    }

    /*public void showArray(String[][] cells){
        System.out.println("Содержание массива:");
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }*/
}
