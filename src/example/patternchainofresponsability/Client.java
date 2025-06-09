package example.patternchainofresponsability;

public class Client {
 
    public static void main(String[] args) {
 
        //Ufficiali
        ProgrammatoreJavaJunior pJJ = new ProgrammatoreJavaJunior();
        ProgrammatoreJavaSenior pJS = new ProgrammatoreJavaSenior();
        ArchictetJava aJ = new ArchictetJava();
        TeamLeader tL = new TeamLeader();
        Manager man = new Manager();
 
        //creazione della gerarchia
        pJJ.setSuperiore( pJS );
        pJS.setSuperiore( aJ );
        aJ.setSuperiore( tL );
        tL.setSuperiore( man );
 
        System.out.println( "Chi guadagna oltre i 4000 euro al mese ? ");
        pJJ.check(4000);
 
    }
 
}