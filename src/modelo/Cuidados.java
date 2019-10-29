package modelo;

public class Cuidados {
	private int sumatoriaNeurocognitivo,sumatoriaNeurodesarrollo;
	private String [][] matrizNino,matrizJoven,matrizAdulto;
	private String cuidados;
	private boolean enfermedad1,enfermedad2,enfermedad3;
	
	public Cuidados() {
		// TODO Auto-generated constructor stub
	}

	public String clasificarMatrizNOCOCHINO(String aux) {
		int x = 0;
		int y = 0;
		if(aux.equals("JOVEN")) {
			if(sumatoriaNeurocognitivo>=0 && sumatoriaNeurocognitivo<=5) {
				x=0;
			}else if(sumatoriaNeurocognitivo>5 && sumatoriaNeurocognitivo<=10) {
				x=1;
			}else if(sumatoriaNeurocognitivo>10 && sumatoriaNeurocognitivo<=15) {
				x=2;
			}
			if(sumatoriaNeurodesarrollo>=0 && sumatoriaNeurodesarrollo<=5) {
				y=0;
			}else if(sumatoriaNeurodesarrollo>5 && sumatoriaNeurodesarrollo<=10) {
				y=1;
			}else if(sumatoriaNeurodesarrollo>10 && sumatoriaNeurodesarrollo<=15) {
				y=2;
			}
			aux=matrizJoven[x][y];
		}
		else if(aux.equals("NIÑO")) {
			if(sumatoriaNeurocognitivo>=0 && sumatoriaNeurocognitivo<=5) {
				x=0;
			}else if(sumatoriaNeurocognitivo>5 && sumatoriaNeurocognitivo<=10) {
				x=1;
			}else if(sumatoriaNeurocognitivo>10 && sumatoriaNeurocognitivo<=15) {
				x=2;
			}
			if(sumatoriaNeurodesarrollo>=0 && sumatoriaNeurodesarrollo<=5) {
				y=0;
			}else if(sumatoriaNeurodesarrollo>5 && sumatoriaNeurodesarrollo<=10) {
				y=1;
			}else if(sumatoriaNeurodesarrollo>10 && sumatoriaNeurodesarrollo<=15) {
				y=2;
			}
			aux=matrizNino[x][y];
		}
		else if(aux.equals("ADULTO")) {
			if(sumatoriaNeurocognitivo>=0 && sumatoriaNeurocognitivo<=5) {
				x=0;
			}else if(sumatoriaNeurocognitivo>5 && sumatoriaNeurocognitivo<=10) {
				x=1;
			}else if(sumatoriaNeurocognitivo>10 && sumatoriaNeurocognitivo<=15) {
				x=2;
			}
			if(sumatoriaNeurodesarrollo>=0 && sumatoriaNeurodesarrollo<=5) {
				y=0;
			}else if(sumatoriaNeurodesarrollo>5 && sumatoriaNeurodesarrollo<=10) {
				y=1;
			}else if(sumatoriaNeurodesarrollo>10 && sumatoriaNeurodesarrollo<=15) {
				y=2;
			}
			aux=matrizAdulto[x][y];
		}
		return aux;
	}
	
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}
	public boolean isEnfermedad1() {
		return enfermedad1;
	}
	public void setEnfermedad1(boolean enfermedad1) {
		this.enfermedad1 = enfermedad1;
	}
	public boolean isEnfermedad2() {
		return enfermedad2;
	}
	public void setEnfermedad2(boolean enfermedad2) {
		this.enfermedad2 = enfermedad2;
	}
	public boolean isEnfermedad3() {
		return enfermedad3;
	}
	public void setEnfermedad3(boolean enfermedad3) {
		this.enfermedad3 = enfermedad3;
	}
	
}
