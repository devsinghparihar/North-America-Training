package com.dsp.assignments;

import java.util.*;
import java.util.Map.Entry;

public class Assignment1 {
	public static void que1(String a, String b) {
		StringBuilder sb = new StringBuilder();

		for (int i = a.length() - 1; i >= 0; i--) {

			sb.append(a.charAt(i));
		}
		if (b.equals(sb.toString())) {
			System.out.println("reverse true ");
		} else
			System.out.println("reverse false");

	}

	public static void que2(int[] arr) {
		int currentSum = arr[0];
		int smallestSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.min(arr[i], currentSum + arr[i]);
			smallestSum = Math.min(smallestSum, currentSum);
		}
		System.out.println("smallest sum: " + smallestSum);

	}

	public static void que3(int a, int b) {
		int power = 1;
		for (int i = 1; i <= b; i++) {
			power *= a;

		}
		System.out.println(power);

	}

	public static void que4(String a) {

	}

	public static void que5(String dsp) {
		for (int i = 0; i < dsp.length(); i++) {
			if (dsp.indexOf(dsp.charAt(i)) != dsp.lastIndexOf(dsp.charAt(i))) {
				continue;
			} else
				System.out.print(dsp.charAt(i) + ", ");

		}

	}

	public static void que6(String dsp) {
		System.out.println("\n");
		for (int i = 0; i < dsp.length(); i++) {
			if (dsp.indexOf(dsp.charAt(i)) != dsp.lastIndexOf(dsp.charAt(i))) {
				System.out.print(dsp.charAt(i) + ", ");
			}

		}

	}

	public static void que7(String a, char b) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b) {
				count++;

			}

		}
		System.out.println("character: " + b + " occured: " + count + " times.");
	}

	public static void que8(String a) {
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				vowelCount++;
			} else
				consonantCount++;
		}
		System.out.println("Vowel count in " + a + " is " + vowelCount + " and consonant count is " + consonantCount);

	}

	public static void que9(String a) {
		int convertedNumber = Integer.parseInt(a);

		System.out.println("String representation: " + a);
		System.out.println("Converted integer: " + convertedNumber);

	}

	public static void que10() {

		int a = 5;
		int b = 5;
		System.out.println("Using == with primitive types: " + (a == b));

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("Using == with object references: " + (str1 == str2));
		System.out.println(".equals() with object references: " + str1.equals(str2));

	}

	public static void que11(String firstString, String secondString) {
		StringBuilder result = new StringBuilder();

		for (char c : firstString.toCharArray()) {
			if (secondString.indexOf(c) == -1) {
				result.append(c);
			}
		}
		System.out.println(result.toString());

	}

	public static void que12(String a) {

	}

	public static void que13(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("not anagram");
		}

		// Convert the strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare the sorted character arrays
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Anagram");
		} else
			System.out.println("not anagram");

	}

	public static void que14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
		System.out.println("\n");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			arr[i] = temp;
		}
		Arrays.sort(arr);
		for (String v : arr) {
			System.out.print(v);
		}

	}

	public static void que15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
		System.out.println("\n");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		Arrays.sort(arr);
		for (int v : arr) {
			System.out.print(v);
		}
	}

	public static void que16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
		System.out.println("\n");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		int sum = 0;
		for(int i: arr) {
			sum +=i;
		}
		System.out.println("Average is : "+sum/n);
	}

	public static void que17() {
		int evenSum =0;
		int oddSum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
	
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		for(int i : arr) {
			if(i % 2 ==0) {
				evenSum+=i;
			}
			else oddSum+=i;
		}
		System.out.println("Sum of even no: "+evenSum);
		System.out.println("Sum of odd no: "+oddSum);
		
	}

	public static void que18(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 65 || a.charAt(i) == 97) {
				count++;
			}
		}

		System.out.println("a occured is: "+count+" times");
	}

	public static void que19(int year) {
		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	public static void que20(int[] arr) {
		int[] array = bubbleSort(arr);
		System.out.println("Smallest in array : "+array[0]+" ,Largest in array is: "+array[array.length-1]);
	}

	public static void que21(int[] array) {
		System.out.println("\n");
		Map<Integer, Integer> map = new HashMap<>();

		for (int a : array) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.print(m.getKey()+", ");
			}
		}
	}

	public static void que22(int[] array) {
		int[] arr = bubbleSort(array);
		
		System.out.println("\n Second largest in array is : "+arr[array.length-2]);
	}

	public static void que46(int[] array, int num) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == num) {

					System.out.println("the pairs " + i + " " + j + " having " + array[i] + " " + array[j]
							+ " have the sum " + num);

				}

			}

		}
	}
	public static void que24(int[] arr) {
		System.out.println("Even numbers is :");
		for(int i: arr) {
			if(i%2==0) {
				System.out.println(i+",");
			}
		}
		System.out.println("Even numbers is :");
		for(int i: arr) {
			if(i%2!=0) {
				System.out.println(i+",");
			}
		}
	}
	
	public static void que25(int[] arr, int[] arr2) {
		

		
		
	}
	public static void que41(int numRows) {
		  for (int i = 1; i <= numRows; i++) {
	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            
	            System.out.println();
	        }
	}
	public static void que43() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        Random random = new Random();
        int randomWeekdayNumber = random.nextInt(7) + 1;
		
		switch (randomWeekdayNumber) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
        	System.out.println("Monday");
            break;
        case 3:
        	System.out.println("Tuesday");
            break;
        case 4:
        	System.out.println("Wednesday");
            break;
        case 5:
        	System.out.println("Thursday");
            break;
        case 6:
        	System.out.println("friday");
            break;
        case 7:
        	System.out.println("Saturday");
            break;
        default:
            System.out.println( "Invalid weekday number");
    }
		
	}
	public static void que44(int[] array1, int[] array2) {
		Arrays.sort(array1);
        Arrays.sort(array2);
        	boolean flag = false;
        // Compare elements of both arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                flag = false;
                break;
            }
            else flag = true;
        }
        if(flag) System.out.println("both array are same");
        else System.out.println("both are different");
        

        
	}
	public static void que45(int[] array) {
		Random random = new Random();
		System.out.println("");
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

         
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for(int i = 0; i<array.length; i++) {
        	System.out.print(array[i]+",");
        }
        System.out.println("");
	}
//	public static void que46() {}
	public static void que47(String inputString, int n) {
		int length = inputString.length();
        

        int partSize = length / n;
        String[] parts = new String[n];
        int index = 0;

        for (int i = 0; i < length; i += partSize) {
            parts[index] = inputString.substring(i, i + partSize);
            index++;
        }
        System.out.println("The string divided into " + n + " equal parts:");
        for (String part : parts) {
            System.out.println(part);
        }

	}
	public static void que48(String a ) {
		Set<Character> ss = new LinkedHashSet<Character>();
		for(int i = 0; i<a.length(); i++) {
			if(a.indexOf(a.charAt(i)) != a.lastIndexOf(a.charAt(i))) {
				ss.add(a.charAt(i));
			}
		}
		System.out.println(ss);
	}
	
	public static void que49(String mainString, String checkString) {
		 boolean startsWithContents = mainString.startsWith(checkString);

	        if (startsWithContents) {
	            System.out.println("The main string starts with the contents of the given string.");
	        } else {
	            System.out.println("The main string does not start with the contents of the given string.");
	        }
	}
	public static void que52(int height) {
		int currentNum = 1;
        for (int i = 1; i <= height; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

        
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
            }

            System.out.println();
        }
	}
	static int[] bubbleSort(int[] arr) {
//		System.out.println("Before sorting-");
//		for(int value : arr) {
//			
//			System.out.print(value+" ");
//		}
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j< n-i -1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
//		System.out.println("After sorting-");
//		for(int value : arr) {
//			
//			System.out.print(value+" ");
//		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check Two String which are reverse of each other or not.
		que1("dsp", "psd");
//		2. Find the Smallest Sum of consecutive Number from given Array.
		int[] arr = { 1, 2, 3, 1, 1, 1, 3, 4 };
		que2(arr);
//		3. Find the Power without using math.pow function.
		que3(3, 3);
//		4. Find the negative Power without using math.pow function.Reverse the String with and without
//		recursion
//		5. Find the unique Character in the String
		que5("Devv singh parihar");

//		6. Print the repeated characters in a String
		que6("devv");
//		7. How many times a particular character is repeated in a string
		que7("Hello", 'l');
//		8. Count the no of vowels and constants in a string
		que8("Capgemini");
//		9. Convert a String into integer?
		que9("1234");
//		10. Write a program to find the difference between equals and ==
		que10();
//		11. How to remove characters from the first String which are present in the second String?
		que11("Capgemini", "mini");
//		12. How to print all permutation of a String?
//		13. Check whether the string is Anagram or not?
		que13("care", "ware");
//		14. WAP to read name (program) and print letters in ascending order (agmoprr)
//			que14();
//		15. WAP to read a number (28156437) and it should print digits order wise(12345678)
//			que15();
//		16. Take 10 integers from keyboard using loop and print their average value on the screen.
//		que16();
//		17. Write a program that reads a set of integers, and then prints the sum of the even and odd
//		integers.
//		que17();
//		18. Determine and print the number of times the character ‘a’ appears in the input entered by the
//		user.
		que18("Capgeminiisagoodcompany");
//		19. Java program to check leap year
		que19(2001);
//		20. Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
		que20(arr);
//		21. Printing only not-repeated digits in the array.
		que21(arr);
//		22. Printing Second largest no. in the array.
		que22(arr);
//		23. Sorting the array without using built in sort methods. 4. Copy all the elements from one array to
//		another array.
		int sortedArray[] = bubbleSort(arr);
		for(int v: sortedArray) {
			System.out.print(v+",");
		}
		
//		24. Printing Odd and Even no. from the array.
		que24(arr);
//		25. Merging 2 array into one array.
		que25(arr, arr);
//		26. Finding Prime Factors of a number
//		27. Find Prime number within a given range or between two numbers.
//		28. Find Strong number
//		29. Find Perfect number
//		30. Check Armstrong number.
//		31. Armstrong number in given range.
//		32. Calculate the number of digits in an integer.
//		33. Find Smallest and largest number from Array.
//		34. Find Number of even and odd elements from Array.
//		35. Rotation of elements of array-left and right.
//		36. Find length of string without using function.
//		37. Remove Spaces from string.
//		38. Check if given string is Palindrome or not.
//		39. Capitalize the first and last character of each word of String.
//		40. Find a greatest pair from Array.
//		41. Write a program in Java to display the pattern like right angle triangle with a number.
		que41(10);
//		42. Write a Java program to check whether the first two characters present at the end
//		of a given string.
//		43. Write a Java program that keeps a number from the user and generates an integer between 1
//		and 7 and displays the name of the weekday.
//		que43();
//		44. Write a Java program that checks if 2 array contains the same element.
		que44(arr,arr);
//		45. How do you shuffle an array in Java.
		que45(arr);
//		46. Find the array pairs whose sum is equal to the given number.
//		que46(arr, 4);
//		47. Write a Java program to divide a string in n equal parts.
		que47("capgis", 2);
//		48. Write a Java program to count and print all the duplicates in the input string.
		que48("devsinghparihar");
//		49. Write a Java program to check whether a given string starts with the contents of another string.
		que49("dsp", "dfdspsingh");
//		50. WAP to print Diamond pattern.
//		51. WAP to print Pyramid of Character.
//		52. WAP to print Pyramid of Number
		que52(6);

	}

}
