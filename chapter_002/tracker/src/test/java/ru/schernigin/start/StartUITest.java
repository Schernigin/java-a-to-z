package ru.schernigin.start;

import org.junit.Test;
import ru.schernigin.models.Item;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by USER on 24.01.2017.
 */
public class StartUITest {

    @Test
    public void whenCreateNewItemThenNameNewItemEqualseNoNull() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "name", "desc", "y"});
        StartUI startUI = new StartUI(input, tracker);
        startUI.init();
        Item result = tracker.findByName("name");
        assertThat(result, is(notNullValue()));
    }
}