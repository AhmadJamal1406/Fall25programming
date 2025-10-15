public class Plot{
	===================================================
	My Laptop crashed in the class and it took around 10 minutes to restart due to some issue so it took very long
		
	private PlotType type;
	private String Id;
	private double Price;
	private boolean isAvailable;

	Plot(String Id, double Price, PlotType type, boolean isAvailable ){
		this.Id=Id;
		this.Price=Price;
		this.type=type;
		this.isAvailable=isAvailable;	
	}
	
	Plot(String Id){
		this.Id=Id;
		
	}
	Plot (){}  
	
	public void setId(String Id){
		this.Id=Id;}
	public String getId(){
		return Id;}
		
	public void setType(PlotType type)
	{ this.type=type;}
		
	public PlotType getType (){
		return type;}

	public double getPrice()
	{ switch(type)
		{ case Marla5:
			this.Price=4000000;
		  case Marla10:
			this.Price=7500000;
		  case Kanal1:
			this.Price=14000000;	
		 case CommercialOffice:
			this.Price=50000000;
		case Parking:
			this.Price=200000;
			}

		return Price;
	
}
	 	
	
	
	









}