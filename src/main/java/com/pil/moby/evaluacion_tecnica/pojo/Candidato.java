package com.pil.moby.evaluacion_tecnica.pojo;

import java.util.*;

public class Candidato implements Comparable{
    private Long id;
    private String name;
    private String lastname;
    private Integer yearsExperience;
    private Double salaryPretension;
    private List<Tecnologia> tecnologias;

    public Candidato(){

    }
    public Candidato(Long id, String name, String lastname, Integer yearsExperience, Double salaryPretension, List<Tecnologia> tecnologias) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.yearsExperience = yearsExperience;
        this.salaryPretension = salaryPretension;
        this.tecnologias = tecnologias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public Double getSalaryPretension() {
        return salaryPretension;
    }

    public void setSalaryPretension(Double salaryPretension) {
        this.salaryPretension = salaryPretension;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public List<Tecnologia> ordenarTecnologias(){
        Collections.sort(tecnologias, (Tecnologia t1, Tecnologia t2) -> t1.getNombre().compareTo(t2.getNombre()));
        return tecnologias;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Candidato candidato = (Candidato) obj;
        return Objects.equals(id, candidato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        Candidato c = (Candidato) o;
        return this.id.compareTo(c.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Candidato n??mero: ").append(this.id).append("\n").
                append("Nombre completo: ").append(this.name).append(" ").append(this.lastname).append("\n").
                append("A??os de experiencia: ").append(this.yearsExperience).append("\n").
                append("Pretencion salarial: ").append(this.salaryPretension).append("\n").
                append("Tecnologias: ").append(this.tecnologias).append("\n").
                append("==================================================");
        return sb.toString();
    }
}
