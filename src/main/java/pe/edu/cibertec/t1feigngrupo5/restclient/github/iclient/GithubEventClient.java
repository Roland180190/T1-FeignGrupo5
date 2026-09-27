package pe.edu.cibertec.t1feigngrupo5.restclient.github.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restclient.github.model.GithubEventDto;

import java.util.List;

@FeignClient(
        name = "githubEventClient",
        url = "${api.github.url}"
)
public interface GithubEventClient {

    @GetMapping("/events")
    List<GithubEventDto> obtenerEventos();

}