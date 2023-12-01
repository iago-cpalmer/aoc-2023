package io.github.iagocpalmer.d1c1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayOne {

	public static void main(String[] args) throws IOException {
		File file = new File("res/input_1_1.txt");

		int result = 0;
		BufferedReader br = new BufferedReader(new FileReader(file));
		Pattern p = Pattern.compile("(([0-9])\\w*([0-9]))|[0-9]");
		String inputLine;
		while ((inputLine = br.readLine()) != null) {
			Matcher matcher = p.matcher(inputLine);
			matcher.find();
			char first = inputLine.charAt(matcher.start());
			char last = inputLine.charAt(matcher.end() - 1);
			result += (((int) first-48) * 10) + ((int) last-48);
		}

		System.out.println("Result: " + result);

	}
}