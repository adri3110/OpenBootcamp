public class EjercicioTema4 {
    public static void main(String[] args) {
        int numeroIf = 2;
        int numeroWhile = 1;
        int numeroDoWhile = 1;
        int estacion = 1;

        //Bucle If
        System.out.println("CONDICION IF: ");
        if (numeroIf < 0 ){
            System.out.println(numeroIf+" es negativo");
        }else if (numeroIf > 0){
            System.out.println(numeroIf+" es positivo");
        }
        //Bucle While
        System.out.println("BUCLE WHILE: ");
        while (numeroWhile <= 3){
            System.out.println("El numero es: "+numeroWhile);
            numeroWhile++;
        }
        //Bucle Do While
        System.out.println("BUCLE DO WHILE: ");
        do{
            System.out.println("El numero es: "+numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile <= 3);
        //Bucle for
        System.out.println("BUCLE FOR");
        for(int numeroFor =0 ; numeroFor<=3 ; numeroFor++){
            System.out.println("El numero es: "+numeroFor);
        }
        //Switch case
        System.out.println("SWITCH CASE");
        switch (estacion){
            case 0:
                System.out.println("Es primavera");
                break;
            case 1:
                System.out.println("Es verano");
                break;
            case 2:
                System.out.println("Es otoño");
                break;
            case 3:
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("¿No sabes en que estacion estamos?");

        }
    }
}
