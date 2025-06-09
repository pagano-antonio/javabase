package example.patternstate;

public class RedColor implements Color{
	 
    private static final String COLOR_NAME = "RED";
    private static final String HEX_COLOR = "#FF0000";
 
    @Override
    public void showColor() {
        System.out.println( HEX_COLOR );
    }
 
}
