public class Medico {
    // Atributos devem ser privados
    private int id;
    private String nome;
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String crm, String especialidade) {
        // Uso obrigatório de construtores, encapsulamento e validações básicas
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome do médico inválido.");
    
        if (crm == null || crm.isBlank())
            throw new IllegalArgumentException("CRM inválido.");

        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCrm() { return crm; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String toString() {
        return "Medico{id=" + id + ", nome='" + nome + "', crm='" + crm +
                "', especialidade='" + especialidade + "'}";
    }
}
