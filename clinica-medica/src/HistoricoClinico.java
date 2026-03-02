public class HistoricoClinico {

    private Paciente paciente;
    private String descricao;

    public HistoricoClinico(Paciente paciente) {
        if (paciente == null)
            throw new IllegalArgumentException("Paciente obrigatório.");

        this.paciente = paciente;
        this.descricao = "";
    }

    //Histórico não aceita texto vazio
    public void adicionarRegistro(String texto) {
        if (texto == null || texto.isBlank())
            throw new IllegalArgumentException("Descrição não pode ser vazia.");

        this.descricao += texto + "\n";
    }

    public Paciente getPaciente() { return paciente; }
    public String getDescricao() { return descricao; }
}