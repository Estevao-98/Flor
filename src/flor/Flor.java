package flor;

public class Flor {
    String nomeFlor, corFlor;
    public Petala petala1;
    public Petala petala2;
    public Petala petala3;
    public Petala petala4;
    public Petala petala5;

 public Flor(){}   
    
 public Flor(String nomeFlor,String corFlor){
     setNomeFlor(nomeFlor);
     petala1 = new Petala(corFlor);
     petala2 = new Petala(corFlor);
     petala3 = new Petala(corFlor);
     petala4 = new Petala(corFlor);
     petala5 = new Petala(corFlor);
   
 }

    public String getCorFlor() {
        return corFlor;
    }

    public void setCorFlor(String corFlor) {
        this.corFlor = corFlor;
    }
 
 

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        this.nomeFlor = nomeFlor;
    }
 
 
    
}
