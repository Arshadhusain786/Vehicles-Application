public class boat implements waterVehicles{
 private  String name;
 private  int capacity;

 public boat(String name,int capacity)
 {
     this.name=name;
     this.capacity=capacity;
 }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
