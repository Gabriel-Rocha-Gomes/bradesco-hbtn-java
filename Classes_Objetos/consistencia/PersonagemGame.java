public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual == 0) {
            this.setStatus("morto");
        } else if (this.saudeAtual > 0) {
            this.setStatus("vivo");
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tomarDano(int quantidadeDeDano) {
        int saude = this.saudeAtual -= quantidadeDeDano;
        if (saude < 0) {
            this.setSaudeAtual(0);
        } else {
            this.setSaudeAtual(saude);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        int saude = this.saudeAtual += quantidadeDeCura;
        if (saude > 100) {
            this.setSaudeAtual(100);
        } else {
            this.setSaudeAtual(saude);
        }
    }
}
