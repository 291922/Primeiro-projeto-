package main.Abertura;

import java.util.Scanner;

import main.Abertura.Cardapio.Cardapiobk;
import main.Abertura.Cardapio.CardapiodoMadeiro;
import main.Abertura.Cardapio.Cardapiodomc;
import main.Abertura.PO.Pedido;

public class Restaurantes {
    public static void mostrarrestaurantes(String cliente) {
      Scanner sc = new Scanner(System.in);
    
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
        System.out.println("OLÁ " + cliente + "ESCOLHA SEU PEDIDO");
        CardapiodoMadeiro.mostrarCardapioMadeiro();
        pedido = sc.nextLine();

        Pedido p1 = new Pedido(cliente,pedido);
        
        System.out.println("---------------------Pedido Criado!---------------------");
        System.out.println("Cliente: " + p1.getCliente());
        System.out.println("Item: "+ p1.getItem());

        break;

        case "2" : 
        System.out.println("OLÁ " + cliente + " ESCOLHA SEU PEDIDO");
        Cardapiobk.mostrarCardapioBK();;
        pedido = sc.nextLine();

        Pedido p2 = new Pedido(cliente,pedido);
        
        System.out.println("---------------------Pedido Criado!---------------------");
        System.out.println("Cliente: " + p2.getCliente());
        System.out.println("Item: "+ p2.getItem());
        
       
        break;

        case "3" : 
         
        System.out.println("OLÁ " + cliente + " ESCOLHA SEU PEDIDO");
        Cardapiodomc.mostrarCardapio();
        pedido = sc.nextLine();

        Pedido p3 = new Pedido(cliente,pedido);
        
        System.out.println("---------------------Pedido Criado!---------------------");
        System.out.println("Cliente: " + p3.getCliente());
        System.out.println("Item: "+ p3.getItem()); 
        break;

        case "4" : 

        System.out.println("OLÁ " + cliente + " ESCOLHA SEU PEDIDO");
        Cardapiodomc.mostrarCardapio(); //trocar o cardapio
        pedido = sc.nextLine();

        Pedido p4 = new Pedido(cliente,pedido);
        
        System.out.println("---------------------Pedido Criado!---------------------");
        System.out.println("Cliente: " + p4.getCliente());
        System.out.println("Item: "+ p4.getItem()); 
        break;

        default :
        System.out.println("esse lugar não existe, faça outra escolha!");
        escolha = sc.nextLine();
        break;
      }
    }
    
}
