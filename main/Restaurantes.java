package main;

import java.util.Scanner;

import main.Cardapios.Cardapiobk;
import main.Cardapios.CardapiodoMadeiro;
import main.Cardapios.Cardapiodomc;

public class Restaurantes {
    public static void mostrarrestaurantes() {
      
        Scanner sc = new Scanner (System.in);

      System.out.println("Opções de Restaurantes!");
      System.out.println("1-Madeiro");
      System.out.println("2-Burguer King");
      System.out.println("3-McDonald`s");
      System.out.println("4-Jeronimo");
    

        System.out.print("Qual restaurante deseaja?");
        String escolha = "";
        escolha = sc.nextLine();

        String pedido = ""; //já declara para todos 
      switch (escolha) {
        case "1" : 
        System.out.println("ESCOLHA SEU PEDIDO");
        CardapiodoMadeiro.mostrarCardapioMadeiro();
        pedido = sc.nextLine();

        Pedido.mostrarPedido(pedido);
        
        break;

        case "2" : 

      Cardapiobk.mostrarCardapioBK();
       
        break;

        case "3" : 
         Cardapiodomc.mostrarCardapio(); //aqui chamamos outra classe 
      
        System.out.println("ESCOLHA SEU PEDIDO");
        pedido = sc.nextLine();

         Pedido.mostrarPedido(pedido); 
        break;

        case "4" : 

        System.out.println("ESCOLHA SEU PEDIDO");

         pedido = sc.nextLine();

         Pedido.mostrarPedido(pedido);
        break;

        default :
        System.out.println("esse lugar não existe, faça outra escolha!");
        escolha = sc.nextLine();
        break;
      }
    }
    
}
