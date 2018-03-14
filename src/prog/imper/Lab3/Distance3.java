package prog.imper.Lab3;

import java.util.List;
public interface Distance3 <T extends Number>{
	double distance(List<T> vectorA, List<T> vectorB) throws NotmatchingDimensionsException;

}
