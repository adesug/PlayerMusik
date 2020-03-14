/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playermusik;

/**
 *
 * @author devx
 */
public class PlayerMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // kie manggil JFrame splash
        splash Splash = new splash();
        //kie nggo nampilna splash men tampil
        Splash.setVisible(true);
        //kie nggo manggil JFrame home(halaman utama)
        //setelah looping thread full 100 otomatis halaman pindah aring home
        home Home = new home();
        
        try{
            for (int i=0; i<=100; i++){
                Thread.sleep(10);
                Splash.loadingBar.setValue(i);
                
                if(i==100){
                    Splash.setVisible(false);
                    Home.setVisible(true);
                    
                }
            }
        } catch(Exception e){
            
        }
    }
    
}
