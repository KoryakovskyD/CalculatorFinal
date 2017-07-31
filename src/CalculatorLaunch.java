/**
 * Created by Дмитрий on 31.07.2017.
 */
import java.io.*;


public class CalculatorLaunch {
    public static void main(String[] args) throws Exception {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String sIn;

        try {
            System.out.println("Введте выражение для расчета. Поддерживаются цифры, операции +,-,*,/,^,% и приоритеты в виде скобок ( и ):");
            sIn = d.readLine();
            sIn = Calculator.opn(sIn);
            System.out.println(Calculator.calculate(sIn));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
