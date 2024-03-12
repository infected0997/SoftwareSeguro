import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
}

class Musica {
    String titulo;
    int duracao;
    String compositor;

    void tocarMusica() {
        System.out.println("Tocando música: " + titulo);
    }
}

class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    Musica[] musicas;

    void mostraTodosOsDados() {
        System.out.println("Informações do álbum:");
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Músicas:");
        for (Musica musica : musicas) {
            System.out.println(" - " + musica.titulo);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        pessoa.nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        pessoa.idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Musica musica = new Musica();
        System.out.print("Digite o título da música: ");
        musica.titulo = scanner.nextLine();
        System.out.print("Digite a duração da música em segundos: ");
        musica.duracao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o compositor da música: ");
        musica.compositor = scanner.nextLine();

        Album album = new Album();
        System.out.print("Digite o gênero do álbum: ");
        album.genero = scanner.nextLine();
        System.out.print("Digite o ano do álbum: ");
        album.ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome do álbum: ");
        album.nome = scanner.nextLine();
        System.out.print("Digite o nome do artista: ");
        album.artista = scanner.nextLine();
        System.out.print("Digite a quantidade de músicas no álbum: ");
        int quantidadeMusicas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        album.musicas = new Musica[quantidadeMusicas];
        for (int i = 0; i < quantidadeMusicas; i++) {
            Musica m = new Musica();
            System.out.print("Digite o título da música " + (i + 1) + ": ");
            m.titulo = scanner.nextLine();
            album.musicas[i] = m;
        }

        scanner.close();

        System.out.println("\nDados da pessoa:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        System.out.println("\nDados da música:");
        System.out.println("Título: " + musica.titulo);
        System.out.println("Duração: " + musica.duracao + " segundos");
        System.out.println("Compositor: " + musica.compositor);

        album.mostraTodosOsDados();
    }
}