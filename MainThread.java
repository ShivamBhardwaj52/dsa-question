import javax.lang.model.util.ElementScanner14;
//multithreding by join method
class NewThread implements Runnable{
    Thread t;
    String s;
    public NewThread(String p){
        t = new Thread(this,p);
        s = p;
        t.start();
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.print(s+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.print(e);
        }
    } 
    }
    class MainThread{
        public static void main(String[]args) {
            NewThread ob1 = new NewThread("one");
            NewThread ob2 = new NewThread("two");
            try{
                ob1.t.join(3000);
                ob2.t.join(2000);{
                    System.out.print("Hello");
                }
                // if(ob1.t.is alive)
                //     System.out.print("t1 is alive");
                // else
                // System.out.print("t1 is dead");

            }
            catch(InterruptedException e){
                System.out.print(e);
            }
        }
    }