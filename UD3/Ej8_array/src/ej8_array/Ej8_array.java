package ej8_array;

/**
 *
 * @author aidan
 */
public class Ej8_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String [] texto;
//        System.out.println("Introduce las temperaturas");
//        String chorizo=System.console().readLine();
//        String[] meses={"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
//        texto=chorizo.split(";");
//        int a;
//        if(texto.length!=12){
//            System.out.println("No has introducido los datos de temperatura de todos los meses");
//        }
//        else{
//        for(int i=0;i<texto.length;i++){
//              a=  Integer.parseInt(texto[i]);
//              System.out.print(meses[i]+": ");
//            for(int j=0; j<=a;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//     }
                String [] texto;
        System.out.println("Introduce las temperaturas");
        String chorizo=System.console().readLine();
        String[] meses={"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
        texto=chorizo.split(";");
        if(texto.length!=12){
            System.out.println("No has introducido los datos de temperatura de todos los meses");
        }
        else{
            int maxTemp=Integer.parseInt(texto[0]);
            for(int i=0; i<texto.length; i++){
                if(Integer.parseInt(texto[i])>maxTemp){
                    maxTemp=Integer.parseInt(texto[i]);
                }
        }
        int maxAltura=maxTemp;
        for(int nivel=maxAltura; nivel>0;nivel--){
            for(int i=0; i<texto.length;i++){
                if(Integer.parseInt(texto[i])>=nivel){
                    System.out.print(" *  ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
        for(int i=0; i<meses.length;i++){
            System.out.print(meses[i]+"|");
        }
        }
    }
    
}
