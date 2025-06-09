package example.patternproxytre;

import java.util.List;

public class IntesaSanPaolo implements ContoCorrente {
 
    @Override
    public List listaMovimenti(String numeroConto) {
        return Estrattore.getMovimenti(numeroConto);
    }
 
}