T1-FeignGrupo5

Tecnologías utilizadas

- Java 25
- Spring Boot 4.1.1
- Spring Cloud 2025.1.3
- OpenFeign
- Lombok
- Maven

Descripción

Este repositorio consume tres APIs externas mediante Feign Client y aplica filtros sobre la información obtenida.

Ejercicio 1 - Albums

API consumida:

GET https://jsonplaceholder.typicode.com/albums

Condiciones:

- `userId` debe ser par.
- `id` debe ser impar.

Endpoint local:

GET http://localhost:8080/api/albums

Ejercicio 2 - GitHub Events

API consumida:

GET https://api.github.com/events

Condiciones:

- `type` debe ser `PushEvent`.
- `actor.id` debe ser impar.

Endpoint local:

GET http://localhost:8080/api/github-events

Ejercicio 3 - FakeStore Users

API consumida:

GET https://fakestoreapi.com/users

Condiciones:

- `id` debe ser par.
- `username` debe tener más de 6 caracteres.

Endpoint local:

GET http://localhost:8080/api/fake-users

