package com.lineate.pojolib.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ClientDtoResponse", description = "Client Info")
public class ClientResponse {

    @Schema(name = "id", description = "Client id", required = true, example = "1234")
    private long id;

    @Schema(name = "firstName", description = "Client firstName", required = true, example = "John")
    private String firstName;

    @Schema(name = "lastName", description = "Client lastName", required = true, example = "Doe")
    private String lastName;

    @Schema(name = "login", description = "Client login", required = true, example = "Client's E-mail recommended")
    private String login;

    @Schema(name = "role", description = "Client role", required = true, example = "USER")
    private String role;

    @Schema(name = "status", description = "Client status", required = true, example = "ACTIVE")
    private String status;
}