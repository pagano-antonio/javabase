package example.patternproxytre;

import java.util.List;

public class ProxyIntesaSanPaolo implements ContoCorrente {
 
    private String username;
    private String password;
    private IntesaSanPaolo intesaSanPaolo;
 
    public ProxyIntesaSanPaolo(String username, String password){
        this.username = username;
        this.password = password;
        intesaSanPaolo = new IntesaSanPaolo();
    }
 
    @Override
    public List listaMovimenti(String numeroConto) {
        List lista = null;
        if( checkUser() )
            lista = intesaSanPaolo.listaMovimenti( numeroConto );
        return lista;
    }
 
    private boolean checkUser(){
        return IdentityManager.checkUser(username, password);
    }
 
}