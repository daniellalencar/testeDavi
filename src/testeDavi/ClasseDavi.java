package testeDavi;

public class ClasseDavi {
  public static void main(String[] args) {
    ClasseDavi classeDavi = new ClasseDavi();
    classeDavi.escreveNome();
    classeDavi.somaValores(3, 4);
  }

  private void somaValores(int i, int j) {
    System.out.println("Valor impresso");
    System.out.println(i + j);
  }

  private void escreveNome() {
    System.out.println("Daniel Lima ALencar");
  }
}
