public class Part1 {
	    static int calculateLength(int binary){
	        //calculateLength calculates the length of the binary using the parameter that gets passed to it
			int tempBinary = binary;
			int length = 0;
			while(tempBinary > 0){
		    tempBinary=tempBinary/10;
		    length +=1;
			}
			return length;
			}
			
		static void printDigitFirstRow(int digit){
		        if(digit == 1 || digit == 4){
		            System.out.print("   ");
		        }else {
		            System.out.print(" _ ");
		        }
		    }
		    static void printDigitSecondRow(int digit){
		        if(digit == 1 || digit == 7){
		            System.out.print("  |");
		        }else if(digit == 2 || digit == 3){
		            System.out.print(" _|");
		        }else if(digit == 5 || digit == 6){
		            System.out.print("|_ ");
		        }else if(digit == 0){
		            System.out.print("| |");
		        }else{
		            System.out.print("|_|");
		        }
		        
		    }
		    static void printDigitThirdRow(int digit){
		        if(digit == 1 || digit == 7 || digit == 4){
		            System.out.print("  |");
		        }else if(digit == 5 || digit == 3 || digit == 9){
		            System.out.print(" _|");
		        }else if(digit == 2){
		            System.out.print("|_ ");
		        }else{
		            System.out.print("|_|");
		        }
		    }
		    
		static void printBasedOnDigitAndRow(int digit, int rowIndex){
		        if(rowIndex == 0){
		            printDigitFirstRow(digit);
		            
		        }else if(rowIndex == 1){
		            printDigitSecondRow(digit);
		        }else if(rowIndex == 2){
		            printDigitThirdRow(digit);
		        }
		    }
		static int calculateDecimalFromBinaryPosition(int position){
		    //calculateDecimalFromBinaryPosition takes the position of the binary and calculates its value based on its position
		    // returns the value in decimal at this position
		    int sum = 2;
		    int tempPosition = position - 1;
		    
		    for(int i = 0 ; i<tempPosition ;i++){
		        sum = sum * 2;
		    }
		    return sum;
		}
		static boolean isBinaryOne(int binaryDigit){
		    //isBinaryOne decides if the binary digit entered is a one or a zero
		         if(binaryDigit % 2 == 0){
		              
		            return false;
		       }else{
		             
		            return true;
		    }
		    
		}
		
		static int binaryToDecimal(int binary){
		    //binaryToDecimal takes one parameter which is the binary number to be converted and returns an integer
		    int tempBinary = binary;
		    //we need the temporary binary to be able to change the number without changing the original binary
		    int decimal = 0;
		    int calculatedLength = calculateLength(binary);
		    
		    
		    if(isBinaryOne(tempBinary)){
		        decimal = decimal + 1;
		    }
		    // we always calculate the first digit of the binary individually 
		    tempBinary = tempBinary / 10;
		    calculatedLength = calculatedLength - 1;
		    
		    //we start from the second digit because the first is already calculated
		    for(int i = 1; i < calculatedLength + 1; i++){
		        
		        if(isBinaryOne(tempBinary)){
		            
		            decimal = decimal + calculateDecimalFromBinaryPosition(i);
		            // we add the value of the binary at a specific position and only add it if the value of the binary digit is 1
		        }
		        
		        tempBinary = tempBinary / 10;
		        // we divide by ten to get rid of one digit
		    }
		   return decimal;
		   
		}
		
		static void decimalToDigital(int decimal){
		     //decimalToDigital takes the decimal as a parameter and prints the numbers in digital format one row at a time and one digit at a time
			
		    int calculatedLength = calculateLength(decimal);
		    
		    int[] intArray = new int[calculatedLength];
		    int tempDecimal = decimal;
		    
		    
		    //this loop is to split the decimal to an array of integers
		    for(int i = 0; i<calculatedLength;i++){
		        intArray[i] = tempDecimal%10;
		        
		        tempDecimal = tempDecimal /10;
		        
		    }
		    
		    
		    for(int rowIndex = 0; rowIndex < 3; rowIndex++){
		        //iterarate once per row of printing
		       for(int i = calculatedLength -1 ; i>-1; i--){
		        //iterate for every digit in the row
		        
		        
		        printBasedOnDigitAndRow(intArray[i], rowIndex);
		        
		        } 
		        System.out.println("");
		    }
		    
		    
		}
		public static void main(String[] args) {
			int binary = 111111111;
			int decimal = binaryToDecimal(binary);
			System.out.println("The binary number is " + binary);
			System.out.println("The decimal number is " + decimal);
			decimalToDigital(decimal);
			}
}
