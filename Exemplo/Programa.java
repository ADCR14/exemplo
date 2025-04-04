import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CheckList checkList = new CheckList();

        System.out.println("Digite como o veículo chegou na oficina");

        checkList.entrada = sc.nextLine();

        System.out.println("Digite como o veículo saiu da oficina");
        checkList.saida = sc.nextLine();


        System.out.println("=======================");
        System.out.println("CheckList: " + checkList.entrada);
        System.out.println("CheckList: " + checkList.saida);
        System.out.println("========================");
        sc.close();
    }



}