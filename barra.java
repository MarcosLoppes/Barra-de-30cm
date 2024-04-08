import java.util.Scanner;
public class barra{
    public static void main (String[] args){
       
       double cargaMaxima = 220000;
       double limiteEscoamento = 310;
       double tensaoMaxima = 565;
       double fatorSegurança = 5;
       double densidadeAco = 7.85;
       double custoPorQuilograma = 44.00;
       double densidadeAcoKgM3 = 1000;
       double cargaPorBarra = cargaMaxima / 2;
       double tensaoPermitida = limiteEscoamento / fatorSegurança;
       double areaNecessaria = cargaPorBarra / tensaoPermitida;
       double diametroNecessario = Math.sqrt((4 * areaNecessaria) / Math.PI);
       double diametroNecessariocm = diametroNecessario * 100;
       double volumeBarra = Math.PI * Math.pow(diametroNecessariocm /2, 2) * 30;
       double massaBarra = volumeBarra * densidadeAcoKgM3 / 1000000;
       double custoBarra = massaBarra * custoPorQuilograma;
       
       System.out.println("Diâmetro necessário para suportar a carga: " + diametroNecessariocm + " cm");
       System.out.println("Custo de uma barra de 30cm: R$" + custoBarra);
    }
}
