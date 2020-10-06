package sk.stuba.fiit.adam_liscak.second_exercise;
import java.util.ArrayList;
import java.lang.StringBuilder;
public class Student {
	// private parametere lebo OOP, lebo nechceme mat namespacove a atributove peklo 
	// lebo chceme aby programator ktory na nase api ide odignoroval tieto veci a pouzival public veci 
	private int id;
	private String firstName;
	private String lastName;
	private short birthYear;
	private byte birthMonth;
	private byte birthDay;
	private boolean sits;
	private boolean works;
	private boolean sleeps;
	private ArrayList<Student> friends;
	public Student(){
		this.friends = new ArrayList<Student>(); 
		// Konstruktor ked studenta inicializujeme bez parametrov
		// friends inicializujem v kazdom konstruktore, mohol by som ho nainicializvat aj
		// prirovnanim hore vo vlastnostiach, ale nieje to pekne tak inicializovat
	}
	public Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.friends = new ArrayList<Student>();
		// konstruktor ked studenta inicializujeme iba s firstname a lastname
	}
	public Student(int id, String firstName, String lastName, short birthYear, byte birthMonth, byte birthDay){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.friends = new ArrayList<Student>();
		// KOnstruktor ked studenta inicializujeme s parametrami
	}
	// setery
	public void sit(){
		this.sits = true;
	}
	public void work(){
		this.works = true;
	}
	public void sleep(){
		this.sleeps = true;
	}
	//getery bojlerplejt
	public int getId(){
		return this.id;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public short getBirthYear(){
		return this.birthYear;
	}
	public byte getBirthMonth(){
		return this.birthMonth;
	}
	public byte getbirthDay(){
		return this.birthDay;
	}
	public boolean isbirthDay(){
		return false;
	}
	public int numberOfFriends(){
		return this.friends.size();
	}
	public boolean sits(){
		return this.sits;
	}
	public boolean works(){
		return this.works;
	}
	public boolean sleeps(){
		return this.sleeps;
	}
	
	public void giveWarning(){
		System.out.println(this.firstName+" "+this.lastName+" you have to study more !!!!!");
	}
	// overridujeme metodu triedy Object toString tak aby ukazala meno a priezvisko
	@Override
	public String toString(){
		return this.firstName+" "+this.lastName;
	}
	// metoda listFriends ktora nam nalistuje vsetkych friendov co student ma podla mena a priezviska
	public String listFriends(){
		StringBuilder sb = new StringBuilder();
		for(Student friend: this.friends){
			sb.append(friend.toString());
			sb.append(",");
		}
		return sb.toString();
	}
	// metoda addFriend ktora prida Studentovi dalsieho kamarata
	public void addFriend(Student friend){
		this.friends.add(friend);
	}
}

