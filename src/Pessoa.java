public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected Float experiencia;


    //Constructor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0f;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setExperiencia(Float experiencia) {
        this.experiencia = experiencia;
    }
    public Float getExperiencia() {
        return experiencia;
    }


    //metodo especifico
    public void ganharExp(){
        System.out.println("Ganhando experiência....");
    }



    @Override
    public String toString() {
        System.out.println("-----------Dados Gafanhoto------------------");
        return "\nNome= " + this.nome + "\nidade= " + this.idade + "\nSexo= " + this.sexo +
        "\nExperiêcia= " + this.experiencia;
    }



}
