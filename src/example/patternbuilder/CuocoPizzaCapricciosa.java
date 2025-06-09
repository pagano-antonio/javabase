package example.patternbuilder;

public class CuocoPizzaCapricciosa  extends CuocoPizza {
    @Override
    public void ingredienti() {
        pizza.setIngredienti("pomodoro, mozzarella, funghi, prosciutto, olive");
    }
}