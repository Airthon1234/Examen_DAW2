package pe.edu.cibertec.DAWII_T1_Airthon_Randal_Cochachin_Ortiz.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultadoDto {
    private Boolean respuesta;
    private String mensaje;
}