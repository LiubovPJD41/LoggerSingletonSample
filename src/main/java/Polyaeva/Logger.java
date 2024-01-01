package Polyaeva;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    protected int num = 1;
    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' hh:mm:ss a zzz ");

    private Logger() {
        // Пользователи которым нужен объект
        // нашего класса получают всегда один
        // и тот же объект, который мы храним
        // в приватном статичном поле, которое
        // мы заполняем в этом методе если оно
        // до того не было заполнено
    }

    public void log(String msg) {        //TODO plus date and time
        System.out.println("[" +formatForDateNow.format(date)+ num++ + "] " + msg);
    }

    //...

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;      //...
    }


}



