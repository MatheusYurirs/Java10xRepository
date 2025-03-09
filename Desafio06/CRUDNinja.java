package NivelIntermediario.Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class CRUDNinja implements InterfaceCRUDNinja {

    LinkedList<Ninja> listDeNinjas = new LinkedList<>();

    public void listaIniciada() {
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));
    }

    @Override
    public void adicionarOPrimeiro(Ninja ninja) {
        listDeNinjas.addFirst(ninja);
    }

    public void adicionarComInput(Scanner scanner) {
        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o Aldeia: ");
        scanner.nextLine();
        String aldeia = scanner.nextLine();
        adicionarOPrimeiro(new Ninja(nome, idade, aldeia));
        System.out.println("Ninja adicionado com sucesso\n");
    }


    @Override
    public void removerOPrimeiro() {
        listDeNinjas.removeFirst();
    }

    @Override
    public void listarTodos() {
        for (Ninja ninja : listDeNinjas) {
            System.out.println("Nome: " + ninja.getNome() + " Idade: " + ninja.getIdade() + " Aldeia: " + ninja.getAldeia());
        }
    }

    @Override
    public void procurar(int i) {
        if (i <= listDeNinjas.size()) {
            Ninja ninjaSeach = listDeNinjas.get(i);
            System.out.println("Ninja: " + ninjaSeach);
        }
        else {
            System.out.println("Index Inválido");
        }

    }

    public void procurarNinja(Scanner scanner){
        System.out.println("Digite o indice do NInja que deseja procurar: ");
       int indice = scanner.nextInt();
        procurar(indice);
    }
}
