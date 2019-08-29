package tws.entity;

public class ParkingLot {
    private String parkingLotID;
    private int capacity;
    private int employeeId;

    public ParkingLot() {
    }

    public String getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(String parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}