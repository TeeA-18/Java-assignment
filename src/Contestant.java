/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Contestant {
    private String contestantName;
    private String contestantID;
    private String email;
    private String mobilePhone;
    private int rank;

    public Contestant() {
    }

    public Contestant(String contestantName, String contestantID, String email, String mobilePhone, int rank) {
        this.contestantName = contestantName;
        this.contestantID = contestantID;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.rank = rank;
    }

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public String getContestantID() {
        return contestantID;
    }

    public void setContestantID(String contestantID) {
        this.contestantID = contestantID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return contestantName + ";" + contestantID + ";" + email + ";" + mobilePhone + ";" + rank;
    }
    
    
    
}
