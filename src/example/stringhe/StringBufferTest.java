package example.stringhe;

public class StringBufferTest {
	 public static void stringReplace (String text) 
	    {
	        text = text.replace ('j' , 'c'); /* Line 5 */
	    } 
	    public static void bufferReplace (StringBufferTest text) 
	    { 
	        text = text.append ("c");  /* Line 9 */
	        text.append ("c");
	    } 
	    public static void main (String args[]) 
	    { 
	        String textString = new String ("java"); 
	        StringBufferTest textBuffer = new StringBufferTest ("java"); /* Line 14 */
	        stringReplace(textString); 
	        bufferReplace(textBuffer); 
	        System.out.println (textString); 
	        System.out.println (textBuffer); 
	    } 
}







//http://www.datrevo.com/lezione-di-java-27-loggetto-string-e-stringbuffer/
//l'ouput sara javajavac
//A string is immutable, it cannot be changed, that's the reason for the StringBuffer class. The stringReplace method does not change 
//the string declared on line 14, so this remains set to "java".
////
////Method parameters are always passed by value - a copy is passed into the method - if the copy changes, the original remains intact, 
//line 5 changes the reference i.e. text points to a new String object, however this is lost when the method completes. The textBuffer
//is a StringBuffer so it can be changed.
////
////This change is carried out on line 9, so "java" becomes "javac", the text reference on line 9 remains unchanged. This gives us the 
//output of "javajavac"
//
