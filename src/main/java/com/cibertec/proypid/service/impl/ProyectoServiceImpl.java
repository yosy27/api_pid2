package com.cibertec.proypid.service.impl;

import com.cibertec.proypid.model.entity.ProyectoEntity;
import com.cibertec.proypid.repository.ProyectoRepository;
import com.cibertec.proypid.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public ProyectoEntity registrarProyecto(ProyectoEntity proyecto) {
        return proyectoRepository.save(proyecto);
    }
}
