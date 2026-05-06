// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : MÉTODOS GENÉRICOS em JAVA
// Ano/S: 2026/1S
// -------------------------------------

// importação de classe que permite acesso ao teclado
import java.util.Scanner;

// classe coordenadora da execução dos testes
public class CoordenadorExecucao {

    // método que realiza todos os testes
    public void executaTudo() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in);

        // declaração de constantes para uso no menu
        final int METODOS_INDEPENDENTES   = 1;
        final int METODOS_SOBRECARREGADOS = 2;
        final int METODOS_GENERICOS       = 3;
        final int SAIR                    = 9;

        // cria arrays de 'int', 'double' e 'String' para os testes INDEPENDENTES e SOBRECARREGADOS
        int[]    intArray     = {  1,   2,   3,   4,   5,   6,   7};
        double[] doubleArray  = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        // AQUI ...
        String[] stringArray = {"Matheus", "de", "Paula", "Santos"};

        // cria arrays de 'Integer', 'Double' e 'String' ('reference types') para os testes GENERICOS
        Integer[] intArrayT     = {  1,   2,   3,   4,   5,   6,   7};
        Double[]  doubleArrayT  = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        String[] stringArrayT = {"Matheus", "de", "Paula", "Santos"};
        // AQUI ...

        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Atividade 1: Teste de Métodos Independentes");
            System.out.println("2 - Atividade 2: Teste de Métodos Sobrecarregados");
            System.out.println("3 - Atividade 3: Teste de Métodos Genéricos");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
            teclado.nextLine();
            System.out.println();

            // avaliação da opção e acionamento da respectiva Atividade
            switch (escolha) {

                //opção 1
                case METODOS_INDEPENDENTES:
                    System.out.println("Atividade 1: Teste de Métodos Independentes !");
                    System.out.println("---------------------------------------------");
                    
                    // instanciação de um objeto da classe 'MetodosIndependentes'
                    MetodosIndependentes independente = new MetodosIndependentes();

                    // A. acionamento do método para impressão do 'array' de 'int'
                    System.out.println("Exibindo conteúdo do 'array' de 'int':");
                    independente.printArrayInt(intArray);

                    // B. acionamento do método para impressão do 'array' de 'double'
                    System.out.println("Exibindo conteúdo do 'array' de 'double':");
                    independente.printArrayDouble(doubleArray);
                    
                    // C. acionamento do método para impressão do 'array' de 'String'
                    // AQUI ...
                    System.out.println("Exibindo o conteúdo de 'array' de 'String'");
                    independente.printArrayString(stringArray);

                    // declaração de variável auxiliar para indicar o resultado da busca
                    int rBI;
                    
                    // D. exemplo de busca por um conteúdo no 'array' de 'int'
                    // 1. conteúdo existente
                    System.out.print("Buscando o conteúdo 5 no 'array' de 'int' ... ");
                    rBI = independente.buscaArrayInt(intArray,5);
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9 no 'array' de 'int' ... ");
                    rBI = independente.buscaArrayInt(intArray,9);
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }

                    // E. exemplo de busca por um conteúdo no 'array' de 'double'
                    // 1. conteúdo existente
                    System.out.print("Buscando o conteúdo 5.5 no 'array' de 'double' ... ");
                    rBI = independente.buscaArrayDouble(doubleArray,5.5);
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9.9 no 'array' de 'double' ... ");
                    rBI = independente.buscaArrayDouble(doubleArray,9.9);
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }

                    // F. exemplo de busca por um conteúdo no 'array' de 'String'
                    // 1. conteúdo existente
                    System.out.print("Buscando o conteúdo 'Paula' no 'array' de 'String' ... ");
                    rBI = independente.buscaArrayString(stringArray, "Paula");
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }
                    // 2. conteúdo inexistente
                    // AQUI ...
                    System.out.print("Buscando o conteúdo 'Neto' no 'array' de 'String' ... ");
                    rBI = independente.buscaArrayString(stringArray, "Neto");
                    if ( rBI == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBI);
                    }

                    break;

                
                //opção 2
                case METODOS_SOBRECARREGADOS:
                    System.out.println("Atividade 2: Teste de Métodos Sobrecarregados !");
                    System.out.println("-----------------------------------------------");
                    
                    // instanciação de um objeto da classe 'MetodosIndependentes'
                    MetodosSobrecarregados sobrecarregado = new MetodosSobrecarregados();

                    // A. acionamento do método para impressão do 'array' de 'int'
                    System.out.println("Exibindo conteúdo do 'array' de 'int':");
                    sobrecarregado.printArray(intArray);

                    // B. acionamento do método para impressão do 'array' de 'double'
                    System.out.println("Exibindo conteúdo do 'array' de 'double':");
                    sobrecarregado.printArray(doubleArray);
                    
                    // C. acionamento do método para impressão do 'array' de 'String'
                    // AQUI ...
                    System.out.println("Exibindo conteúdo do 'array' de 'String':");
                    sobrecarregado.printArray(stringArray);

                    // declaração de variável auxiliar para indicar o resultado da busca
                    // AQUI ...
                    int rBS;                    

                    // D. exemplo de busca por um conteúdo no 'array' de 'int'
                    // AQUI ...
                     System.out.print("Buscando o conteúdo 5 no 'array' de 'int' ... ");
                    rBS = sobrecarregado.buscaArray(intArray,5);
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9 no 'array' de 'int' ... ");
                    rBS = sobrecarregado.buscaArray(intArray,9);
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }    

                    // E. exemplo de busca por um conteúdo no 'array' de 'double'
                    // AQUI ...
                    System.out.print("Buscando o conteúdo 5.5 no 'array' de 'double' ... ");
                    rBS = sobrecarregado.buscaArray(doubleArray,5.5);
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9.9 no 'array' de 'double' ... ");
                    rBS = sobrecarregado.buscaArray(doubleArray,9.9);
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }

                    // F. exemplo de busca por um conteúdo no 'array' de 'String'
                    // AQUI ...
                     System.out.print("Buscando o conteúdo 'Paula' no 'array' de 'String' ... ");
                    rBS = sobrecarregado.buscaArray(stringArray, "Paula");
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 'Neto' no 'array' de 'String' ... ");
                    rBS = sobrecarregado.buscaArray(stringArray, "Neto");
                    if ( rBS == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBS);
                    }

                    break;

                //opcao 3
                case METODOS_GENERICOS:
                    System.out.println("Atividade 3: Teste de Métodos Genericos !");
                    System.out.println("-----------------------------------------");
                    
                    // instanciação de um objeto da classe 'MetodosIndependentes'
                    MetodosGenericos generico = new MetodosGenericos();

                    // A. acionamento do método para impressão do 'array' de objetos 'Integer'
                    System.out.println("Exibindo conteúdo do 'array' de 'Integer':");
                    generico.printArray(intArrayT);

                    // B. acionamento do método para impressão do 'array' de objetos 'Double'
                    System.out.println("Exibindo conteúdo do 'array' de 'Double':");
                    generico.printArray(doubleArrayT);
                    
                    // C. acionamento do método para impressão do 'array' de objetos 'String'
                    // AQUI ...
                    System.out.println("Exibindo conteúdo do 'array' de 'String':");
                    generico.printArray(stringArrayT);
                    
                    // declaração de variável auxiliar para indicar o resultado da busca
                    // AQUI ...
                    int rBG;

                    // D. exemplo de busca por um conteúdo no 'array' de objetos 'Integer'
                    // AQUI ...
                     // 1. conteúdo existente
                    System.out.print("Buscando o conteúdo 5 no 'array' de 'int' ... ");
                    rBG = generico.buscaArray(intArrayT,5);
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9 no 'array' de 'int' ... ");
                    rBG = generico.buscaArray(intArrayT,9);
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }

                    // E. exemplo de busca por um conteúdo no 'array' de objetos 'Double'
                    // AQUI ...
                    System.out.print("Buscando o conteúdo 5.5 no 'array' de 'double' ... ");
                    rBG = generico.buscaArray(doubleArrayT,5.5);
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }
                    // 2. conteúdo inexistente
                    System.out.print("Buscando o conteúdo 9.9 no 'array' de 'double' ... ");
                    rBG = generico.buscaArray(doubleArrayT,9.9);
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }

                    // F. exemplo de busca por um conteúdo no 'array' de objetos 'String'
                    // AQUI ...
                    // 1. conteúdo existente
                    System.out.print("Buscando o conteúdo 'Paula' no 'array' de 'String' ... ");
                    rBG = generico.buscaArray(stringArrayT, "Paula");
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }
                    // 2. conteúdo inexistente
                    // AQUI ...
                    System.out.print("Buscando o conteúdo 'Neto' no 'array' de 'String' ... ");
                    rBG = generico.buscaArray(stringArrayT, "Neto");
                    if ( rBG == -1 ) {
                        System.out.println("NÃO ENCONTRADO !");
                    }
                    else {
                        System.out.println("ENCONTRADO na posição " + rBG);
                    }


                    break;

                case SAIR:
                    System.out.println("Sair ...\n");
                    break;

                default:
                    System.out.println("Opção inválida !  Tente novamente ...\n");
            }

        } while (escolha != SAIR);

        teclado.close();

        // criação de uma instância (objeto) da classe 'Autor' para permitir o acesso
        // aos respectivos métodos
        Autor autor = new Autor();
        
        // aciona método para exibição dos dados do autor do trabalho
        autor.exibeDadosAutor( "2026/1S",
                       "MÉTODOS GENÉRICOS em JAVA", 
                       "MATHEUS DE PAULA SANTOS", 
                       "121 092 251 1 040" );

    }
    
}
