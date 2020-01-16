public class Variable {
	public static void main(String[] args) {
		//TODO: вывод характеристик компьютера в командуню строку
		byte numberCores = 2;
		short logicalProcessors = 4;
		long processorCapacity = 64;
		int cpuFrequency = 3500;
		float hardDiskSpace = 8325693.44f;
		double ramMemory = 8589934592d;
		char localDiskLetter = 'C';
		boolean isCdRom = true;

		System.out.println("Вывод характеристик компьютера в командуню строку:");
		System.out.println("Количество ядер " + numberCores);
		System.out.println("Количество логических процессоров " + logicalProcessors);
		System.out.println("Разрядность процессора в битах " + processorCapacity);
		System.out.println("Частота процессора в МГц " + cpuFrequency);
		System.out.println("Объем жесткого диска в килобитах " + hardDiskSpace);
		System.out.println("Объем оперативной памяти в байтах " + ramMemory);
		System.out.println("Буква локального диска " + localDiskLetter);
		System.out.println("Надичие CD-ROM'а " + isCdRom);
	}
}
