
package bloqueiodeusuario;

import java.util.Scanner;


public class BloqueiodeUsuario {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String login = "aluno";
        String senha = "segredo";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Senha: ");
        senha = teclado.next();
        int contador=1;
        
        while(!senha.equals("segredo") && contador<=2){
              System.out.println("Senha incorreta, tente novamente: \nTentativas Restante : "+(3-contador));
              contador++;
              senha=teclado.next();
        }
        System.out.println();
        if(senha.equals("segredo")){
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Bloqueado (senha incorreta)");
        }
        
        
          
        
        
        
        
    }
    
}
