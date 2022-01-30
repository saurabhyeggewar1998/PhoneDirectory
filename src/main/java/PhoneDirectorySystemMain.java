import java.util.ArrayList;

public class PhoneDirectorySystemMain {
    public static void main(String[] args) {
        PhoneDirectorySystem phoneDirectorySystem = new PhoneDirectorySystem();
        PhoneDirectory phoneDirectory1 = new PhoneDirectory();
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Saurabh", "Yeggewar", "BhangramTalodhi", "Chandrapur",
                        "Maharastra", 412375, "yeggewar@gmail.com"),
                new ContactDetails("462747", "7058888888"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Swapnil", "Yeggewar", "BhangaramTalodhi", "Chandrapur",
                        "Maharastra", 423475, "rabbu@gmail.com"),
                new ContactDetails("462747", "7898888888"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Aditya", "Kumar", "Nagpur", "Nagpur",
                        "Maharastra", 132375, "aditya@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        PhoneDirectory phoneDirectory2 = new PhoneDirectory();
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Saurabh", "Yeggewar", "BhangramTalodhi", "Chandrapur",
                        "Maharastra", 412375, "yeggewar@gmail.com"),
                new ContactDetails("462747", "7058888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Swapnil", "Yeggewar", "BhangramTalodhi", "Chandrapur",
                        "Maharastra", 423475, "rabbu@gmail.com"),
                new ContactDetails("462747", "7898888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Aditya", "Kumar", "Nagpur", "Nagpur",
                        "Maharastra", 132375, "aditya@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        ArrayList<PhoneDirectory> phoneDirectories = new ArrayList<>();
        phoneDirectories.add(phoneDirectory1);
        phoneDirectories.add(phoneDirectory2);

        phoneDirectorySystem.addPhoneDirectories(phoneDirectories);
        phoneDirectorySystem.getPhoneDirectoryList();
    }
}