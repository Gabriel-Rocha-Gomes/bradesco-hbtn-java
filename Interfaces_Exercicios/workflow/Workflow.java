import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    List<Atividade> atividades = new ArrayList<>();

    void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
