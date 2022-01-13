
public class TeluguYears {
	
	public static int nameToYears(String yearName) {
		int startYr= 1900;
		int currentYr= 2022;
		String [] arrOYr=createArrayOfYears();
		int yearNamePos=0;
		for( int i=0; i<arrOYr.length;i++) {
			if(arrOYr[i].equals(yearName)) {
				yearNamePos=i;
			}
		}
		
		String yearToNameCurrent= yearToName(currentYr,currentYr);
		int yearNamePos2=0;
		for( int i=0; i<arrOYr.length;i++) {
			if(arrOYr[i].equals(yearToNameCurrent)) {
				yearNamePos2=i;
			}
		}
	
int a=0; 

		int temp=0;
			temp=Math.abs(yearNamePos-yearNamePos2);
			if(yearNamePos2>yearNamePos) {
				a= currentYr-60+(60-temp);
			}
			else {
			a=currentYr-60+temp;
			}
			

		return a;
		
	
}
		

	public static String yearToName(int currentYear, int birthYear) {
		int startYr= 1900;
		int currentYr= currentYear;
		int yrsBetween= currentYr-startYr;
		int allTimeRecord[]= new int[60];
		String [] arrOYr=createArrayOfYears();
		String namesFromYear= "";
		
		int temp=0;
		int diff=(( (birthYear-startYr)-1)+35-1) %60;
		/* 
		 * the minus 2 is there for 2 reasons
		 * 1. One -1, to account for Java numbering where counting starts at 0
		 * 2. to account for general subtraction where the starting number is skipped 
		 *    and goes to the number right below it, therefore making the answer only
		 *     |n-1| away from the minuend.
		 *     The -1 will make sure in absolute value term that minuend is |n-1|+|-1|=n away from the subtrahend.
		 */
		
		for(int i=0; i<allTimeRecord.length;i++) {
			temp++;
			if(temp==diff) {

				namesFromYear=arrOYr[temp]; 

			}
	
		}
		return namesFromYear;
	
		
	}
	
	public static int convertToInt(String input) {
		int i= Integer.parseInt(input);
		return i;
	}
	
	public static boolean isString(String input) {
		boolean ans=false;
		
		
		 if (Character.isDigit(input.charAt(0))) {
			ans=false;
		
		}
		else {
			ans=true;
			
		}
		return ans;
		
		
	}
	public static boolean isStringValid(String input) {
		boolean ans=false;
		String[] arr= createArrayOfYears();
		for(int i=0; i<arr.length;i++) {
			if(arr[i].equals(input)) {
				ans=true;
			}
	
		}
		return ans;
	}
	
	public static boolean isInputValid(String input) {
		boolean b=false;
		if(input.isBlank()) {
			b=false;
		}
		else {
			b=true;
		}
		return b;
	}
	
	public static String[] createArrayOfYears() {
String names[]= {"Prabhava"
		,"Vibhava"
		,"Shukla"
		,"Pramodyutha"
		,"Prajothpathhi"
		,"Angeerasa"
		,"Shreemukha"
		,"Bhaava"
		,"Yuva"
		,"Dhatha"
		,"Eashwara"
		,"Bhahudhanya"
		,"Pramadi"
		,"Vikrama"
		,"Vrusha"
		,"Chitrabhanu"
		,"Swabhanu"
		,"Thaarana"
		,"Paarthiva"
		,"Vyaya"
		,"SarvaJithhu"
		,"Sarvadhaari"
		,"Virodhi"
		,"Vikruthi"
		,"Khara"
		,"Nandana"
		,"Vijaya"
		,"Yaja"
		,"Manmadha"
		,"Durmukhi"
		,"Hevalambhi"
		,"Vilambhi"
		,"Vikari"
		,"Sharvari"
		,"Plava"
		,"Shubhakruthu"
		,"Shobhakruthu"
		,"Krodhi"
		,"Vishvavasu"
		,"Parabhava"
		,"Plavanga"
		,"Keelaka"
		,"Sowmya"
		,"Sadharana"
		,"Virodhikruthu"
		,"Pareedhavi"
		,"Pramadeecha"
		,"Aananda"
		,"Rakshasa"
		,"Nala"
		,"Pingala"
		,"Kalayukthi"
		,"Sidhharthi"
		,"Roudri"
		,"Durmathi"
		,"Dundubhi"
		,"Rudhirodhari"
		,"Rakthakshi"
		,"Krodhana",
		"Akshaya"};

		return names;
		

	}
	

	
	
}
