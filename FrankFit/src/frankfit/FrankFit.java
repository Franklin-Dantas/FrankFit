package frankfit;

import java.util.Scanner;

public class FrankFit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cliente c = new Cliente();
        Cliente[] vetorCliente = new Cliente[15];

        vetorCliente[0] = new Cliente("Rodrigo", "000.000.000-01", "Trapezio Descendente", 1, false, 0.0);
        vetorCliente[1] = new Cliente("Chris", "000.000.000-13", "Prancha", 2, false, 0.0);
        vetorCliente[2] = new Cliente("Franks", "000.000.000-02", "Supino Reto", 3, false, 0.0);
        vetorCliente[3] = new Cliente("Tay", "000.000.000-03", "Elevação de quadril", 4, true, 110.0);
        vetorCliente[4] = new Cliente("Camila", "000.000.000-04", "Máquinas adutoras", 5, true, 110.0);
        vetorCliente[5] = new Cliente("Alex", "000.000.000-05", "Abdominal inferior", 6, false, 0.0);
        vetorCliente[6] = new Cliente("Lucas", "000.000.000-06", "Abdominal latera", 7, false, 0.0);
        vetorCliente[7] = new Cliente("Frandy", "000.000.000-07", "Supino sentado", 8, false, 0.0);
        vetorCliente[8] = new Cliente("Froquin", "000.000.000-08", "Mesa flexora", 9, true, 440.0);
        vetorCliente[9] = new Cliente("Fred", "000.000.000-09", "Tríceps coice com halteres", 10, true, 110.0);
        vetorCliente[10] = new Cliente("Franklin", "000.000.000-10", "Remada Baixa", 11, false, 0.0);
        vetorCliente[11] = new Cliente("Alexa", "000.000.000-11", "Flexão", 12, false, 0.0);
        vetorCliente[12] = new Cliente("Aron", "000.000.000-12", "Levantamento pelvico", 13, false, 0.0);

        int opcao = 0;
        int matricula = 0;

        do {
            System.out.println("  Academia FrankFit ");
            System.out.println(" Cadastro de clientes");

            System.out.println("1. Todos os clientes ");
            System.out.println("2. Procurar por um cliente expecifico");
            System.out.println("3. Lista de clientes devedores");
            System.out.println("4. Modifica cliente");
            System.out.println("5. Mostrar Devedores");

            System.out.println("6. Sair do programa");

            System.out.println("Você escolheu a opção: ");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolheu mostrar todos os clientes ");
                    c.mostrarTodosCliente(vetorCliente);
                    break;

                case 2:
                    
                    System.out.println("Escolheu mostrar clientes expecifico");
                    System.out.println("Qual a matricula do cliente: ");
                    matricula = s.nextInt();
                    c.mostrarClienteExp(vetorCliente, matricula);
                    break;

                case 3:
                    System.out.println("Escolheu mostrar lista de clientes devedores");
                    c.imprimeDevedores(vetorCliente);
                    break;

                case 4:
                    System.out.println("Escolheu modifica cliente");
                    System.out.println("Qual a matricula do cliente: ");
                    matricula = s.nextInt();                   
                    c.clienteExpMod(vetorCliente, matricula);
                    break;

                case 5:
                    System.out.println("5. Mostrar Devedores");
                    c.mostrarDevedores(vetorCliente);
                    break;

                case 6:
                    System.out.println("Até");
            }
        } while (opcao == 0);
    }
}
