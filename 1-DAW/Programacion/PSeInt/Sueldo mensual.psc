Proceso sin_titulo
	definir hora como numerico;
	definir nombre como caracter;
	definir sueldo como numerico;
	definir dinero como numerico;
	definir finalizar como numerico;
	finalizar<-0;
	Mientras finalizar<>2 Hacer
		Repetir
			escribir "Seleccione 1 para calcular sueldo o 2 para finalizar";
			leer finalizar;
			Segun finalizar Hacer
				1:
					finalizar<-1;
				2:
					finalizar<-2;
				De Otro Modo:
					escribir "error, introduzca otro numero";
			FinSegun
			
			
			
		Hasta Que  finalizar=1 o finalizar=2
		si finalizar=1 Entonces
			
			
		
			escribir "Escriba su nombre";
			leer nombre;
			escribir "Indica el dinero por hora";
			leer dinero;
			escribir "Indica las horas trabajadas";
			leer hora;
			
			sueldo<-hora*dinero;
			
			si hora<=50 Entonces
				escribir"tu sueldo total es ",sueldo," $";
			FinSi
			si hora>50 y hora<=100 Entonces
				escribir "tu sueldo total es ", sueldo*0.9," $";
			FinSi
			si hora>100 entonces 
				escribir "tu sueldo es ", sueldo*0.8," $";
			FinSi
		FinSi
	
	FinMientras
		
	
	
	
	
	
	
FinProceso
