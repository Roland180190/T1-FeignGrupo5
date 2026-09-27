package pe.edu.cibertec.t1feigngrupo5.restclient.fakestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FakeUserDto {

    private Integer id;
    private String username;
    private String email;

}