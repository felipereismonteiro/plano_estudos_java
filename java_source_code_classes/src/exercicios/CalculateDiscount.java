package exercicios;

public class CalculateDiscount {
 public static void main(String[] args) {
  double precoOriginal = 20.50;
  double percentualDesconto = 10;

  
  System.out.println("Valor final com desconto: " + (precoOriginal - (precoOriginal / percentualDesconto)));
 }
}
