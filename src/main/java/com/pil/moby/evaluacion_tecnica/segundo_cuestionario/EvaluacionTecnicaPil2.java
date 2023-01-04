package com.pil.moby.evaluacion_tecnica.segundo_cuestionario;

import com.pil.moby.evaluacion_tecnica.pojo.Candidato;
import com.pil.moby.evaluacion_tecnica.pojo.Tecnologia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EvaluacionTecnicaPil2 {

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.
        resolverPunto1(inicializarCandidatos());

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2(inicializarCandidatos());

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3(inicializarCandidatos());

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4();

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5();

    }

    private static void resolverPunto1(List<Candidato> listaCandidatos) {
        Object[] candidatos = listaCandidatos.toArray();
        for (Object candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    private static void resolverPunto2(List<Candidato> candidatos) {
        Stream<Candidato> candidatosPorId = candidatos.stream().sorted();
        candidatosPorId.map(c -> String.valueOf(c.getId()).concat(" ")
                        .concat(c.getName().concat(" ").concat(c.getLastname())))
                .forEach(System.out::println);
    }

    private static void resolverPunto3(List<Candidato> candidatos) {
        Stream<Candidato> candidatosPorSalario = candidatos.stream();
        candidatosPorSalario.sorted(Comparator.comparingDouble(Candidato::getSalaryPretension).reversed())
                .map(c -> String.valueOf(c.getSalaryPretension()).concat(" ")
                        .concat(c.getName().concat(" ").concat(c.getLastname())))
                .forEach(System.out::println);
    }

    private static void resolverPunto4() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto5() {
        // TODO: Realizar implementación.
    }

    private static List<Candidato> inicializarCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();
        List<Tecnologia> tec = inicializarTecnologia();

        candidatos.add(new Candidato(3L, "John", "Doe", 3, 5000.00, Arrays.asList(tec.get(0), tec.get(1), tec.get(2))));
        candidatos.add(new Candidato(7L, "Matias", "Otamendi", 9, 3000.00 , Arrays.asList(tec.get(7), tec.get(0), tec.get(2))));
        candidatos.add(new Candidato(1L, "Joaquin", "Tagliafico", 6, 2000.00 , Arrays.asList(tec.get(6), tec.get(3))));
        candidatos.add(new Candidato(4L, "Gaston", "Mac Allister", 1, 5000.50 , Arrays.asList(tec.get(4), tec.get(3), tec.get(0))));
        candidatos.add(new Candidato(5L, "Pablo", "De Paul", 4, 9000.50 , Arrays.asList(tec.get(0))));
        candidatos.add(new Candidato(2L, "Lucas", "Di Maria", 7, 6000.00 , Arrays.asList(tec.get(0), tec.get(1), tec.get(2))));
        candidatos.add(new Candidato(10L, "Lionel", "Messi", 10, 10000.10 , Arrays.asList(tec.get(2), tec.get(4), tec.get(0))));
        candidatos.add(new Candidato(9L, "Julian", "Alvarez", 3, 5000.00 , Arrays.asList(tec.get(3), tec.get(6), tec.get(2), tec.get(0))));
        candidatos.add(new Candidato(8L, "Lula", "Martinez", 2, 1000.00 , Arrays.asList(tec.get(5), tec.get(0), tec.get(1))));
        candidatos.add(new Candidato(6L, "Agustin", "Dybala", 2, 1000.00 , Arrays.asList(tec.get(0), tec.get(5), tec.get(1))));

        return candidatos;
    }
    private static List<Tecnologia> inicializarTecnologia() {
        List<Tecnologia> tecnologias = new ArrayList<>();
        tecnologias.add(new Tecnologia(1L, "Java"));
        tecnologias.add(new Tecnologia(2L, "Angular"));
        tecnologias.add(new Tecnologia(3L, "SQL"));
        tecnologias.add(new Tecnologia(4L, "NoSQL"));
        tecnologias.add(new Tecnologia(5L, "Vue"));
        tecnologias.add(new Tecnologia(6L, ".NET"));
        tecnologias.add(new Tecnologia(7L, "MongoDB"));
        tecnologias.add(new Tecnologia(8L, "NodeJS"));

        return tecnologias;
    }

    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}