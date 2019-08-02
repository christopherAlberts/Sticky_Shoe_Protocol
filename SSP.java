// Sticky Shoe Protocol  

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SSP {

 public static void main(String[] args) throws IOException {

  //String command = "powershell.exe  your command";
  //Getting the version
	 
  String User = null;
  String UserName = "powershell.exe $env:UserName";
  String UserDomainName = "powershell.exe [System.Security.Principal.WindowsIdentity]::GetCurrent().Name";
  String SystemsInfo = "powershell.exe  Get-CimInstance Win32_OperatingSystem | FL * ";
  String ipconfigAll = "powershell.exe  ipconfig /allcompartments /all";
  String CPUinfo = "powershell.exe  Get-WmiObject –class Win32_processor | ft systemname,Name,DeviceID,NumberOfCores,NumberOfLogicalProcessors, Addresswidth";
  String GPUinfo = "powershell.exe  Get-WmiObject win32_videocontroller";
  String StorageInfo = "powershell.exe  Get-PSDrive";
  String ipconfigDNS = "powershell.exe  ipconfig /displaydns";
  String ClearHistory = "powershell.exe  'Clear-History'";
  String netstataon = "powershell.exe  netstat -aon";
  String arpa = "powershell.exe  arp -a";
   
  // Executing the command
  Process powerShellProcessUserName = Runtime.getRuntime().exec(UserName);
  Process powerShellProcessUserDomainName = Runtime.getRuntime().exec(UserDomainName);
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
   System.out.println("\n\t\t\t\t\t  " + lineUN);
  }
  stdoutUN.close();
  
  //System.out.println("Standard Error:");
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
   System.out.println("\n\t\t\t\t  " + lineUDN);
  }
  stdoutUDN.close();
  
  //System.out.println("Standard Error:");
  BufferedReader stderrUDN = new BufferedReader(new InputStreamReader(
    powerShellProcessUserDomainName.getErrorStream()));
  while ((lineUDN = stderrUDN.readLine()) != null) {
   System.out.println("Standard Error: " + lineUDN);
  }
  stderrUDN.close();
  
  //System Info
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tSystem Info");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr0 = new BufferedReader(new InputStreamReader(
    powerShellProcess0.getErrorStream()));
  while ((line0 = stderr0.readLine()) != null) {
   System.out.println("Standard Error: " + line0);
  }
  stderr0.close();
  System.out.println("Done - Get-CimInstance Win32_OperatingSystem | FL *");
  
  //ipconfig /allcompartments /all
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\tipconfig /allcompartments /all");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr1 = new BufferedReader(new InputStreamReader(
    powerShellProcess1.getErrorStream()));
  while ((line1 = stderr1.readLine()) != null) {
   System.out.println("Standard Error: " + line1);
  }
  stderr1.close();
  System.out.println("\n\nDone - ipconfig /allcompartments /all");
  
  
  //CPUinfo
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tCPU Info");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr2 = new BufferedReader(new InputStreamReader(
    powerShellProcess2.getErrorStream()));
  while ((line2 = stderr2.readLine()) != null) {
   System.out.println("Standard Error: " + line2);
  }
  stderr2.close();
  System.out.println("Done - Get-WmiObject –class Win32_processor | ft systemname,Name,DeviceID,NumberOfCores,NumberOfLogicalProcessors, Addresswidth");

  //GPUinfo
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tGPU Info");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr3 = new BufferedReader(new InputStreamReader(
    powerShellProcess3.getErrorStream()));
  while ((line3 = stderr3.readLine()) != null) {
   System.out.println("Standard Error: " + line3);
  }
  stderr3.close();
  System.out.println("Done - Get-WmiObject win32_videocontroller");
  
  //StorageInfo
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tStorage Info");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr4 = new BufferedReader(new InputStreamReader(
    powerShellProcess4.getErrorStream()));
  while ((line4 = stderr4.readLine()) != null) {
   System.out.println("Standard Error: " + line4);
  }
  stderr4.close();
  System.out.println("\n\nDone - Get-PSDrive");
  
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tFile Layout");
  System.out.println("##########################################################################################");
  
  //The code that follows Is used to determine the file layout.
  //-----------------------------------------------------------------------------------------------------------------------------
  
  String UserStringDesktop = "Get-ChildItem -Path C:\\Users\\" + User + "\\Desktop"; 
  String UserStringDocuments = "Get-ChildItem -Path C:\\Users\\" + User + "\\Documents";
  String UserStringDownloads = "Get-ChildItem -Path C:\\Users\\" + User + "\\Downloads";
  String UserStringPictures = "Get-ChildItem -Path C:\\Users\\" + User + "\\Pictures";
  String UserStringMusic = "Get-ChildItem -Path C:\\Users\\" + User + "\\Music";
  String UserStringUsers = "Get-ChildItem -Path C:\\Users";
  String UserStringProgramFiles = "Get-ChildItem -Path C:\\'Program Files'";
  String UserStringProgramFilesx86 = "Get-ChildItem -Path C:\\'Program Files (x86)'";
  String UserStringVideos = "Get-ChildItem -Path C:\\Users\\" + User + "\\Videos";
  String UserString3DObjects = "Get-ChildItem -Path C:\\Users\\" + User + "\\'3D Objects'";
  String UserStringOneDrive = "Get-ChildItem -Path C:\\Users\\" + User + "\\OneDrive";
  
  String DesktopFiles = "powershell.exe " + UserStringDesktop;
  String DocumentsFiles = "powershell.exe " + UserStringDocuments;
  String DownloadsFiles = "powershell.exe " + UserStringDownloads;
  String PicturesFiles = "powershell.exe " + UserStringPictures;
  String MusicFiles = "powershell.exe " + UserStringMusic;
  String UsersFiles = "powershell.exe " + UserStringUsers;
  String ProgramFiles = "powershell.exe " + UserStringProgramFiles;
  String ProgramFilesx86 = "powershell.exe " + UserStringProgramFilesx86;
  String VideosFiles = "powershell.exe " + UserStringVideos;
  String ObjectsFiles = "powershell.exe " + UserString3DObjects;
  String OneDriveFiles = "powershell.exe " + UserStringOneDrive;
  
  Process powerShellProcess5 = Runtime.getRuntime().exec(DesktopFiles);
  Process powerShellProcess6 = Runtime.getRuntime().exec(DocumentsFiles);
  Process powerShellProcess7 = Runtime.getRuntime().exec(DownloadsFiles);
  Process powerShellProcess8 = Runtime.getRuntime().exec(PicturesFiles);
  Process powerShellProcess9 = Runtime.getRuntime().exec(MusicFiles);
  Process powerShellProcess10 = Runtime.getRuntime().exec(UsersFiles);
  Process powerShellProcess11 = Runtime.getRuntime().exec(ProgramFiles);
  Process powerShellProcess12 = Runtime.getRuntime().exec(ProgramFilesx86);
  Process powerShellProcess13 = Runtime.getRuntime().exec(VideosFiles);
  Process powerShellProcess14 = Runtime.getRuntime().exec(ObjectsFiles);
  Process powerShellProcess15 = Runtime.getRuntime().exec(OneDriveFiles);
  
  //-----------------------------------------------------------------------------------------------------------------------------
  
  
  //DesktopFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tDesktop Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr5 = new BufferedReader(new InputStreamReader(
    powerShellProcess5.getErrorStream()));
  while ((line5 = stderr5.readLine()) != null) {
   System.out.println("Standard Error: " + line5);
  }
  stderr5.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Desktop");
  
  //DocumentsFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tDocument Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr6 = new BufferedReader(new InputStreamReader(
    powerShellProcess6.getErrorStream()));
  while ((line6 = stderr6.readLine()) != null) {
   System.out.println("Standard Error: " + line6);
  }
  stderr6.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Documents");
  
  //DownloadsFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tDownload Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr7 = new BufferedReader(new InputStreamReader(
    powerShellProcess7.getErrorStream()));
  while ((line7 = stderr7.readLine()) != null) {
   System.out.println("Standard Error: " + line7);
  }
  stderr6.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Downloads");
  
  //PicturesFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tPicture Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr8 = new BufferedReader(new InputStreamReader(
    powerShellProcess8.getErrorStream()));
  while ((line8 = stderr8.readLine()) != null) {
   System.out.println("Standard Error: " + line8);
  }
  stderr8.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Pictures");
  
  //MusicFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tMusic Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr9 = new BufferedReader(new InputStreamReader(
    powerShellProcess9.getErrorStream()));
  while ((line9 = stderr9.readLine()) != null) {
   System.out.println("Standard Error: " + line9);
  }
  stderr9.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users\\" + User + "\\Music");
  
  //UsersFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tUser Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr10 = new BufferedReader(new InputStreamReader(
    powerShellProcess10.getErrorStream()));
  while ((line10 = stderr10.readLine()) != null) {
   System.out.println("Standard Error: " + line10);
  }
  stderr10.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Users");
  
  //ProgramFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tProgram Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr11 = new BufferedReader(new InputStreamReader(
    powerShellProcess11.getErrorStream()));
  while ((line11 = stderr11.readLine()) != null) {
   System.out.println("Standard Error: " + line11);
  }
  stderr11.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Program Files");
  
  //ProgramFilesx86
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tProgram Files (x86)");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr12 = new BufferedReader(new InputStreamReader(
    powerShellProcess12.getErrorStream()));
  while ((line12 = stderr12.readLine()) != null) {
   System.out.println("Standard Error: " + line12);
  }
  stderr12.close();
  System.out.println("\n\nDone - Get-ChildItem -Path C:\\Program Files (x86)");
  
  //VideosFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tVideo Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr13 = new BufferedReader(new InputStreamReader(
    powerShellProcess13.getErrorStream()));
  while ((line13 = stderr13.readLine()) != null) {
   System.out.println("Standard Error: " + line13);
  }
  stderr13.close();
  System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\Videos");
  
  //3DObjectsFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\t3D Object Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr14 = new BufferedReader(new InputStreamReader(
    powerShellProcess14.getErrorStream()));
  while ((line14 = stderr14.readLine()) != null) {
   System.out.println("Standard Error: " + line14);
  }
  stderr14.close();
  System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\3D Objects");
  
  //OneDriveFiles
  System.out.println("\n\n------------------------------------------------------------------------------------------");
  System.out.println("\t\t\t\t\tOneDrive Files");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr15 = new BufferedReader(new InputStreamReader(
    powerShellProcess15.getErrorStream()));
  while ((line15 = stderr15.readLine()) != null) {
   System.out.println("Standard Error: " + line15);
  }
  stderr15.close();
  System.out.println("\n\nDone - Output: >Get-ChildItem -Path C:\\Users\\" + User + "\\OneDrive");
  
  //netstat -aon
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tnetstat -aon ");
  System.out.println("\t\t\t\t   (Displays all ports)");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr16 = new BufferedReader(new InputStreamReader(
    powerShellProcess16.getErrorStream()));
  while ((line16 = stderr16.readLine()) != null) {
   System.out.println("Standard Error: " + line16);
  }
  stderr16.close();
  System.out.println("\n\nDone - netstat -aon");
  
  //arp -a
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tarp -a ");
  System.out.println("\t\t(Which IPv4 address associated with witch MAC address)");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderr17 = new BufferedReader(new InputStreamReader(
    powerShellProcess17.getErrorStream()));
  while ((line17 = stderr17.readLine()) != null) {
   System.out.println("Standard Error: " + line17);
  }
  stderr17.close();
  System.out.println("\n\nDone - arp -a");
  
  //ipconfig /Displaydns
  System.out.println("\n\n##########################################################################################");
  System.out.println("\t\t\t\t\tDisplay DNS");
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
  
  //System.out.println("Standard Error:");
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
  
  //System.out.println("Standard Error:");
  BufferedReader stderrCH = new BufferedReader(new InputStreamReader(
    powerShellProcessCH.getErrorStream()));
  while ((lineCH = stderrCH.readLine()) != null) {
   System.out.println("Standard Error: " + lineCH);
  }
  stderrCH.close();
  System.out.println("\n\n\nCommand Line History has SUCCESSFULLY been cleared.");  
  
 }

}