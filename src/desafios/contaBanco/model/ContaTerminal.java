package desafios.contaBanco.model;

public class ContaTerminal {

    private Integer numero;
    private String nomeCliente;
    private String agencia;
    private Double saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numero, String nomeCliente, String agencia, Double saldo) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nomeCliente).append("\n");
        sb.append(agencia).append("\n");
        sb.append(numero).append("\n");
        sb.append(saldo).append("\n");
        return sb.toString();
    }
}
