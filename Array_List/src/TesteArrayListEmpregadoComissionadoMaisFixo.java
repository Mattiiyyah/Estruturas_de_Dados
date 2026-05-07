// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2026/1S
// ----------------------------------------

 // classe para realização de testes com
// 'ArrayList' contendo objetos 'EmpregadoComissionadoMaisFixo'
// ------------------------------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;
// importação para permitir o uso de 'sort'
//import java.util.Collections;
// importação para permitir o uso de 'Interator'
import java.util.Iterator;

public class TesteArrayListEmpregadoComissionadoMaisFixo {
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'EmpregadoComissionadoMaisFixo' (inicialmente vazio)
        ArrayList< EmpregadoComissionadoMaisFixo > empregados_cf = new ArrayList<>();
        
        // cria 4 objetos da classe EmpregadoComissionadoMaisFixo'
        EmpregadoComissionadoMaisFixo empregado1 =
                new EmpregadoComissionadoMaisFixo(
                        "Fernanda",
                        "Montenegro",
                        "123.123.123-12",
                        12,
                        3,
                        1990,
                        5000,
                        .04,
                        300 );

        EmpregadoComissionadoMaisFixo empregado2 =
                new EmpregadoComissionadoMaisFixo(
                        "Matheus",
                        "de Paula Santos",
                        "222.222.222-22",
                        11,
                        8,
                        2006,
                        6000,
                        .06,
                        300 );

        EmpregadoComissionadoMaisFixo empregado3 =
                new EmpregadoComissionadoMaisFixo(
                        "Ana",
                        "Carolina Silva",
                        "333.333.333-33",
                        25,
                        4,
                        1995,
                        8000,
                        .05,
                        450 );

        EmpregadoComissionadoMaisFixo empregado4 =
                new EmpregadoComissionadoMaisFixo(
                        "Lucas",
                        "Oliveira",
                        "444.444.444-44",
                        7,
                        11,
                        2000,
                        7000,
                        .03,
                        350 );

        // inclussão dos Objetos 'EmpregadoComissionadoMaisFixo' no 'ArrayList'
        empregados_cf.add(empregado1);
        empregados_cf.add(empregado2);
        empregados_cf.add(empregado3);
        empregados_cf.add(empregado4);

        // exibição do conteúdo do 'ArrayList' via 'toString' de 'ArrayList'
        System.out.println("\nConteúdo do 'ArrayList' de objetos 'EmpregadoComissionadoMaisFixo' (exibição via 'toString')");
        System.out.println(empregados_cf);

        // ??? classificação dos elementos do 'ArrayList' via 'iterator'
         System.out.println("\nConteúdo do 'ArrayList' de objetos 'EmpregadoComissionadoMaisFixo' (exibição via 'Interetor')");

         Iterator < EmpregadoComissionadoMaisFixo > interador = empregados_cf.iterator();
         while (interador.hasNext()) {
            EmpregadoComissionadoMaisFixo emp = interador.next();
            System.out.printf("\n%s\nVencimentos: R$ %.2f\n", emp, emp.vencimentos());
         }
        
        // ??? exibição do conteúdo classificado do 'ArrayList'
        //Collections.sort(empregados_cf);

        // ??? realização de buscas por:
        // - objetos efetivamente armazenados no 'ArrayList'
        // - objetos não armazenados no 'ArrayList'
        

        // Cria um array com os empregados que você quer buscar
       EmpregadoComissionadoMaisFixo[] buscados = {empregado1, empregado2, empregado4};

        for (EmpregadoComissionadoMaisFixo emp : buscados) {
        System.out.printf("\nO ArrayList contém '%s'? --> ", emp.getNome());
        if (empregados_cf.contains(emp)) {
                System.out.println("SIM !!!");
        } else {
                System.out.println("Não !!!");
        }
        }
        
        //transferência do conteúdo para um vetor convencional
        EmpregadoComissionadoMaisFixo[] empregados_cf2 = new EmpregadoComissionadoMaisFixo[empregados_cf.size()];

        //armazenando os empregados com for
        for (int i = 0; i < empregados_cf2.length; i++) {
            empregados_cf2[i] = empregados_cf.get(i);  // pega do ArrayList pelo índice
        }

        // exibição do conteúdo do vetor convencional
        System.out.println("\nConteúdo do vetor convencional (copiado do ArrayList):");
        for (EmpregadoComissionadoMaisFixo emp : empregados_cf2) {
            System.out.printf("\n%s\nVencimentos: R$ %.2f\n", emp, emp.vencimentos());
        }

    }

}

