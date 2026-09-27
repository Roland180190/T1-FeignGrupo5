package pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.model.FakeUserDto;

import java.util.List;

@FeignClient(
        name = "fakeUserClient",
        url = "${api.fakestore.url}"
)
public interface FakeUserClient {

    @GetMapping("/users")
    List<FakeUserDto> obtenerUsuarios();

}