import org.dozer.Mapping;

public class SourceBean {

    private Long id;

    private String name;

    @Mapping("binaryData")
    private String data;

    @Mapping("pk")
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

	public SourceBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SourceBean(Long id, String name, String data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}
    
    
} 