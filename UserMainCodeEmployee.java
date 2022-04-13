package aprilthirteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class UserMainCodeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       String s[] = new String[n];
	       String ss = "01-09-2014";
	       StringTokenizer st = new StringTokenizer(ss, "-");
	       int ds=0,ms=0,ys=0;
	       while(st.hasMoreTokens())
	       {
	    	   ds=Integer.parseInt(st.nextToken());
	    	   ms=Integer.parseInt(st.nextToken());
	    	   ys=Integer.parseInt(st.nextToken());
	    	   
	       }
	       int ids[]=new int[n];
	       HashMap<Integer, String>h1=new HashMap<Integer, String>();
	       HashMap<Integer, Integer>h2=new HashMap<Integer, Integer>();
	       TreeMap<Integer, Integer>t1=new TreeMap<Integer, Integer>();
	       for(int i=0; i<n; i++)
	       {
	    	   int id = sc.nextInt();
	    	   ids[i]=id;
	    	   s[i]=sc.next();
	    	   int sal = sc.nextInt();
	    	   h1.put(id, s[i]);
	    	   h2.put(id,sal);
	    	   
	    	   
	       }
	       int d=0,y=0,m=0,sals=0;
	       for(int i=0; i<s.length; i++)
	       {
	    	  StringTokenizer st1 = new StringTokenizer(s[i], "-"); 
	    	  while(st1.hasMoreTokens())
	    	  {
	    		  d = Integer.parseInt(st1.nextToken());
	    		  m = Integer.parseInt(st1.nextToken());
	    		  y = Integer.parseInt(st1.nextToken());
	    	  }
	    	/*  public static int calculateRevisedSalary()
	    	  {
	    		  
	    	  }*/
	    	  int age = 0;
	    	  if((d<ds || m<ms) && y==ys)
	    	  {
	    		  age=(ys-y)-1;
	    	  }
	    	  else {
	    		  age = ys-y;
	    	  }
	    	 if(age>25 && age<=30)
	    	  {
	    		  sals = h2.get(ids[i]);
	    		  sals = sals+sals/5;
	    	  }
	    	  else if(age>30 && age<=60)
	    	  {
	    		  sals = h2.get(ids[i]);
	    		  sals = sals+((sals*3)/10);
	    	  }
	    	  
	    	  t1.put(ids[i], sals);

	       }
	       for(Map.Entry<Integer,Integer> e:t1.entrySet())
	       {
	    	   System.out.println(e.getKey()+"\n"+e.getValue());
	       }
	    	 
		}

	
	}


