package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> resultMap = new HashMap<>();

		for (Student student : students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			resultMap.put(key, student);
		}

		return resultMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double sumGPA = 0.0;
		for (Student student : maps.values()) {
			sumGPA += student.getGpa();
		}

		int totalStudents = maps.size();
		return (totalStudents > 0) ? (sumGPA / totalStudents) : 0.0;
	}
}

