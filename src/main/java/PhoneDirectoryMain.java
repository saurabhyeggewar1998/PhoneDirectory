
public class PhoneDirectoryMain {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addMemberInformation(
                new PersonDetails("Saurabh", "Yeggewar", "BhangramTalodhi", "Chandrapur",
                        "Maharastra", 412375, "yeggewar@gmail.com"),
                new ContactDetails("462747", "7058888888"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Swapnil", "Yeggewar", "BhangramTalodhi", "Chandrapur",
                        "Maharastra", 423475, "rabbu@gmail.com"),
                new ContactDetails("462747", "7898888888"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Aditya", "Kumar", "Nagpur", "Nagpur",
                        "Maharastra", 132375, "aditya@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Priya", "Badge", "Ballarsha", "Nagpur",
                        "Maharastra", 674375, "priya@gmail.com"),
                new ContactDetails("876546", "8674527584"));
        System.out.println();
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "7058888888"));
        phoneDirectory.editPersonDetails(new ContactDetails("462747", "7058888888"), "addresscity", "Mumbai");
        //To check if person details got edited
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "8888888888"));
        phoneDirectory.deletePersonDetails(new ContactDetails("462747", "8888888888"));
        //To check if person details got deleted
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "8888888888"));
        //Get all Person Details
        phoneDirectory.displayAllPersonDetails();
    }
}