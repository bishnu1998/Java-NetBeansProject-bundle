
package init;

import java.io.IOException;

public class Init {

    void m() throws IOException{
       throw new IOException("device Errore");
    }
    void n() throws  IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception Propagated:"+ e);
        }
    }
    public static void main(String[] args) {
       Init i = new Init();
       i.p();
    }

    private void IOException(String device_Errore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
