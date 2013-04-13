import generated.*;
import generated.Rezepte.Rezept;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Aufgabe4 {
	
	public static int index = 1;

	public static void main(String[] args) throws JAXBException{
		
		Scanner in = new Scanner(System.in);
		

			System.out.println("Wählen Sie die Nummer Ihres gewünschten Rezeptes.");
				auflistung();
	
				int a = in.nextInt();
				int index;
				switch(a){
				
					case 0:
						infos(a); break;
						
				}
	}
				


	
private static void auflistung() throws JAXBException{
	
	for(int i = 0; i <= index; i++){
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
			for(int a = 0; a < r.getZutaten().getZutat().size(); a++, b++)
			System.out.println("Zutat " + b + " ist: " + r.getZutaten().getZutat().get(a).getMenge() + r.getZutaten().getZutat().get(a).getEinheit() + r.getZutaten().getZutat().get(a).getName());
			
}
	
	

		
private static Rezepte getRezepte() throws JAXBException {
JAXBContext ctx = JAXBContext.newInstance("generated");
Unmarshaller unmarshaller = ctx.createUnmarshaller();
Rezepte list = (Rezepte) unmarshaller.unmarshal(new File("src/Aufgabe3d_xml.xml"));
return list;
}
		
}
	
	

