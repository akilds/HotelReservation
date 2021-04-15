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
}
