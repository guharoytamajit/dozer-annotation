public class TargetBean {

    private String pk;

    private String name;

    private String binaryData;

    public void setPk(String pk) {
        this.pk = pk;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "TargetBean [pk=" + pk + ", name=" + name + ", binaryData="
				+ binaryData + "]";
	}
    
}  