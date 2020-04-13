package br.com.arquitetura.service;


import br.com.arquitetura.entity.Pessoa;
import br.com.arquitetura.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public List<Pessoa> findAll(){
        return null;
    }

    public Pessoa findById( int id){
        return null;
    }

    public boolean save(Pessoa pessoa){
        return false;
    }

    public boolean delete(int id){
        return  false;
    }


}
