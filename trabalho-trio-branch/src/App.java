import geral.Livro;
import geral.Premio;
import geral.Filme;
import geral.Editora;
import java.util.ArrayList;
import java.util.Scanner;

/*criar código que solicite os dados para cadastro de ao menos 3 instâncias de cada classe,
 e que posteriormente realize a impressão de ao menos 4 informações de cada uma das instâncias */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Livro>listaLivros = new ArrayList<>();
        ArrayList <Filme> listaFilmes = new ArrayList<>();

        for(int i = 1;i<=3;i++){
            ArrayList <Premio> premios = new ArrayList<>();

            System.out.printf("insira o nome do livro %s: \n",i);
            String nome = scanner.nextLine();

            System.out.printf("insira o país de origem do livro %s: \n",i);
            String pais = scanner.nextLine();

            System.out.printf("insira o genero do livro %s: \n",i);
            String genero = scanner.nextLine();

            System.out.printf("insira a classificaçao indicativa do livro %s: \n",i);
            String classificacao = scanner.nextLine();

            System.out.printf("insira a quantidade de páginas do livro %s: \n",i);
            String qtdPaginas = scanner.nextLine();

            System.out.printf("insira o/a autor/a do livro %s: \n",i);
            String autor_a = scanner.nextLine();

            System.out.println("deseja inserir os dados da editora?(sim/nao)");
            String sim_nao = scanner.nextLine();

            if (sim_nao.equals("sim")){
            System.out.printf("insira o nome da editora do livro %s: \n",i);
            String nome_editora = scanner.nextLine();

            System.out.printf("insira a localidade da editora do livro %s: \n",i);
            String endereco_editora = scanner.nextLine();

            Editora editora = new Editora(nome_editora, endereco_editora);

            System.out.println("---------//--------//---------");
            
            listaLivros.add(new Livro(nome, pais, genero, classificacao, qtdPaginas, autor_a, editora));
            }else{
                listaLivros.add(new Livro(nome, pais, genero, classificacao, qtdPaginas, autor_a, null));
            }
        

            
            System.out.printf("insira o nome do filme %s: \n",i);
            String nome_filme = scanner.nextLine();

            System.out.printf("insira o país de origem do filme %s: \n",i);
            String pais_filme = scanner.nextLine();

            System.out.printf("insira o genero do filme %s: \n",i);
            String genero_filme = scanner.nextLine();

            System.out.printf("insira a classificaçao indicativa do filme %s: \n",i);
            String classificacao_filme = scanner.nextLine();

            System.out.printf("insira o faturamento do filme %s: \n",i);
            String faturamneto = scanner.nextLine();

            System.out.printf("insira o/a diretor/a do filme %s: \n",i);
            String diretor_a = scanner.nextLine();

            System.out.printf("insira o estúdio do filme %s: \n",i);
            String estudio = scanner.nextLine();

            System.out.printf("quantos prêmios o filme %s ganhou: (se maior que 0 rodará rodará o código específico) \n",i);
            int qtd_premios = scanner.nextInt();
            scanner.nextLine();

            if (qtd_premios > 0){
                for(int cont = 1; cont <= qtd_premios; cont++){
                    
                    System.out.printf("insira o nome do prêmio que o filme %s ganhou: \n",i);
                    String nome_premio = scanner.nextLine();

                    System.out.printf("insira o ano do prêmio que o filme %s ganhou: \n",i);
                    String ano_premio = scanner.nextLine();

                    System.out.printf("insira a categoria do prêmio que o filme %s ganhou: \n",i);
                    String categoria_premio = scanner.nextLine();

                    premios.add(new Premio(nome_premio, ano_premio, categoria_premio));
                    

            }
        }
            
            

            listaFilmes.add(new Filme(nome_filme, pais_filme, genero_filme, classificacao_filme, faturamneto, diretor_a, estudio, premios));


            
            

        }
        for (Livro livro : listaLivros){
            livro.imprimirInformacoes();
            System.out.println();
        }
        for (Filme filme : listaFilmes){
            filme.imprimirInformacoes();
            System.out.println();
        }
    }
}
