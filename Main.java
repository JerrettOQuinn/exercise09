package com.oquinn;

abstract class Contact {
    abstract void contact();
}

class Emails extends Contact {
    private String x;
    Emails(String emails) {
        x = emails;
    }
    void contact() {
        System.out.println("Sending email to " + x);
    }
}

class PhoneNumbers extends Contact {
    private String x;
    PhoneNumbers(String numbers) {
        x = numbers;
    }
    void contact() {
        System.out.println("Calling" + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Contact person1 = new Emails("fakeperson@gmail.com");
        Contact person2 = new PhoneNumbers("614-123-4567");
        person1.contact();
        person2.contact();
    }
}
