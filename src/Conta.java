public class Conta {
    String conta;
    String nome;
    double saldo;
    boolean especial;

    @Override
    public String toString() {
        return "Conta{" +
                "conta='" + conta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", especial=" + especial +
                '}';
    }

    public Conta(String conta, String nome, double saldo, boolean especial) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
