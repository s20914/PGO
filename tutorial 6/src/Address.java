public class Address {

    public String createAddress(String country){
        return String.format("country: %s", country );
    }

    public String createAddress(String country, String city) {
        return String.format("country: %s, city: %s", country, city);
    }

    public String createAddress(String country, String city, int postalCode) {
        return String.format("country: %s, city: %s, postalCode: %d", country, city, postalCode);
    }

    public String createAddress(String country, String city, int postalCode, String street) {
        return String.format("country: %s, city: %s, postalCode: %d, street: %s", country, city, postalCode, street);
    }

    public String createAddress(String country, String city, int postalCode, String street, int apartment) {
        return String.format("country: %s, city: %s, postalCode: %d, street: %s, apartment: %d", country, city, postalCode, street, apartment);
    }
}
