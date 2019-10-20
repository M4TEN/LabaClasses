/**
 * Класс Овощ - базовый класс для объектов овощей
 * @author hrtt2016
 *<meta charset="utf-8">
 */
public class Ovosch {
	String name;
	String color;
	String polezno;
    
	public String Razmer(int skok){
		return "Размер овощины - "+skok+"cm";
		}
	
	public void Polezno(String que){};
	
	public void Cvet(){};
	
	public void Moika(){};
	
	public void Stol(){};
	
	public void Pol(){};
	
	final public void Ovoschina(){
		System.out.println("Вот это овощина!!");
	}
	public void Lezhit (){
		System.out.println("Лежит овощина, никто не трогает...");
	}
	public void Portitsya(){
		System.out.println("Если эту штуку никто не будет использовать...");
		System.out.println("Она же, блин, испортится!");
	}
	public void Moet(){
		System.out.println("Моем, моем чтоб было чисто, чисто..");
	}
	
	public void Skyshali (){
		System.out.println("Вот и скушали да ничего и не осталось!");
	}//pereopr in Morkov
}
