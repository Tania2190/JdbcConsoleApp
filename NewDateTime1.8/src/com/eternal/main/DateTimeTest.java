package com.eternal.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateTimeTest {

	public static void main(String[] args) {

		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		LocalDate justNow = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate oneDay = LocalDate.parse("1989/06/25", format);
		Period period = Period.between(oneDay, justNow);
		System.out.println(period);
		
		
		
		
		Stream<Integer> sum = Stream.iterate(0, n-> n+1).limit(5);
		System.out.println(sum.getClass().getName());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(10);
		
		List<Integer> slist=al.stream().filter(i -> !(i%2==0)).collect(Collectors.toList());
		slist.forEach(System.out::println);
		
	}

}
