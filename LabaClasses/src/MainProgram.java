/**
 * Класс Программа - основной класс с выполнением программы
 * @author hrtt2016
 *<meta charset="utf-8">
 */
public class MainProgram {
/** Метод main, вызываемый в самом начале */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Выводит в консоль слово Овощ */
		System.out.println("\nОвощ");
		/** Определение нового объекта класса Ovosch*/
		Ovosch something=new Ovosch();
		/** Вызов метода Lezhit
		 * @see Ovosch*/
		something.Lezhit();
		/** Вызов метода Moet
		 * @see Ovosch*/
		something.Moet();
		/** Вызов метода Portitsya
		 * @see Ovosch*/
		something.Portitsya();
		/** Вызов метода Ovoschina
		 * @see Ovosch*/
		something.Ovoschina();
		/** Выводит в консоль Размер овоща
		 * @param 83 - размер 
		 * @return - something.Razmer
		 * @see Ovosch*/
		System.out.println(something.Razmer(83));
		/** Вызов метода Skyshali
		 * @see Ovosch*/
		something.Skyshali();
		System.out.println("\nМорковь");
		Morkov morkovka=new Morkov();
		morkovka.Lezhit();
		morkovka.Fakt();
		morkovka.Zrenie();
		morkovka.Skyshali();
		System.out.println("\nСвёкла");
		Svekla svek=new Svekla();
		svek.Portitsya();
		svek.Kinyl();
		System.out.println("\nЛук");
		Lyk lykovka=new Lyk();
		lykovka.citata();
		lykovka.sila();
		lykovka.Lezhit();
		
		//laba4
		morkovka.Polezno("");
		morkovka.Polezno("nothing");
		morkovka.Razmer(123);
		morkovka.Cvet();
		morkovka.Moika();
		morkovka.Stol();
		morkovka.Pol();
	}

}
