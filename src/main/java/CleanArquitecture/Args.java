package CleanArquitecture;

public class Args {

    public static void main (String []args) {
        // Parametros introducidos en Args Edit Config
        System.out.println("Parametros recibidos en psvm String args: " + args.length);
        // Recorremos el Array
        for(int i = 0; i < args.length; i++) {
            System.out.println("El argumento es " + args[i] + " y está en la posicion del array " + i);
        }
        System.out.println("---------------------------------------------------------");

        int opcionMinVal = 0;
        int opcionMaxVal = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--minVal":
                    opcionMinVal = Integer.parseInt(args[i + 1]); // Extraemos el valor de la siguiente posicion
                    i++; // No es necesario iterar sobre la siguiente posicion del array ya que se ha extraido su valor
                    break;
                case "--maxVal":
                    opcionMaxVal = Integer.parseInt(args[i + 1]);
                    i++;
                    break;
            }
        }

        System.out.println("Opcion minval es: " + opcionMinVal);
        System.out.println("Opcion maxval es: " + opcionMaxVal);
    }

}
