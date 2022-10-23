import java.util.ArrayList;

public class Ave extends Animais{
    String plumagem;
    Alimentacao  alimentacao;

   public static ArrayList <Ave> aviaria = new ArrayList<>();// banco de dados temporario
     Ave (int id, String nome, String especie, String plumagem, Alimentacao alimentacao ){
        super(id,nome,especie);
        this.plumagem = plumagem;
        this.alimentacao = alimentacao;

        aviaria.add(this);

        }
        public String getPlumagem(){
            return plumagem;
        }
        public void setPlumagem(String plumagem){
            this.plumagem = plumagem;
        }
    public static Ave verificaId(int id) throws Exception{
        for (Ave ave : aviaria) {
            if(ave.id == id)
                return ave;            
        }  
        throw new Exception("Ave não Encontrada!!!!!!");        
    }
    
}

