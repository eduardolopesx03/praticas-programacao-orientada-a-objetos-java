package poo;

//Crie uma classe em java, considerando suas características e comportamentos, para representar o 
//seguinte elemento: computador. Explicando cada parte do código.

//ChatGPT

//Para representar um computador em Java, podemos criar uma classe chamada "Computador", que terá 
//os seguintes atributos e métodos:

//Classe Computador
public class Computador {

	
 //Atributos
 private String marca;
 private String modelo;
 private int ano;
 private int capacidadeRam;
 private int capacidadeArmazenamento;
	
 
//Construtor
 public Computador(String marca, String modelo, int ano, int capacidadeRam, int capacidadeArmazenamento) {
 this.marca = marca;
 this.modelo = modelo;
 this.ano = ano;
 this.capacidadeRam = capacidadeRam;
 this.capacidadeArmazenamento = capacidadeArmazenamento;
 
 //O método construtor é utilizado para criar e inicializar objetos de uma classe. Ele é chamado 
 //automaticamente no momento em que um objeto é criado, e é responsável por garantir que os 
 //atributos desse objeto estejam inicializados com os valores desejados.
 
 //Em Java, o construtor tem o mesmo nome da classe e não possui tipo de retorno, nem mesmo void. 
 //O construtor pode receber zero ou mais parâmetros, que são utilizados para passar os valores 
 //iniciais dos atributos do objeto.
 
 //Ao criar um objeto de uma classe, podemos chamar o construtor da classe utilizando a 
 //palavra-chave "new", seguida do nome da classe e dos parâmetros (se houver). Por exemplo:
 //Computador meuComputador = new Computador("Dell", "Inspiron", 2022, 16, 512);
 
 //O método construtor é importante porque garante que os objetos de uma classe estejam em um 
 //estado consistente desde o momento em que são criados. Além disso, o construtor pode ser 
 //utilizado para realizar outras operações de inicialização, como a alocação de memória ou a 
 //chamada de outros métodos.
 }
 
 
 //Chamar o construtor da classe
 Computador meuComputador = new Computador("Dell", "Inspiron", 2022, 16, 512);

 //Nesse exemplo, estamos criando um objeto do tipo "Computador" e passando os valores "Dell", 
 //"Inspiron", 2022, 16 e 512 para o construtor da classe. Esses valores serão utilizados para 
 //inicializar os atributos do objeto "meuComputador".
 
 
 // Métodos
 // Ligar o computador
 public void ligar() {
     System.out.println("O computador está ligando...");
 }

 // Desligar o computador
 public void desligar() {
     System.out.println("O computador está desligando...");
 }

 // Acessar a internet
 public void acessarInternet() {
     System.out.println("O computador está acessando a internet...");
 }
 
 // Imprimir informações do computador
 public void imprimirInformacoes() {
     System.out.println("Marca: " + marca);
     System.out.println("Modelo: " + modelo);
     System.out.println("Ano: " + ano);
     System.out.println("Capacidade de RAM: " + capacidadeRam + "GB");
     System.out.println("Capacidade de armazenamento: " + capacidadeArmazenamento + "GB");
 }
 
 //A classe "Computador" possui cinco atributos privados: "marca", "modelo", "ano", "capacidadeRam"
 //e "capacidadeArmazenamento", que representam as informações básicas de um computador, como sua 
 //marca, modelo, ano de fabricação, capacidade de memória RAM e de armazenamento em disco. Esses 
 //atributos são inicializados pelo construtor da classe, que recebe como parâmetros os valores 
 //correspondentes.
 
 //A classe também possui quatro métodos públicos: "ligar()", "desligar()", "acessarInternet()" e 
 //"imprimirInformacoes()". O método "ligar()" simplesmente imprime uma mensagem indicando que o 
 //computador está ligando. O método "desligar()" faz o mesmo, mas indicando que o computador 
 //está desligando. O método "acessarInternet()" também imprime uma mensagem, indicando que o 
 //computador está acessando a internet. Por fim, o método "imprimirInformacoes()" imprime todas 
 //as informações do computador, incluindo sua marca, modelo, ano de fabricação, capacidade de 
 //memória RAM e de armazenamento em disco.
 
 //Essa classe permite que sejam criados objetos do tipo "Computador" e que sejam realizadas 
 //operações básicas com eles, como ligar, desligar e acessar a internet. Também é possível 
 //imprimir todas as informações do computador, o que pode ser útil para diagnóstico ou para 
 //fins de documentação.
 
 
 //Para que serve a palavra-chave "this" do método construtor?
 //A palavra-chave "this" é utilizada em Java para referenciar o objeto atual de uma classe. 
 //No contexto do método construtor, ela é utilizada para referenciar o objeto que está sendo 
 //criado.
 
 //Em Java, é possível ter métodos com parâmetros que possuem o mesmo nome dos atributos da 
 //classe. Isso pode gerar confusão no código, pois o compilador não sabe se estamos nos 
 //referindo ao parâmetro ou ao atributo. Para evitar essa ambiguidade, podemos utilizar a 
 //palavra-chave "this" para nos referir ao atributo da classe.
 
 //No método construtor, a palavra-chave "this" é geralmente utilizada para inicializar os 
 //atributos do objeto com os valores passados como parâmetros.
 
 //Nesse exemplo, estamos utilizando a palavra-chave "this" para inicializar os atributos da 
 //classe "Computador" com os valores passados como parâmetros para o construtor. O uso de 
 //"this" indica que estamos nos referindo aos atributos da classe, e não aos parâmetros do 
 //construtor com o mesmo nome.
 
 //O uso de "this" no método construtor é importante para garantir que os atributos do objeto 
 //sejam inicializados corretamente, mesmo quando há parâmetros com o mesmo nome dos atributos 
 //da classe. Além disso, o uso de "this" torna o código mais claro e legível, pois indica 
 //claramente a intenção do programador.
 
 
 //Para que servem os métodos Get e Set?
 //Os métodos Get e Set são utilizados para acessar e modificar os valores dos atributos de um 
 //objeto de uma classe, respectivamente. Eles são importantes porque permitem controlar o 
 //acesso aos atributos da classe e garantir que esses atributos estejam sempre em um estado 
 //válido.
 
 ////O método Get (também conhecido como método de acesso) é utilizado para retornar o valor de 
 //um atributo de um objeto. Ele é geralmente definido com o nome do atributo precedido pela 
 //palavra "get", e não recebe nenhum parâmetro. Por exemplo:
 
//Método Get para o atributo marca
 public String getMarca() {
     return marca;
 }

 //Método Get para o atributo modelo
 public String getModelo() {
     return modelo;
 }
 
 //Nesse exemplo, estamos definindo dois métodos Get na classe "Computador", um para o atributo 
 //"marca" e outro para o atributo "modelo". Esses métodos simplesmente retornam os valores dos 
 //atributos correspondentes.
 
 //O método Set (também conhecido como método de modificação) é utilizado para modificar o valor 
 //de um atributo de um objeto. Ele é geralmente definido com o nome do atributo precedido pela 
 //palavra "set", e recebe um parâmetro que representa o novo valor do atributo. Por exemplo:
 
//Método Set para o atributo ano
 public void setAno(int novoAno) {
     ano = novoAno;
 }

 //Método Set para o atributo capacidadeRam
 public void setCapacidadeRam(int novaCapacidadeRam) {
     capacidadeRam = novaCapacidadeRam;
 }
 
 //Nesse exemplo, estamos definindo dois métodos Set na classe "Computador", um para o atributo 
 //"ano" e outro para o atributo "capacidadeRam". Esses métodos recebem um parâmetro que 
 //representa o novo valor do atributo correspondente, e simplesmente atribuem esse valor ao 
 //atributo.
 
 //Com os métodos Get e Set, podemos controlar o acesso aos atributos da classe "Computador" e 
 //garantir que esses atributos estejam sempre em um estado válido. Por exemplo, podemos 
 //utilizar o método Set para garantir que o ano de fabricação do computador seja sempre um 
 //valor positivo:
 
 //public void setAno(int novoAno) {
 //if (novoAno >= 0) {
 //    ano = novoAno;
 // }
 
 //Nesse caso, estamos verificando se o valor do parâmetro "novoAno" é maior ou igual a zero 
 //antes de atribuí-lo ao atributo "ano". Se o valor não for válido, simplesmente não fazemos 
 //nenhuma alteração no atributo.

 
//Os atributos da classe devem ser necessariamente privados?
 
}
