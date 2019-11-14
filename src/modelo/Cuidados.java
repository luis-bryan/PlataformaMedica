package modelo;

public class Cuidados {
	private int sumatoriaNeurocognitivo, sumatoriaNeurodesarrollo;
	private String[][] matrizNino, matrizJoven, matrizAdulto;

	public Cuidados() {
		matrizNino = new String[3][3];
		matrizJoven = new String[3][3];
		matrizAdulto= new String [3][3];
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
	public int sumatoriaNeurocognitivo(int num1,int num2,int num3) {
		int suma = num1+num2+num3;
		return suma;
	}
	public int sumatoriaNeuroDesarrollo(int num1,int num2,int num3) {
		int suma = num1+num2+num3;
		return suma;
	}

	public String clasificarMatriz(String aux,int sumaNeuro, int sumaNeuroDE) {
		sumatoriaNeurocognitivo = sumaNeuro;
		sumatoriaNeurodesarrollo= sumaNeuroDE;
		int x = 0;
		int y = 0;
		String aux2 ="";
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
			aux2 = matrizJoven[x][y];
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
			aux2 = matrizNino[x][y];
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
			aux2 = matrizAdulto[x][y];
		}
		return aux2;
	}
}
