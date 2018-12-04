package com.controleestoque.controleestoque.controller;

import com.controleestoque.controleestoque.model.Usuario;
import com.controleestoque.controleestoque.repository.CadastroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/usuario" )
public class CadastroController {

    CadastroRepository cadastroRepository;

     public CadastroController(CadastroRepository cadastroRepository){
         this.cadastroRepository = cadastroRepository;
     }

    @PostMapping()
    public  Usuario  salvar ( @RequestBody Usuario usuario) {
        return cadastroRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { cadastroRepository.deleteById(id); }

    @GetMapping("/buscar")
    public List<Usuario> buscar(){
    return  cadastroRepository.findAll();
    }

}
