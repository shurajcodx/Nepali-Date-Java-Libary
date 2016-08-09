/*
 * Copyright (c) 2016, Shuraj Shampang. All rights reserved.
 * Shuraj PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.shuraj.nepalidate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NepaliDate {
	private int[][] bikramSambat ={
			{2000,30,32,31,32,31,30,30,30,29,30,29,31},
			{2001,31,31,32,31,31,31,30,29,30,29,30,30},
			{2002,31,31,32,32,31,30,30,29,30,29,30,30},
			{2003,31,32,31,32,31,30,30,30,29,29,30,31},
			{2004,30,32,31,32,31,30,30,30,29,30,29,31},
			{2005,31,31,32,31,31,31,30,29,30,29,30,30},
			{2006,31,31,32,32,31,30,30,29,30,29,30,30},
			{2007,31,32,31,32,31,30,30,30,29,29,30,31},
			{2008,31,31,31,32,31,31,29,30,30,29,29,31},
			{2009,31,31,32,31,31,31,30,29,30,29,30,30},
			{2010,31,31,32,32,31,30,30,29,30,29,30,30},
			{2011,31,32,31,32,31,30,30,30,29,29,30,31},
			{2012,31,31,31,32,31,31,29,30,30,29,30,30},
			{2013,31,31,32,31,31,31,30,29,30,29,30,30},
			{2014,31,31,32,32,31,30,30,29,30,29,30,30},
			{2015,31,32,31,32,31,30,30,30,29,29,30,31},
			{2016,31,31,31,32,31,31,29,30,30,29,30,30},
			{2017,31,31,32,31,31,31,30,29,30,29,30,30},
			{2018,31,32,31,32,31,30,30,29,30,29,30,30},
			{2019,31,32,31,32,31,30,30,30,29,30,29,31},
			{2020,31,31,31,32,31,31,30,29,30,29,30,30},
			{2021,31,31,32,31,31,31,30,29,30,29,30,30},
			{2022,31,32,31,32,31,30,30,30,29,29,30,30},
			{2023,31,32,31,32,31,30,30,30,29,30,29,31},
			{2024,31,31,31,32,31,31,30,29,30,29,30,30},
			{2025,31,31,32,31,31,31,30,29,30,29,30,30},
			{2026,31,32,31,32,31,30,30,30,29,29,30,31},
			{2027,30,32,31,32,31,30,30,30,29,30,29,31},
			{2028,31,31,32,31,31,31,30,29,30,29,30,30},
			{2029,31,31,32,31,32,30,30,29,30,29,30,30},
			{2030,31,32,31,32,31,30,30,30,29,29,30,31},
			{2031,30,32,31,32,31,30,30,30,29,30,29,31},
			{2032,31,31,32,31,31,31,30,29,30,29,30,30},
			{2033,31,31,32,32,31,30,30,29,30,29,30,30},
			{2034,31,32,31,32,31,30,30,30,29,29,30,31}, 
			{2035,30,32,31,32,31,31,29,30,30,29,29,31},
			{2036,31,31,32,31,31,31,30,29,30,29,30,30},
			{2037,31,31,32,32,31,30,30,29,30,29,30,30},
			{2038,31,32,31,32,31,30,30,30,29,29,30,31},
			{2039,31,31,31,32,31,31,29,30,30,29,30,30},
			{2040,31,31,32,31,31,31,30,29,30,29,30,30},
			{2041,31,31,32,32,31,30,30,29,30,29,30,30},
			{2042,31,32,31,32,31,30,30,30,29,29,30,31},
			{2043,31,31,31,32,31,31,29,30,30,29,30,30},
			{2044,31,31,32,31,31,31,30,29,30,29,30,30},
			{2045,31,32,31,32,31,30,30,29,30,29,30,30},
			{2046,31,32,31,32,31,30,30,30,29,29,30,31},
			{2047,31,31,31,32,31,31,30,29,30,29,30,30},
			{2048,31,31,32,31,31,31,30,29,30,29,30,30},
			{2049,31,32,31,32,31,30,30,30,29,29,30,30},
			{2050,31,32,31,32,31,30,30,30,29,30,29,31},
			{2051,31,31,31,32,31,31,30,29,30,29,30,30},
			{2052,31,31,32,31,31,31,30,29,30,29,30,30},
			{2053,31,32,31,32,31,30,30,30,29,29,30,30},
			{2054,31,32,31,32,31,30,30,30,29,30,29,31},
			{2055,31,31,32,31,31,31,30,29,30,29,30,30},
			{2056,31,31,32,31,32,30,30,29,30,29,30,30},
			{2057,31,32,31,32,31,30,30,30,29,29,30,31},
			{2058,30,32,31,32,31,30,30,30,29,30,29,31},
			{2059,31,31,32,31,31,31,30,29,30,29,30,30},
			{2060,31,31,32,32,31,30,30,29,30,29,30,30},
			{2061,31,32,31,32,31,30,30,30,29,29,30,31},
		    {2062,30,32,31,32,31,31,29,30,29,30,29,31},
			{2063,31,31,32,31,31,31,30,29,30,29,30,30},
			{2064,31,31,32,32,31,30,30,29,30,29,30,30},
			{2065,31,32,31,32,31,30,30,30,29,29,30,31},
			{2066,31,31,31,32,31,31,29,30,30,29,29,31},
			{2067,31,31,32,31,31,31,30,29,30,29,30,30},
			{2068,31,31,32,32,31,30,30,29,30,29,30,30},
			{2069,31,32,31,32,31,30,30,30,29,29,30,31},
			{2070,31,31,31,32,31,31,29,30,30,29,30,30},
			{2071,31,31,32,31,31,31,30,29,30,29,30,30},
			{2072,31,32,31,32,31,30,30,29,30,29,30,30},
			{2073,31,32,31,32,31,30,30,30,29,29,30,31},
			{2074,31,31,31,32,31,31,30,29,30,29,30,30},
			{2075,31,31,32,31,31,31,30,29,30,29,30,30},
			{2076,31,32,31,32,31,30,30,30,29,29,30,30},
			{2077,31,32,31,32,31,30,30,30,29,30,29,31},
			{2078,31,31,31,32,31,31,30,29,30,29,30,30},
			{2079,31,31,32,31,31,31,30,29,30,29,30,30},
			{2080,31,32,31,32,31,30,30,30,29,29,30,30},
			{2081, 31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30},
			{2082, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30},
			{2083, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30},
			{2084, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30},
			{2085, 31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30},
			{2086, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30},
			{2087, 31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30},
			{2088, 30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30},
			{2089, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30},
			{2090, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30}
	};
	private String debugInfo = "";
	private int month;
	private int day;
	private int year;
	private int dayOfWeek;
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	public String toString(){
		int day = this.getDay();
		int month =this.getMonth();
		int year = this.getYear();
		int dayOfMonth = this.getDayOfWeek();
		String dayName = this.getDayOfWeekString(dayOfMonth);
		String monthName = this.getNepaliMonthString(month);
		return dayName+" "+monthName+" "+day+" "+year;
	}
	

	
	/*
	 * For converting English date to Nepali Date , We need First check Leap Year
	 * this Method Check leap year
	 */
	@Deprecated
	public boolean isLeapYear(int year)
		{
			int a = year;
			if (a%100==0)
			{
			 if(a%400==0)
			 {
				return true;
			 } else {
			 	return false;
			 }
				
			} else { 
				if (a%4==0)
				{
					return true;
				} else {
					return false;
				}
			}
		}
	
	
	//This Method is used for Getting Month in Nepali
	@Deprecated
	private String getNepaliMonthString(int m){
		String n_month = "";
		
		switch(m){
			case 1:
				n_month = "Baishak";
				break;
				
			case 2:
				n_month = "Jestha";
				break;
				
			case 3:
				n_month = "Ashad";
				break;
				
			case 4:
				n_month = "Shrawn";
				break;
				
			case 5:
				n_month = "Bhadra";
				break;
			
			case 6:
				n_month = "Ashwin";
				break;
			
			case 7:
				n_month = "kartik";
				break;
			
			case 8:
				n_month = "Mangshir";
				break;
			
			case 9:
				n_month = "Poush";
				break;
			
			case 10:
				n_month = "Magh";
				break;
			
			case 11:
				n_month = "Falgun";
				break;
			
			case 12:
				n_month = "Chaitra";
				break;
		}	
		return  n_month;
	}
	
	//This Method is used to display  Day in Nepali
	private String getDayOfWeekString(int eday){	
		String day="";
		switch(eday){
			case 1:
				day = "Sunday";
				break;
				
			case 2:
				day = "Monday";
				break;
				
			case 3:
				day = "Tuesday";
				break;
			
			case 4:
				day = "Wednesday";
				break;
			
			case 5:
				day = "Thursday";
				break;
			
			case 6:
				day = "Friday";
				break;
			
			case 7:
				day = "Saturday";
				break;
		}
		return day;
	}
	
	//This Method is Check Range of English Date, Checking Valid or not
	private boolean isRangeEnglish(int yy, int mm, int dd){
		if( yy<1944 ||  yy>2033){
			this.debugInfo = "Supported only between 1944-2022";
			return false;
		}
			
		if(mm<1 || mm >12){
			this.debugInfo = "Error! value 1-12 only";
			return false;
		}
			
		if(dd<1 || dd >31){
			this.debugInfo = "Error! value 1-31 only";			
			return false;
		}	
		
		return true;
	}
	
	
	public NepaliDate(){
		int year =this.ADyear();
		int month = this.ADMonth();
		int eday = this.ADDay();
		if (this.isRangeEnglish(year, month, eday) == false){
			System.out.println("Please Check your Range");
		} else {			
		 	int[] montharray = {31,28,31,30,31,30,31,31,30,31,30,31};
		 	int[] lmonth = {31,29,31,30,31,30,31,31,30,31,30,31};
			
			int def_eyy = 1944;									//spear head english date...
			int def_nyy = 2000; int def_nmm = 9; int def_ndd = 17-1;		//spear head nepali date...
			int total_eDays=0; int total_nDays=0; int a=0; int day=7-1;		//all the initializations...
			int m = 0; int y = 0; int i =0; int j = 0;
			int numDay=0;
			
			// count total no. of days in-terms of year
			for(i=0; i<(year-def_eyy); i++){	//total days for month calculation...(english)
				if(this.isLeapYear(def_eyy+i)==true)
					for(j=0; j<12; j++)
						total_eDays += lmonth[j];
				else
					for(j=0; j<12; j++)
						total_eDays += montharray[j];
			}
			
			// count total no. of days in-terms of month					
			for(i=0; i<(month-1); i++){		
				if(this.isLeapYear(year)==true)
					total_eDays += lmonth[i];
				else
					total_eDays += montharray[i];
			}
			
			// count total no. of days in-terms of date
			total_eDays += eday;
			
			
			i = 0; j = def_nmm;					
			total_nDays = def_ndd;
			m = def_nmm;
			y = def_nyy;
			
			// count nepali date from array
			while(total_eDays != 0) {
		        a = this.bikramSambat[i][j];
				total_nDays++;						//count the days
				day++;								//count the days interms of 7 days
				if(total_nDays > a){
					m++;
					total_nDays=1;
					j++;
				}
				if(day > 7)
					day = 1;
				if(m > 12){
					y++;
					m = 1;
				}
			    if(j > 12){
					j = 1; i++;
				}
				total_eDays--;
			}
			
			numDay=day;
			
			this.setMonth(m);
			this.setDay(total_nDays);
			this.setDayOfWeek(day);
			this.setYear(y);
		}
	}
	
	
	//Date Convert by User in Nepali
	public void setNepaliDateConvertor(int year,int month,int eday ){
		if (this.isRangeEnglish(year, month, eday) == false){
			System.out.println("Please Check your Range");
		} else {			
		 	int[] montharray = {31,28,31,30,31,30,31,31,30,31,30,31};
		 	int[] lmonth = {31,29,31,30,31,30,31,31,30,31,30,31};
			
			int def_eyy = 1944;									//spear head english date...
			int def_nyy = 2000; int def_nmm = 9; int def_ndd = 17-1;		//spear head nepali date...
			int total_eDays=0; int total_nDays=0; int a=0; int day=7-1;		//all the initializations...
			int m = 0; int y = 0; int i =0; int j = 0;
			int numDay=0;
			
			// count total no. of days in-terms of year
			for(i=0; i<(year-def_eyy); i++){	//total days for month calculation...(english)
				if(this.isLeapYear(def_eyy+i)==true)
					for(j=0; j<12; j++)
						total_eDays += lmonth[j];
				else
					for(j=0; j<12; j++)
						total_eDays += montharray[j];
			}
			
			// count total no. of days in-terms of month					
			for(i=0; i<(month-1); i++){		
				if(this.isLeapYear(year)==true)
					total_eDays += lmonth[i];
				else
					total_eDays += montharray[i];
			}
			
			// count total no. of days in-terms of date
			total_eDays += eday;
			
			
			i = 0; j = def_nmm;					
			total_nDays = def_ndd;
			m = def_nmm;
			y = def_nyy;
			
			// count nepali date from array
			while(total_eDays != 0) {
		        a = this.bikramSambat[i][j];
				total_nDays++;						//count the days
				day++;								//count the days interms of 7 days
				if(total_nDays > a){
					m++;
					total_nDays=1;
					j++;
				}
				if(day > 7)
					day = 1;
				if(m > 12){
					y++;
					m = 1;
				}
			    if(j > 12){
					j = 1; i++;
				}
				total_eDays--;
			}
			
			numDay=day;
			
			this.setMonth(m);
			this.setDay(total_nDays);
			this.setDayOfWeek(day);
			this.setYear(y);
		}
	}
	
	public String getNepaliDateConvertor(){
		int day = this.getDay();
		int month =this.getMonth();
		int year = this.getYear();
		int dayOfMonth = this.getDayOfWeek();
		String dayName = this.getDayOfWeekString(dayOfMonth);
		String monthName = this.getNepaliMonthString(month);
		return dayName+" "+monthName+" "+day+" "+year;
	}
	//Getting System Date For Finding Nepali Date
	private int ADyear(){
		Date date = new Date();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		int year1 = Integer.parseInt(year.format(date));
		return year1;
	}
	private int ADDay(){
		Date date = new Date();
		SimpleDateFormat day = new SimpleDateFormat("dd");
		int day1 = Integer.parseInt(day.format(date));
		return day1;
	}
	private  int ADMonth(){
		Date date = new Date();
		SimpleDateFormat month = new SimpleDateFormat("MM");
		int month1 = Integer.parseInt(month.format(date));
		return month1;
	}
}


