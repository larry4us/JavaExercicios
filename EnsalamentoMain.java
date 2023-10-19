
public class EnsalamentoMain {
	public static void main(String[] args) {
		Sala sala_1 = new Sala(1,2,3,true);
		//System.out.println(sala_1.getDescricao());
		
		

		//System.out.println(turma1.getHorariosString());
		//System.out.println(turma1.getDescricao());
		
			Ensalamento ensalamento = new Ensalamento();

	        // Criando salas
	        Sala sala101 = new Sala(6, 101, 50, true);
	        Sala sala102 = new Sala(6, 102, 100, true);
	        Sala sala203 = new Sala(6, 203, 50, false);
	        Sala sala204 = new Sala(6, 204, 100, false);

	        ensalamento.addSala(sala101);
	        ensalamento.addSala(sala102);
	        ensalamento.addSala(sala203);
	        ensalamento.addSala(sala204);

	        // Criando turmas
	        Turma turma1 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
	        Turma turma2 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
	        Turma turma3 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);

	        // Definindo horários para as turmas
	        turma1.addHorario(8);
	        turma1.addHorario(15);
	        turma1.addHorario(22);
	        turma2.addHorario(8);
	        turma2.addHorario(16);
	        turma3.addHorario(8);
	        turma3.addHorario(16);

	        ensalamento.addTurma(turma1);
	        ensalamento.addTurma(turma2);
	        ensalamento.addTurma(turma3);

	        // Testando as funções
	        ensalamento.alocarTodas();

	        //System.out.println("Relatório de Resumo de Ensalamento:");
	        //System.out.println(ensalamento.relatorioResumoEnsalamento());

	        //System.out.println("Relatório de Turmas por Sala:");
	        System.out.println(ensalamento.relatorioTurmasPorSala());
	        
	        Ensalamento e1 = new Ensalamento();
	        Sala s1 = new Sala(2, 102, 80, true); 
	        e1.addSala(s1);
	        Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true); 
	        t1.addHorario(7); 
	        t1.addHorario(21); 
	        t1.addHorario(35); 
	        e1.addTurma(t1); 
	        Sala s2 = new Sala(2, 202, 100, false); 
	        e1.addSala(s2); 
	        e1.alocar(t1, s2); 
	        Sala s3 = new Sala(2, 301, 50, true);
	        e1.addSala(s3); 
	        e1.alocar(t1, s3);
	        e1.alocar(t1, s1); 
	        System.out.println(e1.ensalamento.size());
	}
}


