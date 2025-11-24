import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            canal.notificar(
                    new Mensagem(
                            format("%s - %s", video.getArquivo(), video.getFormatoVideo()), TipoMensagem.LOG)
            );
        }
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }
}
