package com.riwi.notas.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoteReq {
  @NotBlank(message = "El titulo no puede estar vacio")
  private String title;
  @NotBlank(message = "El contenido no puede estar vacio")
  private String content;
  @NotNull(message = "El usuario tiene que tener notas")
  private String userId;
}
