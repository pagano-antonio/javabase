package example.patternproxydue;

public class DocumentManager {
	 
    public DocumentManager(String textFileName, String imageFileName) {
        loadText(textFileName);
        loadImage(imageFileName);
    }
 
    private void loadText(String textFileName) {
        System.out.println("--LOADING TEXT--");
        new FileManager(textFileName).display();
    }
 
    private void loadImage(String imageFileName) {
        System.out.println("--LOADING IMAGES--");
        new ProxyFileManager(imageFileName).display();
    }
}