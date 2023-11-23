package douglasrafael.com.github.models.cep;


public class Cep {
    private String cep;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String ddd;

    public Cep(RecordCep recordCep) {
        this.cep = recordCep.cep();
        this.street = recordCep.logradouro();
        this.complement = recordCep.complemento();
        this.neighborhood = recordCep.bairro();
        this.city = recordCep.localidade();
        this.state = recordCep.uf();
        this.ddd = recordCep.ddd();
    }

    public String getCep() {
        return this.cep;
    }

    public String getStreet() {
        return this.street;
    }

    public String getComplement() {
        return this.complement;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getDdd() {
        return this.ddd;
    }

    @Override
    public String toString() {
        return "Cep [cep=" + cep + ", street=" + street + ", complement=" + complement + ", neighborhood=" + neighborhood
                + ", city=" + city + ", state=" + state + ", ddd=" + ddd + "]";
    }
}
