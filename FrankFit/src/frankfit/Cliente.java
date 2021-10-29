package frankfit;

import java.util.Scanner;

/*
Atributos da classe Cliente:
Número da matrícula (int);
Nome do cliente (String);
Devedor (Boolean);
Quantidade devida (double); Obs: Se devedor = False, quantidade devida = 0.
Atividade (String).

Métodos da classe Cliente:
Getters e setters.
 */
public class Cliente {

    Scanner s = new Scanner(System.in);

    private String nome;
    private String cpf;
    private String atvd;
    private boolean devedor;
    private double divida;
    private int matricula;

    Cliente(String nome, String cpf, String atvd, int matricula, boolean devedor, double divida) {
        this.nome = nome;
        this.cpf = cpf;
        this.atvd = atvd;
        this.devedor = devedor;
        this.divida = divida;
        this.matricula = matricula;
    }

    Cliente() {
        super();
    }

    //Imprimir na tela a lista de clientes (matrícula, nome e atividade);
    public void mostrarTodosCliente(Cliente[] a) {
        for (int i = 0; i < a.length && a[i] != null; i++) {
            System.out.println("Matricula: " + a[i].getMatricula() + "\nNome: " + a[i].getNome() + "\nAtividade: " + a[i].getAtvd());
            System.out.println("");
        }
    }

    //Imprimir na tela a clientes expecifico (matricula);
    public void mostrarClienteExp(Cliente[] a, int findMatricula) {
        int cont = 0;
        for (int i = 0; i < a.length && a[i] != null; i++) {
            if (a[i].getMatricula() == findMatricula) {
                System.out.println(a[i]);
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("Cliente não encontrado!");
        }
    }

    //Modificar os dados de um cliente específico (matricula);                    
    public void clienteExpMod(Cliente[] a, int matricula) {
        String nome;
        String cpf;
        String atvd;
        boolean devedor;
        double divida;

        for (int i = 0; i < a.length && a[i] != null; i++) {
            if (matricula == a[i].getMatricula()) {

                System.out.println("Qual nome devera ser colocado? ");
                nome = s.nextLine();
                a[i].setNome(nome);
                s.nextLine();

                System.out.println("Qual cpf devera ser colocado? ");
                cpf = s.nextLine();
                a[i].setCpf(cpf);
                s.nextLine();

                System.out.println("Qual atividade devera ser colocado? ");
                atvd = s.nextLine();
                a[i].setAtvd(atvd);
                s.nextLine();

                System.out.println("É devedor?  ");
                System.out.println("Digite true se estiver devendo e false caso contrario.");
                devedor = s.nextBoolean();
                a[i].setDevedor(devedor);

                if (devedor == true) {
                    System.out.println("Qual o valor da divida? ");
                    divida = s.nextDouble();
                    a[i].setDivida(divida);
                } else {
                    a[i].setDivida(0.0);
                }

                System.out.println(a[i]);
                break;
            }

        }
    }

    //Imprimir na tela a clientes devedores ;
    public void mostrarDevedores(Cliente[] a) {
        int cont = 0;
        for (int i = 0; i < a.length && a[i] != null; i++) {
            if (a[i].isDevedor() == false) {
                cont++;
            }
        }
        System.out.println("Clientes que estão em dia: " + cont + "\nClientes que estão devendo: " + (15 - cont));
    }

    //Adicionar clientes (cliente);
    public void addCliente(Cliente[] a, String nome, String cpf, String atvd, int matricula, boolean devedor, double divida) {
        for (int i = 0; i < a.length && a[i] != null; i++) {

            if (a[i] == null) {
                Cliente x = new Cliente(nome, cpf, atvd, matricula, devedor, divida);
                a[i] = x;
                break;
            }

        }
    }

    //lista de devedores
    public void imprimeDevedores(Cliente[] a) {

        int t, cont = 0;
        Cliente atualCliente = new Cliente();
        Cliente[] vetorCliente = new Cliente[15];

        for (int i = 0; i < a.length && a[i] != null; i++) {
            if (a[i].isDevedor() == true) {
                vetorCliente[cont] = a[i];
                System.out.println(vetorCliente[cont]);
                cont++;
            }
            //decrescente buble sort
            /*  for (int g = 1; vetorCliente[g] < vetorCliente[4]; g++) {
                for (int j = 0; j < g; j++) {
                    if (vetorCliente[g].getDivida() > vetorCliente[j].getDivida()) {
                        atualCliente = vetorCliente[g];
                        vetorCliente[g] = vetorCliente[j];
                        vetorCliente[j] = atualCliente;
        }
    }
}
           //cresnte
           for (t = 0; t < vetorCliente.length; t++) {
                for (int w = 0; w < (vetorCliente.length - 1); w++) {
                    if (vetorCliente[w].getDivida() < vetorCliente[w + 1].getDivida()) {
                        atualCliente = vetorCliente[w];
                        vetorCliente[w] = vetorCliente[w + 1];
                        vetorCliente[w + 1] = atualCliente;
                    }
                }
            }
            System.out.println(vetorCliente[t]);*/
        }
    }

    public void matriNomeAtvd() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAtvd() {
        return atvd;
    }

    public void setAtvd(String atvd) {
        this.atvd = atvd;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return nome + ", " + cpf + ", " + atvd + ", " + matricula + ", " + devedor + ", " + divida + ", ";
    }

    
    
}
