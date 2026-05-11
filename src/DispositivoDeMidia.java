public abstract class DispositivoDeMidia {
    
    protected String NomeDoDispositivo;
    
    public DispositivoDeMidia(String nome){
        
        this.NomeDoDispositivo = nome;
        
    }
    
    public abstract void Reproduzir();
    
    public void desligar(){
        
        System.out.println(this.NomeDoDispositivo + "está desligando...");
        
    }
    
}
