package memoryleak;

import java.util.HashMap;
import java.util.Map;

public class MemLeak {
//    @Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((key == null) ? 0 : key.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MemLeak other = (MemLeak) obj;
//		if (key == null) {
//			if (other.key != null)
//				return false;
//		} else if (!key.equals(other.key))
//			return false;
//		return true;
//	}

	public final String key;
    
    public MemLeak(String key) {
        this.key =key;
    }
    
    public static void main(String args[]) {
        try {
        	HashMap<MemLeak, String> map = new HashMap<MemLeak, String>();
            
            // ogni volta che genero una nuova istanza di MemLeak viene creato un nuovo codice hash
            // quindi non sara mai piu recuperabile

             //for(;;) {
        	  MemLeak l1 =     new MemLeak("11");
        	  System.out.println(l1.hashCode());
                map.put(l1, "sdfsd");
               // System.out.println(map.size());
                
              
           // }
                MemLeak l =     new MemLeak("11");
                System.out.println(l.hashCode());
                String f = map.get(l);
                
             System.out.println(f);
                
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
