package dto;

public class ADFoodDTO {

	private String ad_Writer;	
	private String ad_Title;
	private String ad_Info;
	private String ad_IAddress;
	private String ad_ITime;
	public String getAd_Writer() {
		return ad_Writer;
	}
	public void setAd_Writer(String ad_Writer) {
		this.ad_Writer = ad_Writer;
	}
	public String getAd_Title() {
		return ad_Title;
	}
	public void setAd_Title(String ad_Title) {
		this.ad_Title = ad_Title;
	}
	public String getAd_Info() {
		return ad_Info;
	}
	public void setAd_Info(String ad_Info) {
		this.ad_Info = ad_Info;
	}
	public String getAd_IAddress() {
		return ad_IAddress;
	}
	public void setAd_IAddress(String ad_IAddress) {
		this.ad_IAddress = ad_IAddress;
	}
	public String getAd_ITime() {
		return ad_ITime;
	}
	public void setAd_ITime(String ad_ITime) {
		this.ad_ITime = ad_ITime;
	}
	@Override
	public String toString() {
		return "ADFoodDTO [ad_Writer=" + ad_Writer + ", ad_Title=" + ad_Title + ", ad_Info=" + ad_Info
				+ ", ad_IAddress=" + ad_IAddress + ", ad_ITime=" + ad_ITime + "]";
	}
	
	
	// 매개변수 받는 생성자. 
//	public ADFoodDTO(String ad_Writer, String ad_Title, String ad_Info, String ad_ITime) {
//		super();
//		this.ad_Writer = ad_Writer;
//		this.ad_Title = ad_Title;
//		this.ad_Info = ad_Info;
//		this.ad_ITime = ad_ITime;
//	}

	
	
	
	
	
	
	
	
}
