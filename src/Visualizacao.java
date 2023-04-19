public class Visualizacao {
    private  Gafanhoto espectador;
    private Video filme;


    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void setEspectador(Gafanhoto espectador){
        this.espectador = espectador;
    }
    public Gafanhoto getEspectador(){
        return this.espectador;
    }

    public void SetFilme(Video filme){
        this.filme = filme;
    }
    public Video getFilme(){
        return this.filme;
    }


    @Override
    public String toString() {
     
        return "Espectador{" + this.espectador  + "}" + "\nFilme{" + this.filme + "}";
    }


    //Metodos Especificos Sobrecarga - O gafanhoto terá 3 formas de avaliar o video

    public void avaliar(){
        this.filme.setAvaliacao(5); //Se eu chamar só o metodo avaliar sem inserir valor - avaliacao
        //será 5
        System.out.println("O video "  + this.filme.getTitulo() + "  obteve uma  avaliação média... Nota " + this.filme.getAvaliacao());

    }
    public void avaliar(int nota){ // ele poderá avaliar dando uma nota ao video que ele assistiu
        this.filme.setAvaliacao(nota);
        if(nota<5){
            System.out.println("O video"  + this.filme.getTitulo() + " não  obteve uma  avaliação... Nota " + this.filme.getAvaliacao());
        }
        else{
            System.out.println("O video " + this.filme.getTitulo() +" obteve uma boa avalição de nota!! Nota " + this.filme.getAvaliacao());
        }
    }
    public void avaliar(float porc){ // ele poderá avaliar dando uma porcentagem do quanto ele gostou do video
        int tot = 0;
        if(porc < 20){
            tot = 3;
        }
        else if(porc <=50){
            tot = 5;
        }
        else if(porc<=90){
            tot = 8;
        }
        else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
        if(tot < 5){ 
            System.out.println("O video" + this.filme.getTitulo() + " não  obteve uma  avaliação... Nota " + this.filme.getAvaliacao());
        }else{
            System.out.println("O video " + this.filme.getTitulo() +  " obteve uma boa avaliação... Nota " + this.filme.getAvaliacao());
        }
        
    }


}
