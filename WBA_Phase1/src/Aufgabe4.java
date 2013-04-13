import generated.*;
import generated.Rezepte.Rezept;
import generated.Rezepte.Rezept.Comments.Comment;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Aufgabe4 {
	
	public static int index = 0;

	public static void main(String[] args) throws JAXBException{
		
		Scanner in = new Scanner(System.in);
		
		do{
			for(int i=0; i<1; i++){
				System.out.println("Wählen Sie die Nummer Ihres gewünschten Rezeptes.");
					auflistung();
		
					int a = in.nextInt();
						infos(a); 
						kommentare(a);
				System.out.println("\n\n");
				System.out.println("Wenn sie Kommetare hinzufügen wollen, wählen sie: \t 1");
				System.out.println("Wenn Sie ein anderes Rezept wählen wollen wählen sie: \t 2");
				System.out.println("Wenn Sie das Programm beenden wollen wählen sie: \t 3");

				int tmp = in.nextInt();
				if(tmp == 1) kommentieren(a);
				if(tmp == 3) System.exit(-1);
			} 
 
		}
		
		while(index != 1);	
	}
		

				
private static void kommentieren(int i) throws JAXBException{
	Scanner in = new Scanner(System.in);
	
	System.out.println("Geben Sie jetzt Ihren Usernamen ein.");
	String user = in.nextLine();
	System.out.println("Geben Sie jetzt Ihren Kommentar ein.");
	String text = in.nextLine();
	
	Comment neuescomment = new Comment();
	
	neuescomment.setUser(user);
	neuescomment.setKommentar(text);
	
	getRezepte().getRezept().get(i).getComments().getComment().add(neuescomment);
	
//    Marshaller m = context.createMarshaller();
//    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//    m.marshal(new ObjectFactory().createRezepte(rezepte), new File(xmlfile));
//
//    	JAXBContext ctx = JAXBContext.newInstance("generated");
//    	Unmarshaller unmarshaller = ctx.createUnmarshaller();
//    	Rezepte list = (Rezepte) unmarshaller.unmarshal(new File("src/Aufgabe3d_xml.xml"));
//    	return list;
	
}

	
private static void auflistung() throws JAXBException{
	
	for(int i = 0; i < getRezepte().getRezept().size(); i++){
		System.out.println(getRezepte().getRezept().get(i).getRezeptname() + "........." + i);
	}	
}

private static void infos(int i) throws JAXBException{
		
	Rezept r = getRezepte().getRezept().get(i);
		
		System.out.println(getRezepte().getRezept().get(i).getRezeptname() + "\n");
		
		System.out.println("Bild Nummer" + r.getBilder().getBild().get(0).getBildId());
		System.out.println(r.getBilder().getBild().get(0).getLink());
		System.out.println("Gepostet von:" + r.getBilder().getBild().get(0).getUser() + "\n");
		
		int b = 1;
		for(int a = 0; a < r.getZutaten().getZutat().size(); a++, b++){
			System.out.println("Zutat " + b + " ist: " + r.getZutaten().getZutat().get(a).getMenge() + " " + r.getZutaten().getZutat().get(a).getEinheit() + " " + r.getZutaten().getZutat().get(a).getName());
		}
			
		System.out.println("\n" + "Arbeitszeit: " + r.getZubereitung().getZeit());
		System.out.println("Schwierigkeitsgrad: " + r.getZubereitung().getSchwierigkeit());
		System.out.println("Brennwert: " + r.getZubereitung().getBrennwert());
		System.out.println("Zubereitung: " + r.getZubereitung().getAnleitung() + "\n\n");
}
	
private static void kommentare(int i) throws JAXBException{
	
	Rezept r = getRezepte().getRezept().get(i);
	
		System.out.println("Kommentare: \n");
		int b = 1;
		for(int a = 0; a < r.getComments().getComment().size(); a++, b++){
			System.out.println("Kommentar " + b + ", von " + r.getComments().getComment().get(a).getUser() + " am " + r.getComments().getComment().get(a).getDatum());
			System.out.println(r.getComments().getComment().get(a).getUserPic());
			System.out.println(r.getComments().getComment().get(a).getKommentar() + "\n");
		}
}


		
private static Rezepte getRezepte() throws JAXBException {
JAXBContext ctx = JAXBContext.newInstance("generated");
Unmarshaller unmarshaller = ctx.createUnmarshaller();
Rezepte list = (Rezepte) unmarshaller.unmarshal(new File("src/Aufgabe3d_xml.xml"));
return list;
}
		
}
	


