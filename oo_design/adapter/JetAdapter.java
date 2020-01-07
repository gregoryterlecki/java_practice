public class JetAdapter implements HelicopterInterface {

  Jet theJet;

  public JetAdapter(Jet jet){
    theJet = jet;
  }

  public void hover(){
    theJet.takeOff();
  }

  public void verticalLand(){
    theJet.landOnRunway();
  }
}
