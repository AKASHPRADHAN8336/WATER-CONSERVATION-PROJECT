package com.example.UserService.dto;

import io.swagger.v3.oas.annotations.media.Schema;
//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;

@Schema(
        description = "UserDto model information"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    @NotEmpty(message = "username should not be empty and null.")
    @Schema(
            description = "Username"
    )
    private String username;
    @NotEmpty(message = "password should not be empty or null.")
    @Schema(
            description = "password"
    )
    private String password;
    @NotEmpty(message = "Your role cannot be empty or null.")
    @Schema(
            description = "role"
    )
    private String role;
}

