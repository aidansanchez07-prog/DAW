Proceso sin_titulo
	definir dinero como numerico;
	definir neto como numerico;
	definir cuenta como numerico;
	definir skip como numerico;
	cuenta<-0;
	Repetir
		escribir "introduzca el importe ";
		leer dinero;
		
		cuenta<-cuenta+dinero;
		escribir "Si quieres saber la cuenta final pulse 0 si no pulse cualquier numero";
		leer skip;
	hasta que skip=0
	si cuenta<=100 Entonces
		neto<-cuenta*0.95;
	FinSi
	si cuenta>100 y cuenta<=250 Entonces
		neto<-cuenta*0.85;
	FinSi
	si cuenta>250 Entonces
		neto<-cuenta*0.75;
	FinSi
	
	escribir "Tu cuenta total es ", neto," $";
	
FinProceso
