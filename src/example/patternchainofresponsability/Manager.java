package example.patternchainofresponsability;

public class Manager extends Dipendente {

	@Override
	public void check(int stipendio) {
        if ( stipendio > 4000)
            dipendente.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }


}
