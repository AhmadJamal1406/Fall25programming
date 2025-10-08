public class Screen {
    Seat[][] seats;
    String name;
    private final int  priceREGULAR=500;
    private final int pricePREMIUM=750;
    private final int priceVIP=1000;
    private final int priceRECLINER=1200;




    Screen(String name, int n){
        this.name=name;

        // SeatType[] types=SeatTypes.values;
        seats= new Seat[n][];
        for (int i=0;i< seats.length;i++){
//            seats[i]= new Seat[10+i];
            seats[i]=defaultRowLengths(10+i);
            for (int j=0;j<seats[i].length;j++){
                seats[i][j]= new Seat(i,j,500,SeatType.REGULAR,true);

            }

        }
    }
    //====================Booking and Cancelling=================================
    //===========================================================================
    void bookSeat(int r,int c){
        seats[r][c].setIsAvailable(false);
    }
    void bookSeat(String id){
        Seat seat= getSeat(id);
        seat.setIsAvailable(false);
    }
    void cancelSeat(int r,int c){
        seats[r][c].setIsAvailable(true);
    }
    void cancelSeat(String id){
        Seat seat = getSeat(id);
        seat.setIsAvailable(true);
    }






    //====================Seating plan=================================
    Seat getSeat(int r,int c){
    return seats[r][c];

    }
    Seat getSeat(String id){
        Seat temp=null;
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++){
                if(id.equals(seats[i][j].getId())){
                    temp=seats[i][j];
                }
            }
        }
        return temp;
    }
    String  findFirstAvailable(SeatType type){
        String str=null;
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++){
                if( type.equals(seats[i][j].getType())&&seats[i][j].getIsAvailable() ){
                     str=seats[i][j].toString();
                     break;
                }
            }
        }
        return str;
    }
    Seat[] listAvailable(SeatType type){
        int n=totalAvailable(type);
        int z=0;
        Seat[] seats= new Seat[n];
        for(int i=0;i<this.seats.length;i++){
            for(int j=0;j<this.seats[i].length;j++){
                if( type.equals(this.seats[i][j].getType())&& this.seats[i][j].getIsAvailable()  ){
                    seats[n-(n-z)]=this.seats[i][j];
                    z++;
                }
            }
        }

        return seats;
    }

   // ===============================Counting and stuff=========================================

    public int totalAvailable(){
        int total=0;
        for (int i=0;i < seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                if(seats[i][j].getIsAvailable()){
                    total++;
                }
            }
        }
        return total;
    }
    public int  totalAvailable(SeatType type){
        int total=0;
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++){
                if(type.equals(seats[i][j].getType()) && seats[i][j].getIsAvailable() ){
                    total++;

                }
            }
        }

        return total;
    }

    public int  totalBooked(SeatType type){
        int total=0;
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++){
                if(type.equals(seats[i][j].getType()) && !seats[i][j].getIsAvailable() ){
                    total++;

                }
            }
        }

        return total;
    }
 

    @Override
    public  String toString(){
        String temp= this.name;
        for(int i=0;i<seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                temp=temp +"\n"+seats[i][j];
            }
        }
        return temp;
    }
    public String Layout() {
    StringBuilder temp = new StringBuilder();
    temp.append(name).append("\n"); // Screen name
    for (int i = 0; i < seats.length; i++) {
        temp.append("row ").append(i+1).append(" ");
        for (int j = 0; j < seats[i].length; j++) {
            temp.append(" ").append(seats[i][j].Layout());
        }
        temp.append("\n");
    }
    return temp.toString();
}
    int totalSeatCount(){
        int total=0;
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j++){
                total++;
            }

        }


        return total;
    }


    //==========================MEthods===========================
    
    int getRowCount(){

        return seats.length;
    }
    int getRowLength(int row){
        return seats[row].length;
    }
    boolean checkRow(int row){
        boolean flag= true;
        if(row<0||row>=seats.length){
            System.out.println("Invalid row");
            flag=false;
        }
        else {
            System.out.println("valid");
        }
        return flag;
    }
    boolean checkBounds(int row,int col){
        boolean flag=true;
        if(checkRow(row)){
            if(col<0||col>=seats[row].length){
               flag=false;
            }
            else
                flag=true;
        }
        else {
            flag = false;
        }
    return flag;
    }

    void setRowType(int row ,SeatType type,int price){
        for (int i=0;i<seats[row].length;i++){
            seats[row][i].setType(type);
            seats[row][i].setPrice(price);
        }
    }
    void setTypeFor(int row,int col){
        if(row<2){
            seats[row][col].setType(SeatType.VIP);
        }
        else if(row<4){
            seats[row][col].setType(SeatType.PREMIUM);
        }
        else if(row<6){
            seats[row][col].setType(SeatType.REGULAR);
        }
        else{ 
            seats[row][col].setType(SeatType.RECLINER);
        }

    }
    int priceFor(SeatType type){
        int price=0;
        if(type==SeatType.PREMIUM){
            price=pricePREMIUM;
        }
        else if(type==SeatType.VIP){
            price=priceVIP;
        }
        else if(type==SeatType.RECLINER){
            price=priceRECLINER;
        }
        else{
            price=priceREGULAR;
        }
        
        return price;
    }
    Seat[] defaultRowLengths(int num){
        Seat[] seats= new Seat[num];

        return seats;
    }}








