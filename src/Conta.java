public class Conta {
    String conta;
    String senha;
    String nome;
    double saldo;
    boolean especial;
    double limite;


    public Conta(String conta, String senha, String nome, double saldo, boolean especial, double limite) {
        this.conta = conta;
        this.senha = senha;
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "conta='" + conta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", especial=" + especial +
                '}';
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