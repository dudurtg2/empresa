package com.example.empresa.facades;

import com.example.empresa.applications.EmpresaApplication;
import com.example.empresa.entities.Empresa;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmpresaFacade {
    private EmpresaApplication empresaApplication;

    public EmpresaFacade(EmpresaApplication empresaApplication) {
        this.empresaApplication = empresaApplication;
    }
    
    
    public List<Empresa> findAll() {
        return this.empresaApplication.findAll();
    }

    
    public Empresa findById(int id) {
        return this.empresaApplication.findById(id);
    }

    
    public Empresa save(Empresa Empresa) {
        return this.empresaApplication.save(Empresa);
    }

    
    public Empresa update(int id, Empresa Empresa) {
        return this.empresaApplication.update(id, Empresa);
    }

    
    public void deleteById(int id) {
        this.empresaApplication.deleteById(id);
    }


   
}
