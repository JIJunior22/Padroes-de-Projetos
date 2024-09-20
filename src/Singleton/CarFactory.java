package Singleton;

import java.util.Scanner;

public class CarFactory {


    private static CarFactory instance;



    private CarFactory() {

    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public void carFactory() {
        Scanner sc = new Scanner(System.in);
        int totalCarrosGol = 0;
        int totalCarrosUP = 0;

        System.out.println("FABRICA DE CARROS - NOVOS MODELOS 2024");
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Digite 1. para Gol");
            System.out.println("Digite 2. para UP");
            System.out.println("Digite 3. Sair");
            System.out.print(">>>> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    totalCarrosGol++;
                    System.out.println("Gol criado. Total de carros Gol: " + totalCarrosGol);
                    break;

                case 2:
                    totalCarrosUP++;
                    System.out.println("UP criado. Total de carros UP: " + totalCarrosUP);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        // Exibe o total de cada carro criado
        System.out.println("RESUMO FINAL:");
        System.out.println("Total de carros Gol criados: " + totalCarrosGol);
        System.out.println("Total de carros UP criados: " + totalCarrosUP);

        // Verifica qual modelo foi o mais criado
        if (totalCarrosGol > totalCarrosUP) {
            System.out.println("O modelo mais criado foi: Gol");
        } else if (totalCarrosUP > totalCarrosGol) {
            System.out.println("O modelo mais criado foi: UP");
        } else if (totalCarrosGol == 0 && totalCarrosUP == 0) {
            System.out.println("Nenhum carro foi criado.");
        } else {
            System.out.println("Ambos os modelos foram criados em quantidades iguais.");
        }
    }
    public class Main {
        public static void main(String[] args) {
            CarFactory carros=CarFactory.getInstance();
            carros.carFactory();


        }
    }
}


