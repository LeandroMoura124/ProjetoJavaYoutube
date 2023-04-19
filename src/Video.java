public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Constructor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }



    //Get e Setters
    public void SetTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvali;
        novaAvali = (int) ((this.avaliacao + avaliacao)/this.views); //Calculando a média de avaliacoes
        this.avaliacao = novaAvali;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public int getViews() {
        return views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getCurtidas() {
        return curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }






    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }


    @Override
    public String toString() {
        System.out.println("-------------Dados Video---------------------");
        return  "\ntitulo= " + titulo + "\nAvaliação= " + this.avaliacao +
        "\nViews= " + this.views + "\ncurtidas= " + this.curtidas + "\nreproduzindo= " + this.reproduzindo;
    }
}
