package br.com.arquitetura.controller;

import br.com.arquitetura.entity.Pessoa;
import br.com.arquitetura.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>("Lista de Pessoas", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public void findById( @PathVariable int id){

    }

    @PostMapping
    public void save( @RequestBody Pessoa pessoa ){

    }

    @PutMapping("/{id}")
    public void update(  @PathVariable int id, @RequestBody Pessoa pessoa){

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

    }

}
