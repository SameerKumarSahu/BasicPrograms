package Day3;

public class DayofWeek {

	public static void main(String[] args) {
		int y = Integer.parseInt(args[0]);
		int m  = Integer.parseInt(args[1]);
		int d  = Integer.parseInt(args[2]);
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        if(d0==0)
            System.out.println("The day is: SUNDAY");
        else if(d0==1)
            System.out.println("The day is: MONDAY");
        else if(d0==2)
            System.out.println("The day is: TUESDAY");
        else if(d0==3)
            System.out.println("The day is: WEDNESDAY");
        else if(d0==4)
            System.out.println("The day is: THURSDAY");
        else if(d0==5)
            System.out.println("The day is: FRIDAY");
        else if(d0==6)
            System.out.println("The day is: SATURDAY");
    

	}

}
