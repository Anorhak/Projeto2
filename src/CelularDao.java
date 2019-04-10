package PrimeiroPacote;

public class CelularDao {
    
    Celular[] vcel = new Celular[5];
    
    public boolean criarCelular(Celular exemplo){
        boolean r = false;
        for(int i=0 ; i<=vcel.length ; i++){
            
            if(vcel[i] == null){
                vcel[i] = new Celular();
                vcel[i].setMarca(exemplo.getMarca());
                vcel[i].setModelo(exemplo.getModelo());
                vcel[i].setCd(exemplo.getCd());
                r = true;                
            }else{
                r = false;               
            }
        }
        return r;       
    }
    
    public void pesquisarcd(String cd){
        for(int i=0 ; i<=vcel.length ; i++){
            if(vcel[i].getCd() == cd){
                System.out.println("Marca: "+vcel[i].getMarca());
                System.out.println("Modelo: "+vcel[i].getModelo());
                System.out.println("Cd: "+vcel[i].getCd());
            }
        }
    }
    
    public void pesquisarmarca(String modelo, String marca){
        
    }

}
