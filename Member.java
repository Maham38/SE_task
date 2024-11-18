
package com.mycompany.main2;


class Member extends User {
    private int memberId;

    public Member(int memberId, String name, String email, int phone) {
        super(name, email, phone);
        this.memberId = memberId;
    }
    public int getMemberId() { 
        return memberId; 
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId; 
    }
}
