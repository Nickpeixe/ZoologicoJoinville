import java.util.ArrayList;

class Animais{
  protected  int id;
  protected String nome;
  protected String especie;
  private ArrayList<Limpeza>limps;

    public Animais(int id, String nome, String especie){
        this.id = id;
        this.nome = nome;
        this.especie = especie;
       
    }
    public int getId(){
        return id;
    }
    public  void setId(int id){
         this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public  void setNome(String nome){
         this.nome = nome;
    }
    public String getEspecie(){
        return especie;
    }
    public  void setEspecie(String especie){
         this.especie = especie;
    }
    
}