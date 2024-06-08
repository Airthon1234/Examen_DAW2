package pe.edu.cibertec.DAWII_T1_Airthon_Randal_Cochachin_Ortiz.model.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private Integer idusuario;
    private String nomusuario;
    private String nombres;
    private String apellidos;
    private Boolean activo;
    private String email;
}