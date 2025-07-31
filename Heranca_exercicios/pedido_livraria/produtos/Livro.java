public class Livro extends Produto {
    private String autor;
    private int paginas;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
        this.autor = autor;
        this.paginas = paginas;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido() {
        return precoBruto * 1.15; 
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
}
