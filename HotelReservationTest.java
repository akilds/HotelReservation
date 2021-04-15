import org.junit.Test;
import java.util.ArrayList;

public class HotelReservationTest {

	//TEST CASE 1
	@Test
	public void addHotelCheck()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		hotel.add(new HotelReservationSystem("Lakewood",110));
		hotel.add(new HotelReservationSystem("Bridgewood",160));
		hotel.add(new HotelReservationSystem("Ridgewood",220));
		hotel.stream().forEach( entry -> {
			entry.show();
		});
	}

   //TEST CASE 2
	@Test
	public void cheapestHotelCheck()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		hotel.add(new HotelReservationSystem("Lakewood",110));
		hotel.add(new HotelReservationSystem("Bridgewood",160));
		hotel.add(new HotelReservationSystem("Ridgewood",220));	
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel1.cheapestHotel();
	}

   //TEST CASE 3
	@Test
	public void addHotelCheck2()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		hotel.add(new HotelReservationSystem("Lakewood",110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",220,150));	
		hotel.stream().forEach( entry -> {
			entry.show2();
		});
	}

   //TEST CASE 4
	@Test
	public void cheapestHotelCheck2()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",220,150));
		hotel1.cheapestHotel2();
	}

   //TEST CASE 5
	@Test
	public void addHotelCheck3()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",3,110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",4,160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",5,220,150));	
		hotel.stream().forEach( entry -> {
			entry.show3();
		});
	}

   //TEST CASE 6
	@Test
	public void cheapestHotelCheck3()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",3,110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",4,160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",5,220,150));	
		hotel1.cheapestHotel3();
	}

   //TEST CASE 7
   @Test
	public void cheapestHotelCheck4()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",3,110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",4,160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",5,220,150));	
		hotel1.cheapestHotel4();
	}

   //TEST CASE 9
	@Test
	public void addHotelCheck4()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		hotel.add(new HotelReservationSystem("Lakewood",3,110,80,90,80));
		hotel.add(new HotelReservationSystem("Bridgewood",4,160,110,50,30));
		hotel.add(new HotelReservationSystem("Ridgewood",5,220,100,150,40));	
		hotel.stream().forEach(entry -> {
			entry.show4();
		});
	}

   //TEST CASE 10
	@Test
	public void cheapestHotelCheck5() throws HotelRegistrationException
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",3,110,80,90,80));
		hotel.add(new HotelReservationSystem("Bridgewood",4,160,110,50,30));
		hotel.add(new HotelReservationSystem("Ridgewood",5,220,100,150,40));
		hotel1.cheapestHotel5();
	}
	
}
