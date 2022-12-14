package com.pil.moby.evaluacion_tecnica.pojo;

import java.util.Objects;

public class Tecnologia {
    private Long id;
    private String nombre;

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static boolean esIdPar(Long id){
        return id % 2 == 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tecnologia tecnologia = (Tecnologia) obj;
        return Objects.equals(id, tecnologia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + ")"+ " " + nombre;
    }
}
