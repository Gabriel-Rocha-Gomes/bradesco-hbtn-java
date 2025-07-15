public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void tomarDano(int dano) {
        this.saudeAtual -= dano;
        if (this.saudeAtual < 0) {
            this.saudeAtual = 0;
        }
    }

    public void receberCura(int cura) {
        this.saudeAtual += cura;
        if (this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }
    }
}
