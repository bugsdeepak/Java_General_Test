package ioExamples;
import java.io.*;

public class FileReplace {

	public FileReplace() {
		
	}

	private static void doSimpleFileListing(String dirName) {
		System.out.println();
		// System.out.println("Simple file listing...");
		//System.out.println("----------------------");
		File dir = new File(dirName);
		String children[] = dir.list();
		printFiles(children, dirName);
	}

	private static void doFileFilterListing(String dirName, String ff) {
		// System.out.println("Filter file listing...");
		//System.out.println("----------------------");
		final String fileFilter = ff;
		File dir = new File(dirName);
		FilenameFilter filter = null;
		if (fileFilter != null)
			filter = new FilenameFilter() {

				public boolean accept(File dir, String name) {
					return name.startsWith(fileFilter);
				}

				{
					//fileFilter = s;
					//super();
				}
			};
		String children[] = dir.list(filter);
		printFiles(children, dirName);
	}

	private static void doFileFilterDirectoryListing(String dirName) {
		//System.out.println("Filter Directory listing...");
		//System.out.println("---------------------------");
		File dir = new File(dirName);
		File files[] = (new File(dirName)).listFiles();
		FileFilter dirFilter = new FileFilter() {

			public boolean accept(File dir) {
				return dir.isDirectory();
			}

		};
		files = dir.listFiles(dirFilter);
		for (int i = 0; i < files.length; i++)
			System.out.println((new StringBuilder("[Directory]         : "))
					.append(files[i]).toString());

		System.out.println();
	}

	private static void printFiles(String children[], String dirName) {
		String copyrightLine = "----------------------------------------------------------------\n"
				+ " "
				+ " "
				+ "----------------------------------------------------------------\n";


		if (children == null) {
			System.out.println((new StringBuilder("Error with ")).append(
					dirName).toString());
			System.out
					.println("Either directory does not exist or is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				File newFile = new File((new StringBuilder(String
						.valueOf(dirName))).append(File.separatorChar).append(
						filename).toString());
				String line = "";
				String oldtext = "";
				try {
					int lines = 0;
					if (newFile.isDirectory()) {

						System.out.println((new StringBuilder("[Directory]         : ")).append(newFile.getAbsoluteFile()).toString());
						dirCount++;
						doSimpleFileListing(newFile.getAbsolutePath());
					} else {
						
					if (newFile.getName().endsWith(".java")) {
							fileCount++;
							
						} else if (newFile.getName().endsWith(".xml")) {
						} else if (newFile.getName().endsWith(".properties")) {
							BufferedReader reader = new BufferedReader(new FileReader(newFile));
							while ((line = reader.readLine()) != null) {
								lines++;
								oldtext = (new StringBuilder(String.valueOf(oldtext))).append(line).append("\r\n").toString();
							}
							reader.close();
							StringBuffer sb = new StringBuffer(copyrightLine);
							 sb.append(oldtext);
							 FileWriter writer = new FileWriter(newFile.getAbsoluteFile());
							 writer.write(sb.toString());
							 writer.close();
							
							 
							 System.out.print((new StringBuilder("[properties File]: ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							propertyCount++;
							totalpropertyCount+=lines;
						} else if (newFile.getName().endsWith("package.html")) {
							//System.out.print((new StringBuilder("[package.html File]: ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							//pkgCount++;
							//totalpkgCount+=lines;
						} else if (newFile.getName().endsWith("README")) {
							//System.out.print((new StringBuilder("[README File]       : ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							//readCount++;
							//totalreadCount+=lines;
						} else if (newFile.getName().endsWith("dtd")) {
							//System.out.print((new StringBuilder("[dtd File]         : ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							//dtdCount++;
							//totaldtdCount+=lines;
						} else if (newFile.getName().endsWith("bat")) {
							//System.out.print((new StringBuilder("[batch File]         : ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							//dtdCount++;
							//totaldtdCount+=lines;
						}else{
							System.out.print((new StringBuilder("[NON Java File]        : ")).append(newFile.getAbsoluteFile()).toString()+ ":	[Lines]	: "+ lines+ ":	[SIZE] :"+ (Math.ceil(newFile.length() / 1024.0))+ "KB");
							//nonJavaCount++;
							//totalnonJavaCount+=lines;

						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println();
			}

		}
		System.out.println();
	}

	public static void main(String args[]) {
		doSimpleFileListing("provide the name of directrty");
		int totalFile = fileCount + nonJavaCount + xmlCount + propertyCount
				+ pkgCount + readCount + dtdCount;
		int totaltotalFile = totalfileCount + totalnonJavaCount + totalxmlCount
				+ totalpropertyCount + totalpkgCount + totalreadCount
				+ totaldtdCount;

		System.out.println((new StringBuilder("Java Line Count: ")).append(totalfileCount).toString());
		//System.out.println((new StringBuilder("xml Line count  : ")).append(totalxmlCount).toString());
		//System.out.println((new StringBuilder("propertyLine Count : ")).append(totalpropertyCount).toString());
		//System.out.println((new StringBuilder("pkg.html	Line  : ")).append(totalpkgCount).toString());
		//System.out.println((new StringBuilder("read Line Count	  : ")).append(totalreadCount).toString());
		//System.out.println((new StringBuilder("dtd Line Count 	  : ")).append(totaldtdCount).toString());
		//System.out.println((new StringBuilder("NonJava Line Files  : ")).append(totalnonJavaCount).toString());
		//System.out.println((new StringBuilder("\nTotal Lines : ")).append(totaltotalFile).toString());
	}

	private static int fileCount = 0;

	private static int dirCount = 0;

	private static int nonJavaCount = 0;

	private static int xmlCount = 0;

	private static int propertyCount = 0;

	private static int pkgCount = 0;

	private static int readCount = 0;

	private static int dtdCount = 0;

	private static int totalfileCount = 0;

	private static int totaldirCount = 0;

	private static int totalnonJavaCount = 0;

	private static int totalxmlCount = 0;

	private static int totalpropertyCount = 0;

	private static int totalpkgCount = 0;

	private static int totalreadCount = 0;

	private static int totaldtdCount = 0;

}
