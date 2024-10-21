import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       
      // Pontuação ate o momento   
       double heroiXP = 7500;

       System.out.println("Lista de conquista XP : ");
       System.out.println("1.000 : Ferro ");
       System.out.println("1.001 e 2.000 : Bronze ");
       System.out.println("2.001 e 5.000 : Prata Ouro ");
       System.out.println("5.001 e 8.000 : Platina Diamante ");
       System.out.println("8.001 e 9.000 : Ascendente ");
       System.out.println("9.001 e 10.000 : Imortal");
       System.out.println("10.001 : Modo God ");
       System.out.println();


       // Determinando a categoria de XP
       String categoria;
       int faixaXP = (int) heroiXP / 1000;  // Simplificação para categorizar o XP por milhares

       switch (faixaXP) {
           case 0:
               categoria = "Ferro";
               break;
           case 1:
               categoria = "Bronze";
               break;
           case 2:
           case 3:
           case 4:
               categoria = "Prata Ouro";
               break;
           case 5:
           case 6:
           case 7:
               categoria = "Platina Diamante";
               break;
           case 8:
               categoria = "Ascendente";
               break;
           case 9:
               categoria = "Imortal";
               break;
           default:
               categoria = "Modo God";
       }

       System.out.println("Sua categoria é: " + categoria);
       System.out.printf("Seu nivel no momento é: %.0f%n", heroiXP);
   }
}

