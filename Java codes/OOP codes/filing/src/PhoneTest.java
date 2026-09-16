class Phone{
    private String name;
    private long serialNo;
    Phone(String name,long serialNo){
       setName(name);
       setSerialNo(serialNo);
    }

    public void setName(String name){
        if(name.isEmpty())
        {
            throw new RuntimeException("Validation exception");
        }
        this.name = name;
    }

    public void setSerialNo(long serialNo) {
        int count=0;
        long temp=serialNo;
        while(temp!=0) {
            temp/=10;
            count++;
        }
        if(count!=16) {
            throw new RuntimeException("Validation exception");
        }
        this.serialNo = serialNo;
    }
}


class PhoneTest {
    public static void main(String[] args) {
        Phone test=new Phone("",12345677);
    }
}
