import java.io.BufferedReader;
import java.io.FileReader;

public class CsvFileReader {
	
	public String[] read(String fileName) {
     
        
        String line = "";
        String  cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

        	String details[]=null;
            while ((line = br.readLine()) != null) {

                
                details= line.split(cvsSplitBy);
                

            }
          return details;
        } catch (Exception e) {
        	System.out.println("Exception Msg : " + e.getMessage());
        }

	return null;
	}

	public static void main(String[] args) {

		
        String csvFile = "C:/test/shahimsha.csv";
        CsvFileReader csv=new CsvFileReader();
        String details[]=csv.read(csvFile);
        for(String str:details) {
        	System.out.println(str);
        }
        
        
        

	}
}
