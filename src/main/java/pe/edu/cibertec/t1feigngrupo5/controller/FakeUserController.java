package pe.edu.cibertec.t1feigngrupo5.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.model.FakeUserDto;
import pe.edu.cibertec.t1feigngrupo5.service.FakeUserService;

import java.util.List;

@RestController
@RequestMapping("/api/fake-users")
@RequiredArgsConstructor
public class FakeUserController {

    private final FakeUserService fakeUserService;

    @GetMapping
    public ResponseEntity<List<FakeUserDto>> obtenerUsuarios() {

        return ResponseEntity.ok(
                fakeUserService.obtenerUsuariosFiltrados()
        );
    }

}