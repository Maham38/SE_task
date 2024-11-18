
package com.mycompany.main2;

public class Staff extends User {
    private int staffId;

    public Staff(int staffId, String name, String email, int phone) {
        super(name, email, phone);
        this.staffId = staffId;
    }

    public int getStaffId() { 
        return staffId; 
    }
    public void setStaffId(int staffId) { 
        this.staffId = staffId; 
    }
}
