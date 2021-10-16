class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println(fibonacci(2));
		System.out.println(tribonacci(10));
		
		
		int [] array = {10, 20, 30, 40, 50, 60};
		System.out.println(encontrarPos(array, 0, 45));
		System.out.println(encontrarPos2(array, 45));
		System.out.println(arrayTieneX(array, 0, 1));
	}

	// EJERCICIO 3
	public static boolean arrayTieneX(int [] array, int n, int x) {
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
			if(array[i] == x) {
				return true;
			}
		}
		return false;
	}

	// EJERCICIO 4
	public static int encontrarPos(int [] array, int pos, int x) {
		// RECURSIVA SECUENCIAL
		if(pos == array.length - 1 || x > array[pos] && x <= array[pos + 1]) {
			return pos + 2;
		}else {
			return encontrarPos(array, pos + 1, x);
		}
	}

	public static int encontrarPos2(int [] array, int x) {
		// RECURSIVA ITERATIVA
		int i = 0;
		for (; i < array.length; i++) {
			if(i == array.length - 1 || x > array[i] && x <= array[i + 1]) {
				return i + 2; 
			}
		}
		
		return i + 2;
	}

	public static void encontrarPos3(int [] array, int x) {
		// RECURSIVA ITERATIVA CON BUSQUEDA BINARIA
	}

	public static void encontrarPos4(int [] array, int x) {
		// RECURSIVA CON BUSQUEDA BINARIA
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