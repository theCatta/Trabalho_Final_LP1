package tflp1;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {
  //cria atributos
  private int dia;
  private int mes;
  private int ano;

  public Data(){
    Scanner scan = new Scanner(System.in);
    int d, m, a;

    do
    {
      //Obtenção do valor do dia
      System.out.print("Insira o Dia: ");
      d = scan.nextInt();
      while(d < 1 || d > 31)
      {
         System.out.println("Valor inválido! Precisa ser entre 0-31");
         System.out.print("Insira o Dia: ");
         d = scan.nextInt();
      }
      this.dia = d;
  
      //Obtenção do valor do mês
      System.out.print("Insira o Mês: ");
      m = scan.nextInt();
      while(m < 1 || m > 12)
      {
         System.out.println("Valor inválido! Precisa ser entre 0-12");
         System.out.print("Insira o Mês: ");
         m = scan.nextInt();
      }
      this.mes = m;
  
      //Obtenção do valor do ano
      System.out.print("Insira o Ano: ");
      a = scan.nextInt();
      while(a < 1)
      {
         System.out.println("Valor inválido! Precisa ser maior que 0");
         System.out.print("Insira o Ano: ");
         a = scan.nextInt();
      }
      this.ano = a;
      
      if(!checaMes()){
        System.out.print("Você colocou um dia não compatível com o Mês: \n");
      }
      
    }while(!checaMes());  
  }

  public Data(int d, int m, int a){
    setDia(d);
    setMes(m);
    setAno(a);
  }

  public void setDia(int d){
    this.dia = d;
  }

  public void setMes(int m){
    this.mes = m;
  }

  public void setAno(int a){
    this.ano = a;
  }

  public void setDia(){
    Scanner scan = new Scanner(System.in);
    int d;

    do{
      System.out.println("Insira um valor de dia: ");
      d = scan.nextInt();
      while(d < 1 || d > 31)
      {
         System.out.println("Valor inválido! Precisa ser entre 0-31");
         System.out.print("Insira o Dia: ");
         d = scan.nextInt();
      }
      this.dia = d;
        
      if(!checaMes()){
        System.out.print("Você colocou um dia não compatível com o Mês: \n");
      }
    } while(!checaMes());
    
  }

  public void setMes(){
    Scanner scan = new Scanner(System.in);
    int m;

    do{
      System.out.println("Insira um valor de mês: ");
      m = scan.nextInt();
      while(m < 1 || m > 12)
      {
         System.out.println("Valor inválido! Precisa ser entre 0-12");
         System.out.print("Insira o Mês: ");
         m = scan.nextInt();
      } 
      this.mes = m;
      
      if(!checaMes()){
        System.out.print("Você colocou um Mês não compatível com o Dia: \n");
      }
    }while(!checaMes());   
  }

  public void setAno(){
    Scanner scan = new Scanner(System.in);
    int a;
    
    do{
    System.out.println("Insira um valor de Ano: ");
    a = scan.nextInt();
    while(a < 1)
    {
       System.out.println("Valor inválido! Precisa ser maior que 0");
       System.out.print("Insira o Ano: ");
       a = scan.nextInt();
    }
    this.ano = a;
    
    if(!checaMes()){
        System.out.print("Você colocou um Ano não compatível com o Dia (bissexto): \n");
      }
    }while(!checaMes());
  }

  public int getDia(){
    return this.dia;
  }

  public int getMes(){
    return this.mes;
  }

  public int getAno(){
    return this.ano;
  }

  public boolean bissexto(){
    if(this.getAno() % 4 == 0 && (this.getAno() % 400 == 0 || this.getAno() % 100 != 0)){
      return true;
    } else {
      return false;
    }
  }

  public void apresentaDataAtual(){
    Date data = new Date();
    DateFormat formata = DateFormat.getDateInstance(DateFormat.FULL);
    String dt = formata.format(data);

    System.out.printf("\nData atual é: %s\n", dt);
  }

  public String mostra1(){
    String dt = String.valueOf(this.getDia()) + "/" + String.valueOf(this.getMes()) + "/" + String.valueOf(this.getAno());

    return dt;
  }

  public String mostra2(){
    String m = "", dt;
    switch(this.getMes()){
      case 1:
        m = "Janeiro";
        break;
      case 2:
        m = "Fevereiro";
        break;
      case 3:
        m = "Março";
        break;
      case 4:
        m = "Abril";
        break;
      case 5:
        m = "Maio";
        break;
      case 6:
        m = "Junho";
        break;
      case 7:
        m = "Julho";
        break;
      case 8:
        m = "Agosto";
        break;
      case 9:
        m = "Setembro";
        break;
      case 10:
        m = "Outubro";
        break;
      case 11:
        m = "Novembro";
        break;
      case 12:
        m = "Dezembro";
        break;
    }

    dt = String.valueOf(this.getDia()) + "/" + m + "/" + String.valueOf(this.getAno());

    return dt;
  }

  public int diasTranscorridos(){
    int dias = 0;
    
    for(int i = 0; i < this.getMes(); ++i){
      switch(i){
        case 4: case 6: case 9: case 11: 
          dias += 30;
          break;
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          dias += 31;
          break;
        case 2:
          if(this.bissexto()){
            dias += 29;
          }
          else dias += 28;
      }
    }

    dias += this.getDia();

    return dias;
    
  }

  private boolean checaMes(){
    boolean check = false;
    int d = this.getDia();
      
    switch(this.getMes()){
      case 4: case 6: case 9: case 11: 
        if(d < 31){
          check = true;
        }else{
          check = false;
        }
        break;
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        if(d <= 31){
          check = true;
        }else{
          check = false;
        }
        break;
      case 2:
        if(this.bissexto()){
          if(d <= 29){
            check = true;
          }else {
            check = false;
          }
        }
        else {
          if(d <= 28){
            check = true;
          }
        }
    }

    return check;
  }
}

