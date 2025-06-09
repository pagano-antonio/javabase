package example.patternchainofresponsability;

public class TeamLeader extends Dipendente {

	@Override
	public void check(int stipendio) {
        if ( stipendio > 3000)
        	 System.out.println( "Stipendio troppo alto!!!");
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }


}
