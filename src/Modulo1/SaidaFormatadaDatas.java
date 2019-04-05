package Modulo1;

import java.util.Calendar;
import java.util.Date;

public class SaidaFormatadaDatas {
	public static void main(String a[]) {
		System.out.println("****** Exemplos com Date");
		Date now = new Date();
		System.out.printf("Nome do dia: %tA/%TA\n", now, now);
		System.out.printf("Nome do dia ab abreviado: %ta/%Ta\n", now, now);
		System.out.printf("S�culo com 2 d�gitos: %TC\n", now);
		System.out.printf("Ano com 2 d�gitos:    %Ty\n", now);
		System.out.printf("Ano com 4 d�gitos:    %TY\n", now);
		System.out.printf("Dia do ano:           %Tj\n", now);
		System.out.printf("M�s com 2 d�gitos:    %Tm\n", now);
		System.out.printf("Dia do m�s com 2 d�gitos: %Td\n", now, now);
		System.out.printf("Hora e minutos (24h): %TR\n", now);
		System.out.printf("Hora e minutos (24h): %TT\n", now);
		System.out.printf("Hora e minutos (12h): %Tr\n", now);
		System.out.printf("M�s/Dia/Ano:          %TD\n", now);
		System.out.printf("Data no padr�o ISO 8601  %TF\n", now);
		System.out.printf("Formato de data do Unix: %Tc\n", now);
// Exemplos de Calendar
		System.out.println("\n\n****** Exemplos com Calendar");
		Calendar dateTime = Calendar.getInstance();
		System.out.printf("%tc\n", dateTime);
		System.out.printf("%tF\n", dateTime);
		System.out.printf("%tD\n", dateTime);
		System.out.printf("%tr\n", dateTime);
		System.out.printf("%tT\n", dateTime);
// Usando o primeiro par�metro mais de uma vez
		System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", dateTime);
		System.out.printf("%1$TA, %1$TB %1$Td, %1$TY\n", dateTime);
		System.out.printf("%1$ta, %1$tb %1$te, %1$ty\n", dateTime);
		System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
	}
}