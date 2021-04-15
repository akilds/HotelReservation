public class HotelReservationSystem {

	public String hotelName;
	public int rateForRegularCustomer;

	public HotelReservationSystem(String hotelName,int rateForRegularCustomer)
	{
		this.hotelName = hotelName;
		this.rateForRegularCustomer = rateForRegularCustomer;
	}

	public void show()
	{
		System.out.println("Hotel Name : " + this.hotelName);
		System.out.println("Rate for Regular Customer : " + this.rateForRegularCustomer);
	}
}
