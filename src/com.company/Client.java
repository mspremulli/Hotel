package src.com.company;

public class Client {
  private String name;
  private int partySize;
  private int currentBill;
  private int prepaid;
  private String phoneNumber;
  private int roomNumber;
  private int roomType;

  public String getName() {
    return name;
  }

  public int getRoomNumber() {
    return roomNumber;
  }


  public void makePayment(int payment){
    prepaid += payment;
  }

  public void chargeRoom(int charge){
    currentBill += charge;
  }

  public int getOutstanding(){
    return currentBill;
  }
}
