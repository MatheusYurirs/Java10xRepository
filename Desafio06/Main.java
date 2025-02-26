package NivelIntermediario.Desafio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRUDNinja crudNinja = new CRUDNinja();
        Scanner scanner = new Scanner(System.in);
        int procura = scanner.nextInt();
        Boolean hubOn = true;
        crudNinja.listaIniciada();
        while (hubOn) {
            System.out.println("----------- Ninjas Menu ------------");
            System.out.println("1 - Listar Ninjas");
            System.out.println("2 - Adicionar Ninja");
            System.out.println("3 - Remover o Primeiro da lista ");
            System.out.println("4 - Procurar Ninja(Insira o Indíce do Ninja)");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    crudNinja.listarTodos();
                    break;
                case 2:
                    crudNinja.adicionarComInput(scanner);
                    break;
                case 3:
                    crudNinja.removerOPrimeiro();
                    break;
                case 4:
                    crudNinja.procurar(procura);
                    break;
                case 5:
                    scanner.close();
                    hubOn = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

}

