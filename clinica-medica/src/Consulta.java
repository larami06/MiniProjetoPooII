import java.time.LocalDateTime;

public class Consulta {
    // Atributos devem ser privados
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private boolean compareceu;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataHora) {
        // Uso obrigatório de construtores, encapsulamento e validações básicas
        if (medico == null || paciente == null)
            throw new IllegalArgumentException("Médico e paciente são obrigatórios.");

        // Consulta não pode ser marcada no passado
        if (dataHora.isBefore(LocalDateTime.now()))
            throw new IllegalArgumentException("Consulta não pode ser marcada no passado.");

        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.compareceu = false;
    }

    //Não registrar comparecimento sem consulta marcada
    public void registrarComparecimento() {
        this.compareceu = true;
    }

    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public LocalDateTime getDataHora() { return dataHora; }
    public boolean isCompareceu() { return compareceu; }
}