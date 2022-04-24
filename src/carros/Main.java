package aula5;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Carro chevet = new Carro();
        Carro gol = new Carro();
        Carro hilux = new Carro();
        
        chevet.setPlaca("HBN-2329");
        chevet.setModelo("Sedan");

        gol.setPlaca("HBN-2329");
        gol.setModelo("Hat");

        hilux.setPlaca("HBN-3512");
        hilux.setModelo("Hat");
        
        System.out.println("escolha um numero de 1 a 3 para representar o carro escolhido");
        int Number_car = input.nextInt();
        
        Registroalu registr0 = new Registroalu();
        switch (Number_car){
        case 1:
            registr0. setCarroalugado(gol); // passing a object as a parameter
            System.out.println(" Gol car");
            break;
        case 2: 
            registr0.setCarroalugado(hilux);
            System.out.println(" hillux car");
            break;
        case 3: 
            registr0.setCarroalugado(chevet);
            System.out.println(" chevet car");
            break;
        }
        
        System.out.println("quanto custa para alugar o carro?");
        int custo =input.nextInt();
        input.close();
        registr0.setValorAluguel(custo);
        System.out.println("Ok: R$" + registr0.getValorAluguel());
        

	}

}
