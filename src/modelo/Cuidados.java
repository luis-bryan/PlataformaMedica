package modelo;

public class Cuidados {
	private int sumatoriaNeurocognitivo, sumatoriaNeurodesarrollo;
	private String[][] matrizNino, matrizJoven, matrizAdulto;
	private String cuidados;
	private boolean enfermedad1, enfermedad2, enfermedad3;

	public Cuidados() {
		matrizNino[0][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas";
		matrizNino[0][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[0][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[1][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[1][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[1][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[2][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizNino[2][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
		matrizNino[2][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";

		matrizJoven[0][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas";
		matrizJoven[0][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas";
		matrizJoven[1][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas";
		matrizJoven[0][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizJoven[1][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizJoven[1][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizJoven[2][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizJoven[2][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizJoven[2][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";

		matrizAdulto[0][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas";
		matrizAdulto[0][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizAdulto[0][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizAdulto[1][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico";
		matrizAdulto[1][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
		matrizAdulto[1][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
		matrizAdulto[2][0] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
		matrizAdulto[2][1] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
		matrizAdulto[2][2] = "1. Supervision las 24 Horas del dia \n 2. Controles con un medico especialista \n 3. Realizar actividades simples como  lecturas \n 4. Toma de medicamentos de manera periodica, estos son recomendados por el medico \n 5. Ayuda en hacer actividades simples";
	}

	public String clasificarMatriz(String aux) {
		int x = 0;
		int y = 0;
		if (aux.equals("JOVEN")) {
			if (sumatoriaNeurocognitivo >= 0 && sumatoriaNeurocognitivo <= 5) {
				x = 0;
			} else if (sumatoriaNeurocognitivo > 5 && sumatoriaNeurocognitivo <= 10) {
				x = 1;
			} else if (sumatoriaNeurocognitivo > 10 && sumatoriaNeurocognitivo <= 15) {
				x = 2;
			}
			if (sumatoriaNeurodesarrollo >= 0 && sumatoriaNeurodesarrollo <= 5) {
				y = 0;
			} else if (sumatoriaNeurodesarrollo > 5 && sumatoriaNeurodesarrollo <= 10) {
				y = 1;
			} else if (sumatoriaNeurodesarrollo > 10 && sumatoriaNeurodesarrollo <= 15) {
				y = 2;
			}
			aux = matrizJoven[x][y];
		} else if (aux.equals("NIÑO")) {
			if (sumatoriaNeurocognitivo >= 0 && sumatoriaNeurocognitivo <= 5) {
				x = 0;
			} else if (sumatoriaNeurocognitivo > 5 && sumatoriaNeurocognitivo <= 10) {
				x = 1;
			} else if (sumatoriaNeurocognitivo > 10 && sumatoriaNeurocognitivo <= 15) {
				x = 2;
			}
			if (sumatoriaNeurodesarrollo >= 0 && sumatoriaNeurodesarrollo <= 5) {
				y = 0;
			} else if (sumatoriaNeurodesarrollo > 5 && sumatoriaNeurodesarrollo <= 10) {
				y = 1;
			} else if (sumatoriaNeurodesarrollo > 10 && sumatoriaNeurodesarrollo <= 15) {
				y = 2;
			}
			aux = matrizNino[x][y];
		} else if (aux.equals("ADULTO")) {
			if (sumatoriaNeurocognitivo >= 0 && sumatoriaNeurocognitivo <= 5) {
				x = 0;
			} else if (sumatoriaNeurocognitivo > 5 && sumatoriaNeurocognitivo <= 10) {
				x = 1;
			} else if (sumatoriaNeurocognitivo > 10 && sumatoriaNeurocognitivo <= 15) {
				x = 2;
			}
			if (sumatoriaNeurodesarrollo >= 0 && sumatoriaNeurodesarrollo <= 5) {
				y = 0;
			} else if (sumatoriaNeurodesarrollo > 5 && sumatoriaNeurodesarrollo <= 10) {
				y = 1;
			} else if (sumatoriaNeurodesarrollo > 10 && sumatoriaNeurodesarrollo <= 15) {
				y = 2;
			}
			aux = matrizAdulto[x][y];
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
