
package prog.imper.Lab5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import prog.imper.Lab4.Pair1;
import prog.imper.Lab4.Pair2;

public class BoundedTypesWildcards {

	public static double avgA(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum / list.size();
	}

	public static <T extends Number> double avgB(List<T> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum / list.size();
	}

	public static <K extends Serializable> Map<K, Integer> histogramA(List<K> list) {
		Map<K, Integer> map = new HashMap<>();
		for (K k : list) {
			if (map.containsKey(k)) {
				map.put(k, map.get(k) + 1);
			} else {
				map.put(k, 1);
			}

		}
		return map;

	}

	public static Map<Serializable, Integer> histogramB(List<? extends Serializable> list) {
		Map<Serializable, Integer> map = new HashMap<>();
		for (Serializable key : list) {
			if (map.containsKey(key)) {
				map.put(key, new Integer(map.get(key) + 1));
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}

	public static <T extends Comparable<T>> int counterGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray) {
			if (e.compareTo(elem) > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		List<String> listA = Arrays.asList("Ola", "Ala", "Ola", "Anna");
		Map<String, Integer> mapA = BoundedTypesWildcards.histogramA(listA);
		for (Map.Entry<String, Integer> entry : mapA.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());
		Map<Serializable, Integer> mapA2 = BoundedTypesWildcards.histogramB(listA);
		for (Map.Entry<Serializable, Integer> entryB : mapA2.entrySet())
			System.out.println(entryB.getKey() + " : " + entryB.getValue());
		List<Integer> listB = Arrays.asList(1, 1, 2, 3, 4, 1, 2, 3);
		Map<Integer, Integer> mapB = BoundedTypesWildcards.histogramA(listB);
		for (Map.Entry<Integer, Integer> entry : mapB.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());
		List<Person1> listC = Arrays.asList(new Person1("John", "Smith", "123"), new Person1("John", "Smith", "124"),
				new Person1("John", "Smith", "123"));
		Map<Person1, Integer> mapC = BoundedTypesWildcards.histogramA(listC);
		for (Map.Entry<Person1, Integer> entry : mapC.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());
		List<Pair1<String, Integer>> plist=Arrays.asList(new Pair1<String,Integer>("jan",344), new Pair1<String,Integer>("janert",344),new Pair1<String,Integer>("jan",344));
		Map<Pair1<String,Integer>,Integer> mapD=BoundedTypesWildcards.histogramA(plist);
		for(Entry<Pair1<String, Integer>, Integer> entry: mapD.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
}
}
