import java.util.Scanner;

public class Lista01 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("QuestÃ£o: ");
    int q = sc.nextInt();

    switch (q) {
      case 1 -> questao1();
      case 2 -> questao2();
      case 3 -> questao3();
      case 4 -> questao4();
      case 5 -> questao5();
      case 6 -> questao6();
      case 7 -> questao7();
      case 8 -> questao8();
      case 9 -> questao9();
      case 10 -> questao10();
      case 11 -> questao11();
      case 12 -> questao12();
      case 13 -> questao13();
      case 14 -> questao14();
      case 15 -> questao15();
      case 16 -> questao16();
      default -> System.out.println("QuestÃ£o invÃ¡lida");
    }
  }

  // QuestÃµes
  // Desenvolva cada questÃ£o dentro dos mÃ©todos a seguir
  static void questao1() {
    int idade = 25;
        if (idade > 18) {
          System.out.println("É maior de idade");
        } else {
          System.out.println("É menor de idade");
        }
      }
  


  static void questao2() {
    int n = 15;
        if (n % 2 == 0) {
          System.out.println("O Numero é par");
        } else {
          System.out.println("O Numero é impar");
        }
  }

  static void questao3() {
    int x = 12;
    int y = 11;
      if (x > y) {
        System.out.println("X é maior que Y");
      } else if (x < y) {
        System.out.println("Y é maior que X");  
      }else {
        System.out.println("X e Y são iguais");
      }
  }

  static void questao4() {
    int n = 21;
     if (n < 20) {
       System.out.println("Está frio");
     } else {
        System.out.println("Está quente");
     }
  }

  static void questao5() {
    float nota = 6.8f;
    if (nota >= 6.8f) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }

  static void questao6() {
    int valor = 90;
    if (valor < 100) {
      System.out.println(valor * 0.50);
    } else {
      System.out.println(valor * 0.70);
    }
    
  

  }

  static void questao7() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  static void questao8() {
    int i = 2;
    int soma = 0;
    while (i <= 100) {
      soma = soma + i;
      i = i +2;
    }
    System.out.println(soma);
  }

  static void questao9() {
    int x = 2;
    for (int i = 1; i <= 10; i++) {
      System.out.println(x + "x" + i + "=" + (x * i));
    }
  }

  static void questao10() {
    int x = 5 ;
    int divisor = 0;

    for (int i = 1; i <= x; i++) {
      if (x % i == 0) {
        divisor++;
      }
    }
    if (divisor == 2) {
      System.out.println(x + " é um número primo");
    } else {
      System.out.println(x + " não é um número primo");
    }
  }

  static void questao11() {
    char letra = 'a';
    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("É uma vogal");
            break;
        default:
            System.out.println("Não é uma vogal");
    }
  }

  static void questao12() {
    
  }

  static void questao13() {
  }

  static void questao14() {
  }

  static void questao15() {
  }

  static void questao16() {
  }
}
