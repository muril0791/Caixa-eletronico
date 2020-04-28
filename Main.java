import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String cpf;
    String senha;
    double Saldo = 1000;
    int Depósito;
    int saque;
    int menu;
    int conta;
    int agencia;
    int valor;
    int banco;

    System.out.println("Bem vindo ao banco MuriloLegalBank");
    System.out.print("Digite seu CPF?");
    cpf = ler.next();
    for (int cpf2 = 1; cpf2 <= 3; cpf2++) {
      if (cpf.equals("123.456.789.00")) {
        System.out.println("CPF CORRETO! ");

      } else {
        switch (cpf2) {
        case 1:
          System.out.println("cpf incorreto, tente novamente! (MAIS 2 TENTATIVAS!");
          cpf = ler.next();
          break;
        case 2:
          System.out.println(" cpf incorreto, tente novamente! ( MAIS 1 TENTATIVA!");
          cpf = ler.next();
          break;
        case 3:
          System.out.println("cpf incorret0, tente novamente! ( ULTIMA TENTATIVA!!");
          cpf = ler.next();
          System.out.println(" ERRO DE CPF! Acesso negado ");
          System.exit(0);
        }
      }
    }
    System.out.println("Digite sua senha:");
    senha = ler.next();
    for (int senha2 = 1; senha2 <= 3; senha2++)
      if (senha.equals("01020304")) {
        System.out.println("Senha correta.");

      } else {
        switch (senha2) {
        case 1:
          System.out.println("Senha incorreta, tente novamente! (MAIS 2 TENTATIVAS!");
          cpf = ler.next();
          break;
        case 2:
          System.out.println("Senha incorreta, tente novamente! ( MAIS 1 TENTATIVA!");
          cpf = ler.next();
          break;
        case 3:
          System.out.println("Senha incorreta, tente novamente! ( ULTIMA TENTATIVA!!");
          cpf = ler.next();
          System.out.println(" ERRO DE Senha! Sua conta foi bloqueada por segurança! ");
          System.exit(0);
        }
      }
    System.out.println(" Você entrou na sua conta lindo(a)");

    System.out.println("Escolha uma opção:\n" + "Menu:\n" + "1 – Saldo \n" + "2 – Depósito \n" + "3 – Saque \n"
        + "4 - Transferencia \n" + "0 – Sair\n" + "Escolha uma opção, por favor:");
    menu = ler.nextInt();

    switch (menu) {
    case 1:
      System.out.println("O saldo da sua conta é: " + Saldo);
      break;
    case 2:
      System.out.println("Digite o valor do seu depósito: \n");
      Depósito = ler.nextInt();
      System.out.print("Depósito efetuado com sucesso! \n");
      Saldo = Saldo + Depósito;
      break;
    case 3:
      System.out.println("Digite o valor que deseja retirar: \n ");
      saque = ler.nextInt();
      System.out.println("Saque efetuado com sucesso \n");
      Saldo = Saldo - saque;
    case 0:
      System.out.print(" Sessão encerrada com sucesso, Obrigado! \n");
      System.exit(0);
    case 4:
      System.out.println("Digite a conta que voce deseja transferir: \n");
      conta = ler.nextInt();
      System.out.println("Digite o numero da agência: \n");
      agencia = ler.nextInt();
      System.out.println("Digite o numero do banco: \n");
      banco = ler.nextInt();
      System.out.println("Digite o valor que deseja transferir: \n");
      valor = ler.nextInt();
      System.out.println("Transferencia efetuada com sucesso no valor de R$" + valor);
      Saldo = Saldo - valor;
      System.out.println("Saldo na conta: R$" + Saldo);
      break;

    }

  }
}