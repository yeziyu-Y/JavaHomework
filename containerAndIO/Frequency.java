package containerAndIO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Frequency {
	public abstract String read(String inputFile) throws Exception;
	public abstract void resultout(String outputFile,byte[] dataout) throws Exception;
	public byte[] count(String str) {
		str.toLowerCase();
		String []words = str.split("\\s+"); 
		HashMap <String,Integer>map = new HashMap<String,Integer>();
		for (int i = 0;i < words.length;i++) {
			if (map.get(words[i]) == null) {
				map.put(words[i], 1);
			}
			else {
				map.put(words[i], map.get(words[i])+1);
			}
		}
		Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		String out = "";
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) { 
			  out += entry.getKey() + " " + entry.getValue() + "\n"; 
			}
		byte []dataout = out.getBytes();
		return dataout;
	}
}
