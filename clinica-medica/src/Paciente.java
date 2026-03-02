import java.time.LocalDate;

public class Paciente {
    // Atributos devem ser privados
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Paciente(int id, String nome, String cpf, LocalDate dataNascimento) {
        // Uso obrigatório de construtores, encapsulamento e validações básicas
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome do paciente inválido.");

        if (cpf == null || cpf.isBlank())
            throw new IllegalArgumentException("CPF inválido.");

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public LocalDate getDataNascimento() { return dataNascimento; }

    @Override
    public String toString() {
        return "Paciente{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}