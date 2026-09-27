package pe.edu.cibertec.t1feigngrupo5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.iclient.FakeUserClient;
import pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.model.FakeUserDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeUserService {

    private final FakeUserClient fakeUserClient;

    public List<FakeUserDto> obtenerUsuariosFiltrados() {

        return fakeUserClient.obtenerUsuarios()
                .stream()
                .filter(usuario ->
                        usuario.getId() != null &&
                                usuario.getId() % 2 == 0)
                .filter(usuario ->
                        usuario.getUsername() != null &&
                                usuario.getUsername().length() > 6)
                .toList();
    }

}