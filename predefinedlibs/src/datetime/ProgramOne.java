package datetime;
/*to Represent Zone:
		 ZoneId object can be used to represent Zone.*/

import java.time.*;

class ProgramOne {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		/*We can create ZoneId for a particular zone as follows*/
		
		 ZoneId la = ZoneId.of("America/Los_Angeles");
		 ZonedDateTime zt = ZonedDateTime.now(la);
		 System.out.println(zt);
		
		
		
	}
}