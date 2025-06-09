package example.patternadapterclass;

public class Employer implements InterfaceEmployer {
	  
    private String lastName = null;
  
    @Override
    public String getLastName() {
        return lastName;
    }
  
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}