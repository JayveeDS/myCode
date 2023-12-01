package HandsOn;

public class Faculty extends Employee {
	private String status;
	
	public boolean isRegular() {
		if (status.equals("y")) {
			return true;
		} else if(status.equals("n")) {
			return false;
		}
		return false;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
}