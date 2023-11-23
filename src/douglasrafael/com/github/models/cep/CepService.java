package douglasrafael.com.github.models.cep;

public class CepService {

    public void requestCep(String cep) {

        if (cep.equalsIgnoreCase("exit")) {
            return;
        }

        if (cep.length() == 9 && cep.charAt(cep.length() - 4) == '-') {
            cep = cep.substring(0, cep.length() - 4) + cep.substring(cep.length() - 3);
        }
        if (cep.length() != 8 || !cep.matches("[0-9]+")) {
            System.out.println("CEP invalid.");
            return;
        }

        String adress = "https://viacep.com.br/ws/" + cep + "/json/";
        var recordCep = ViaCepApiJson.request(adress);

        if (!(recordCep.erro() == null)) {
            System.out.println("CEP not found.");
            return;
        }

        Cep cepFormated = new Cep(recordCep);
        System.out.println(ViaCepApiJson.request(adress));
        System.out.println(cepFormated);
    }
}
