
public class Chromebook extends Item{
	private String os;
	private boolean isAvailable;
	
	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
		this.isAvailable = true;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}

	/**
	 * @return
	 */
	public boolean getIsAvailable() {
		// TODO Auto-generated method stub
		return isAvailable ;
	}
}


