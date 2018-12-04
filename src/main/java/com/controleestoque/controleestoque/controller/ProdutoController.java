package com.controleestoque.controleestoque.controller;


import com.controleestoque.controleestoque.model.Produto;
import com.controleestoque.controleestoque.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping()
    public Produto salvar (@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { produtoRepository.deleteById(id); }

    @GetMapping("/buscar")
    public List<Produto> buscar(){
        return  produtoRepository.findAll();
    }
}
