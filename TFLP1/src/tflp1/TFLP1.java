package tflp1;

/**
 *Gabriel Ferreira de Souza
 *Guilherme Ferreira Santos
 */

public class TFLP1 {
    
    public static void main(String[] args) {
        
    //teste 1
    AmostraTemperatura t1 = new AmostraTemperatura(4, 2, 2003, 10, 55, 43, 23);

    //teste 2
    System.out.println("\n--------------------------------------");
    System.out.println("t1: ");
    System.out.println("A sequência de números é: " + t1.getNumSeq());
    System.out.println("A data é: " + t1.getData());
    System.out.println("A hora é: " + t1.getHora());
    System.out.println("A temperatura é: " + t1.getValor());
    System.out.println("--------------------------------------\n");

    //teste 3
    System.out.println("Instânciar t2: ");
    AmostraTemperatura t2 = new AmostraTemperatura();

    //teste 4
    System.out.println("\n--------------------------------------");
    System.out.println("t2: ");
    System.out.println("A sequência de números é: " + t2.getNumSeq());
    System.out.println("A data é: " + t2.getData());
    System.out.println("A hora é: " + t2.getHora());
    System.out.println("A temperatura é: " + t2.getValor());
    System.out.println("--------------------------------------\n");

    //teste 5
    System.out.println("Alterar t1: ");
    t1.setData();
    t1.setHora();
    t1.setValor();

    //teste 6
    System.out.println("\n--------------------------------------");
    System.out.println("t1: ");
    System.out.println("A sequência de números é: " + t1.getNumSeq());
    System.out.println("A data é: " + t1.getData());
    System.out.println("A hora é: " + t1.getHora());
    System.out.println("A temperatura é: " + t1.getValor());
    System.out.println("--------------------------------------\n");
    }
    
}
