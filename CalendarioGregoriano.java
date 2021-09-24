import javax.swing.JOptionPane;

/*
Nosso calendário atual é Gregoriano.
Faça um método que receba como argumento o dia, mês e ano do nosso calendário gregoriano, e retorne o
número do dia correspondente no calendário Juliana

Fórmula : data_juliana = (1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12 )))/12-
(3*((ano+4900+(mes-14)/12)/100))/4+dia-32075

Para testar informe para a função a data de inicio das olimpíadas do Brasil 05 de Agosto de 2016. O resultado deverá ser : 2457606
 */
public class CalendarioGregoriano {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano: "));
        System.out.println("Data Gragoriana: " + dia + "/" + mes + "/" + ano);
        Calcular(dia, mes, ano);

    }
    private static void Calcular(int dia,int mes ,int ano){
        int data_juliana;
        data_juliana = (1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12 )))/12-
                (3*((ano+4900+(mes-14)/12)/100))/4+dia-32075;
        System.out.println("Data Juliana: " + data_juliana);
    }
}


