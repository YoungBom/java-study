package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		int hours = 12;
		int minutes = 30;
		System.out.println(hours + "시간" + minutes + "분" );
		
		int makeyourtime = (hours * 60) + minutes;
		System.out.println("총"+ makeyourtime + "분");
	}

}
