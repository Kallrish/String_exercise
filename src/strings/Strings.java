package strings;

//Importando a classe java.util.Scanner para receber a entrada do usuário
import java.util.Scanner;

/**Classe para capturar as strings a serem trabalhadas.
 *
 *@author: Jonatas"Kallrish"Ribeiro
 */
public class Strings {
  /**Método para capturar as strings e realizar o processamento das mesmas.
   *
   *@author: Jonatas "Kallrish" Ribeiro
   */
  public static void main(String[] args) {
    // Instaciamento e criação do objeto usando padrão de entrada (System.ini)
    Scanner ler = new Scanner(System.in);
    //Introdução informando ao usuário sobre o que se trata o programa
    System.out.println("Olá! Seja bem-vindo ao exercício com Strings! \nVamos começar!\n");
    //Solicitação na tela para que o usuário digite o seu nome
    System.out.println("Digite o seu nome:");
    String nome = " "; //Variável que receberá o nome
    nome = ler.nextLine(); //Variável nome recebe o valor da String digitada
    //Solicitação na tela para que o usuário digite o seu sobrenome
    System.out.println("Digite o seu sobrenome:");
    String sobreNome = " "; //Variável que receberá o sobrenome
    sobreNome = ler.nextLine();   //Variável sobrenome recebe o valor da String digitada
    //Variável que receberá o a concatenação de nome s sobrenome
    final var nomeCompleto = nome + " " + sobreNome;
    //Retorna nome completo para o usuário
    System.out.println("O seu nome completo é: " + nomeCompleto + "\n");

    var string = " " + nomeCompleto + " "; //Variável recebe texto para próxima parte do exercício
    //Introdução sobre a segunda parte do exercício
    System.out.println("Agora algumas curiosidades com recursos da classe String! \n");
    System.out.println("Char na posição: " + string.charAt(8)); //Retorna o caractere na posição 8
    System.out.println("Quantidade: " + string.length()); //Retorna a quantidade de caracteres
    System.out.println("Sem trim [" + string + "]"); //Retorna o texto com espaço nas extremidades
    //Retorna o texto sem espaço nas extremidades
    System.out.println("Com trim [" + string.trim() + "]");
    //Retorna o texto em letras minúsculas
    System.out.println("Minúsculo: " + string.toLowerCase());
    //Retorna o texto em letras maiúsculas
    System.out.println("Maiúsculas: " + string.toUpperCase());
    //Retorna se há a letra J no texto (true or false)
    System.out.println("Contém a letra J? " + string.contains("J"));
    //Retorna se há a letra Z no texto (true or false)
    System.out.println("Contém a letra Z? " + string.contains("Z"));
    //Retorna o texto com as letras "a" trocadas por @
    System.out.println("Troca letra: " + string.replace("a", "@"));
    //Retorna se o texto é igual a palabra citada
    System.out.println("Igual a \"Jonatas\"? " + string.equals("Jonatas"));
    //Retorna se o texto é igual ao texto citado, ignorando maiúsculas e minúsculas
    System.out.println("Igual ignorando case a \" JONATAS ribeiro \"? "
            + string.equalsIgnoreCase(" JONATAS ribeiro "));
    //Retorna o conteúdo do texto do caracter 9 ao 16
    System.out.println("Conteúdo do caracter 9 a 16: " + string.substring(9, 16) + "\n");
    //Introdução sobre a última parte do exercício
    System.out.println("Mais 4 exemplos para você de recursos com Strings! \n");
    //Retorna o nome, cujos caracteres foram inseridos em uma matriz e separa os com parágrafos
    System.out.println("\"Jonatas\" vira uma matriz logo abaixo: ");
    char[] matriz = nome.toCharArray();
    System.out.println(matriz[0]);
    System.out.println(matriz[1]);
    System.out.println(matriz[2]);
    System.out.println(matriz[3]);
    System.out.println(matriz[4]);
    System.out.println(matriz[5]);
    System.out.println(matriz[6]);
    //Retorna o nome inteiro, em que cada parte foi separada em uma matriz e separa em parágrafos
    System.out.println("\nSeparando o nome \"Joaquim Morais Santos\" em parágrafos: ");
    String [] matrizNome = "Joaquim Morais Santos".split(" ");
    System.out.println(matrizNome[0]);
    System.out.println(matrizNome[1]);
    System.out.println(matrizNome[2]);
    //Retorna a concatenação da palavra "Aula" com a string " de Java"
    System.out.println("\nConcatenando \"Aula".concat(" de Java") + "\"");
    //Retorna o a substituição de todos os caracteres numéricos no texto citado
    System.out.println("Censurando números -> 1234 asda qw".replaceAll("[0-9]", "#"));
    //Fim do exercício, despedida
    System.out.println("\nObrigado por participar do Exercício!\n#keepcoding");

  }
}
