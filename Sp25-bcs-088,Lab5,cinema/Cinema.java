public class Cinema {
    private String name;
    Screen[] screens;

    Cinema(String name,int n){
        this.name=name;
        screens=new Screen[n];
        for(int i=0;i< screens.length;i++){
            screens[i]=new Screen("screen "+(i+1),5);
        }

    }
    int totalAvailable(){
        int total=0;
        for(int i=0;i<screens.length;i++){
            total=total+screens[i].totalAvailable();
        }
        return total;
    }
    public double totalRevenue(){
        return this.totalAvailable() * 500;


    }
    @Override
    public String toString(){
        String temp=name;
        for(int i=0;i<screens.length;i++){
            temp=temp+"\n"+ screens[i];
        }
        return temp;
    }

   
    public String Layout() {
        StringBuilder str = new StringBuilder();
        str.append(name).append("\n"); // Cinema name
        for (int i = 0; i < screens.length; i++) {
            str.append(screens[i].Layout()).append("\n");
        }
        return str.toString();
    }



}
