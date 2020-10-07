package src.com.company.Rooms;

import src.com.company.Client;

  public class StandardRoom extends Room {


    public StandardRoom() {
      super();

    }

    public StandardRoom(int roomNumber,
                        int floorNumber,
                        boolean isOccupied,
                        boolean needsCleaning,
                        Client client,
                        int averagePrice) {
      super(roomNumber, "single", floorNumber, isOccupied, needsCleaning, client, averagePrice);
    }
  }


