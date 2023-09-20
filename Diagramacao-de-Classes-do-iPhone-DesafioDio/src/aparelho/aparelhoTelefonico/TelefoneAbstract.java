package aparelho.aparelhoTelefonico;

public abstract class TelefoneAbstract implements TelefoneInterface {

  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  public void atender() {
    System.out.println("Atendendo a ligação.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }
}
