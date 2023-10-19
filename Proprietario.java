public class Proprietario {
    String nome;
    int cnh;
    int anoNascimento;

    public Proprietario() {
        this("", 0, 0);
    }

    public Proprietario(String nome) {
        this(nome, 0, 0);
    }

    public Proprietario(String nome, int cnh) {
        this(nome, cnh, 0);
    }

    public Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    public int getIdade(int anoReferencia) {
        return anoReferencia - anoNascimento;
    }

    public String getDescricao() {
        String desc = "Proprietario: nome=" + nome + ", cnh=" + cnh + ", anoNascimento=" + anoNascimento + ".";
        return desc;
    }
}



