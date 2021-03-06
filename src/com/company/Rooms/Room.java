package src.com.company.Rooms;


public abstract class Room {


  private final int roomNumber;
  private final String roomType;
  private final int floorNumber;
  private boolean isOccupied;
  private boolean needsCleaning;
  private src.com.company.Client client;
  private int averagePrice;

  /**
   * Default Constructor
   */
  public Room() {
    roomNumber = 1;
    roomType = "single";
    floorNumber = 1;
    isOccupied = false;
    needsCleaning = false;
    client = null;
    averagePrice = 1000;
  }

  public Room(int roomNumber,
              String roomType,
              int floorNumber,
              boolean isOccupied,
              boolean needsCleaning,
              src.com.company.Client client,
              int averagePrice) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.floorNumber = floorNumber;
    this.isOccupied = isOccupied;
    this.needsCleaning = needsCleaning;
    this.client = client;
    this.averagePrice = averagePrice;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void reserve(){ isOccupied = true; }

  public int checkout(){
    client = null;
    isOccupied = false;
    needsCleaning = true;
    System.out.println(averagePrice);
    return averagePrice;
  }

  public void clean(){ needsCleaning = false; }

}

