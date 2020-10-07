package src.com.company;

public class HotelRoom {
  private int roomNumber;
  private String roomType;
  private int floorNumber;
  private boolean isOccupied;
  private boolean needsCleaning;
  private Client client;
  private int averagePrice;

  /**
   * Default Constructor
   */
  public HotelRoom() {
    roomNumber = 1;
    roomType = "single";
    floorNumber = 1;
    isOccupied = false;
    needsCleaning = false;
    client = null;
    averagePrice = 1000;
  }

  public HotelRoom(int roomNumber,
                   String roomType,
                   int floorNumber,
                   boolean isOccupied,
                   boolean needsCleaning,
                   Client client,
                   int averagePrice) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.floorNumber = floorNumber;
    this.isOccupied = isOccupied;
    this.needsCleaning = needsCleaning;
    this.client = client;
    this.averagePrice = averagePrice;
  }

  public void reserve(){ isOccupied = true; }

  public void checkout(){
    client = null;
    isOccupied = false;
    needsCleaning = true;
    System.out.println(averagePrice);
  }

  public void clean(){ needsCleaning = false; }


}

