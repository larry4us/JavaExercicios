import java.util.*;

public class Turma {

	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios;
	int[][] matriz_horarios =  {{1, 8, 15, 22, 29},
								{2, 9, 16, 23, 30},
					            {3, 10, 17, 24, 31},
					            {4, 11, 18, 25, 32},
					            {5, 12, 19, 26, 33},
					            {6, 13, 20, 27, 34},
					            {7, 14, 21, 28, 35}};
		
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
		this.horarios = new ArrayList<Integer>();
	}
	
	Turma (){
		this("","",0,false);
	}
	
	void addHorario(int horario) {
		horarios.add(horario);
	}
	
	String getHorarioString(int numero) {
		int col = -1;
		int lin = -1;
		boolean encontrado = false;
		String frase = "";
		
		for (int linha = 0; linha < matriz_horarios.length; linha ++){
			for(int coluna = 0; coluna < matriz_horarios[linha].length;coluna ++) {
				if (matriz_horarios[linha][coluna] == numero) {
					encontrado = true;
					lin = linha;
					col = coluna;
					break;
				}
			}
			if (encontrado) {
				break;
			}
		}
		
		if (col == 0) {
			frase += "segunda ";
		} else if (col == 1) {
			frase += "terça ";
		} else if (col == 2) {
			frase += "quarta ";
		} else if (col == 3) {
			frase += "quinta ";
		} else if (col == 4) {
			frase += "sexta ";
		}
		
		if (lin == 0) {
			frase += "8hs";
		} else if (lin == 1) {
			frase += "10hs";
		} else if (lin == 2) {
			frase += "12hs";
		} else if (lin == 3) {
			frase += "14hs";
		} else if (lin == 4) {
			frase += "16hs";
		} else if (lin == 5) {
			frase += "18hs";
		} else if (lin == 6) {
			frase += "20hs";
		}	
		return frase;
	}
	
    String getHorariosString() {
        if (this.horarios.size() > 0) {
            StringBuilder frase = new StringBuilder();
            frase.append(getHorarioString(this.horarios.get(0)));

            for (int i = 1; i < this.horarios.size(); i++) {
                frase.append(", ");
                frase.append(getHorarioString(this.horarios.get(i)));
            }

            return frase.toString();
        }

        return "";
    }
    
    String getAcessivelString() {
    	if (this.acessivel == true) {
    		return "sim";
    	} else {
    		return "não";
    	}
    }

    String getDescricao() {
    	StringBuilder frase = new StringBuilder();
    	frase.append("Turma: " + this.nome);
    	frase.append("\nProfessor: " + this.professor);
    	frase.append("\nNúmero de Alunos: " + this.numAlunos);
    	frase.append("\nHorário: " + getHorariosString());
    	frase.append("\nAcessível:" + getAcessivelString());
    	return frase.toString();
    }

}
	
	
	
	


