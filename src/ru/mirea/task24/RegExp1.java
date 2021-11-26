package ru.mirea.task24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
    public static void main(String[] args){

        //Pattern — предоставляет скомпилированное представление регулярного выражения.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient's place in the queue:");
        String queue = sc.next();
        Pattern pattern = Pattern.compile("^"+ "queue: " + queue + ".*");
        Matcher matcher;
        try(FileReader reader = new FileReader("src/ru/mirea/task24/queue.txt")){

            BufferedReader br = new BufferedReader(reader);//BufferedReader читает текст из потока ввода символов
            String line = br.readLine();
            while (line != null)
            {//Matcher — выполняет операцию сопоставления в результате интерпретации шаблона.
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(line.substring(matcher.start(), matcher.end()));
                }
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
/* Выходные данные
Данные находятся в текстовом файле queue.txt
queue: 5; Имя пациента: Мария; Возраст: 19; Диагноз: Двухсторонняя пневмония;
queue: 3; Имя пациента: Михаил;  Возраст: 57; Диагноз: Инсульт;
queue: 1; Имя пациента: Виктория;  Возраст: 28; Диагноз: Хронический пиелонефрит;
queue: 10; Имя пациента: Василий;  Возраст: 35; Диагноз: Артроз;
queue: 9; Имя пациента: Ангелина;  Возраст: 9; Диагноз: Острое респираторное заболевание;
 */
