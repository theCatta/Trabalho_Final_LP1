package tflp1;
import java.util.Scanner;

class Hora{
  //cria atributos
  private int hora;
  private int min;
  private int seg;
  
  //construtor para armazenar valor de atributos
  public Hora(){
    Scanner scan = new Scanner(System.in);
    int h, m, s;

    System.out.print("Insira o valor de Hora: ");
    h = scan.nextInt();
    while(h < 0 || h > 23)
    {
       System.out.println("!Valor inválido precisa ser entre 0-23!");
       System.out.print("Insira o valor de Hora: ");
       h = scan.nextInt();
     }

    System.out.print("Insira o valor de Minuto: ");
    m = scan.nextInt();
    while(m < 0 || m > 59)
    {
      System.out.println("!Valor inválido precisa ser entre 0-59!");
      System.out.print("Insira o valor de Minuto: ");
      m = scan.nextInt();
    }

    System.out.print("Insira o valor de Segundo: ");
    s = scan.nextInt();
    while(s < 0 || s > 59)
    {
      System.out.println("!Valor inválido precisa ser entre 0-59!");
      System.out.print("Insira o valor de Segundo: ");
      s = scan.nextInt();      
    }

    this.hora = h;
    this.min = m;
    this.seg = s;
  }
  
  //construtor para definir os atributos da classe
  public Hora(int hora, int min, int seg){
    this.hora = hora;
    this.min = min;
    this.seg = seg;
  }

  //destrutor
  public void finaliza(){
    this.hora = 0;
    this.min = 0;
    this.seg = 0;
  }

  //métodos para armazenar valores individuais
  public void setHor(){
    Scanner scan = new Scanner(System.in);
    int h;
    
    System.out.print("Insira o valor de Hora: ");
    h = scan.nextInt();
    while(h < 0 || h > 23)
    {
       System.out.println("!Valor inválido precisa ser entre 0-23!");
       System.out.print("Insira o valor de Hora: ");
       h = scan.nextInt();
     }

    System.out.println("");
    
    setHor(h);
  }
  
  public void setMin(){
    Scanner scan = new Scanner(System.in);
    int m;
    
    System.out.print("Insira o valor de Minuto: ");
    m = scan.nextInt();
    while(m < 0 || m > 59)
    {
      System.out.println("!Valor inválido precisa ser entre 0-59!");
      System.out.print("Insira o valor de Minuto: ");
      m = scan.nextInt();
    }

    System.out.println("");
    
    setMin(m);
  }
  
  public void setSeg(){
    Scanner scan = new Scanner(System.in);
    int s;
    
    System.out.print("Insira o valor de Segundo: ");
    s = scan.nextInt();
    while(s < 0 || s > 59)
    {
      System.out.println("!Valor inválido precisa ser entre 0-59");
      System.out.print("Insira o valor de Segundo: ");
      s = scan.nextInt();      
    }

    System.out.println("");

    setSeg(s);
  }

  //métodos para definir valores individuais
  public void setHor(int h){
    this.hora = h;
  }
  
  public void setMin(int m){
    this.min = m;
  }
  
  public void setSeg(int s){
    this.seg = s;
  }

  //métodos para mostrar valores individuais
  public int getHor(){
    return this.hora;
  }
  
  public int getMin(){
    return this.min;
  }
  
  public int getSeg(){
    return this.seg;
  }

  //método para mostrar hora formato 24h
  public String getHora1(){
    String hora1;

    hora1 = String.valueOf(this.hora) + ":" + String.valueOf(this.min) + ":" + String.valueOf(this.seg);
    
    return hora1;
  }

  //método para mostrar hora fomato 12h
  public String getHora2(){
    String hora2, periodo;
    int h = this.hora;
    
    if(hora > 12){
      h -= 12;
      periodo = " PM";
    } else if (hora == 00){
      h = 12;
      periodo = " AM";
    } else if(hora == 12){
      periodo = " PM";
    } else{
      periodo = " AM";
    }

    hora2 = String.valueOf(h) + ":" + String.valueOf(this.min) + ":" + String.valueOf(this.seg) + periodo;
    
    return hora2;
  }

  //método para mostrar hora em segundos
  public int getSegundos(){
    int total;

    total = (3600 * this.hora) + (this.min * 60) + this.seg;
    
    return total;
  }
  
}
