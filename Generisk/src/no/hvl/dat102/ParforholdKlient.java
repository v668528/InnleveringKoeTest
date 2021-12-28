package no.hvl.dat102;

public class ParforholdKlient {  
public static void main(String[] args) {
    Par<String> strPar = new Par<>("Ole", "Kari");   
    Par<Integer> intPar = new Par<>(2021, 2022);
    
    System.out.println(strPar);
    String maksStreng = strPar.maks();
    System.out.printf("stoerste %s%n",maksStreng);        
    //--------------------------------------
    System.out.println(intPar);
    int maksHeltall = intPar.maks();
    System.out.printf("stoerste %d%n",maksHeltall);      
  }
}

