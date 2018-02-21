package com.diogocapela.pl02;

public class Main {
    
    public static void main(String[] args) {
        
        Data data1 = new Data();
        
        System.out.println(data1.toAnoMesDiaString());
        
        Data data2 = new Data(1974, 4, 25);
        
        System.out.println(data2.toAnoMesDiaString());
        
        System.out.println(data1.isMaior(data2));
        
        System.out.println(data1.calcularDiferenca(data2));
        
        Data dataHoje = new Data(2018, 2, 21);
        
        System.out.println(dataHoje.calcularDiferenca(2018, 12, 25));
        
        System.out.println(data2.determinarDiaDaSemana());
        
        System.out.println(Data.isAnoBissexto(1974));

    }
    
}
