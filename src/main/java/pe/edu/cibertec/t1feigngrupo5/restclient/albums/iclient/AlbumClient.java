package pe.edu.cibertec.t1feigngrupo5.restclient.albums.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restclient.albums.model.AlbumsPlaceHolder;

import java.util.List;

@FeignClient(
        name = "albumClient",
        url = "${api.jsonplaceholder.url}"
)
public interface AlbumClient {

    @GetMapping("/albums")
    List<AlbumsPlaceHolder> obtenerAlbums();
}