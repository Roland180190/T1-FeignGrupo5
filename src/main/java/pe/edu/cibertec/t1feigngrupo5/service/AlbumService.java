package pe.edu.cibertec.t1feigngrupo5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restclient.albums.iclient.AlbumClient;
import pe.edu.cibertec.t1feigngrupo5.restclient.albums.model.AlbumsPlaceHolder;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumClient albumClient;

    public List<AlbumsPlaceHolder> obtenerAlbumsFiltrados() {

        return albumClient.obtenerAlbums()
                .stream()
                .filter(album ->
                        album.getUserId() != null &&
                                album.getUserId() % 2 == 0)
                .filter(album ->
                        album.getId() != null &&
                                album.getId() % 2 != 0)
                .toList();
    }
}