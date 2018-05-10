package JavaTraining.sampleapp.Question2;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aahad on 2/19/2018.
 */
public abstract class Restaurant {

    private Menu menu;

    public abstract void addItem(Order order, Item item);

    public abstract void orderFood(Order order);

    public abstract void cancelOrder(Order order);

    public abstract void payOrder(Order order);

}

