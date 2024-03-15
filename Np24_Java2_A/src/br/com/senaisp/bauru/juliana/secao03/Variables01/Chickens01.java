package br.com.senaisp.bauru.juliana.secao03.Variables01;
public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	int eggsPerChicken = 5, chickenCount = 3, totalEggs = 0;
    	//Na segunda-feira Mr.Brown recolhe os ovos
    	totalEggs += eggsPerChicken * chickenCount++;
    	//Na terca-feira, Mr.Brown ganha uma galinha pela manhã
    	//chickenCount++;
    	totalEggs += eggsPerChicken * chickenCount;
    	//Na quarta-feira pela manhã um animal come metade das galinhas
    	chickenCount /= 2;
    	totalEggs += eggsPerChicken * chickenCount;
    	
        System.out.println(totalEggs);
    }   
}
