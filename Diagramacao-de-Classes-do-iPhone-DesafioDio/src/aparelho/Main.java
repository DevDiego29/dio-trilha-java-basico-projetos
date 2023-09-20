package aparelho;

public class Main {

  public static void main(String[] args) {
    AparelhoMultifuncional aparelho = new AparelhoMultifuncional();

    System.out.println("------------->");
    aparelho.selecionarMusica("GIGI D'AGOSTINO");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(996592546);

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}
