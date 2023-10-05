package br.prova;

import java.util.Random;
import java.util.Scanner;

public class MontyHall {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random premio = new Random();
        System.out.println("Bem vindo ao Monty Hall!!");
        int portaPremiada = premio.nextInt(3) + 1;
        //System.out.println(portaPremiada);
        System.out.println("Escolha uma porta (1 || 2 || 3) ");
        int portaEscolhida = scan.nextInt();

        int portaVazia;
        do {
            Random random = new Random();
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);

        String mudar;
        System.out.println("A porta " + portaVazia + " esta vazia, deseja mudar a porta? (s/n)");
        mudar = scan.next();

        if(mudar.equals("s")){

            if(portaEscolhida != portaPremiada){
                System.out.println("Você ganhou a porta premiada foi: " + portaPremiada);
            }else{
                System.out.println("Você perdeu a porta escolhida anteriormente era a premiada, porta:" + portaPremiada);
            }

        }else {
            if(portaEscolhida == portaPremiada){
                System.out.println("Você ganhou :) a porta premiada foi: " + portaPremiada);
            }else {
                System.out.println("Você perdeu :( o premio estava na porta: " + portaPremiada);
            }
        }
    }

    }

