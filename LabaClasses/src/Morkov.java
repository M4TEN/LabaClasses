/**
 * Класс Морковь - наследует класс Овощ, класс для объектов моркови
 * @author hrtt2016
 *
 */
public class Morkov extends Ovosch{
	/** Поле для хранения названия салата в который входит морковь*/
String salatik;
/** Поле для хранения информации о статусе моркови*/
String Porezali;
/** Обрабатывает исключения поля (@link Morkov#que)
 * @param que - Что хотят делать с морковью*/
@Override
public void Polezno(String que){
	try{
		if (que!="")
			throw new MyException("Are you sure you want to..."+que+"?");
	}
	catch(MyException e){
		System.out.println(e.getMessage());
	}
	finally{
		System.out.println("Yay");
	}
}
/** */
@Override
public String Razmer(int razmer){
	return "Its - "+razmer;
}
/** */
@Override
public void Cvet(){
	System.out.println("Цвет морковки оранжевый");
}
/** */
public void Moika(){
	System.out.println("Морковь лежит в мойке");
}
/** */
public void Stol()
{
	System.out.println("Морковь лежит на столе");
}
/** */
public void Pol()
{
	System.out.println("Морковь лежит на полу");
}
/** */
public void Zrenie(){
	System.out.println("Говорят, морковка улучшает зрение!");
	System.out.println("Не знаю, скушайте проверьте :|");
}
/** */
public void Fakt(){
	System.out.println("Морковку зайцы не едят, она вредна для них!");
}
/** */
public void Skyshali(){
	System.out.println("Вот и скушали морковку, не осталось ничего!");
}
}
