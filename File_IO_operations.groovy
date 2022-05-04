import groovy.io.FileType

class File_IO_operations {
    static void main(String[] args){

        // Open a file, read each line and output them
        println("Open a file, read each line and output them\nReading file test.txt")
        println('''new File("test.txt").eachLine {
                    line -> println "$line";}''')
        new File("test.txt").eachLine {
            line -> println "$line";
        }

        // Overwrite the file
        println("\nOverwrite the file");
        println('''new File("test.txt").withWriter('utf-8') {
            writer -> writer.writeLine("Line 4");
            }''')
        new File("test.txt").withWriter('utf-8') {
            writer -> writer.writeLine("Line 4");
        }

        // Append the file
        println("\nAppend the file");
        println('''File file = new File("test.txt")
                    file.append('Line 5')''')

        File file = new File("test.txt");
        file.append('Line 5');
        //muestralo
        new File("test.txt").eachLine {
            line -> println "$line";
        }

        // Get the file as a string
        println("\nGet the file as a string")
        println("println(file.text)")
        println(file.text);

        // Get the file size
        println("\nFile Size : \${file.length()} bytes");
        println("File Size : ${file.length()} bytes");

        // Check if a file or directory
        println("\nCheck if a file or a directory");
        println('''File : ${file.isFile()}
                Dir : ${file.isDirectory()}''')
        println("File : ${file.isFile()}");
        println("Dir : ${file.isDirectory()}");

        // Copy file to another file
        println("\nCopy file to another file")
        println('''def newFile = new File("test2.txt");
                   newFile << file.text;''')
        def newFile = new File("test2.txt");
        newFile << file.text;

        println("\nmostremos el contenido del nuevo fichero test2.txt");

        new File("test2.txt").eachLine {
            line -> println "$line";
        }

        // Delete a file
        println("\nDelete a file");
        println("borrando newFile que es = test2.txt");
        newFile.delete();

        // Get directory files
        println("\nGet directory files");
        println('''def dirFiles = new File("").listRoots();
                   dirFiles.each {
                   item -> println file.absolutePath;
        }''');
        def dirFiles = new File("").listRoots();

        dirFiles.each {
            item -> println file.absolutePath;
        }

        // Get directory files recursively
        println("\nGet directory files recursively");
        println('''File folder = new File(".");
        folder.eachFileRecurse FileType.FILES,  { file2 ->
            // show files end with a .txt or .groovy extension
            if (file2.name.endsWith(".txt") || file2.name.endsWith(".groovy")) {
                println ("Processing file ${file2.absolutePath}");
            }
        }''');
        File folder = new File(".");
        folder.eachFileRecurse FileType.FILES,  { file2 ->
            // show files end with a .txt or .groovy extension
            if (file2.name.endsWith(".txt") || file2.name.endsWith(".groovy")) {
                println ("Processing file ${file2.absolutePath}");
            }
        }


    }
}
