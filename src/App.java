public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Video[] v = new Video[3];

       v[0] = new Video("Destrinchando Java");
       v[1] = new Video("Consumindo API em Java");
       v[2] = new Video("Usufruindo o spring boot");
        System.out.println(v[0].toString());


       Gafanhoto[] g = new Gafanhoto[2];
       g[0] = new Gafanhoto("Leandro", 18, "M", "leandro_tz");
       System.out.println(g[0].toString());

       Visualizacao[] visu = new Visualizacao[5];
       visu[0] = new Visualizacao(g[0], v[1]);
       visu[1] = new Visualizacao(g[0], v[2]);
       visu[2] = new Visualizacao(g[0], v[0]);
       visu[0].avaliar();
       visu[1].avaliar(87.6f);
       visu[2].avaliar(10);

       System.out.println(visu[1].toString());
       System.out.println(visu[0].toString());
       System.out.println(visu[1].toString());
       System.out.println(visu[0].toString());
       System.out.println(g[0].toString());





    }
}
