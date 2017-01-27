import java.io.*;
public class teste{

     public static void main(String []args) throws IOException{
        System.out.println("                 Bem Vindo");
        System.out.println("O projeto a seguir ira ler o arquivo in.txt");
        System.out.println("Em sua primeira linha contera  um inteiro positivo M maior que 0");
        System.out.println("Em sua segunda linha um texto, realizar a quebra de linha do texto sem quebrar palavras");
        System.out.println("Considerando que a linha pode ter no maximo M caracteres");
        System.out.println( "==========================================================================================");
        
        FileReader in = null;
        FileWriter out = null;

      try {
         in = new FileReader("in.txt");
         out = new FileWriter("out.txt");
         
         int c;
         int contador = 0;
         c =  in.read();
         int M = Character.getNumericValue(c);
         while ((c = in.read()) != -1) {
            if (contador < M){
                out.write(c);
                if (c == 32)
                {
                    contador++;
                }
                
            }else
            {
                
                out.write("\r\n" + c);
                contador = 0;
            }
            
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
         System.out.println("Arquivo foi organizado conforme solicitado");
      }
     }
}
