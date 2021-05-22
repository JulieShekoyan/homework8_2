package com.company;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int productNumber;

    public Store(int countOfWorkers, String name, String phoneNumber, int productNumber) {
        setCountOfWorkers(countOfWorkers);
        setName(name);
        setPhoneNumber(phoneNumber);
        setProductNumber(productNumber);
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers <= 50 && countOfWorkers >= 2) {
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("Please check count of workers ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Please check name ");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Please check phone number ");
        }
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void sell(int productNumber) {
        int newProductNumber = getProductNumber() - 1;
        setProductNumber(newProductNumber);
    }
}
