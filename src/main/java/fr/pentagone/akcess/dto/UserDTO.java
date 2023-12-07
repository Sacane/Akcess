package fr.pentagone.akcess.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// Api to server
public record UserDTO(@NotNull @NotBlank String username, @NotNull @NotBlank String password) {
}
