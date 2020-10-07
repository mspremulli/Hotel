package src.com.company.Rooms;

import src.com.company.Client;

public class SuiteRoom extends Room {
  private boolean needsRestock;

  public SuiteRoom() {
    super();
    needsRestock = false;
  }

  public SuiteRoom(int roomNumber,
                   int floorNumber,
                   boolean isOccupied,
                   boolean needsCleaning,
                   Client client,
                   int averagePrice,
                   boolean needsRestock) {
    super(roomNumber, "suite", floorNumber, isOccupied, needsCleaning, client, averagePrice);
    this.needsRestock = needsRestock;
  }
}
