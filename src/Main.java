//Página 72 - Criar um sistema de ajuda para a linguagem Java
public class Main {
    public static void main(String[] args)
        throws java.io.IOException {
            char escolha, ignorar;

            do {
                System.out.println("Ajuda com:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do while\n");
                System.out.println("Escolha um: ");

                escolha = (char) System.in.read();

                do {
                    ignorar = (char) System.in.read();
                } while (ignorar != '\n');
            } while( escolha < '1' | escolha > '5' );

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
                    System.out.println("        Código");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        System.out.print(Mensagem de erro/exceção)");
                    System.out.println("}");
                    break;

                case '3':
                    System.out.println("O for:\n");
                    System.out.println("for(Init; Condição; Instrução)");
                    System.out.println("Código;");
                    break;

                case '4':
                    System.out.println("O While:\n");
                    System.out.println("while (Condição) Instrução;");
                    break;

                case '5':
                    System.out.println("O do-while:\n");
                    System.out.println("do {");
                    System.out.println("    Código");
                    System.out.println("} while (condição);");
                    break;

                default:
                    System.out.print("Seleção não encontrada");
            }
        }
    }