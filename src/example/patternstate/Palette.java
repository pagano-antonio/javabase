package example.patternstate;
public class Palette {
	 
    private Color c;
 
    public void setColor(Color c1) {
        this.c=c1;
    }
 
    public void currentColor() {
        c.showColor();
    }
 
}
