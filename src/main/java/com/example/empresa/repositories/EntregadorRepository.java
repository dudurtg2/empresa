package com.example.empresa.repositories;

import com.example.empresa.entities.Entregador;
import com.example.empresa.interfaces.IEntregadorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntregadorRepository implements IEntregadorRepository {

    @Override
    public List<Entregador> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Entregador buscarPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public Entregador gravar(Entregador entregador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gravar'");
    }

    @Override
    public Entregador atualizar(int id, Entregador entregador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

   
}
