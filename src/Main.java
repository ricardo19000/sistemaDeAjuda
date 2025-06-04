//Página 72 - Criar um sistema de ajuda para a linguagem Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        throws java.io.IOException {

        String escolha;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Ajuda com:\n");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("0. Sair");
            System.out.print("\nEscolha um número ou digite o operador: ");

            escolha = sc.next();

            if (escolha.equals("0")){
                System.out.print("Até logo...");
                break;
            }

            boolean validacao = true;

            switch (escolha) {
                case "1", "if":
                    System.out.println("O if:\n");
                    System.out.println("if (Condição) Instrução;");
                    System.out.println("else Instrução;");
                    break;

                case "2", "switch":
                    System.out.println("O Switch:\n");
                    System.out.println("Switch (Expressão) {");
                    System.out.println("    case Constante:");
                    System.out.println("        Código");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        System.out.print(Mensagem de erro/exceção)");
                    System.out.println("}");
                    break;

                case "3", "for":
                    System.out.println("O for:\n");
                    System.out.println("for(Init; Condição; Instrução)");
                    System.out.println("Código;");
                    break;

                case "4", "while":
                    System.out.println("O While:\n");
                    System.out.println("while (Condição) Instrução;");
                    break;

                case "5", "do-while":
                    System.out.println("O do-while:\n");
                    System.out.println("do {");
                    System.out.println("    Código");
                    System.out.println("} while (condição);");
                    break;

                default:
                    System.out.print("Seleção não encontrada");
                    validacao = false;
            }
            if(validacao){
                System.out.println("\nAperte enter para continuar");
                sc.nextLine();
                sc.nextLine();
            }
        }
    }
}