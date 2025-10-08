public class Seat {
    private String id;
    private int price;
    private SeatType type;
    private boolean isAvailable;


    Seat(int r, int c,int price,SeatType type,boolean available){
        this.id=String.format("%d-%3d",r,c);
        setPrice(price);
        setType(type);
        setIsAvailable(available);
    }


    public String getId() {
        return id;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
    @Override
    public String toString(){
        return String.format("%s %d %s %b",id,price,type,isAvailable);
    }
    String  Layout(){
        return isAvailable ? "O": "X";

    }
}
