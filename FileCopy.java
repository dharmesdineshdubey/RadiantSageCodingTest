import java.io.*;
import java.nio.file.Files;

public class Main {
	
	public static void main(String[] args)throws IOException {
	

		
		        
		        FileInputStream fis = null;
		        FileOutputStream fos = null;
		 
		        try {
		 
		          
		            fis = new FileInputStream("C:\\Users\\Dipak\\Desktop\\input.txt");
		            if (fis.exists()) {
		                String fileType = "Undetermined";
		                String fileName = fis.getName();
		                String extension = "";
		                int i = fileName.lastIndexOf('.');
		      
		                if (i > 0) {
		                    extension = fileName.substring(i + 1);
		                }
		                try {
		                    fileType
		                        = Files.probeContentType(fis.toPath());
		                }
		                catch (IOException ioException) {
		                    System.out.println(
		                        "Cannot determine file type of "
		                        + fis.getName()
		                        + " due to following exception: "
		                        + ioException);
		                }
		      
		                
		                System.out.println(
		                    "Extension used for file is -> " + extension);
		            }
		            
		            else {
		                System.out.println("Enter file of extension .txt");
		            }
		    		
		 
		            
		            fos = new FileOutputStream(
		                "C:\\Users\\Dipak\\Desktop\\output.txt");
		 
		            int c;
		 
		            
		            while ((c = fis.read()) != -1) {
		 
		               
		                fos.write(c);
		            }
		 
		            
		            System.out.println(
		                "copied the file successfully");
		        }
		 
		       
		        finally {
		 
		           
		 
		            if (fis != null) {
		 
		               
		                fis.close();
		            }
		            if (fos != null) {
		 
		                
		                fos.close();
		            }
		        }
		    }
		
	}