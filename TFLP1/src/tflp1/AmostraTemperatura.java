package tflp1;
import java.util.Scanner;

public class AmostraTemperatura{
  private int numseq;
  private Data data;
  private Hora hora;
  private float valor;

  public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v){
    this.data = new Data(a, b, c);
    this.hora = new Hora(d, e, f);
    
    setValor(v);
  }
  
  public AmostraTemperatura(){
    Scanner scan = new Scanner(System.in);
    float val;
    
    this.data = new Data();
    this.hora = new Hora();
    
    System.out.print("Digite o valor da temperatura: ");
    val = scan.nextFloat();

    setValor(val);
  }

  public AmostraTemperatura(Data d, Hora h, float v){
    this.data = d;
    this.hora = h;
    setValor(v);
  }
  
  public void setData(int a, int b, int c){
    this.data = new Data(a, b, c);
  }

  public void setData(){
    this.data = new Data();
  }

  public void setHora(int a, int b, int c){
    this.hora = new Hora(a, b, c);
  }

  public void setHora(){  
    this.hora = new Hora();
  }

  public void setValor(float v){
    this.valor = v;
    this.numseq += 1;
  }

  public void setValor(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o valor da temperatura: ");
    this.valor = scan.nextFloat();
    
    this.numseq += 1;
  }

  public int getNumSeq(){
    return (this.numseq);
  }

  public String getData(){
    String dt = this.data.mostra1();

    return dt;
  }

  public String getHora(){
    String hr = this.hora.getHora1();

    return hr;
  }

  public float getValor(){
    return this.valor;
  }
  
}
