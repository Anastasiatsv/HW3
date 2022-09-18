import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

    FileWriter nFile = new FileWriter("file1.txt");
    nFile.write ("cat, \ndog \nmouse, \nwolf!, \nchicken \ncar \nboy \ngirl, \nclass \nchrome \ndoor, \nhouse, \nmarket, \nmiss \nmoon \ncat \ncat \ncoffee");
    nFile.close();
    }
}

