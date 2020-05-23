public class Estudante {

    private int codigo;
    private String nome;
    private String dtNascimento;
    private String email;
    private String senha;
    private Cidade cidade;

    public Estudante(int $codigo, String $nome, String $dataDeNascimento,
                     String $email, String $senha, Cidade $cidade) {
        codigo = $codigo;
        nome = $nome;
        dtNascimento = $dataDeNascimento;
        email = $email;
        senha = $senha;
        cidade = $cidade;

        cidade.adicionaNovoEstudante();
    }

    public Estudante() {

    }

    public int getCodigo()              {return codigo;}
    public String getNome()             {return nome;}
    public String getDtNascimento()     {return dtNascimento;}
    public String getEmail()            {return email;}
    public String getSenha()            {return senha;}
    public Cidade getCidade()           {return cidade;}

    public void setCodigo(int $codigo)                          {codigo = $codigo;}
    public void setNome(String $nome)                           {nome = $nome;}
    public void setDtNascimento(String $dataDeNascimento)       {dtNascimento = $dataDeNascimento;}
    public void setEmail(String $email)                         {email = $email;}
    public void setSenha(String $senha)                         {senha = $senha;}
    public void setCidade(Cidade $cidade)                       {cidade = $cidade;}


    public void exibeDados() {
        System.out.println("#Dados do Aluno#");
        System.out.println("* Código:" + codigo);
        System.out.println("* Nome:" + nome);
        System.out.println("* Data de Nascimento:" + dtNascimento);
        System.out.println("* E-mail:" + email);
        System.out.println("* Senha:" + senha);
        System.out.println("* Cidade:" + cidade.getDescricao());
    }
}
