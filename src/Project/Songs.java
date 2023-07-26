package Project;

public class Songs {
	String title;
	double duration;
	public Songs(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public Songs()
	{
		
	}
	public String getTitle()
	{
		return title;
	}
	public double getDuration()
	{
		return duration;
	}
	
	public String toString()
	{
		
		return "Songs(" + "titles="+ title +'\'' + ", duration = " + duration  + ')';
		
	}
}
