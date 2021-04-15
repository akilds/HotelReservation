package HotelReservation1;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.time.DayOfWeek;

public class HotelReservationSystem {

	public String hotelName;
   public int rateForRegularCustomerInWeekday;
   public int rateForRegularCustomerInWeekday;
	public int rateForRegularCustomerInWeekend;
   public ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();

	public HotelReservationSystem() {}

   //USE CASE 1
   public HotelReservationSystem(String hotelName, int rateForRegularCustomer)
   {
      this.hotelName = hotelName;
      this.rateForRegularCustomer = rateForRegularCustomer;
   }

   //USE CASE 3
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

   public void show2()
   {
      System.out.println("Hotel Name : " + this.hotelName);
      System.out.println("Rate for Regular Customer in Weekdays : " + this.rateForRegularCustomerInWeekday);
      System.out.println("Rate for Regular Customer in weekends : " + this.rateForRegularCustomerInWeekend);
   }

   public void show3()
   {
      System.out.println("Hotel Name : " + this.hotelName);
      System.out.println("Hotel Ratings : " + this.hotelRatings);
      System.out.println("Rate for Regular Customer in Weekdays : " + this.rateForRegularCustomerInWeekday);
      System.out.println("Rate for Regular Customer in weekends : " + this.rateForRegularCustomerInWeekend);
   }


   //USE CASE 2
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

   //USE CASE 4
   void cheapestHotel2()
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
	   LocalDate date = cInDate;
	   int addedDays = 0;
	   while(addedDays<noOfDaysBetween+1)
	   {
	    	if(date.getDayOfWeek()==DayOfWeek.SATURDAY || date.getDayOfWeek()==DayOfWeek.SUNDAY)
	    	{
	    		totalRateInLakewood += 90;
	    		totalRateInBridgewood += 50;
	    		totalRateInRidgewood += 150;
	    	}
	    	else
	    	{
	    		totalRateInLakewood += 110;
	    		totalRateInBridgewood += 150;
	    		totalRateInRidgewood += 220;
	    	}
	    	date = date.plusDays(1);
	    	++addedDays;
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
	   if(minTotalRate.get() == totalRateInBridgewood)
	   {
	    	System.out.println("Bridgewood");
      	System.out.println("Total Rates : $" + totalRateInBridgewood);
	   }
	   if(minTotalRate.get() == totalRateInRidgewood)
	   {
	    	System.out.println("Ridgewood");
	    	System.out.println("Total Rates : $" + totalRateInRidgewood);
	   }
	}

   //USE CASE 6
   void cheapestHotel3()
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
		DayOfWeek cInDayOfWeek = cInDate.getDayOfWeek();
		System.out.println("Enter Checkout date : ");
		String checkOutDate = scanner.nextLine();
		LocalDate cOutDate = LocalDate.parse(checkOutDate,formatter);
		DayOfWeek cOutDayOfWeek = cOutDate.getDayOfWeek();
	   long noOfDaysBetween = ChronoUnit.DAYS.between(cInDate, cOutDate);
	   System.out.println(noOfDaysBetween);
	   LocalDate date = cInDate;
	   int addedDays = 0;
	   while(addedDays<noOfDaysBetween+1)
	   {
	    	if(date.getDayOfWeek()==DayOfWeek.SATURDAY || date.getDayOfWeek()==DayOfWeek.SUNDAY)
	    	{
	    		totalRateInLakewood += 90;
	    		totalRateInBridgewood += 50;
	    		totalRateInRidgewood += 150;
	    	}
	    	else
	    	{
	    		totalRateInLakewood += 110;
	    		totalRateInBridgewood += 150;
	    		totalRateInRidgewood += 220;
	    	}
	    	date = date.plusDays(1);
	    	++addedDays;
	   }
	   totalRateInHotel.add(totalRateInLakewood);
	   totalRateInHotel.add(totalRateInBridgewood);
	   totalRateInHotel.add(totalRateInRidgewood);
	   Optional<Integer> minTotalRate = totalRateInHotel.stream().min((i, j) -> i.compareTo(j));
	   if(minTotalRate.get() == totalRateInLakewood && minTotalRate.get() == totalRateInBridgewood)
	   {
	    	System.out.println("Bridgewood");
	    	System.out.println("Rating : 4");
	    	System.out.println("Total Rates : $" + minTotalRate.get());
	   }
	   else if(minTotalRate.get() == totalRateInLakewood && minTotalRate.get() == totalRateInRidgewood)
	   {
	    	System.out.println("Ridgewood");
	    	System.out.println("Rating : 5");
	    	System.out.println("Total Rates : $" + minTotalRate.get());
	   }
	   else if(minTotalRate.get() == totalRateInBridgewood && minTotalRate.get() == totalRateInRidgewood)
	   {
	    	System.out.println("Ridgewood");
	    	System.out.println("Rating : 5");
	    	System.out.println("Total Rates : $" + minTotalRate.get());
	   }
	   else if(minTotalRate.get() == totalRateInLakewood && minTotalRate.get() == totalRateInBridgewood && minTotalRate.get() == totalRateInRidgewood)
	   {
	    	System.out.println("Ridgewood");
	    	System.out.println("Rating : 5");
	    	System.out.println("Total Rates : $" + minTotalRate.get());
	   }
	   else
	   {
	    	if(minTotalRate.get() == totalRateInLakewood)
	    	{
	    		System.out.println("Lakewood");
	    		System.out.println("Rating : 3");
	    		System.out.println("Total Rates : $" + totalRateInLakewood);
	    	}
	    	if(minTotalRate.get() == totalRateInBridgewood)
	    	{
	    		System.out.println("Bridgewood");
	    		System.out.println("Rating : 4");
	    		System.out.println("Total Rates : $" + totalRateInBridgewood);
	    	}
	    	if(minTotalRate.get() == totalRateInRidgewood)
	    	{
	    		System.out.println("Ridgewood");
	    		System.out.println("Rating : 5");
	    		System.out.println("Total Rates : $" + totalRateInRidgewood);
	    	}
	   }
	}
}

