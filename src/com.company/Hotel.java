package src.com.company;

import src.com.company.Rooms.Room;
import src.com.company.Rooms.StandardRoom;
import src.com.company.Rooms.SuiteRoom;

import java.util.ArrayList;

public class Hotel {
  private String hotelName;
  private int numberOfRooms;
  ArrayList<StandardRoom> availableStandards;
  ArrayList<StandardRoom> reservedStandards;
  ArrayList<SuiteRoom> availableSuites;
  ArrayList<SuiteRoom> reservedSuites;
  ArrayList<Client> clients;

  public void addRoom(StandardRoom room){
    availableStandards.add(room);
  }

  public void addRoom(SuiteRoom room){
    availableSuites.add(room);
  }

  public void reserveRoom(StandardRoom room){
    reservedStandards.add(room);
  }

  public void reserveRoom(SuiteRoom room){
    reservedSuites.add(room);
  }

  public  void checkoutRoom(StandardRoom room){
    room.checkout();
    addRoom(room);
  }

  public  void checkoutRoom(SuiteRoom room){
    room.checkout();
    room.clean();
    addRoom(room);
  }

  public int getClientBalance(String name){
    for (var client:clients) {
      if(client.getName().equals(name)){
        return client.getOutstanding();
      }
    }
    return 0;
  }

  public int getClientBalance(int roomNumber){
    for (var client : clients) {
      if(client.getRoomNumber() == roomNumber){
        return client.getOutstanding();
      }
    }
    return 0;
  }

}
