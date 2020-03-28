package runtime;

public class RuntimeDemo1 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing Notepad.");
		}
		System.out.println("Notepad returned: " + p.exitValue());
	}

}
