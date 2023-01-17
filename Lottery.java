package Variavels.test;

import java.util.HashMap;
import java.util.Random;

public class Lottery {
    public static <Radom> void main(String[] args) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(60) + 1; // gera um número aleatório entre 1 e 60

            if (numbers.containsKey(num)){
                numbers.put(num, numbers.get(num) + 1);
            }else{
                numbers.put(num,1);
            }
        }
        System.out.println("Número Frequência");
        for (int num : numbers.keySet()) {
            System.out.println(num + " " + numbers.get(num));

        }

    }
}
