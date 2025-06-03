import java.util.Scanner;
public class SalaryIncrease {
    public static void main(String[] args) {
        int huvi; 
        double tsalin;
        double suuld;
        double zuruu;
        
        Scanner scanner = new Scanner(System.in);
        tsalin = scanner.nextDouble();
        
        if (tsalin >= 0 && tsalin <= 400.00) {
            suuld = tsalin + tsalin * 0.15; 
            zuruu = tsalin * 0.15;
            huvi = 15;
        } else if (tsalin >= 400.01 && tsalin <= 800.00) {
            suuld = tsalin + tsalin * 0.15; 
            zuruu = tsalin * 0.15;
            huvi = 12;
        } else if (tsalin >= 800.01 && tsalin <= 1200.00) {
            suuld = tsalin + tsalin * 0.1; 
            zuruu = tsalin * 0.1;
            huvi = 10;
        } else if (tsalin >= 1200.01 && tsalin <= 2000.00) {
            suuld = tsalin + tsalin * 0.07; 
            zuruu = tsalin * 0.07;
            huvi = 7;
        } else {
            suuld = tsalin + tsalin * 0.04; 
            zuruu = tsalin * 0.04;
            huvi = 4;
        }
        
        System.out.printf("Novo salario: %.2f%n", suuld);
        System.out.printf("Reajuste ganho: %.2f%n", zuruu);
        System.out.printf("Em percentual: %d %%\n", huvi);
        
        scanner.close();
    }
}

