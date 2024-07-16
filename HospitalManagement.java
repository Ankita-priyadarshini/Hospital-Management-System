import java.util.*;
import java.util.Calendar;

class Staff {
    String sid, sname, desg, sex;
    int salary;

    void newStaff(Scanner input) {
        System.out.print("id: ");
        sid = input.nextLine();
        System.out.print("name: ");
        sname = input.nextLine();
        System.out.print("designation: ");
        desg = input.nextLine();
        System.out.print("sex: ");
        sex = input.nextLine();
        System.out.print("salary: ");
        salary = input.nextInt();
        input.nextLine(); 
    }

    void staffInfo() {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}

class Doctor {
    String did, dname, specilist, appoint, doc_qual;
    int droom;

    void newDoctor(Scanner input) {
        System.out.print("id: ");
        did = input.nextLine();
        System.out.print("name: ");
        dname = input.nextLine();
        System.out.print("specialization: ");
        specilist = input.nextLine();
        System.out.print("work time: ");
        appoint = input.nextLine();
        System.out.print("qualification: ");
        doc_qual = input.nextLine();
        System.out.print("room no: ");
        droom = input.nextInt();
        input.nextLine(); // Consume newline
    }

    void doctorInfo() {
        System.out.println(did + "\t" + dname + "\t" + specilist + "\t" + appoint + "\t" + doc_qual + "\t" + droom);
    }
}

class Patient {
    String pid, pname, disease, sex, admit_status;
    int age;

    void newPatient(Scanner input) {
        System.out.print("id: ");
        pid = input.nextLine();
        System.out.print("name: ");
        pname = input.nextLine();
        System.out.print("disease: ");
        disease = input.nextLine();
        System.out.print("sex: ");
        sex = input.nextLine();
        System.out.print("admit status: ");
        admit_status = input.nextLine();
        System.out.print("age: ");
        age = input.nextInt();
        input.nextLine(); // Consume newline
    }

    void patientInfo() {
        System.out.println(pid + "\t" + pname + "\t" + disease + "\t" + sex + "\t" + admit_status + "\t" + age);
    }
}

class Medical {
    String med_name, med_comp, exp_date;
    int med_cost, count;

    void newMedi(Scanner input) {
        System.out.print("name: ");
        med_name = input.nextLine();
        System.out.print("company: ");
        med_comp = input.nextLine();
        System.out.print("exp date: ");
        exp_date = input.nextLine();
        System.out.print("cost: ");
        med_cost = input.nextInt();
        System.out.print("no of units: ");
        count = input.nextInt();
        input.nextLine(); // Consume newline
    }

    void findMedi() {
        System.out.println(med_name + "\t" + med_comp + "\t" + exp_date + "\t" + med_cost);
    }
}

class Lab {
    String facility;
    int lab_cost;

    void newFacility(Scanner input) {
        System.out.print("facility: ");
        facility = input.nextLine();
        System.out.print("cost: ");
        lab_cost = input.nextInt();
        input.nextLine(); // Consume newline
    }

    void facilityList() {
        System.out.println(facility + "\t" + lab_cost);
    }
}

class Facility {
    String fec_name;

    void addFacility(Scanner input) {
        System.out.print("facility: ");
        fec_name = input.nextLine();
    }

    void showFacility() {
        System.out.println(fec_name);
    }
}

public class HospitalManagement {
    public static void main(String args[]) {
        Scanner input = null;
        try {
            input = new Scanner(System.in);
            String months[] = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
            };
            Calendar calendar = Calendar.getInstance();
            int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
            System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

            Doctor[] d = new Doctor[25];
            Patient[] p = new Patient[100];
            Lab[] l = new Lab[20];
            Facility[] f = new Facility[20];
            Medical[] m = new Medical[100];
            Staff[] s = new Staff[100];
            int i;
            for (i = 0; i < 25; i++) d[i] = new Doctor();
            for (i = 0; i < 100; i++) p[i] = new Patient();
            for (i = 0; i < 20; i++) l[i] = new Lab();
            for (i = 0; i < 20; i++) f[i] = new Facility();
            for (i = 0; i < 100; i++) m[i] = new Medical();
            for (i = 0; i < 100; i++) s[i] = new Staff();

            d[0].did = "21"; d[0].dname = "Dr. Gajendra Purohit"; d[0].specilist = "Neurosurgeon"; d[0].appoint = "5-11AM"; d[0].doc_qual = "MBBS, MD"; d[0].droom = 21;
            d[1].did = "32"; d[1].dname = "Dr. Anup Kumar Singh"; d[1].specilist = "Physician"; d[1].appoint = "10-3AM"; d[1].doc_qual = "MBBS, MD"; d[1].droom = 13;
            d[2].did = "17"; d[2].dname = "Dr. Rehan Bharadwaj"; d[2].specilist = "Surgeon"; d[2].appoint = "8-2AM"; d[2].doc_qual = "BDM"; d[2].droom = 35;
            d[3].did = "33"; d[3].dname = "Dr. Shalini Acharya"; d[3].specilist = "Orthopedician"; d[3].appoint = "10-4PM"; d[3].doc_qual = "MBBS, MS"; d[3].droom = 26;

            p[0].pid = "12"; p[0].pname = "Darshil Lomha"; p[0].disease = "Cancer"; p[0].sex = "Male"; p[0].admit_status = "y"; p[0].age = 50;
            p[1].pid = "13"; p[1].pname = "Sumit Dharya"; p[1].disease = "Cold"; p[1].sex = "Male"; p[1].admit_status = "y"; p[1].age = 23;
            p[2].pid = "14"; p[2].pname = "Chelsea Singh"; p[2].disease = "Malaria"; p[2].sex = "Female"; p[2].admit_status = "y"; p[2].age = 28;
            p[3].pid = "15"; p[3].pname = "Pavini Garg"; p[3].disease = "Diabetes"; p[3].sex = "Female"; p[3].admit_status = "y"; p[3].age = 36;

            m[0].med_name = "Corex"; m[0].med_comp = "Cino pvt"; m[0].exp_date = "9-5-16"; m[0].med_cost = 55; m[0].count = 8;
            m[1].med_name = "Nytra"; m[1].med_comp = "Ace pvt"; m[1].exp_date = "4-4-15"; m[1].med_cost = 500; m[1].count = 5;
            m[2].med_name = "Brufa"; m[2].med_comp = "Reckitt"; m[2].exp_date = "12-7-17"; m[2].med_cost = 50; m[2].count = 56;
            m[3].med_name = "Pride"; m[3].med_comp = "DDF pvt"; m[3].exp_date = "12-4-12"; m[3].med_cost = 1100; m[3].count = 100;

            l[0].facility = "X-ray"; l[0].lab_cost = 800;
            l[1].facility = "CT Scan"; l[1].lab_cost = 1200;
            l[2].facility = "OR Scan"; l[2].lab_cost = 500;
            l[3].facility = "Blood Bank"; l[3].lab_cost = 50;

            f[0].fec_name = "Ambulance";
            f[1].fec_name = "Admit Facility";
            f[2].fec_name = "Canteen";
            f[3].fec_name = "Emergency";

            s[0].sid = "22"; s[0].sname = "Prakash"; s[0].desg = "Worker"; s[0].sex = "Male"; s[0].salary = 5000;
            s[1].sid = "23"; s[1].sname = "Rohit"; s[1].desg = "Nurse"; s[1].sex = "Male"; s[1].salary = 2000;
            s[2].sid = "24"; s[2].sname = "Anil"; s[2].desg = "Worker"; s[2].sex = "Male"; s[2].salary = 5000;
            s[3].sid = "25"; s[3].sname = "Amit"; s[3].desg = "Nurse"; s[3].sex = "Male"; s[3].salary = 20000;

            int choice, j, c1, status = 1;
            while (status == 1) {
                System.out.println("\n                                    MAIN MENU");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("1. Doctors  | 2. Patients  | 3. Medicines  | 4. Laboratories  | 5. Facilities  | 6. Staff");
                System.out.println("-----------------------------------------------------------------------------------");

                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 1) {
                            System.out.println("1. Add New Entry\n2. Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    d[count1].newDoctor(input);
                                    count1++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count1; j++) {
                                        d[j].doctorInfo();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 2) {
                            System.out.println("1. Add New Entry\n2. Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    p[count2].newPatient(input);
                                    count2++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Disease \t Sex \t Admit Status \t Age");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count2; j++) {
                                        p[j].patientInfo();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    case 3:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 3) {
                            System.out.println("1. Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    m[count3].newMedi(input);
                                    count3++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Name \t Company \t Expiry Date \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count3; j++) {
                                        m[j].findMedi();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    case 4:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 4) {
                            System.out.println("1. Add New Entry\n2. Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    l[count4].newFacility(input);
                                    count4++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Facility \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count4; j++) {
                                        l[j].facilityList();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    case 5:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 5) {
                            System.out.println("1. Add New Facility\n2. Existing Facilities List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    f[count5].addFacility(input);
                                    count5++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Hospital Facility are:");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count5; j++) {
                                        f[j].showFacility();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    case 6:
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (status == 6) {
                            System.out.println("1. Add New Entry\n2. Existing Staff List");
                            c1 = input.nextInt();
                            switch (c1) {
                                case 1:
                                    s[count6].newStaff(input);
                                    count6++;
                                    break;
                                case 2:
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count6; j++) {
                                        s[j].staffInfo();
                                    }
                                    break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            status = input.nextInt();
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose a valid section.");
                }
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = input.nextInt();
            }
        } finally {
            if (input != null) {
                input.close(); // Close the scanner object to avoid resource leak
            }
        }
    }
}
