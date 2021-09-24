/*
Crie o jogo do Dinossauro - Skeep
O Skeep é um dinossauro e será um personagem que possui as seguintes características:
-energia
-velocidade
-temperatura
-humor

Comportamentos:
pular()
correr()
comer()
brincar()
tomarSol()
ficarNaSombra()

Regras:
O dinossauro precisa tomar Sol para ter velocidade, além de deixa-lo com mais humor
Precisa comer para ter energia, e comer melhora o humor também
Para cada ponto de velocidade ganho ele perde um ponto de energia
correr gasta energia deixa o humor feliz
ficarNaSombra recupera energia deixa o humor triste
brincar gasta energia e deixa o humor feliz
pular gasta energia e deixa o humor feliz

Faça uma classe chamada Dinossauro, contendo as características e comportamentos do Skeep.
Crie uma classe de Teste com o método main, que execute as seguintes atividades:
Crie uma instância do classe Dinossauro chamada de Skeep
Crie uma instância da classe Scanner chamada de scan
Em um loop inifinito
Mostre na tela as características do objeto Skeep
Mostre um menu de opções para o usuário com as seguintes opções:
(P)ular           co(R)rer               (C)omer
(B)rincar        Tomar (S)ol          Ficar na S(O)mbra
Pegue a primeira letra do que o usuário digitar como sendo a opção escolhida
String textoMaiusculo = scan.nextLine().toUpperCase();
char letra = textoMaiusculo.charAt(0);
Conforme a opção escolhida execute o método correspondente no objeto Skeep
 */

import javax.swing.*;
import java.util.Scanner;

class Teste{

    public static void main(String[] args) {

    Dinossauro skeep = new Dinossauro();

    Scanner scan = new Scanner(System.in);

    while (true){
        String textoMaiusculo = scan.nextLine().toUpperCase();
        char letra = textoMaiusculo.charAt(0);

      switch (letra){
        case 'P': skeep.pular();
            break;
        case 'C': skeep.comer();
            break;
        case 'R': skeep.correr();
            break;
        case 'B': skeep.brincar();
              break;
        case 'S': skeep.tomarSol();
              break;
        case 'O': skeep.ficarNaSombra();
              break;
          //default:
        // throw new IllegalStateException("Unexpected value: " + reino);
      }
    }
    }
}

 class Dinossauro{

     int energia= 3;
     int velocidade= 3;
     int temperatura = 3;
     int humor = 3;

    public void pular() {
        System.out.println("Pular");
        humor = humor +1;
        System.out.println("Seu humor subiu para:" + humor);
        energia = energia -1;
        System.out.println("Sua energia subiu para:" + energia);
    }
    public void correr() {
        System.out.println("Correr");
        humor = humor +1;
        System.out.println("Seu humor diminuiu para:" + humor);
        energia = energia -1;
        System.out.println("Sua energia subiu para:" + energia);

    }
    public void comer() {
        System.out.println("Comeeeeeeer!");
        System.out.println("Ficar na sombra");
        humor = humor +1;
        System.out.println("Seu humor subiu para:" + humor);
        energia = energia +1;
        System.out.println("Sua energia subiu para:" + energia);
    }
    public void brincar() {
        System.out.println("Brincar");
        System.out.println("Ficar na sombra");
        humor = humor +1;
        System.out.println("Seu humor subiu para:" + humor);
        energia = energia -1;
        System.out.println("Sua energia subiu para:" + energia);
    }
    public void tomarSol() {
        System.out.println("Vamos tomar um solzin?! ");
        humor = humor +1;
        System.out.println("Seu humor subiu para:" + humor);
        velocidade = velocidade +1;
        System.out.println("Sua velocidade subiu para:" + velocidade);
        energia = energia -1;
        System.out.println("Infelizmente sua energia diminuiu para:" + energia);

    }
    public void ficarNaSombra() {
        System.out.println("Ficar na sombra");
        humor = humor -1;
        System.out.println("Seu humor diminuiu para:" + humor);
        energia = energia +1;
        System.out.println("Sua energia subiu para:" + energia);
    }
}


