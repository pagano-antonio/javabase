package example.patternchainofresponsability;

public class ProgrammatoreJavaJunior extends Dipendente {

	@Override
	public void check(int stipendio) {
        if ( stipendio > 1300)
            dipendente.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }


}
