package com.company;

import java.util.Scanner;

public class aula03letraB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasproduzidas, pecasdefeituosas;
        System.out.println("informe a quantidade de pecas produzidas");
        pecasproduzidas = sc.nextInt();
        System.out.println("informe a quantidade de pecas defeituosas ");
        pecasdefeituosas = sc.nextInt();
        if(pecasdefeituosas > (pecasproduzidas * 0.1)) {
            System.out.println("maquina precisa de manutencao");
        }else{
                System.out.println("maquina nao precisa de manutencao");

            }
        }
    }
