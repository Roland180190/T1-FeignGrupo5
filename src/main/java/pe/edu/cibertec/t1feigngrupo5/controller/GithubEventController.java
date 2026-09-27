package pe.edu.cibertec.t1feigngrupo5.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo5.restclient.github.model.GithubEventDto;
import pe.edu.cibertec.t1feigngrupo5.service.GithubEventService;

import java.util.List;

@RestController
@RequestMapping("/api/github-events")
@RequiredArgsConstructor
public class GithubEventController {

    private final GithubEventService githubEventService;

    @GetMapping
    public ResponseEntity<List<GithubEventDto>> obtenerEventos() {

        return ResponseEntity.ok(
                githubEventService.obtenerEventosFiltrados()
        );
    }

}