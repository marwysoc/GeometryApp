package pl.yameo.internship.assignment;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeometryApp app = new GeometryApp(scanner);
		app.start();
		scanner.close();
	}
}
