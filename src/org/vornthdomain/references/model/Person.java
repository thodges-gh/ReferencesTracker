package org.vornthdomain.references.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by vornth on 7/12/15.
 */
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty address;
    private final StringProperty phone;
    private final StringProperty email;
    private final StringProperty relation;

    public Person() {
        this(null, null);
    }

    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        // dummy data
        this.address = new SimpleStringProperty("123 Any Street, Any City, TX");
        this.phone = new SimpleStringProperty("(555) 555-5555");
        this.email = new SimpleStringProperty("yourname@gmail.com");
        this.relation = new SimpleStringProperty("Coworker from Any Job");
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getRelation() {
        return relation.get();
    }

    public StringProperty relationProperty() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation.set(relation);
    }
}
