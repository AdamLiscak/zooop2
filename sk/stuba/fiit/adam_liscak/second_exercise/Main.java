package sk.stuba.fiit.adam_liscak.second_exercise;
public class Main {
	public static void main(String[] args){
		System.out.println("* pocitac s ktorym pracujem je objekt, instanciou triedy pocitacov");
		System.out.println("* Ma svoju identitu");
		System.out.println("* Ma svoj stav");
		//List<Student> students = new ArrayList<Student>();
		for(int i = 0;i<10;i++){
			System.out.println(System.identityHashCode(new Student()));
			// myslite autonomitou ze maju vlastnu identitu alebo vlastne atributy?
			// toto printuje hashcode indentity
			// ked vlastne atributy, tak to bude dole
		}
		Student peterMelisko = new Student(0,"Peter","Melisko",(short)1991,(byte)8,(byte)12);
		String[] firstNames = { "Jozo", "Benito", "Sancho", "Jan", "Alfonso", "Xu","Takashi","Kim", "Sviotlana", "Jordan"};
		String[] lastNames = {"Cantallone", "Zakopecky", "Panza", "Achberger", "Slyminx","Bin Tiang", "Hiroshima", "Jong", "Sviatoplukova", "Smith"};
		for( int j = 0; j<10;j++){
			peterMelisko.addFriend(new Student(firstNames[j],lastNames[j]));
		}
		// peter sedi na zachode
		peterMelisko.sit();
		// peter tiez hra(pracuje) na tenisovych kurtoch
		peterMelisko.work();
		// ale peter nespi
		// nechce sa mi tu 10x vypisovat peterMelisko... 
		Student p = peterMelisko;
		p.giveWarning();
		String[] peterMeliskoAttributes = {"id:"+p.getId(), "firstName:"+p.getFirstName(), "lastName:"+p.getLastName(), "birthYear:"+p.getBirthYear(), "birthMonth:"+p.getBirthMonth(), "sits:"+p.sits(), "works:"+p.works(), "sleeps:"+p.sleeps(), "friends:"+p.listFriends()};
		for(String attribute: peterMeliskoAttributes){
			System.out.println(attribute);
		}
		new Hello();
		new HelloDate();
		new KeyboardReader().read();
		new Hello();
	}
}
