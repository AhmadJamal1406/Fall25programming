

public class CityCinema {
    private String name;
    Cinema[] cinemas;

    CityCinema(String cinema,int n){
    this.name = cinema; 
    cinemas = new Cinema[n];
    for(int i=0;i<cinemas.length;i++){
        cinemas[i] = new Cinema("Cinema " + (i+1), 2);
    }



    }
    int totalAvailable(){
        int total=0;
        for (int i=0;i< cinemas.length;i++){
            total=total+cinemas[i].totalAvailable();
        }

        return total;
    }
  
    

    @Override
public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(name);
    for (int i = 0; i < cinemas.length; i++) {
        str.append("\n").append(cinemas[i].toString());
    }
    return str.toString();
}



 public String Layout() {
        StringBuilder str = new StringBuilder();
        str.append(name).append("\n"); 
        for (int i = 0; i < cinemas.length; i++) {
            str.append(cinemas[i].Layout()).append("\n"); 
        }
        return str.toString();
    }





}
