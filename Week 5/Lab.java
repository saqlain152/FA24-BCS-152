public class Lab {
    private String labName;
    private String labStaff;
    private String labAddress;
    private Pc[] pcs;

    public Lab(String labName, String labStaff, String labAddress, int numPCs) {
        this.labName = labName;
        this.labStaff = labStaff;
        this.labAddress = labAddress;
        this.pcs = new Pc[numPCs];
    }

    public void addPC(Pc pc, int index) {
        if (index >= 0 && index < pcs.length) {
            pcs[index] = pc;
        }
    }

    public void displayLabDetails() {
        System.out.println("\nLab Name: " + labName);
        System.out.println("Lab Staff: " + labStaff);
        System.out.println("Lab Address: " + labAddress);
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i] != null) {
                pcs[i].displayPCDetails();
            }
        }
    }
}