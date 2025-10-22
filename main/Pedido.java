package main;

import main.Restaurantes;
import java.util.Scanner;

public class Pedido {
    public static void mostrarPedido(String pedido) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Qual é o seu pedido? ");
    int pedido1 = sc.nextInt();
    

    switch (pedido1) {

            case 1 : {
                System.out.println("teste");
                break;
            }

            case 2 : {
                System.out.println("Teste2");
                break;
            }

            case 3 : {
                System.out.println("Teste3");
                break;
            }

            case 4 : {
                System.out.println("Teste4");
                break;
            }

            default : {
                System.out.println("teste nada");
                break;
            }

        }
   

   }

  }  