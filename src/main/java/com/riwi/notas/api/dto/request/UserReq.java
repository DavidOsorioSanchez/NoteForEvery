package com.riwi.notas.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
  @NotBlank(message = "El nombre no puede estar vacio")
  @Size(max = 30, message = "El nombre del usuario tiene que ser maximo de 30 caracteres")
  private String name;
  @NotBlank(message = "El email no puede estar vacio")
  @Email(message = "El email es invalido")
  private String email;
  @NotBlank(message = "La contraseña no puede estar vacio")
  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$", message = "La contraseña no es valida")
  private String password;
}
