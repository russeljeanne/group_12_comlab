package com.example.mobile_voting_app;

public class Member {
    private String Name;
    private String Selected_pres;
    private String Selected_vicePres;
    private String Selected_secretary;
    private String Selected_subSecretary;
    private String Selected_treasurer;
    private String Selected_subTreasurer;
    private String Selected_PIO1;
    private String Selected_PIO2;
    private String Selected_PIO3;
    private String Selected_Auditor1;
    private String Selected_Auditor2;
    private String Selected_Auditor3;

    public Member() {}

    public String getName() {
        return Name;
    }

    public void setName (String name) { Name = name;}
    public String getSelected_pres() {return Selected_pres;}

    public void setSelected_pres(String selected_president) {Selected_pres = selected_president;}
    public String getSelected_vicePres() {return Selected_vicePres;}

    public void setSelected_vicePres(String selected_vicePresident) {Selected_vicePres = selected_vicePresident;}
    public String getSelected_sec() {return Selected_secretary;}

    public void setSelected_sec(String selected_secretary) {Selected_secretary = selected_secretary;}
    public String getSelected_subSec() {return Selected_subSecretary;}

    public void setSelected_subSec(String selected_subsecretary) {Selected_subSecretary = selected_subsecretary;}
    public String getSelected_tres() {return Selected_treasurer;}

    public void setSelected_tres(String selected_treasurer) {Selected_treasurer = selected_treasurer;}
    public String getSelected_subTres() {return Selected_subTreasurer;}

    public void setSelected_subTres(String selected_subtreasurer) {Selected_subTreasurer = selected_subtreasurer;}

    public String getSelected_PIO1() {
        return Selected_PIO1;
    }

    public void setSelected_PIO1(String selected_PIO1) {
        Selected_PIO1 = selected_PIO1;
    }

    public String getSelected_PIO2() {
        return Selected_PIO2;
    }

    public void setSelected_PIO2(String selected_PIO2) {
        Selected_PIO2 = selected_PIO2;
    }

    public String getSelected_PIO3() {
        return Selected_PIO3;
    }

    public void setSelected_PIO3(String selected_PIO3) {
        Selected_PIO3 = selected_PIO3;
    }

    public String getSelected_Auditor1() {
        return Selected_Auditor1;
    }

    public void setSelected_Auditor1(String selected_Auditor1) {
        Selected_Auditor1 = selected_Auditor1;
    }

    public String getSelected_Auditor2() {
        return Selected_Auditor2;
    }

    public void setSelected_Auditor2(String selected_Auditor2) {
        Selected_Auditor2 = selected_Auditor2;
    }

    public String getSelected_Auditor3() {
        return Selected_Auditor3;
    }

    public void setSelected_Auditor3(String selected_Auditor3) {
        Selected_Auditor3 = selected_Auditor3;
    }
}
