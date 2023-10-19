import java.util.*;

public class Ensalamento {
	ArrayList<Sala> salas;
	ArrayList<Turma> turmas;
	ArrayList<TurmaEmSala> ensalamento;
	
	Ensalamento(){
		this.salas = new ArrayList<Sala>();
		this.turmas = new ArrayList<Turma>();
		this.ensalamento = new ArrayList<TurmaEmSala>();
	}
	
	void addSala(Sala sala) {
		this.salas.add(sala);
	}
	
	void addTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	Sala getSala(Turma turma){
		for(TurmaEmSala x: this.ensalamento) {
			if (turma == x.turma) {
				return x.sala;
			} 
		}
		return null;
	}
	
	boolean salaDisponivel(Sala sala, int horario) {
		for (TurmaEmSala x: this.ensalamento) {
			if (x.sala == sala) {
				for (int y: x.turma.horarios) {
					if (y == horario) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
    boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (int horario : horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }
        return true;
    }
    
    void alocarTodas() {
        for (Turma turma : this.turmas) {
            for (Sala sala : this.salas) {
                if (alocar(turma, sala)) {
                    break;  // Alocou a turma, passa para a próxima turma
                }
            }
        }
    }

    boolean alocar(Turma turma, Sala sala) {
        if (turma.acessivel && sala.acessivel) {
            if (turma.numAlunos <= sala.capacidade && salaDisponivel(sala, turma.horarios)) {
                TurmaEmSala x = new TurmaEmSala(turma, sala);
                this.ensalamento.add(x);
                return true;
            }
        }
        return false;
    }
    
    /*
    boolean alocar(Turma turma, Sala sala) {
    	if (turma.acessivel && sala.acessivel) {
    		if (turma.numAlunos <= sala.capacidade) {
    			if (salaDisponivel(sala, turma.horarios)){
    				TurmaEmSala x = new TurmaEmSala(turma,sala);
                    this.ensalamento.add(x);    				
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
    

    void alocarTodas() {
        for (Turma turma : this.turmas) {
        	
            
            for (Sala sala : this.salas) {
                if (alocar(turma, sala)) {
                    turmaAlocada = true;
                    break;
                }
            }
        }
    }
*/

    int getTotalTurmasAlocadas() {
        return this.ensalamento.size();
    }

    int getTotalEspacoLivre() {
        int totalEspacoLivre = 0;
        
        for (TurmaEmSala ensalamentoAtual: this.ensalamento) {
        	totalEspacoLivre += ensalamentoAtual.sala.capacidade - ensalamentoAtual.turma.numAlunos;
        }
        return totalEspacoLivre;
    }
  

        String relatorioResumoEnsalamento() {
            int totalSalas = this.salas.size();
            int totalTurmas = this.turmas.size();
            int turmasAlocadas = this.getTotalTurmasAlocadas();
            int espacosLivres = this.getTotalEspacoLivre();

            return "Total de Salas: " + totalSalas + "\n" +
                   "Total de Turmas: " + totalTurmas + "\n" +
                   "Turmas Alocadas: " + turmasAlocadas + "\n" +
                   "Espaços Livres: " + espacosLivres;
        }
        String cabecalho(Sala sala) {
        	StringBuilder cab = new StringBuilder();
        	cab.append("--- Bloco " + sala.bloco + ", Sala " + sala.sala + " (" + sala.capacidade +
        				" lugares, " + (sala.acessivel ? "acessível" : "não acessível") + ") ---"+ "\n\n");
        	return cab.toString();
        }
        
        
        
        String relatorioTurmasPorSala() {
            StringBuilder relatorio = new StringBuilder();
            relatorio.append(this.relatorioResumoEnsalamento()).append("\n\n");

           
            for (Sala sala : this.salas) {
                //relatorio.append(sala).append("\n\n");
                relatorio.append(cabecalho(sala));
                for (TurmaEmSala ts : ensalamento) {
                    if (ts.sala == sala) {
                        relatorio.append("Turma: ").append(ts.turma.nome).append("\n");
                        relatorio.append("Professor: ").append(ts.turma.professor).append("\n");
                        relatorio.append("Número de Alunos: ").append(ts.turma.numAlunos).append("\n");
                        relatorio.append("Horário: ").append(ts.turma.getHorariosString()).append("\n");
                        relatorio.append("Acessível: ").append(ts.turma.acessivel ? "sim" : "não").append("\n\n");
                    }
                }
            }

            return relatorio.toString();
        }
        
        String temSala (Turma turma) {
        	StringBuilder relatorioSala = new StringBuilder();
        	for (TurmaEmSala x: ensalamento) {
        		if(x.turma == turma) {
        			relatorioSala.append("Bloco " + x.sala.bloco + ", Sala " + x.sala.sala +
        								" (" + x.sala.capacidade + " lugares, " +
        								(x.sala.acessivel ? "acessível" : "não acessível") + ")"+ "\n");
        			return relatorioSala.toString();
        		}
        	}
        	
        	return "SEM SALA\n";
        }
        
        
        String relatorioSalasPorTurma() {
            StringBuilder relatorio = new StringBuilder();
            relatorio.append(this.relatorioResumoEnsalamento()).append("\n\n");

            for (Turma turma : this.turmas) {
                relatorio.append("Turma: ").append(turma.nome).append("\n");
                relatorio.append("Professor: ").append(turma.professor).append("\n");
                relatorio.append("Número de Alunos: ").append(turma.numAlunos).append("\n");
                relatorio.append("Horário: ").append(turma.getHorariosString()).append("\n");
                relatorio.append("Acessível: ").append(turma.acessivel ? "sim" : "não").append("\n");
                relatorio.append("Sala: " + temSala(turma)).append("\n");
            }

            return relatorio.toString();
        }


}