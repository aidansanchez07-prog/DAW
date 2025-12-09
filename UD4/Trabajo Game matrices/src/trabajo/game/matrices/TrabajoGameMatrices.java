package trabajo.game.matrices;

/**
 *
 * @author aidan
 */
public class TrabajoGameMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] inventario = new String[10][2];

        inventario[0][0] = "Marvel's Spider-Man 2";
        inventario[0][1] = "12";

        inventario[1][0] = "God of War: Ragnarök";
        inventario[1][1] = "8";

        inventario[2][0] = "Horizon Forbidden West";
        inventario[2][1] = "5";

        inventario[3][0] = "Final Fantasy XVI";
        inventario[3][1] = "9";

        inventario[4][0] = "The Last of Us Part I";
        inventario[4][1] = "6";

        inventario[5][0] = "Gran Turismo 7";
        inventario[5][1] = "7";

        inventario[6][0] = "Demon's Souls Remake";
        inventario[6][1] = "4";

        inventario[7][0] = "Resident Evil 4 Remake";
        inventario[7][1] = "10";

        inventario[8][0] = "Elden Ring";
        inventario[8][1] = "3";

        inventario[9][0] = "Assassin's Creed Mirage";
        inventario[9][1] = "11";
        int opcion;
        do{
             System.out.println("---Menu de opciones---\n 1.Ver estado de stock\n 2.Alquilar un juego\n 3.Devolver un juego\n 4.Salir");
              opcion=Integer.parseInt(System.console().readLine());
             switch(opcion){
                 case 1:
                     for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if(j==1){
                    System.out.print(": ");
                }
                System.out.print(inventario[i][j]);
        }
                         System.out.println("");
        }
                     break;
                 case 2:
                     System.out.println("Que juego de la lista quieres alquilar: (introduzca el numero de el juego que quiera alquilar) \n1 : Marvel's Spider-Man 2\n" +
"2 : God of War: Ragnarök\n" +
"3 : Horizon Forbidden West\n" +
"4 : Final Fantasy XVI\n" +
"5 : The Last of Us Part I\n" +
"6 : Gran Turismo 7\n" +
"7 : Demon's Souls Remake\n" +
"8 : Resident Evil 4 Remake\n" +
"9 : Elden Ring\n" +
"10: Assassin's Creed Mirage");
                     int alquiler=Integer.parseInt(System.console().readLine());
                     System.out.println("Y que cantidad?");
                     int cantidad=Integer.parseInt(System.console().readLine());
                     if(alquiler>10 || alquiler<1 ){
                         System.out.println("Valor incorrecto");
                     }
                     else{
                         int num=Integer.parseInt(inventario[alquiler-1][1]);
                         
                         if(cantidad>num||num==0){
                             System.out.println("Lo siento no nos queda stock");
                         }
                         else{
                             num=num-cantidad;
                             String numero=Integer.toString(num);
                             inventario[alquiler-1][1]=numero;
                             System.out.println("Muy bien has alquilado: "+inventario[alquiler-1][0]);
                         }
                     }
                     break;
                 case 3:
                     System.out.println("Que juego de la lista quieres alquilar: (introduzca el numero de el juego que quiera alquilar) \n1 : Marvel's Spider-Man 2\n" +
"2 : God of War: Ragnarök\n" +
"3 : Horizon Forbidden West\n" +
"4 : Final Fantasy XVI\n" +
"5 : The Last of Us Part I\n" +
"6 : Gran Turismo 7\n" +
"7 : Demon's Souls Remake\n" +
"8 : Resident Evil 4 Remake\n" +
"9 : Elden Ring\n" +
"10: Assassin's Creed Mirage");
                     int devolver=Integer.parseInt(System.console().readLine());
                        System.out.println("Y que cantidad?");
                     int cantidads=Integer.parseInt(System.console().readLine());
                     
                     if(devolver>10 || devolver<1 ){
                         System.out.println("Valor incorrecto");
                     }
                     else{
                         int num=Integer.parseInt(inventario[devolver-1][1]);
                         
                         
                             num=num+cantidads;
                             String numero=Integer.toString(num);
                             inventario[devolver-1][1]=numero;
                             System.out.println("Muy bien has devuelto: "+inventario[devolver-1][0]);
                         
                     }
                     break;
                 case 4:
                     System.out.println("Garcias por su visita");
                     break;
                 default:
                     System.out.println("Valor incorrecto");
                     break;
             }
       
            }while(opcion!=4);
        }
    }


