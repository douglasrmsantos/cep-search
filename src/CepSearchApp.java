import java.util.Scanner;

import douglasrafael.com.github.models.Cep;
import douglasrafael.com.github.models.ViaCepApiJson;

public class CepSearchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cep = "";

        while (!cep.equalsIgnoreCase("exit")) {

            System.out.println("Type the CEP: ");
            cep = scanner.nextLine().replace("-", "");

            if (cep.equalsIgnoreCase("exit")) {
                break;
            }

            if (cep.length() != 8) {
                System.out.println("CEP invalid.");
                continue;
            }

            String adress = "https://viacep.com.br/ws/" + cep + "/json/";

            if (ViaCepApiJson.requestCep(adress).erro() == null) {
                Cep cepFormated = new Cep(ViaCepApiJson.requestCep(adress));
                System.out.println(ViaCepApiJson.requestCep(adress));
                System.out.println(cepFormated);

            } else {
                System.out.println("CEP not found.");
            }

        }
        scanner.close();
    }
}
