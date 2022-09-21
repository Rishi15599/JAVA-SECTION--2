public class Whatsapp {
    void W(){
        System.out.println("====== WhatsApp =======");
    }
}
class contact extends Whatsapp{
    long contact;
    void contact(long contact){
        System.out.println("No of Contact : "+contact);
    }
}
class Message extends Whatsapp{
    long chat;
    long group;
    void Message(long chat,long group){
        System.out.println("No of Chat : "+chat);
        System.out.println("No of Group : "+group);
    }
}
class Call extends Whatsapp{
    long audio;
    long video;
    long call;
    void Call(long audio,long video,long call){
        System.out.println("No of Audio (MissCall) :"+audio);
        System.out.println("No of Video (MissCall) : "+video);
        System.out.println("No of Call (MissCall) : "+call);
    }
}
class Main{
    public static void main(String[] args) {
        contact c=new contact();
        c.W();
        c.contact(1957);
        System.out.println("==============");
        Message m=new Message();
        m.W();
        m.Message(1000,500);
        System.out.println("==============");
        Call ca=new Call();
        ca.W();
        ca.Call(100,80,180);

    }
}
