package Q_04;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

public class Bicycle {
    private Owner owner;

    public Bicycle() {
        owner = new Owner("Unknown", "0000000000");
    }

    public Bicycle(String name, String phone) {
        owner = new Owner(name, phone);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Ishadi", "0771780683");
        System.out.println("Owner: " + bike.getOwner().getOwnerName());
        System.out.println("Phone: " + bike.getOwner().getPhoneNo());
    }
}
