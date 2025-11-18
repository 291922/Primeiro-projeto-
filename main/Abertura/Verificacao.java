package main.Abertura;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;



public class Verificacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        int anonascimento,dianascimento,mesnascimento;

        System.out.println("Faça seu login");
        System.out.println("----------Verifique sua idade---------- ");
        
        System.out.println("Digite o dia do seu nascimento: ");
        dianascimento = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento:");
        mesnascimento = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        anonascimento = sc.nextInt();
        sc.nextLine(); 
        
    
        LocalDate nascimento = LocalDate.of(anonascimento, mesnascimento, dianascimento);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento,hoje);
        
        
        
        if(idade.getYears() >= 18) {
            System.out.println("Olá, você já pode ter acesso ao site");
            Login.mostrarlogin();
        }
        else {
            System.out.println("Olá, infelizmente você não pode ter acesso ao site");
        }
        
    }
}