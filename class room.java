class Room {
    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;
    void setData(int rno,String rt,float area,boolean ac) {
    roomNo=rno;
    roomType=rt;
    roomArea=area;
    acMachine=ac;
    }
    void displayData() {
    System.out.println(“The room#.Is”+roomNo);
    System.out.println(“The room Type is”+roomType);
    System.out.println(“The room area is”+roomArea);
    String s=(acMachine)?“yes”:“no”;
    System.out.println(“The A/c Machine needed”+s);
    }
    public static void main(String arg[]){
    Room room1=new Room();
    room1.setData(101,“Deluxe”,240.0f,true);
    room1.displayData();
    }
    }
    
    
