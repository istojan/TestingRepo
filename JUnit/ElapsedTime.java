package JUnit;

public class ElapsedTime {
	
	public static int elapsedTime(int h1, int m1, int h2, int m2, String amOrPm1, String amOrPm2){
		
		if(h1==12){
			h1 = 0;
		}
		if(h2==12){
			h2 = 0;
		}
		if(amOrPm1.equals("pm")){
			h1+=12;
		}
		if(amOrPm2.equals("pm")){
			h2+=12;
		}
		if(m2<m1){
			m2+=60;
			h2--;
		}
		if(h2<h1){
			h2+=24;
		}
		return m2 - m1 + 60*(h2-h1);
		
	}
	
}
