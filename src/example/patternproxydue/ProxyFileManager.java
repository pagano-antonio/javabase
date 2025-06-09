package example.patternproxydue;

public class ProxyFileManager implements FileInterface {
	 
    private FileManager fileManager;
    private String fileName;
 
    public ProxyFileManager(String fileName) {
        System.out.println("ProxyFileManager() " );
        this.fileName = fileName;
    }
 
    @Override
    public void display() {
        System.out.print("ProxyFileManager.display() -> " );
        if (fileManager==null)
            fileManager = new FileManager( fileName );
        fileManager.display();
    }
}