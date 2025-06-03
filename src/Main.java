//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
                    System.out.println("if (condição) instrução;");
                    System.out.println("else instrução;");
                    break;
            }
        }
    }