package main.Abertura;

import java.util.Scanner;

import main.Abertura.PO.POlogin;

public class Login {
    public static void mostrarlogin(){
        Scanner sc = new Scanner(System.in);
        String nome,email,senha,confirmarsenha;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
         System.out.println("Digite seu email: ");
        email = sc.nextLine();

       do  {
        System.out.println("Digite sua senha: ");
         senha = sc.nextLine();
        System.out.println("Confirme sua senha: ");
        confirmarsenha = sc.nextLine();

        if (!senha.equals(confirmarsenha)) {
            System.out.println("----------As senhas não são iguais!----------");
            
        }

    } while (!senha.equals(confirmarsenha));

        
        POlogin login1 = new POlogin( nome, email, senha );

        System.out.println("Seja bem vindo " + nome );
    
        Restaurantes.mostrarrestaurantes(nome);
    

    }
}

