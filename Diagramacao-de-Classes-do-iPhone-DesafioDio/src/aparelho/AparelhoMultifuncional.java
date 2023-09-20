package aparelho;

import aparelho.aparelhoTelefonico.TelefoneInterface;
import aparelho.navegadorInternet.NavegadorInterface;
import aparelho.reprodutorMusical.ReproducaoInterface;

public class AparelhoMultifuncional implements ReproducaoInterface, TelefoneInterface, NavegadorInterface {

  public void tocar() {
    System.out.println("Ouvindo a música.");
  }

  public void pausar() {
    System.out.println("Pausando a música.");
  }

  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  public void atender() {
    System.out.println("Atendendo ligação.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }

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
