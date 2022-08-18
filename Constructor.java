import java.util.Scanner;
/*
En un estacionamiento cobran $ 1.500 por hora o fracción. Diseñe un algoritmo
que determine cuanto debe pagar un cliente por el estacionamiento de su vehículo,
conociendo el tiempo de estacionamiento en horas y minutos*/
public class Code2_conditionals {

    public static void main(String[] args) {
        Scanner data_in = new Scanner(System.in);
        int tiempo;
        System.out.println("Digite el tiempo de estacionamiento en minutos: ");
        tiempo=data_in.nextInt();

        float residuo = tiempo%60;
        float aux = tiempo/60;
        int entero = (int)aux;
        float total;

        if(residuo>0){
            total = entero *1500 + 1500;
            System.out.println("Total a pagar\n" + total);
        }
        else{
            total =entero*1500;
            System.out.println("Total a pagar\n" + total);
        }
    }

}