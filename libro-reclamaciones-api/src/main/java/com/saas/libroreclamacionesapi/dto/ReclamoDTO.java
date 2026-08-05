package com.saas.libroreclamacionesapi.dto;

import com.saas.libroreclamacionesapi.TipoBien;
import jakarta.validation.constraints.*;

public record ReclamoDTO(
        @NotBlank
        String tipoDocumento,
        @NotBlank
        String numeroDocumento,
        @NotBlank
        String nombreCompleto,
        @Email
        @NotBlank
        String correo,
        @NotNull
        TipoBien tipoBien,
        @NotBlank
        @Size(min = 10, max = 1000)
        String descripcion
){}
