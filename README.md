# M4D2


Descrição da Tarefa
A primeira atividade da equipe de desenvolvimento está especificada nas instruções abaixo:

    Crie um novo projeto no BlueJ, chamado: Desafio_Modulo_1

    Crie a classe: Cidade com os seguintes atributos:
        Código = tipo de dados número inteiro
        Descrição = tipo de dados texto
        UF = tipo de dados texto;
        Quantidade de estudantes = tipo de dados número inteiro.

    Crie os seguintes métodos na classe Cidade:
        Construtor que receba como parâmetro os valores dos atributos:
            Código, Descrição e UF
        Métodos de acesso (GET) para os atributos:
            Código, Descrição e UF
        Métodos de configuração (SET) para os atributos:
            Descrição e UF
        Método adicionaNovoEstudante que deverá somar +1 estudante no atributo que representa a quantidade de estudantes, toda vez que o método for executado.
        Método exibeDados para apresentar os dados da classe.

    Crie a classe: Estudante com os seguintes atributos:
        Código = tipo de dados inteiro
        Nome = tipo de dados texto
        Data de nascimento = tipo de dados texto
        Email = tipo de dados texto
        Senha = tipo de dados texto
        Cidade = tipo de dados Cidade

    Crie os seguintes métodos na classe Estudante:
        Construtor que receba como parâmetro os valores dos atributos:
            Código
            Nome
            Data de nascimento
            Email
            Senha
            Cidade
        (o método construtor deve fazer uso também do método adicionaNovoEstudante da classe Cidade, para que, a cada novo estudante cadastrado para um determinado curso (associação simples entre classes), seja calculada e armazenada a quantidade de estudantes para a cidade selecionada)
        Métodos de acesso (GET) para todos os atributos
        Métodos de configuração (SET) para todos os atributos
        Método exibeDados para apresentar todos os dados da classe

    Crie uma classe de Teste chamada: TesteFun4Study
        A classe de teste deve criar 2 cidades e 2 estudantes para cada cidade criada. Utilize a classe Teclado para solicitar os dados do teclado.
        Para cada estudante criado, atualize a senha. Utilize a classe Teclado para solicitar os dados do teclado. Para atualizar a senha, o usuário deve digitar (nesta ordem):
            senha anterior (cadastrada na criação do objeto)
            nova senha
            repetir a nova senha
            A senha deve ser atualizada apenas se o usuário digitar corretamente a senha anterior e digitar duas vezes a nova senha. Informe com uma mensagem o sucesso ou não da alteração da senha.
        Depois da criação das cidades e seus estudantes, o sistema deverá exibir os dados destes objetos na tela.

 
Importante:

    Durante o desenvolvimento, procure utilizar ao máximo os conceitos praticados
    Inclusive, utilize comentários no código para indicar qual e onde um conceito foi utilizado
    Você ainda pode criar métodos e/ou atributos auxiliares caso necessite e/ou ache interessante, desde que não fuja da ideia principal da atividade.

 


SEGUNDA PARTE DO DESAFIO

Conforme descrito da segunda parte do desafio deste módulo, você foi novamente contratado para desenvolver melhorias no Projeto Fun4Study. O principal objetivo destas melhorias diz respeito principalmente ao uso de estruturas de seleção e repetição para refatorar o código elaborado na classse TesteFun4Study. 
Para desenvolver as melhorias do sistema, siga as instruções abaixo:
 

    Crie um novo projeto no BlueJ chamado: Desafio_Modulo_4. Este projeto pode ser criado com base no gabarito/projeto desenvolvido para a atividade do Módulo 3.

    Altere a classe de Teste chamada TesteFun4Study
        Com base em um comando de repetição, a classe de teste deve permitir criar várias cidades:
            Deve ser permitido criar várias cidades, portanto faça uso de um comando de repetição que permita que enquanto o usuário não selecionar a opção “0”, por meio do teclado, o sistema deverá continuar executando e permitir a criação de uma nova cidade;
            Deve-se apresentar os dados de cada cidade após a sua criação.

        Para cada cidade criada deve ser permitido a criação de vários estudantes.
            Deve ser permitido criar vários estudantes por cidade, portanto faça uso de um comando de repetição que permita que enquanto o usuário não selecionar a opção “0”, por meio do teclado, o sistema deverá continuar executando e permitir a criação de um novo estudante para a cidade da vez;
            Após a criação de cada estudante, deve-se apresentar os dados do estudante criado na tela;
            Após apresentar os dados do estudante na tela, deve-se perguntar se o usuário deseja alterar algum dado do estudante criado. Em caso positivo, deve-se perguntar qual é o atributo que se deseja alterar e permitir a alteração. Após a alteração deve-se apresentar os dados do estudante atualizados;
            Para atualizar a senha o usuário deve digitar (nesta ordem):
                senha anterior (cadastrada na criação do objeto)
                nova senha
                repetir a nova senha
                A senha deve ser atualizada apenas se o usuário digitar corretamente a senha anterior e digitar duas vezes a nova senha. Caso algum erro ocorra, o sistema deve solicitar novamente que o usuário digite a senha anterior, a nova senha e a repetição da nova senha. O sistema só deve sair desta etapa quando a senha for corretamente alterada.
            Cada cidade criada deve ter no mínimo 4 estudantes, portanto deve-se verificar se este mínimo de estudantes já foram criados antes de encerrar a criação dos estudantes de cada cidade;
            Quando for selecionado “0”, por meio do teclado, o sistema deve encerrar a criação dos estudantes, somente se a condição acima dos estudantes mínimos estiver atendida, e passar para a criação da próxima cidade ou encerrar caso o usuário deseje.

 
Importante

    O objetivo desta atividade é exercitar estruturas de seleção e repetição, por isso, não estamos nos preocupando com o armazenamento dos objetos em memória neste momento
    Durante o desenvolvimento, procure utilizar ao máximo os conceitos praticados
    Solicite o que for necessário via Teclado
    Você ainda pode criar métodos, atributos e/ou classes auxiliares caso necessite e/ou ache interessante, desde que não fuja da ideia. 

Você deve entregar, na tarefa abaixo, seu projeto do BlueJ compactado no formato ZIP. Você deve compactar toda a pasta do projeto, não apenas os arquivos-fonte.