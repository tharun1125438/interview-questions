package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctWordInFileStream {

	public static void main(String[] args) throws IOException {
		
		List<String> collect = Files.lines(Paths.get("C:\\Users\\ktharun\\eclipse-workspace\\practice\\src\\practice\\test-data.txt")).collect(Collectors.toList());
		List<String> words = new ArrayList<>();
		for (String str : collect) {
			words.addAll(Arrays.asList(str.split(" ")));
		}
		Map<String, Long> myEntrySet = words.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting()));
		System.out.println(Collections.max(myEntrySet.entrySet(), 
				Map.Entry.comparingByValue()).getKey() + myEntrySet.get(Collections.max(myEntrySet.entrySet(), 
				Map.Entry.comparingByValue()).getKey()));
		
	}

}
