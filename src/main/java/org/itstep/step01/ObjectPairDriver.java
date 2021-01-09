package org.itstep.step01;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    //БОНУСНЫЙ ВОПРОС: Почему компилируется эта строка кода?
    //stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);

    //Ответ
    //Потому что поля класса(а так-же парметры в констркторе) обьвленны, и передаються в Object
    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
        int idx = 0;
        for(int i = 0; i < 2; i++)
        {
            if((int)stadiums[i].getSecond() < (int)stadiums[i+1].getSecond())
            {
                idx = i+1;
            }
        }
        return (String) stadiums[idx].getFirst();
    }

}
