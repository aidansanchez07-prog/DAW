Proceso sin_titulo
	definir seleccion como numerico;
	definir saldo como numerico;
	definir deposito como numerico;
	definir retirar como numerico;
	saldo<-0;
	Repetir
		
	 
		escribir "Bienvenido al Cajero Automatico";
		escribir "1.Depositar";
		escribir "2. Retirar";
		escribir "3.Consultar";
		escribir "4. Salir";
		Leer seleccion;
		si seleccion=1 entonces
			escribir "Añade la cantidad que vas a depositar";
			leer deposito;
			saldo<-saldo+deposito;
			escribir "Tu saldo ahora es ", saldo;
		sino 
			si seleccion=2 Entonces
				si saldo=0 Entonces
					escribir "Error no tienes nada de dinero";
					
				
				SiNo
					escribir"Cuanto de sea retirar";
					leer retirar;
					si saldo< retirar Entonces
						escribir "Error no puedes retirar mas dinero que el que tienes";
					sino 
						saldo<-saldo-retirar;
						escribir "Tu saldo ahora es ", saldo;
					FinSi
					
				FinSi
				
			SiNo
				si seleccion=3 Entonces
					escribir "Tu saldo es ", saldo;
				SiNo
					si seleccion=4 Entonces
						escribir"Gracias por su visita vuelva pronto";
					sino 
						escribir"Añade un caracter correcto";
					FinSi
				FinSi
			
			FinSi
		FinSi
		
	Hasta que seleccion=4;
FinProceso
