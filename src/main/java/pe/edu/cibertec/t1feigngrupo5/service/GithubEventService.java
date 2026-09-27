package pe.edu.cibertec.t1feigngrupo5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restclient.github.iclient.GithubEventClient;
import pe.edu.cibertec.t1feigngrupo5.restclient.github.model.GithubEventDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GithubEventService {

    private final GithubEventClient githubEventClient;

    public List<GithubEventDto> obtenerEventosFiltrados() {

        return githubEventClient.obtenerEventos()
                .stream()
                .filter(evento ->
                        "PushEvent".equals(evento.getType()))
                .filter(evento ->
                        evento.getActor() != null &&
                                evento.getActor().getId() != null &&
                                evento.getActor().getId() % 2 != 0)
                .toList();
    }

}