Proceso sin_titulo
	definir min como numerico;
	definir seg como numerico;
	definir final como caracter;
	escribir"escribe primero los minutos y luego los segundos";
	leer min;
	leer seg;
	Repetir
		
		Repetir
			seg<-seg+1;
			esperar 1 Segundos;
			si min<10 y seg<10 Entonces
				escribir "0",min,":0",seg;
			SiNo
				
				si min<10 Entonces
					escribir "0",min,":",seg;
				
				sino
					Si seg<10 Entonces
					escribir min,":0",seg;
				
				
			
					SiNo
						escribir min,":",seg;
					FinSi
				FinSi
				
			FinSi
			
		Hasta Que seg=59
		seg<-0;
		min<-min+1;
		esperar 1 segundo;
		si min>59 Entonces
			min<-0;
			escribir "00:00";
		SiNo
			
		
			si min<10 Entonces
				escribir "0",min,":0",seg;
			SiNo
				escribir min,":0",seg;
			finsi
		FinSi
		
		escribir "Si quieres continuar escribe cualquier cosa si no escribe NO";
		leer final;
	Hasta Que final=="NO"
FinProceso
