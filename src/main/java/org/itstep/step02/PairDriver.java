package org.itstep.step02;

public class PairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */

    //БОНУСНЫЙ ВОПРОС: Что произойдет, если вы повторно воспроизведете проблему,
    //которую вы исправили на шаге 1 из предыдущего блока?
    //Будет ли компилироваться полученный код?
    //Как вы думаете, почему обобщенные классы коллекций иногда называют
    //«типобезопасными» коллекциями?

    //Ответ
    //Не будет компилироваться, так как проверка типов происходит уже не на этапе выполнения,
    //а на этапе компилирования

    //БОНУСНЫЙ ВОПРОС: Перечислите некоторые причины,
    //по которым класс Pair может быть предпочтительнее класса ObjectPair.
    //Можете ли вы предположить ситуации, в которых класс ObjectPair может
    //быть предпочтительнее класса Pair?

    //Ответ
    //ObjectPair предпочтительней, когда мы к примеру мы хотим чтобы в процессе
    //работы программы Тип полей нашего обьекта постоянно менялься, тоесть, был гибким
    //Pair предпочтительней, когда у нас обьект будет определенного типа, и в последствии
    //его тип не будет меняться, что упрощает работу


    public static void main(String[] args) {

        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair("Michigan Stadium", 109901);
        stadiums[2] = new Pair("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(Pair<String,Integer>[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
        int idx = 0;
        for(int i = 0; i < 2; i++)
        {
            if(stadiums[i].getSecond() < stadiums[i+1].getSecond())
            {
                idx = i+1;
            }
        }
        return (String) stadiums[idx].getFirst();
    }

}