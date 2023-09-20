package aparelho.navegadorInternet;

public abstract class NavegadorAbstract implements NavegadorInterface {

  public void exibirPagina() {
    System.out.println("Exibindo a página.");
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando página.");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
