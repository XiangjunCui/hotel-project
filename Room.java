//Xiangjun Cui

package hotelproject;

public class Room implements Comparable<Room> {
    
    public int roomNo;
    public double price;
    
    public Room (int RoomNumber, double RoomPrice)
    {
        roomNo = RoomNumber;
        price = RoomPrice;
    }
    public void setPrice(double RoomPrice)
    {
            price = RoomPrice;
    }
    public String getRoomInfo()
    {
        return "";
    }
    public int compareTo(Room other)
    {
        return Double.compare(price, other.price);
    }
}
