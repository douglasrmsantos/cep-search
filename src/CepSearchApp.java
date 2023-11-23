import douglasrafael.com.github.models.cep.CepService;

import java.util.Scanner;

public class CepSearchApp {
    private static CepService cepService = new CepService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cep;

        do {
            System.out.println("Type the CEP or exit: ");
            cep = scanner.nextLine();

            cepService.requestCep(cep);

            if (cep.equalsIgnoreCase("exit")) {
                break;
            }

        } while (!cep.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
