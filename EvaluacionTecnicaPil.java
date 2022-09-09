public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);
        // Desarrollo de la consigna 1.
            int nroI;
            double nroD;
            String textoEjemplo;
        
        imprimirConsigna(2);
        // Desarrollo de la consigna 2.
            nroI = 10;
            nroD = 3.5;
            textoEjemplo = "PruebaPil";
            
            int suma = nroI + (int)nroD;
            int producto = nroI * (int)nroD;
            System.out.println("suma = " + suma);
            System.out.println("producto = " + producto);
            
        imprimirConsigna(3);
        // Desarrollo de la consigna 3.
            if(nroI <= 10 && nroD <=30){
                System.out.println("suma = " + suma);
                System.out.println("producto = " + producto);
            }
            else{
                System.out.println("error");
            }
            
            int dobleNroI = nroI;
            /*
            Comento el punto b en vista que no me he dado idea de como resolverlo. Esto es un aproximado
            do{
                 dobleNroI ++;
                 System.out.println("dobleNroI = " + dobleNroI);
            }
            while();*/
            
            for(int i=0; i<=10; i++){
                System.out.println("nunEmeroB = " + nroD);
            }
        

    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
