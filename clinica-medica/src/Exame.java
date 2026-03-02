public class Exame {
    // Atributos devem ser privados
    private String nome;
    private int prazoDias;
    private Paciente paciente;

    public Exame(String nome, int prazoDias, Paciente paciente) {
        // Uso obrigatório de construtores, encapsulamento e validações básicas
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome do exame inválido.");

        // Exame deve ter prazo > 0
        if (prazoDias <= 0)
            throw new IllegalArgumentException("Prazo do exame deve ser maior que zero.");

        if (paciente == null)
            throw new IllegalArgumentException("Paciente não pode ser nulo.");

        this.nome = nome;
        this.prazoDias = prazoDias;
        this.paciente = paciente;
    }

    public String getNome() { return nome; }
    public int getPrazoDias() { return prazoDias; }
    public Paciente getPaciente() { return paciente; }
}