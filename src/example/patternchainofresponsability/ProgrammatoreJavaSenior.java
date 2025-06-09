package example.patternchainofresponsability;

public class ProgrammatoreJavaSenior extends Dipendente {

	@Override
	public void check(int stipendio) {
        if ( stipendio > 2000)
            dipendente.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }


}
