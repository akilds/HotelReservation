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
			entry.show();
		});
	}

   //TEST CASE 4
	@Test
	public void addHotelCheck()
	{
		ArrayList<HotelReservationSystem> hotel = new ArrayList<HotelReservationSystem>();
		HotelReservationSystem hotel1 = new HotelReservationSystem();
		hotel.add(new HotelReservationSystem("Lakewood",110,90));
		hotel.add(new HotelReservationSystem("Bridgewood",160,50));
		hotel.add(new HotelReservationSystem("Ridgewood",220,150));	
		hotel.stream().forEach( entry -> {
			entry.show();
		});
		hotel1.cheapestHotel();
	}
}
