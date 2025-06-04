//Página 72 - Criar um sistema de ajuda para a linguagem Java
public class Main {
    public static void main(String[] args)
        throws java.io.IOException {
            char escolha;

            System.out.println("Ajuda com:");
            System.out.println("1. if");
            System.out.println("2. switch");

            escolha = (char) System.in.read();

            switch (escolha) {
                case '1':
                    System.out.println("O if:\n");
                    System.out.println("if (Condição) Instrução;");
                    System.out.println("else Instrução;");
                    break;

                case '2':
                    System.out.println("O Switch:\n");
                    System.out.println("Switch (Expressão) {");
                    System.out.println("    case Constante:");
                    System.out.println("        Instrução");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        System.out.print(Mensagem de erro/exceção)");
                    System.out.println("}");
                    break;
                default:
                    System.out.print("Seleção não encontrada");
            }
        }
    }