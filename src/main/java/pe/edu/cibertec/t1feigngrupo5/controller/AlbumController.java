package pe.edu.cibertec.t1feigngrupo5.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo5.restclient.albums.model.AlbumsPlaceHolder;
import pe.edu.cibertec.t1feigngrupo5.service.AlbumService;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping
    public ResponseEntity<List<AlbumsPlaceHolder>> obtenerAlbums() {

        return ResponseEntity.ok(
                albumService.obtenerAlbumsFiltrados()
        );
    }
}