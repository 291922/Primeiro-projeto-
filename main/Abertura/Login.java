package main.Abertura;

import java.util.Scanner;
import main.Restaurantes;

public class Login {
    public static void mostrarlogin(){
        Scanner sc = new Scanner(System.in);

        String senha,confirmarsenha;

        System.out.println("Digite seu email: ");
        sc.nextLine();
        System.out.println("Digite sua senha: ");
         senha = sc.nextLine();
        System.out.println("Confirme sua senha: ");
        confirmarsenha = sc.nextLine();

        if (senha.equals(confirmarsenha)) {
            System.out.println("Login feito com sucesso!");
            Restaurantes.mostrarrestaurantes();
        }

        else {
            System.out.println("As senhas não coincidiram, tente novamente");
        }

    }
    }

