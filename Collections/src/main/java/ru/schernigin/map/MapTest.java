package ru.schernigin.map;

import java.util.*;
import org.junit.*;


/**
 * Class for demonstrating the work of methods "hashCode" and "equals" with overlapping and without.
 *
 * @author schernigin.
 * @since 01.03.2017.
 * @version 1.0
 */
public class MapTest {

    /**
     * Inner map for test.
     */
    private Map<User, Object> map;

    /**
     * Inner parameter.
     */
    private Calendar birthday = new GregorianCalendar(1988, 06, 28);

    /**
     * вывод: {Sergey=java.lang.Object@20fa23c1, Sergey=java.lang.Object@3581c5f3}
     *
     * описание: при добавлении значения по ключу, в HashMap, ключ нового значения сравнивается
     * с ключами уже имеющихся значений по хешу и методу equals.
     * в данном примере, выводится два объекта, добавленные в MAP'У, потому что не переопределенны
     * методы "hashCode" & "equals". (то есть используется дефолтная реализация этих методов).
     * при добавлении объекта в мапу, метод "put", вызывает метод "hash(key)", для сравнения есть ли такой кляч в мапе,
     * если такой ключ уже имеется, то значение перезатирается и возращает старое значение, иначе
     * значение записывается новое значение и ключ, и возвращает null.
     * в методе "hash(key)" вычесляется хеш ключа,
     * метод "hashCode" в дефолтной реализации, представляет внутреннийй адрес объекта в целое число =>
     * не смотря на то, что поля объектов равны, внутренние их адреса разные, и мар определяет их как разные ключи.
     */
    @Test
    public void whenNotOverrideMethodsThenIfAddTwoObjectShowTwoNewObject() {
        map = new HashMap<User, Object>();

        map.put(new User("Sergey", 2, birthday), new Object());
        map.put(new User("Sergey", 2, birthday), new Object());

        System.out.println(map);
    }

    /**
     * вывод: {Sergey=java.lang.Object@20fa23c1, Sergey=java.lang.Object@3581c5f3}
     *
     * описание: возвращает так же два объекта, т.к. метод "hashCode" не перекрыт,
     * и в данном случае у объектов-ключей будут разные хэши, а результат вызова
     * "equals" будет true, т.к. equals() переопределен и сравнивает поля объектов.
     */
    @Test
    public void whenOverrideMethodEqualsThenShowTwoNewObject() {
        map = new HashMap<User, Object>();

        map.put(new UserE("Sergey", 2, birthday), new Object());
        map.put(new UserE("Sergey", 2, birthday), new Object());

        System.out.println(map);
    }

    /**
     * вывод: {Sergey=java.lang.Object@f2a0b8e, Sergey=java.lang.Object@593634ad}
     *
     * описание: возвращает так же два объекта, т.к. метод "equals" не перекрыт,
     * и в данном случае у объектов-ключей будут одинаковые хэши, но результат вызова
     * метода "equals" = false т.к. equals()  по дефолту сравнивает адреса объектов.
     *
     */
    @Test
    public void whenOverrideMethodHashCodeThenShowTwoNewObject() {
        map = new HashMap<User, Object>();

        map.put(new UserH("Sergey", 2, birthday), new Object());
        map.put(new UserH("Sergey", 2, birthday), new Object());

        System.out.println(map);
    }

    /**
     * выод: {Sergey=java.lang.Object@f2a0b8e}
     *
     * описание: т.к. методы "hashCode" & "equals" перекрыты, и сравниваются по внутренним полям,
     * то мапа оределит что это один и тот же ключ, и сначала добавит первое значение, а потом по
     * этомк ключу перезапишет на новое значение.
     */
    @Test
    public void whenOverrideMethodHashCodeAndEqualsThenShowOneObject() {
        map = new HashMap<User, Object>();

        map.put(new UserEH("Sergey", 2, birthday), new Object());
        map.put(new UserEH("Sergey", 2, birthday), new Object());

        System.out.println(map);
    }


}
