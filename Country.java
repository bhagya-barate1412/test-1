package com.priya.java;
import java.util.ArrayList;
public class Country {


	



		public static void main(String[] args) {

			Countries countries = new Countries();

			ArrayList<String> indianStates = new ArrayList<>();
			indianStates.add("Maharashtra");
			indianStates.add("Karnatka");
			indianStates.add("Panjab");

			ArrayList<String> usStates = new ArrayList<>();
			usStates.add("California");
			usStates.add("Texas");
			usStates.add("Florida");

			countries.listingCountry("India", indianStates);
			countries.listingCountry("US", usStates);

			System.out.println("Calling getCountry Method with Valid Country");
			System.out.println(countries.getCountry("India"));

			System.out.println("\nCalling getCountry Method with Invalid Country");
			System.out.println(countries.getCountry("Srilanka"));

			System.out.println("\nCalling listCountryBefore Method with Country India");
			countries.listCountryBefore("India");

			System.out.println("\nCalling listCountryAfter Method with Country US");
			countries.listCountryAfter("US");

		}
	}

