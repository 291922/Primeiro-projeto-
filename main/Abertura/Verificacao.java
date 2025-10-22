package main.Abertura;
import java.util.Scanner;
import main.Restaurantes;
import java.time.LocalDate;
import java.time.Period;



public class Verificacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int anonascimento,dianascimento,mesnascimento;

        System.out.println("Faça seu login");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o dia do seu nascimento: ");
        dianascimento = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento:");
        mesnascimento = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        anonascimento = sc.nextInt();

        LocalDate nascimento = LocalDate.of(anonascimento, mesnascimento, dianascimento);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento,hoje);
        
        
        
        if(idade.getYears() >= 18) {
            System.out.println("Olá " + nome + "você já pode ter acesso ao site");
            Login.mostrarlogin();
        }
        else {
            System.out.println("Olá "+ nome + "infelizmente você não pode ter acesso ao site");
        }
        
    }
}