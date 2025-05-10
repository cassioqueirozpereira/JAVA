package agrupamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Escola {
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;
    private int proximoNumeroDepartamento = 0;

    // Métodos
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento (nomeDepartamento, proximoNumeroDepartamento++));
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    // Temos 3 funções agruparAlunos()
    // Qunado não passamos parâmetro. Ativa essa função.
    public void agruparAlunos(){
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno a: discentes) {
            if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(a.recuperarNaturalidade()).add(a);
        }
        System.out.println("\nresultado do agrupamento por naturalidade: \n\n" + agrupamento);
    }

    // Quando passamos um número inteiro como parâmetro, ativa essa função.
    public void agruparAlunos(int a) {
        Map<String, Set<Aluno>>agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, Collectors.toSet()));

        System.out.println("\nResultado do agrupamento por naturalidade: \n\n");
        agrupamento.forEach((String chave, Set<Aluno>conjunto)->System.out.println(chave + " = " + conjunto + "\n"));
    }

    // Quando passamos um número com casas decimais, ativa essa função.
    public void agruparAlunos(double a) {
        Map<String, Set<Aluno>> agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, TreeMap::new, Collectors.toSet()));

        System.out.println("\nResultado do agrupamento por naturalidade: \n\n");
        agrupamento.forEach((String chave, Set<Aluno> conjunto)->System.out.println(chave + " = " + conjunto + "\n"));
    }
}
