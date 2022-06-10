package com.priya.java;

public class Factory {

		
		public static void main(String args[])
		{
			
			try {
				FourWheeler fw = new FourWheeler("MARUTI", 1300, 5, 1000);
				System.out.println(fw);	
				
			}catch(VehicleException ae){
				System.out.println(ae);
			}catch(UnsafetyException ae){
				System.out.println(ae);
			}
			try {
							
				FourWheeler fw1 = new FourWheeler("Honda", 800, 0, 1100);
				System.out.println(fw1);
			}catch(VehicleException ae){
				System.out.println(ae);
			}catch(UnsafetyException ae){
				System.out.println(ae);
			}
			try {
				
				FourWheeler fw2 = new FourWheeler("BMW", 5000, 0, 1200);
				System.out.println(fw2);
			}catch(VehicleException ae){
				System.out.println(ae);
			}catch(UnsafetyException ae){
				System.out.println(ae);
			}
			try {
				
				FourWheeler fw3 = new FourWheeler("SUZUKI", 1200, 5, 1300);
				System.out.println(fw3);
			}catch(VehicleException ae){
				System.out.println(ae);
			}catch(UnsafetyException ae){
				System.out.println(ae);
			}
		}

	}


