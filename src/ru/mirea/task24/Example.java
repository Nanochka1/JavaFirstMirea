package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//тестирование примера из дополнительного материала
public class Example {
    public static void main(String[] args) {
        String text = "Диана Анастасия Вадим";
        Pattern pattern = Pattern.compile("А.++а");//сверхжадный режим
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}