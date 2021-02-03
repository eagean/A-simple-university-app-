import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Uni {


	public static void  main(String[] args) {
	   
	    
		ArrayList<Student> stu = new ArrayList<>();
		ArrayList<Instructor> ins = new ArrayList<>();
		ArrayList<Courses> cou = new ArrayList<>();
		boolean mainege = true ;
		boolean egestu = true ;  
		boolean egeins = true ;
		boolean egecou = true ;
		
		
		
		while (mainege) {
		
		System.out.println(" 1 for Student's operations" + "\n" + " 2 for Instructor'operations" + "\n" + " 3 for Courses' operation " + "\n" + " 4 for listing operations");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if (x<1 || x>4  )
		{
			System.out.println("please enter valid number you entered : " + x );  
		}
		
		
		switch ( x )
		{
case 1: 
			while (egestu) {
			System.out.print(" 1 for add student" + "\n" + "2 for update student " + "\n" + "3 for remove student" );
			Scanner sscan = new Scanner (System.in);
			int forstu = sscan.nextInt();
			if (forstu<1 || forstu>3  ) {
			
				System.out.println("please enter valid number you entered : " + forstu );  
			}
			
				
			
			switch (forstu) {
			
			case 1 :
			 
			     Student s = new Student();
			     Scanner stud = new Scanner(System.in);
			
			    System.out.print("enter student's name : ");
			    String sn = stud.nextLine();
			    System.out.print("enter student's surname : ");
			    String ss = stud.nextLine();
			    System.out.print("enter student's id : ");
			    String si = stud.nextLine();
			    System.out.print("enter student's birthday : ");
		    	String sb = stud.nextLine();
	    		System.out.print("enter student's department : ");
		    	String sd = stud.nextLine();
			
			
		         s.setName(sn);	
		         s.setSurname(ss);
		         s.setStudentid(si);
		         s.setBirthday(sb);
		         s.setDepartment(sd);
		
		          	stu.add(s);
		          	
		          	break;
		          	
			case 2 :
				Iterator<Student> stulist = stu.iterator();
				while (stulist.hasNext()){
					Student h1 = stulist.next();
					Student handle = h1;
					System.out.println((stu.indexOf(handle)+1)+ "." + "Student --->" + "\n" + "Studentid : " + handle.getStudentid() 
								+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Student's birthday : " + handle.getBirthday() 
											+ "\n" +  "Student's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
						
				}
				
						System.out.println("please enter which number to change");
						Scanner stuup = new Scanner(System.in);
						int stuptade = stuup.nextInt();
						Student suphandle = stu.get((stuptade - 1 ) );
			        
						System.out.println("Selected student is : " + stuptade + "\n" + "name : " + suphandle.getName() + "\n" + "surname : " + suphandle.getSurname() 
										+ "\n" + "Student id : " + suphandle.getStudentid() + "\n" + "Student's birthday " + suphandle.getBirthday()
										+ "\n" +"Student's department : " + suphandle.getDepartment());
						System.out.println("Enter 1 for update name" + "\n" + "Enter 2 for update surname" + "\n" +"Enter 3 for update studentid "
										+ "\n" +"Enter 4 for update birthday "  + "\n" + "Enter 5 for update department" );
						Scanner upswitchs = new Scanner(System.in);
							int upswitch = upswitchs.nextInt();
										if(upswitch<1 || upswitch>5)
											{System.out.print("invalid enter" + upswitch);}
					switch (upswitch){
						case 1 : 
								System.out.println("enter new name : ");
								Scanner stuuptname = new Scanner(System.in);
								String shn = stuuptname.nextLine();
								Student suphandlen = suphandle;
								suphandlen.setName(shn);
								System.out.println("name succesfully changed");
								break ;
						case 2 : 
								System.out.println("enter new surname : ");
								Scanner stuuptsurname = new Scanner(System.in);
								String shs = stuuptsurname.nextLine();
								Student suphandles = suphandle;
								suphandles.setSurname(shs);
								System.out.println("surname succesfully changed ");
								break ;
						case 3 : 
								System.out.println("enter new id : ");
								Scanner stuuptid = new Scanner(System.in);
								String shid = stuuptid.nextLine();
								Student suphandleid = suphandle;
								suphandleid.setStudentid(shid);
								System.out.println("studentid succesfully changed ");
								break ;
						case 4 : 
								System.out.println("enter new birthday : ");
								Scanner stuuptbday = new Scanner(System.in);
								String shbd = stuuptbday.nextLine();
								Student suphandlebd = suphandle;
								suphandlebd.setBirthday(shbd);
								System.out.println("birthday succesfully changed ");
								break ;
						case 5 : 
								System.out.println("enter new department : ");
								Scanner stuuptdep = new Scanner(System.in);
								String shd = stuuptdep.nextLine();
								Student suphandled = suphandle;
								suphandled.setDepartment(shd);
								System.out.println("department succesfully changed " );
								break ;
						}
				
		
						
				break ;
				
		
		          	
			case 3 : 
				Iterator<Student> sit = stu.iterator();
				while (sit.hasNext())
				{
					Student sforit = sit.next();
					Student sforith = sforit;
					System.out.print("please enter in order  studentid , name , surname  ");
					Scanner cont = new Scanner(System.in);
					String contstringid = cont.nextLine();
					String contstringname= cont.nextLine();
					String contstringsurname= cont.nextLine();
							if (((sforith.getStudentid()).equals(contstringid)) 	&& 	((sforith.getName()).equals(contstringname))		&& 	((sforith.getSurname()).equals(contstringsurname)))
								{
									System.out.println("deleting ....  " + "\n" + " Student id : " + sforit.getStudentid() + "\n" + "Name : " + sforit.getName() + "\n" + "Surname : " + sforit.getSurname());
						
										sit.remove();	
						
									}				                 																									
					
				}
				
				break;
			     
			}  
			System.out.print("press 1 for more Student operation or press 2 for exit the Student's menu ");
			Scanner stuboolean = new Scanner(System.in);
			int q1 = stuboolean.nextInt();
			if(q1==1 || q1==2) {
			if ( q1==1 )
			{egestu = true;}
			else 
			{egestu=false;}}
		}
break ;
		
case 2:
			while (egeins) {
				System.out.print(" 1 for add Instructor" + "\n" + "2 for update Instructor " + "\n" + "3 for removeInstructor" );
				Scanner iscan = new Scanner (System.in);
				int forins = iscan.nextInt();
				if (forins<1 || forins>3  ) {
				
					System.out.println("please enter valid number you entered : " + forins );  
				}
				
					
				
				switch (forins) {
				case 1 : 
						Instructor i = new Instructor();
						Scanner insd = new Scanner(System.in);
			
						System.out.print("enter instructor's name : ");
						String in = insd.nextLine();
						System.out.print("enter instructor's surname : ");
						String is = insd.nextLine();
						System.out.print("enter instructor's academictitle : ");
						String iat = insd.nextLine();
						System.out.print("enter instructor's birthday : ");
						String ib = insd.nextLine();
						System.out.print("enter instructor's department : ");
						String id = insd.nextLine();
			
						i.setName(in);
						i.setSurname(is);
						i.setAcademictitle(iat);
						i.setBirthday(ib);
						i.setDepartment(id);
			
			
						  ins.add(i);
						  
	  break ;
				
				case 2 : 
					Iterator<Instructor> inslist = ins.iterator();
					while(inslist.hasNext()) {
					
						Instructor h1 = inslist.next();
						Instructor handle = h1 ;
						System.out.println((ins.indexOf(handle)+1)+ "." + "Instructor --->" + "\n" + "Instructor academictitle : " + handle.getAcademictitle()
						+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Instructor's birthday : " + handle.getBirthday() 
									+ "\n" +  "Instructor's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
					
					}
					System.out.println("please enter which number to change");
					Scanner insup = new Scanner(System.in);
					int inuptade = insup.nextInt();
					Instructor iuphandle = ins.get((inuptade - 1 ) );
		        
					System.out.println("Selected Instructor is : " + inuptade + "\n" + "name : " + iuphandle.getName() + "\n" + "surname : " + iuphandle.getSurname() 
									+ "\n" + "Instructor academic title : " + iuphandle.getAcademictitle() + "\n" + "Instructor's birthday " + iuphandle.getBirthday()
									+ "\n" +"Instructor's department : " + iuphandle.getDepartment());
					System.out.println("Enter 1 for update name" + "\n" + "Enter 2 for update surname" + "\n" +"Enter 3 for update academic title  "
									+ "\n" +"Enter 4 for update birthday "  + "\n" + "Enter 5 for update department" );
					Scanner upswitchs = new Scanner(System.in);
						int upswitch = upswitchs.nextInt();
									if(upswitch<1 || upswitch>5)
										{System.out.print("invalid enter" + upswitch);}
				switch (upswitch){
					case 1 : 
							System.out.println("enter new name : ");
							Scanner insuptname = new Scanner(System.in);
							String ihn = insuptname.nextLine();
							Instructor suphandlen = iuphandle;
							suphandlen.setName(ihn);
							System.out.println("name succesfully changed");
							break ;
					case 2 : 
							System.out.println("enter new surname : ");
							Scanner insuptsurname = new Scanner(System.in);
							String ihs = insuptsurname.nextLine();
							Instructor suphandles = iuphandle ;
							suphandles.setSurname(ihs);
							System.out.println("surname succesfully changed ");
							break ;
					case 3 : 
							System.out.println("enter new academictitle : ");
							Scanner uiat = new Scanner(System.in);
							String iuat = uiat.nextLine();
							Instructor inshandleat = iuphandle;
							inshandleat.setDepartment(iuat);
							System.out.println("academictitle succesfully changed ");
							break ;
					case 4 : 
							System.out.println("enter new birthday: ");
							Scanner insuptbday = new Scanner(System.in);
							String ihbd = insuptbday.nextLine();
							Instructor ihandlebd = iuphandle;
							ihandlebd.setBirthday(ihbd);
							System.out.println("birthday succesfully changed ");
							break ;
					case 5 : 
							System.out.println("enter new department : ");
							Scanner iuptdep = new Scanner(System.in);
							String ihd = iuptdep.nextLine();
							Instructor iuphandled = iuphandle;
							iuphandled.setDepartment(ihd);
							System.out.println("department succesfully changed " );
							break ;
					}
			
	
					
			break ;
			
							
					
				case 3 : 
			Iterator<Instructor> iit = ins.iterator();
			while (iit.hasNext()) {
				
				Instructor iforit = iit.next();
				Instructor iforith = iforit;
				System.out.print("please enter in order academictitle , name , surname  ");
				Scanner cont = new Scanner(System.in);
				String contstringatitle = cont.nextLine();
				String contstringname= cont.nextLine();
				String contstringsurname= cont.nextLine();
						if (((iforith.getAcademictitle()).equals(contstringatitle)) 	&& 	((iforith.getName()).equals(contstringname))		&& 	((iforith.getSurname()).equals(contstringsurname)))
							{
								System.out.println("deleting ....  " + "\n" + " Instructor's academic title : " + iforit.getAcademictitle() 
								                   							+ "\n" + "Name : " + iforit.getName() + "\n" + "Surname : " + iforit.getSurname() );
					
									iit.remove();	
				
			}}
						break ;
				}
					System.out.print("press 1 for more Instructor operation or press 2 for exit the Instructor's menu ");
						Scanner insboolean = new Scanner(System.in);
						int q2 = insboolean.nextInt();
						if(q2==1 || q2==2) {
						if ( q2==1 )
						{egeins = true;}
						else 
						{egeins=false;}}
				}
break;
			
						
				
case 3:
			while (egecou) {
				System.out.print(" 1 for add course" + "\n" + "2 for update course " + "\n" + "3 for remove course" );
				Scanner cscan = new Scanner (System.in);
				int forcou = cscan.nextInt();
				if (forcou<1 || forcou>3  ) {
				
					System.out.println("please enter valid number you entered : " + forcou );  
				}
				
					
				
				switch (forcou) {
				
			    case 1 : 
			    	Courses c = new Courses();
			    	Scanner coud = new Scanner(System.in);
			
			    	System.out.print("enter course's name : ");
			    	String cn = coud.nextLine();
			    	System.out.print("enter course's id : ");
			    	String ci = coud.nextLine();
			    	System.out.print("enter course's ects : ");
			    	String ce = coud.nextLine();
			
			    	c.setName(cn);
			    	c.setId(ci);
			    	c.setEcts(ce);
		
			    	cou.add(c);
			
	 	break;
				case 2 : 
					Iterator<Courses> coulist = cou.iterator();
					while (coulist.hasNext()){
						Courses h1 = coulist.next();
						Courses handle = h1;
						System.out.println((cou.indexOf(handle)+1)+ "." + "Course --->" + "\n" +"Course's name : " + handle.getName() + "\n"+ "Course's id :  " + handle.getId() 
																										+ "\n"+"Course's etcs" + handle.getEcts() +"\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"    );
							
					}
					System.out.println("please enter which number to change");
					Scanner couup = new Scanner(System.in);
					int couptade = couup.nextInt();
					Courses couphandle = cou.get((couptade - 1 ) );
		        
					System.out.println("Selected Instructor is : " + couptade + "\n" + "name : " + couphandle.getName() 
					 									+ "\n" + "id : " + couphandle.getId() + "\n" + "ects : " + couphandle.getEcts());
					
					System.out.println("Enter 1 for update name" + "\n" + "Enter 2 for update courseid" + "\n" +"Enter 3 for update ects " );
					Scanner upswitchs = new Scanner(System.in);
						int upswitch = upswitchs.nextInt();
									if(upswitch<1 || upswitch>3)
										{System.out.print("invalid enter" + upswitch);}
				switch (upswitch){
					case 1 : 
							System.out.println("enter new name : ");
							Scanner couuptname = new Scanner(System.in);
							String chn = couuptname.nextLine();
							Courses couhandlen = couphandle;
							couhandlen.setName(chn);
							System.out.println("name succesfully changed");
							break ;
					case 2 : 
							System.out.println("enter new surname : ");
							Scanner couuptid = new Scanner(System.in);
							String chs = couuptid.nextLine();
							Courses couhandles = couphandle ;
							couhandles.setId(chs);
							System.out.println("id succesfully changed ");
							break ;
					case 3 : 
							System.out.println("enter new ects: ");
							Scanner coupe = new Scanner(System.in);
							String coupee = coupe.nextLine();
							Courses couupects = couphandle;
							couupects.setEcts(coupee);
							System.out.println("ects succesfully changed ");
							break ;
					
				}
					
					
		break ;
				case 3 :
					Iterator<Courses> cit = cou.iterator();
					while (cit.hasNext())
					{
						Courses cforit = cit.next();
						Courses cforith = cforit;
						System.out.print("please enter in order  course's id , name , ects  ");
						Scanner cont = new Scanner(System.in);
						String contstringid = cont.nextLine();
						String contstringname= cont.nextLine();
						String contstringects= cont.nextLine();
								if ((cforith.getId()).equals(contstringid) && cforith.getName().equals(contstringname)  && (cforith.getEcts()).equals(contstringects)) {
							
											cit.remove();	
							
										}	}	
					break ;
				 }
					System.out.print("press 1 for more Student operation or press 2 for exit the Student's menu ");
					Scanner couboolean = new Scanner(System.in);
					int q3 = couboolean.nextInt();
					if(q3==1 || q3==2) {
					if ( q3==1 )
					{egecou = true;}
					else 
					{egecou=false;}}
		       }
break ;

case 4 : 
	    System.out.println("enter 1 for listall or enter 2 for list desired propertiesly search : ");
			Scanner listops = new Scanner(System.in);
				int lops = listops.nextInt();
				if (lops<1 || lops>2  ) {
				
					System.out.println("please enter valid number you entered : " + lops );  
				}
			switch (lops) {
     case 1 :
            	   System.out.print("please enter 1 for listall student"+ "\n" + "please enter 2 for list all instructor" + "\n" + "please enter 3 for list all Course"  );          	   
            	   Scanner listallop = new Scanner(System.in);
            	   int lallop = listallop.nextInt();
            	   if (lallop < 1 || lallop>3) {
            	   System.out.print("invalid choose must be between 1 and 3 choosen number : " + lallop );          	   
            	                                }
            	   switch (lallop) {
               case 1 : 
            	    	 	Iterator<Student> stulistall = stu.iterator();
            	    	 	while (stulistall.hasNext()){
       					   Student h1 = stulistall.next();
       					   Student handle = h1;
       					   System.out.println((stu.indexOf(handle)+1)+ "." + "Student --->" + "\n" + "Studentid : " + handle.getStudentid() 
       								+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Student's birthday : " + handle.getBirthday() 
       											+ "\n" +  "Student's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
       						
       				}
                       break ;
                       
            	 case 2 :
            		 			Iterator<Instructor> inslistall = ins.iterator();
            		 			while(inslistall.hasNext()) {
 					
            		 		Instructor h1 = inslistall.next();
            		 		Instructor handle = h1 ;
            		 		System.out.println((ins.indexOf(handle)+1)+ "." + "Instructor --->" + "\n" + "Instructor academictitle : " + handle.getAcademictitle()
            		 			+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Instructor's birthday : " + handle.getBirthday() 
 									+ "\n" +  "Instructor's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
 					
 					}
            		 
            		 			break ;
           
           
                  case 3 : 
                	  			Iterator<Courses> coulistall = cou.iterator();
                	  			while (coulistall.hasNext()){
  						   Courses h1 = coulistall.next();
  						   Courses handle = h1;
  						   System.out.println((cou.indexOf(handle)+1)+ "." + "Course --->" + "\n" +"Course's name : " + handle.getName() + "\n"+ "Course's id :  " + handle.getId() 
  																										+ "\n"+"Course's etcs" + handle.getEcts() +"\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"    );
  							
  					}
                	  	  
            		 
                	  			break ;
            	   }
            	   
            	   
        break; 
            	   
          		   
      case 2 :
    	  ArrayList<Student> dpstu = new ArrayList<>();
    	  ArrayList<Instructor> dpins = new ArrayList<>();
    	  ArrayList<Courses> dpcou = new ArrayList<>();
    	  Scanner dpsearch = new Scanner(System.in);  	  
            System.out.println("please enter keyworld for your search : ");	   
            String searchstring = dpsearch.nextLine();
            
            		   Iterator<Student> stusearch = stu.iterator();
            			while (stusearch.hasNext()){
            				Student h1 = stusearch.next();
            				Student handle = h1;
            				if((handle.getName()).equals(searchstring) 
            										||
            										(handle.getSurname()).equals(searchstring)
            																|| 
            															(handle.getStudentid()).equals(searchstring)
            																					|| 
            																			(handle.getBirthday()).equals(searchstring) 
         																								    || 
            														             						(handle.getDepartment()).equals(searchstring) ) 
            					dpstu.add(handle);
            			}
            			
            			Iterator<Instructor> inssearch = ins.iterator();
            			while (inssearch.hasNext()){
            				Instructor h1 = inssearch.next();
            				Instructor handle = h1;
            				if((handle.getName()).equals(searchstring) 
            										||
            										(handle.getSurname()).equals(searchstring)
            																|| 
            															(handle.getAcademictitle()).equals(searchstring)
            																					|| 
            																			(handle.getBirthday()).equals(searchstring) 
         																								    || 
            														             						(handle.getDepartment()).equals(searchstring) ) 
            					dpins.add(handle);
            			}
            			
            			Iterator<Courses> cousearch = cou.iterator();
            			while (cousearch.hasNext()){
            				Courses h1 = cousearch.next();
            				Courses handle = h1;
            				if((handle.getName()).equals(searchstring) 
            										||
            										(handle.getId()).equals(searchstring)
            																|| 
            															(handle.getEcts()).equals(searchstring) )
            																					
            					dpcou.add(handle);
            			}
            			
            			Iterator<Student> dpsl = dpstu.iterator();
        	    	 	while (dpsl.hasNext()){
   					   Student h1 = dpsl.next();
   					   Student handle = h1;
   					   System.out.println((stu.indexOf(handle)+1)+ "." + "Student --->" + "\n" + "Studentid : " + handle.getStudentid() 
   								+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Student's birthday : " + handle.getBirthday() 
   											+ "\n" +  "Student's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
        	    	 	}
        	    	 	
        	    	 	Iterator<Instructor> dpil = dpins.iterator();
    		 			while(dpil.hasNext()) {
				
    		 		Instructor h1 = dpil.next();
    		 		Instructor handle = h1 ;
    		 		System.out.println((ins.indexOf(handle)+1)+ "." + "Instructor --->" + "\n" + "Instructor academictitle : " + handle.getAcademictitle()
    		 			+ "\n" + "Name : " + handle.getName() + "\n" + "Surname : " + handle.getSurname() + "\n" + "Instructor's birthday : " + handle.getBirthday() 
								+ "\n" +  "Instructor's department : " + handle.getDepartment()+ "\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"       );
				
			             }
    		 			
    		 			Iterator<Courses> dpcl = dpcou.iterator();
        	  			while (dpcl.hasNext()){
					   Courses h1 = dpcl.next();
					   Courses handle = h1;
					   System.out.println((cou.indexOf(handle)+1)+ "." + "Course --->" + "\n" +"Course's name : " + handle.getName() + "\n"+ "Course's id :  " + handle.getId() 
																									+ "\n"+"Course's etcs" + handle.getEcts() +"\n"+ "&&&&&&&&&&&&&&&&&&&&&&&"    );
						
				}
			   
            	   
        break;
            	   
		
			}		
break;				
		   }	
		
		
		
		
		System.out.print("Do you want leave the program ? " + "\n" + " enter  1 for contine  or  2 for exit ");
		Scanner mainegecontrol = new Scanner(System.in);
		int qm = mainegecontrol.nextInt();
		if(qm==1 || qm == 2 ) {
		if ( qm==1 )
		{mainege = true;}
		else 
		{mainege=false;}}
		
		egestu =true ;
		egeins =true ;
		egecou =true ;
		}
	
	}
	
}

