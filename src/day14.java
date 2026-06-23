/*
public class day14{
static class Student {
    String name;
    int age;
    int regNo;

    Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.regNo = builder.regNo;
    }
    static class Builder {
        public String name;
        public int age;
        public int regNo;

        public Builder name(String nameValue) {
            this.name = nameValue;
            return this;
        }
        public Builder age(int ageValue) {
            this.age = ageValue;
            return this;
        }
        public Builder regNo(int regNoValue) {
            this.regNo = regNoValue;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
}

static void main() {
    Student student = new Student.Builder()
            .name("Narthika Raja")
            .age(19)
            .regNo(35)
            .build();

    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println(student.regNo);

}
        }
 */
/*
public class day14 {
    interface Notification{
        void sent(String to,String message);
    }
    class EmailNotification implements Notification{

        @Override
        public void sent(String to,String message){
        System.out.println("Sending Email: "+message +", to "+to);
    }
}
class WhatsappNotification implements Notification{

    @Override
    public void sent(String to,String message){
        System.out.println("Sending Whatsapp: "+message +", to "+to);
    }
}
static Notification getNotification(day14 factory, String type){
    return switch (type){
        case "Email"-> factory.new EmailNotification();
        case "Whatsapp"-> factory.new WhatsappNotification();
        default -> throw new IllegalArgumentException("Invalid notification type: "+type);
    };
}

    static void main() {
        day14 factory = new day14();

        String type = "Whatsapp";
        getNotification(factory, type).sent("4453543543", "Hello World");
    }
}
 */



