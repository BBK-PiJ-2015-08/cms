package cms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager; 

public class Main
{
     static Scanner sc= new Scanner(System.in);
     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     static String name,age,address,contact,email,salary,designation,decider,technology;
     static int  choice;
     static Connection con=null;
     static Statement stmt=null;
     static ResultSet rs=null;
    public static void main(String[] args)
    {
         do
         {
          System.out.println("1.Management");
          System.out.println("2.Faculty");
          System.out.println("3.Students");
          System.out.println("4.Support Staff");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      management();
                      break;
              case 2:
                      faculty();
                      break;
              case 3:
                      students();
                      break;
              case 4:
                      supportStaff();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));

    }
    public static void management()
    {
         do
         {
          System.out.println("1.Principal");
          System.out.println("2.DeputyPrincipal");
          System.out.println("3.Secretary");
          System.out.println("4.Receptionist");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      principal();
                      break;
              case 2:
                      deputyPrincipal();
                      break;
              case 3:
                      secretary();
                      break;
              case 4:
                      receptionist();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));

    }
    public static void faculty()
    {
         do
         {
          System.out.println("1.Java Teacher");
          System.out.println("2.C/C++ Teacher");
          System.out.println("3.Android Teacher");
          System.out.println("4.SQL Teacher");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      javaTeacher();
                      break;
              case 2:
                      cTeacher();
                      break;
              case 3:
                      androidTeacher();
                      break;
              case 4:
                      sqlTeacher();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
    public static void students()
    {
         do
         {
          System.out.println("1.Java Students");
          System.out.println("2.C/C++ Students");
          System.out.println("3.Android Students");
          System.out.println("4.SQL Students");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      javaStudent();
                      break;
              case 2:
                      cStudent();
                      break;
              case 3:
                      androidStudent();
                      break;
              case 4:
                      sqlStudents();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
    public static void supportStaff()
    {
             do
         {
          System.out.println("1.Security Guard");
          System.out.println("2.Night Guard");
          System.out.println("3.Cleaner");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      securityGuard();
                      break;
              case 2:
                      nightGuard();
                      break;
              case 3:
                      cleaner();
                      break;
              
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
    public static void principal()
    {
         do
         {
          System.out.println("1.Add New Principal");
          System.out.println("2.Search For A Principal");
          System.out.println("3.Delete A Principal");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addPrincipal();
                      break;
              case 2:
                      searchPrincipal();
                      break;
              case 3:
                      deletePrincipal();
                      break;

              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));

    }
     public static void deputyPrincipal()
    {
         do
         {
          System.out.println("1.Add New Deputy Principal");
          System.out.println("2.Search For A Deputy Principal");
          System.out.println("3.Delete A Deputy Principal");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addDeputyPrincipal();
                      break;
              case 2:
                      searchDeputyPrincipal();
                      break;
              case 3:
                      deleteDeputyPrincipal();
                      break;

              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
      public static void secretary()
    {
         do
         {
          System.out.println("1.Add New Secretary");
          System.out.println("2.Search For A Secretary");
          System.out.println("3.Delete A Secretary");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addSecretary();
                      break;
              case 2:
                      searchSecretary();
                      break;
              case 3:
                      deleteSecretary();
                      break;

              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void receptionist()
    {
         do
         {
          System.out.println("1.Add New Receptionist");
          System.out.println("2.Search For A Receptionist");
          System.out.println("3.Delete A Receptionist");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addReceptionist();
                      break;
              case 2:
                      searchReceptionist();
                      break;
              case 3:
                      deleteReceptionist();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void javaTeacher()
    {
do
         {
          System.out.println("1.Add New Java Teacher");
          System.out.println("2.Search For A Java Teacher");
          System.out.println("3.Delete A Java Teacher");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addjavaTeacher();
                      break;
              case 2:
                      searchjavaTeacher();
                      break;
              case 3:
                      deletejavaTeacher();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void cTeacher()
    {
do
         {
          System.out.println("1.Add New C Teacher");
          System.out.println("2.Search For A C Teacher");
          System.out.println("3.Delete A C Teacher");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addcTeacher();
                      break;
              case 2:
                      searchcTeacher();
                      break;
              case 3:
                      deletecTeacher();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void androidTeacher()
    {
do
         {
          System.out.println("1.Add New Android Teacher");
          System.out.println("2.Search For An Android Teacher");
          System.out.println("3.Delete An Android Teacher");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addandroidTeacher();
                      break;
              case 2:
                      searchandroidTeacher();
                      break;
              case 3:
                      deleteandroidTeacher();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void sqlTeacher()
    {
do
         {
          System.out.println("1.Add New SQL Teacher");
          System.out.println("2.Search For An SQL Teacher");
          System.out.println("3.Delete An SQL Teacher");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addsqlTeacher();
                      break;
              case 2:
                      searchsqlTeacher();
                      break;
              case 3:
                      deletesqlTeacher();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
        public static void javaStudent()
    {
do
         {
          System.out.println("1.Add New Java Student");
          System.out.println("2.Search For A Java Student");
          System.out.println("3.Delete A Java Student");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addjavaStudent();
                      break;
              case 2:
                      searchjavaStudent();
                      break;
              case 3:
                      deletejavaStudent();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void cStudent()
    {
do
         {
          System.out.println("1.Add New C Student");
          System.out.println("2.Search For A C Student");
          System.out.println("3.Delete A C Student");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addcStudent();
                      break;
              case 2:
                      searchcStudent();
                      break;
              case 3:
                      deletecStudent();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void androidStudent()
    {
do
         {
          System.out.println("1.Add New Android Student");
          System.out.println("2.Search For An Android Student");
          System.out.println("3.Delete An Android Student");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addandroidStudent();
                      break;
              case 2:
                      searchandroidStudent();
                      break;
              case 3:
                      deleteandroidStudent();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void sqlStudents()
    {
do
         {
          System.out.println("1.Add New SQL Student");
          System.out.println("2.Search For An SQL Student");
          System.out.println("3.Delete An SQL Student");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addsqlStudent();
                      break;
              case 2:
                      searchsqlStudent();
                      break;
              case 3:
                      deletesqlStudent();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void securityGuard()
    {
do
         {
          System.out.println("1.Add New Security Guard");
          System.out.println("2.Search For A Security Guard");
          System.out.println("3.Delete A Security Guard");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addsecurityGuard();
                      break;
              case 2:
                      searchsecurityGuard();
                      break;
              case 3:
                      deletesecurityGuard();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void nightGuard()
    {
do
         {
          System.out.println("1.Add New Night Guard");
          System.out.println("2.Search For A Night Guard");
          System.out.println("3.Delete A Night Guard");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addnightGuard();
                      break;
              case 2:
                      searchnightGuard();
                      break;
              case 3:
                      deletenightGuard();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
       public static void cleaner()
    {
do
         {
          System.out.println("1.Add New Cleaner");
          System.out.println("2.Search For A Cleaner");
          System.out.println("3.Delete A Cleaner");

          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                      addcleaner();
                      break;
              case 2:
                      searchcleaner();
                      break;
              case 3:
                      deletecleaner();
                      break;
              default :
                      System.out.println("Wrong choice");

          }
          System.out.println("do you want to choose more options y/n");
          decider=sc.next().toLowerCase();
         }
         while(decider.equals("y"));
    }
    public static void addPrincipal()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into management values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Principal y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchPrincipal()
    {
          
          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a designation");
          designation=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from management where name='"+name+"' and designation='Principal'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletePrincipal()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from management where designation='Principal'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Principal name for deletion");
                name=br.readLine();
                stmt.execute("delete from management where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from management where designation='Principal'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
    public static void addDeputyPrincipal()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into management values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Deputy Principal y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
        public static void addSecretary()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into management values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Secretary y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
            public static void addReceptionist()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into management values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Receptionist y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
            public static void searchDeputyPrincipal()
            {

          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a designation");
          designation=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from management where name='"+name+"' and designation='Deputy Principal'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
            public static void deleteDeputyPrincipal()
            {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from management where designation='Deputy Principal'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Deputy Principal name for deletion");
                name=br.readLine();
                stmt.execute("delete from management where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from management where designation='Deputy Principal'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
            public static void searchReceptionist()
            {

          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a designation");
          designation=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from management where name='"+name+"' and designation='Receptionist'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
            public static void deleteReceptionist()
            {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from management where designation='Receptionist'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Receptionist name for deletion");
                name=br.readLine();
                stmt.execute("delete from management where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from management where designation='Receptionist'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
            public static void searchSecretary()
                  {

          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a designation");
          designation=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from management where name='"+name+"' and designation='Secretary'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
        public static void deleteSecretary()
         {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from management where designation='Secretary'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Secretary name for deletion");
                name=br.readLine();
                stmt.execute("delete from management where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from management where designation='Secretary'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addjavaTeacher()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into faculty values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Java Teacher y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchjavaTeacher()
    {

          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a technology");
          technology=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from faculty where name='"+name+"' and technology='Java'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletejavaTeacher()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from faculty where technology='Java'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a Java Teacher name for deletion");
                name=br.readLine();
                stmt.execute("delete from faculty where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from faculty where technology='Java'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addcTeacher()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into faculty values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for C Teacher y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
public static void searchcTeacher()
    {

          try
          {
              System.out.println("Enter the name which you wish to search for");
          name=br.readLine();
          System.out.println("Enter a technology");
          technology=br.readLine();
              con=ConnectionClass.getConnection();
              stmt=con.createStatement();
              rs=stmt.executeQuery("select * from faculty where name='"+name+"' and technology='C'");
              System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
              if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
              }
              else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletecTeacher()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from faculty where technology='C'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a C Teacher name for deletion");
                name=br.readLine();
                stmt.execute("delete from faculty where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from faculty where technology='C'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addandroidTeacher()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into faculty values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Android Teacher y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
public static void searchandroidTeacher()
    {

          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from faculty where name='"+name+"' and technology='Android'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deleteandroidTeacher()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from faculty where technology='Android'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a Android Teacher name for deletion");
                name=br.readLine();
                stmt.execute("delete from faculty where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from faculty where technology='Android'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addsqlTeacher()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into faculty values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for SQL Teacher y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
public static void searchsqlTeacher()
    {

          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from faculty where name='"+name+"' and technology='SQL'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletesqlTeacher()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from faculty where technology='SQL'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a SQL Teacher name for deletion");
                name=br.readLine();
                stmt.execute("delete from faculty where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from faculty where technology='SQL'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addjavaStudent()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into students values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Java Student y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchjavaStudent()
    {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from students where name='"+name+"' and technology='Java'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletejavaStudent()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from students where technology='Java'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a Java Student name for deletion");
                name=br.readLine();
                stmt.execute("delete from students where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from students where technology='Java'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addcStudent()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into students values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for C Student y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchcStudent()
    {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from students where name='"+name+"' and technology='C'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletecStudent()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from students where technology='C'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a C Student name for deletion");
                name=br.readLine();
                stmt.execute("delete from students where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from students where technology='C'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addandroidStudent()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into students values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Android Student y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchandroidStudent()
    {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from students where name='"+name+"' and technology='Android'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deleteandroidStudent()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from students where technology='Android'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a Android Student name for deletion");
                name=br.readLine();
                stmt.execute("delete from students where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from students where technology='Android'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addsqlStudent()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Technology");
            technology=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into students values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+technology+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for SQL Student y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
    public static void searchsqlStudent()
    {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a technology");
            technology=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from students where name='"+name+"' and technology='SQL'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
    public static void deletesqlStudent()
    {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from students where technology='SQL'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("technology"));
                }
                System.out.println("Enter a SQL Student name for deletion");
                name=br.readLine();
                stmt.execute("delete from students where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from students where technology='SQL'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tTechnology:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+"\t"+rs.getString("technology"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addsecurityGuard()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into supportstaff values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Security Guard y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
   public static void searchsecurityGuard()
   {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a designation");
            designation=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from supportstaff where name='"+name+"' and designation='Security Guard'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+rs.getString("designation"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
   public static void deletesecurityGuard()
   {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from supportstaff where designation='Security Guard'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Security Guard name for deletion");
                name=br.readLine();
                stmt.execute("delete from supportstaff where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from supportstaff where designation='Security Guard'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addnightGuard()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into supportstaff values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Night Guard y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
   public static void searchnightGuard()
   {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a designation");
            designation=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from supportstaff where name='"+name+"' and designation='Night Guard'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+rs.getString("designation"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
   public static void deletenightGuard()
   {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from supportstaff where designation='Night Guard'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Night Guard name for deletion");
                name=br.readLine();
                stmt.execute("delete from supportstaff where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from supportstaff where designation='Night Guard'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
public static void addcleaner()
    {
        do
        {
            try
            {
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter Age");
            age=sc.next();
            System.out.println("Enter Address");
            address=br.readLine();
            System.out.println("Enter Contact");
            contact =sc.next();
            System.out.println("Enter E-mail");
            email=br.readLine();
            System.out.println("Enter Salary");
            salary=sc.next();
            System.out.println("Enter Designation");
            designation=br.readLine();
             con=ConnectionClass.getConnection();
             stmt=con.createStatement();
             stmt.execute("insert into supportstaff values('"+name+"','"+age+"','"+address+"','"+contact+"','"+email+"','"+salary+"','"+designation+"')");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            System.out.println("Do you want to enter more Entries for Cleaner y/n");
            decider=sc.next().toLowerCase();
        }
        while(decider.equals("y"));
    }
   public static void searchcleaner()
   {
          try
          {
            System.out.println("Enter the name which you wish to search for");
            name=br.readLine();
            System.out.println("Enter a designation");
            designation=br.readLine();
            con=ConnectionClass.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from supportstaff where name='"+name+"' and designation='Cleaner'");
            System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
            if(rs.next())
              {
                  System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+rs.getString("designation"));
              }
            else
              {
                  System.out.println("Input Mismatch?...Please check your inputs");
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(IOException e)
          {
              e.printStackTrace();
          }
          finally
          {
              ConnectionClass.closeConnection(con, stmt, rs);
          }
    }
   public static void deletecleaner()
   {
           try
           {
               con=ConnectionClass.getConnection();
               stmt=con.createStatement();
               rs=stmt.executeQuery("select * from supportstaff where designation='Cleaner'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
                System.out.println("Enter a Cleaner name for deletion");
                name=br.readLine();
                stmt.execute("delete from supportstaff where name='"+name+"' ");
                System.out.println("DELETION SUCCEESSFUL");
                 rs=stmt.executeQuery("select * from supportstaff where designation='Cleaner'");
                System.out.println("Name:"+"\tAge:"+"\tAddress:"+"\tContact:"+"\tE-mail:"+"\tSalary:"+"\tDesignation:");
                while(rs.next())
                {
                    System.out.println(rs.getString("name")+"\t"+rs.getString("age")+"\t"+rs.getString("address")+"\t"+rs.getString("contact")+"\t"+rs.getString("email")+"\t"+rs.getString("salary")+"\t"+rs.getString("designation"));
                }
           }
           catch(SQLException e)
           {
               e.printStackTrace();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           finally
           {
               ConnectionClass.closeConnection(con, stmt, rs);
           }
    }
}
