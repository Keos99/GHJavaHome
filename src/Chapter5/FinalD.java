package Chapter5;

class ErrorMsg{
    final int OUTER = 0;
    final int INERR = 1;
    final int DISCERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
      "Ошибка вывода",
      "Ошибка ввода",
      "Отсутствует место на диске",
      "Выход индекса за границы массива"
    };

    String getErrorMsg(int i){
        if (i >=0 & i < msgs.length){
            return msgs[i];
        } else {
            return "Несуществующий код ошибки";
        }
    }
}

public class FinalD {
    public static void main(String[] args) {
        ErrorMsg errorMsg = new ErrorMsg();
        System.out.println(errorMsg.getErrorMsg(errorMsg.OUTER));
        System.out.println(errorMsg.getErrorMsg(errorMsg.DISCERR));
    }
}
