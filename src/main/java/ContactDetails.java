import java.util.Objects;

public class ContactDetails {
    private String landLinePhoneNumber;
    private String mobilePhoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(landLinePhoneNumber, that.landLinePhoneNumber) && Objects.equals(mobilePhoneNumber, that.mobilePhoneNumber);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public ContactDetails(String landLinePhoneNumber, String mobilePhoneNumber) {
        this.landLinePhoneNumber = landLinePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getLandLinePhoneNumber() {
        return landLinePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "landLinePhoneNumber='" + landLinePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                '}';
    }
}