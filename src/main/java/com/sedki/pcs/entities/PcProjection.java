package com.sedki.pcs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomPc", types = { Pc.class })
public interface PcProjection {
    public String getNomPc();
}
