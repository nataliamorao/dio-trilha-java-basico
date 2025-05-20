import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(List<Cliente> clientes, List<Conta> contas) {
        this.clientes = clientes;
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
  }