package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
          Pair<String, Integer> p1;
          Pair<String, Number> p2;
          Pair<Object, Object> p3;
          Pair<?, ?> p4;
          Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7);
        int a = p1.getSecond();

//      p1 = new Pair<Integer, Double>(23, 12.0);потому что в p1 второй тип выбран как Integer,
        //а в данной строке выбран Double, что и приводит к ошибке

//      p2 = new Pair<String, Integer>("B", 8);такая же проблема что и в 25 строке, только уже тип Number на Integer

//      p3 = new Pair<String, Integer>("C", 9);такая же проблема что и в 25 строке, только уже тип Object на Integer

        p4 = new Pair<String, String>("House", "Car");
        p4 = new Pair<String, Integer>("D", 10);

//      Integer b = p4.getSecond();не компилируеться, потому что при обьявлении не был выбран тип, значит нужно
        //привести его к нужному
        Integer c = (Integer) p4.getSecond();

//      p5 = new Pair<String, String>("E", "G");на 20 строке, второй обобщенный тип обьявлен как наследуемый
        //от абстрактного класса Number(тоесть являеться суперклассом для всех числовых типов),
        //тоесть второй обобщенный тип должен иметть реализацию всех его методов,
        //а класс String не реализует их, так как не являеться числовым

        p5 = new Pair<String, Double>("E", 11.0);
        p5 = new Pair<String, Integer>("E", 11);

//      Integer d = p5.getSecond(); такая же проблема как и на 35 строке
        Integer e = (Integer) p5.getSecond();
    }

}
