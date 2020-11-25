import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class TrianglesModulars{

    public static boolean stringDigit(String valor) {
        boolean resultat = false;

        for (int i = 0; i < valor.length(); i++ ){
            char ch = valor.charAt(i);
            if(Character.isDigit(ch)){ // For enhanced com?
                resultat = true;
            }else{
                resultat = false;
                break;
            }
        }
        return resultat;
    }

    

    public static void dibuixaPunts(int linia){
        String punt = ".";
        
        System.out.print(punts);
    }

    public static void dibuixaNombresCreixents(int linia){
        for (int n = linia; n < 9+1; n++ ){
            System.out.print(n);
        }
    }

    public static void dibuixaNombresDecreixents(int linia){
        for (int n = 8; n > linia-1; n-- ){
            System.out.print(n);
        }
    }

    public static void dibuixaLinia(int linia){
        dibuixaPunts(linia);
        dibuixaNombresCreixents(linia);
        dibuixaNombresDecreixents(linia);
        dibuixaPunts(linia);
    }

    public static void dibuixaUnTriangle(){
        for (int i = 9; i > 0-1; i-- ){
            int linia = i;
            dibuixaLinia(linia);
            System.out.println();
        }
    }

    public static void dibuixaTriangles(int num){
        for (int i = 0; i < num; i++ ){
            dibuixaUnTriangle();
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("quants?");
        String resposta = input.readLine();
        int num = 0;
        if (stringDigit(resposta)){
            num = Integer.parseInt(resposta);
            dibuixaPunts(num);
            /*
            dibuixaTriangles(num);
            */
        }else {
            System.out.println("Cal un nombre enter");
        }
    }
}