
/*public class day7{
    static class leaverequest
class request{
        String to;
        void validates(String to){
            System.out.println("Validating the field: "+to);
        }
        void  send(){
            System.out.println("Sending notification");
        }
    }
    class textnotifications{
        String to;
        void validatesto(String to){
            System.out.println("validating the field:" +to);
        }
        void send(){
            System.out.println("sending notification");
        }
    }
    static void main(){

    }
}
/*

 /*
public class day7 {
    static class request{
        private String to;
        request(String to){
            this.to=to;
        }
        void send(){
        }
    }
    static class leaveRequest extends request{
        leaveRequest(String to){
            super(to);
        }
        void sendLeaveRequest(){
            System.out.println("Name:");
            System.out.println("Date:");
            System.out.println("Reason:");
        }
        static class OnDutyRequest(){
            OnDutyRequest(String to){
                super(to);
            }
            void OnDutyRequest(){
                System.out.println("Name:");
                System.out.println("Date:");
                System.out.println("Request:");
            }
        }
    }
/*
public class day7{
    static class Request {
        String name;
        String date;
        String reason;
        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }
        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }
    static class LeaveRequest extends Request {
        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveLeaveRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectLeaveRequest() {
            System.out.println("Reject on duty request");
        }
    }
    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }
    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("Narthika R","12-06-2026","Head pain");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("Viveka R","12-06-2026","Head pain");
        onDutyRequest.rejectOnDutyRequest();
    }
}
*/
/*
public class day7 {
  static class payment{
  String amount;
  void transfer(){
  System.out.println("Make a payment here");
  }
}
static class UPIPayment extends payment{
  @Override
  void transfer() {
    System.out.println("UPIpaymennt");
  }
}
static class Cardpayment extends payment{
    @Override
  void transfer(){
      System.out.println("Cardpayment");
    }
}
static  class NBpayment extends payment{
  @Override
  void transfer() {
    System.out.println("NBpayment");
  }
}
static void main() {
  UPIPayment upipayment = new UPIPayment();
  upipayment.transfer();

  Cardpayment cardpayment = new Cardpayment();
  cardpayment.transfer();

  NBpayment nbpayment = new NBpayment();
  nbpayment.transfer();
  }
}
*/