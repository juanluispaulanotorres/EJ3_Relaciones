package com.example.EJ2DTOCrud;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface iPersona {
    PersonaOutputDTO addPersona(PersonaInputDTO personaInputDTO) throws Exception;
    List<PersonaOutputDTO>  listaPersonas();
    PersonaOutputDTO idPersona(int id) throws Exception;
    PersonaOutputDTO usuarioPersona(String usuario);
    void modificaPersona(int id, PersonaInputDTO persona) ;
    void eliminaPersona(@PathVariable int id) throws Exception;
}
