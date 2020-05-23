public class Cidade {

    private int codigo;
    private String descricao;
    private String uf;
    private int qtdeEstudantes = 0;

    public Cidade(int $codigo, String $descricao, String $uf) {
        codigo = $codigo;
        descricao = $descricao;
        uf = $uf;
    }

    public int getCodigo()          {return codigo;}
    public String getDescricao()    {return descricao;}
    public String getUF()           {return uf;}
    public int getQtdeEstudantes()  {return qtdeEstudantes;}

    public void adicionaNovoEstudante()     {qtdeEstudantes++;}

    public void exibeDados()
    {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("UF: " + uf);
        System.out.println("Qtde. Estudantes: " + qtdeEstudantes);
    }
}
