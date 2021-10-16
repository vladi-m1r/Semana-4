class Main {

	public static void main(String[] args) {
		int [] array = {10, 20, 30, 40, 50, 60};
		int n = 30;
		System.out.println("arreglo contiene: " + arrayTieneX(array, 0, n));
		System.out.println("arreglo contiene: " + arrayTieneX2(array, n));
		System.out.println("encontrar1: " + encontrarPos(array, 0, n));
		System.out.println("encontrar2: " + encontrarPos2(array, n));
		System.out.println("encontrar3: " + encontrarPos3(array, n));
		System.out.println("encontrar4: " + encontrarPos4(array, n));
		System.out.println("fibonacci: " + fibonacci(2));
		System.out.println("tribonacci: " + tribonacci(10));
	}

	// EJERCICIO 3
	public static boolean arrayTieneX(int [] array, int n, int x) {
		// RECURSIVA
		if(array[n] == x) {
			return true;
		}else if(n == array.length - 1) {
			return false;
		}else {
			return arrayTieneX(array, n + 1, x);
		}
	}

	public static boolean arrayTieneX2(int [] array, int x) {
		// ITERATIVA
		for (int i = 0; i < array.length; i++) {
			if(array[i] == x) 
				return true;
		}
		return false;
	}

	// EJERCICIO 4
	public static int encontrarPos(int [] array, int pos, int x) {
		// RECURSIVA SECUENCIAL
		if(pos == 1 && x < array[pos + 1]) {
			return 1;
		}else if(pos == array.length - 1) {
			return pos + 2;
		}else if(x > array[pos] && x <= array[pos + 1] ) {
			return pos + 2;
		}else {
			return encontrarPos(array, pos + 1, x);
		}
	}

	public static int encontrarPos2(int [] array, int x) {
		// RECURSIVA ITERATIVA
		int i = 0;
		for (; i < array.length; i++) {
			if(i == 1 && x < array[i]) {
				return 1;
			}else if(i == array.length - 1 || x > array[i] && x <= array[i + 1]) {
				break;
			}
		}
		
		return i + 2;
	}

	public static int encontrarPos3(int [] array, int x) {
		// RECURSIVA ITERATIVA CON BUSQUEDA BINARIA
		int ini = -1;
		int fin = array.length;
		int i = (fin - ini) / 2;
		
		while(true) {
			if(i == -1 || i == array.length - 1 || x <= array[i + 1] && x > array[i]) 
				break;
			
			if(x > array[i]) 
				ini = i;
			else 
				fin = i;
			
			i = (fin - ini)/2 + ini;
		}
		
		return i + 2;
	}
	
	public static int encontrarPos4(int [] array, int x) {
		return encontrarPos4(array, -1, array.length, (array.length - 1)/2, x);
	}
	
	public static int encontrarPos4(int [] array, int ini, int fin, int i, int x) {
		// RECURSIVA CON BUSQUEDA BINARIA
		if(i == -1 || i == array.length - 1 || x <= array[i + 1] && x > array[i]) {
			return i + 2;
		}else {
			if(x > array[i]) {
				ini = i;
			}else {
				fin = i;
			}
			int mid = (fin - ini)/2 + ini;
			return encontrarPos4(array, ini, fin, mid, x);
		}
	}

	// EJERCICIO 5
	public static int factorial(int x) {
		if(x == 0) {
			return 1;
		}else {
			return x * factorial(x - 1);
		}
	}

	// EJERCICIO 6
	public static int fibonacci(int x) {
		if(x == 0) {
			return 0;
		}else if(x == 1){
			return 1;
		}else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}

	public static int tribonacci(int x) {
		if(x == 0 || x == 1) {
			return 0;
		}else if(x == 2) {
			return 1;
		}else {
			return tribonacci(x - 1) + tribonacci(x - 2) + tribonacci(x - 3);
		}
	}
}