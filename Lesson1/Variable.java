public class Variable {
	public static void main(String[] args) {
		byte numberOfCores = 2;
		short processorSpeed = 2000;
		int cashL2PerCore = 256;
		long cashL3 = 4;
		float display = 13.3f;
		double storage = 250.69;
		char serialNumberFirstLetter = 'C';
		boolean myNotebook = true;

		System.out.println ("Количество ядер процессора = " + numberOfCores);
		System.out.println ("Частота процессора = " + processorSpeed);
		System.out.println ("Размер кэша L2 = " + cashL2PerCore);
		System.out.println ("Размер кэша L3 = " + cashL3);
		System.out.println ("Диагональ экрана = " + display);
		System.out.println ("Объем HDD = " + storage);
		System.out.println ("Серийный номер начинается с '" + serialNumberFirstLetter + "'");
		System.out.println ("Этот ноутбук Сергея = " + myNotebook);
	}
}