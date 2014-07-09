import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;


public class Test {
public static void main(String[] args) {
	  Mapper mapper = new DozerBeanMapper();
	  SourceBean obj=new SourceBean(22l, "joe", "wassup");
	  TargetBean destObject = mapper.map(obj, TargetBean.class);
	  System.out.println(destObject);
}
}
