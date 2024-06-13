package com.riwi.notas.api.dto.request;

import jakarta.validation.constraints.NotBlank;
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
}
