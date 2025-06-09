package example.patternstate;

public class WhiteColor implements Color{
	 
    private static final String COLOR_NAME = "WHITE";
    private static final String HEX_COLOR = "#FFFFFF";
 
    @Override
    public void showColor() {
        System.out.println( HEX_COLOR );
    }
 
}