/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    // Create the first DACArecipient object using setters
    DACArecipient person1 = new DACArecipient();
    person1.setSurname("Mendez");
    person1.setGivenName("Javier");
    person1.setUscisNumber(563445);
    person1.setCountryOfOrigin("Venezuela");
    person1.setBirthday(2451564);
    person1.setValidFromDate(3956753);
    person1.setExpirationDate(3956840);
    person1.setSex('M');
    
    // Create the second DACArecipient object using setAll method
    DACArecipient person2 = new DACArecipient();
    person2.setAll("Gomez", "Maria", 123456, "Mexico", 2451575, 3956800, 3956899, 'F');

    DACArecipient person3 = person2;

    System.out.println(person2.equals(person3));
    System.out.println(person2.equals(person1));
  
    System.out.println(person1.printCard());
    System.out.println(person2.printCard());
  }
}