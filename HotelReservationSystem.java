package HotelReservation1;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class HotelReservationSystem {

	public String hotelName;
   int rateForRegularCustomerInWeekday;
	int rateForRegularCustomerInWeekend;
   public ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();

	public HotelReservationSystem() {}

	public HotelReservationSystem(String hotelName,int rateForRegularCustomerInWeekday, int rateForRegularCustomerInWeekend)
	{
		this.hotelName = hotelName;
		this.rateForRegularCustomerInWeekday = rateForRegularCustomerInWeekday;
		this.rateForRegularCustomerInWeekend = rateForRegularCustomerInWeekend;
	}

	public void show()
	{
		System.out.println("Hotel Name : " + this.hotelName);
		System.out.println("Rate for Regular Customer : " + this.rateForRegularCustomer);
	}

	void cheapestHotel()
	{
		ArrayList<Integer> totalRateInHotel = new ArrayList<Integer>();
		int totalRateInLakewood = 0;
		int totalRateInBridgewood = 0;
		int totalRateInRidgewood = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Checkin date : ");
		String checkInDate = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate cInDate = LocalDate.parse(checkInDate,formatter);
		System.out.println("Enter Checkout date : ");
		String checkOutDate = scanner.nextLine();
		LocalDate cOutDate = LocalDate.parse(checkOutDate,formatter);
	   long noOfDaysBetween = ChronoUnit.DAYS.between(cInDate, cOutDate);
	   System.out.println(noOfDaysBetween);
	   for(int variable=0; variable<noOfDaysBetween;variable++)
      {
       	totalRateInLakewood += 110;
	   	totalRateInBridgewood += 160;
	 		totalRateInRidgewood += 220;
	   }
	   totalRateInHotel.add(totalRateInLakewood);
	   totalRateInHotel.add(totalRateInBridgewood);
	   totalRateInHotel.add(totalRateInRidgewood);
      Optional<Integer> minTotalRate = totalRateInHotel.stream().min((i, j) -> i.compareTo(j));
	   if(minTotalRate.get() == totalRateInLakewood)
	   {
	   	System.out.println("Lakewood");
	    	System.out.println("Total Rates : $" + minTotalRate.get());
	   }
      else if(minTotalRate.get() == totalRateInBridgewood)
	   {
	    	System.out.println("Bridgewood");
	    	System.out.println("Total Rates : $" + totalRateInBridgewood);
	   }
      else
	   {
	    	System.out.println("Ridgewood");
	    	System.out.println("Total Rates : $" + totalRateInRidgewood);
	   }
	}
}

