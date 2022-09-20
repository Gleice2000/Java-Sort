package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String nome;
   private String clube;
   private String liga;
   private String posicao;
   private String nivel;
  
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }


    public void setClube(String clube) {
        this.clube = clube;
    }


    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

 
    public String getPosicao() {
        return posicao;
    }


    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


    public String getNivel() {
        return nivel;
    }


    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


  

    @Override    
    public int compareTo(Dados outroDado){
      return this.getClube().
              compareTo(outroDado.getClube());
    }
    
    
     @Override
    public String toString(){
        return getClube()+ " : " + getLiga() ;
    }// fim toString
    
}




