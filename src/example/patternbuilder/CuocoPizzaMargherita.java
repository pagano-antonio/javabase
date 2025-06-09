package example.patternbuilder;

public class CuocoPizzaMargherita extends CuocoPizza {
    @Override
    public void ingredienti() {
        pizza.setIngredienti("pomodoro, mozzarella");
    }
}
